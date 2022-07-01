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
        org.junit.Assert.assertEquals("tests.slow", (double) 1, (double) (byte) -1, (double) 0.0f);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest0.logger;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray1, byteArray5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest23.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger24);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0, (double) (short) 10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        int[] intArray5 = new int[] { (byte) 1, ' ', '#', (byte) 0, (short) -1 };
        int[] intArray10 = new int[] { (short) -1, (short) 0, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) 10, '4', 1 };
        int[] intArray9 = new int[] { 100, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", 0.0d, 0.0d, (double) 100);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        double[] doubleArray3 = new double[] { (byte) -1, (short) 1, (short) 100 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '4');
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, 0.0d, (double) (-1L));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 100.0d, (double) (-1.0f));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 0, 0.0d, 10.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 'a', (float) 100, (float) (byte) 1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        short[] shortArray1 = new short[] { (byte) 0 };
        short[] shortArray8 = new short[] { (short) 1, (byte) 0, (short) 0, (byte) 10, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray8);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        char[] charArray4 = new char[] { '4', '4', ' ' };
        char[] charArray6 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray4, charArray6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        int[] intArray5 = new int[] { (short) 0, ' ', (byte) 10, 100, 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        float[] floatArray19 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray24 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray29 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray34 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray39 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray40 = new float[][] { floatArray19, floatArray24, floatArray29, floatArray34, floatArray39 };
        java.util.Set<float[]> floatArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest42.assertFieldsEquals("tests.nightly", indexReader44, fields45, fields46, false);
        java.lang.String str49 = synonymsAnalysisTest42.getTestName();
        synonymsAnalysisTest42.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule51 = synonymsAnalysisTest42.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) floatArray40, (java.lang.Object) testRule51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) assertArray12, (java.lang.Object[]) floatArray40);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1L, (long) (byte) 10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (short) 100, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) 100, 10.0f, (float) ' ');
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        char[] charArray5 = new char[] { '4', ' ', 'a', '4' };
        char[] charArray7 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray5, charArray7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        char[] charArray4 = new char[] { ' ', '#', ' ', '4' };
        char[] charArray11 = new char[] { ' ', ' ', '4', ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        double[] doubleArray3 = new double[] { 10, (byte) -1, 0 };
        double[] doubleArray8 = new double[] { (short) 10, (byte) 100, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray8, 10.0d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 0, (long) (byte) 1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        char[] charArray6 = new char[] { '4', '4', 'a', '#', ' ' };
        char[] charArray13 = new char[] { '4', '4', ' ', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray6, charArray13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray3, floatArray6, (float) 10);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) '4');
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray28, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray21, floatArray24, (float) 10);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) '4');
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) '4');
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray45, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray38, floatArray41, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray21, floatArray41, (float) 0);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray41, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) floatArray6, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 0.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest1.ruleChain;
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest24.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest24.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray20, (java.lang.Object) synonymsAnalysisTest24);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray29, (-1.0f));
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule19, (java.lang.Object) (-1.0f));
        org.apache.lucene.util.LuceneTestCase.classRules = testRule19;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule19);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 0, (short) 0, (byte) -1 };
        short[] shortArray6 = new short[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, (double) 10, 100.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) 'a');
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService10);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest14.assertPositionsSkippingEquals("tests.nightly", indexReader17, (int) (byte) 1, postingsEnum19, postingsEnum20);
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest14.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.nightly", indexReader25, fields26, fields27, false);
        java.lang.String str30 = synonymsAnalysisTest23.getTestName();
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest23, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) synonymsAnalysisTest23);
        java.lang.Class<?> wildcardClass36 = synonymsAnalysisTest23.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain12, (java.lang.Object) wildcardClass36);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.slow", indexReader8, terms9, terms10, true);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", (-1), numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest11.assertFieldsEquals("tests.nightly", indexReader13, fields14, fields15, false);
        java.lang.String str18 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.ensureAllSearchContextsReleased();
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest11.assertFieldsEquals("tests.awaitsfix", indexReader22, fields23, fields24, false);
        org.elasticsearch.common.logging.ESLogger eSLogger27 = synonymsAnalysisTest11.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray5 = new double[] { 0.0f, '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        char[] charArray5 = new char[] { 'a', 'a', ' ', '#', 'a' };
        char[] charArray11 = new char[] { ' ', 'a', '#', ' ', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) 1, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        long[] longArray5 = new long[] { 1, 0, 100, (byte) 100 };
        long[] longArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray6);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, 100.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', (long) 100);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray6 = new double[] { 1.0f, (byte) 10, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, 0.0d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (byte) 100, (double) 'a');
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) ' ');
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 1L, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest20.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest20.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest20.analysisService;
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest32.analysisService = analysisService33;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest32.assertFieldsEquals("tests.weekly", indexReader36, fields37, fields38, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        synonymsAnalysisTest32.setUp();
        synonymsAnalysisTest32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest32.assertDocsEnumEquals("tests.monster", postingsEnum45, postingsEnum46, true);
        org.elasticsearch.common.logging.ESLogger eSLogger49 = synonymsAnalysisTest32.getlogger();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) synonymsAnalysisTest32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { (byte) -1, 0, 100L, 0, 100L, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        char[] charArray2 = new char[] { '#', 'a' };
        char[] charArray8 = new char[] { '#', '4', '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) queryCachingPolicy5);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        org.junit.rules.RuleChain ruleChain11 = null;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain11;
        synonymsAnalysisTest9.overrideTestDefaultQueryCache();
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray14, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("", indexReader25, 1, postingsEnum27, postingsEnum28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) indexReader25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray3);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        char[] charArray2 = new char[] { '#' };
        char[] charArray7 = new char[] { ' ', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray2, charArray7);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 1, (float) '#', (float) (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        char[] charArray2 = new char[] { ' ', '4' };
        char[] charArray7 = new char[] { ' ', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.nightly", indexReader11, fields12, fields13, false);
        java.lang.String str16 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest9.analysisService;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest9.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) '#', postingsEnum21, postingsEnum22, true);
        synonymsAnalysisTest9.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest9.resetCheckIndexStatus();
        synonymsAnalysisTest9.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest9.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray33, executorServiceArray34, executorServiceArray35 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray42 = new java.util.concurrent.ExecutorService[][] { executorServiceArray39, executorServiceArray40, executorServiceArray41 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray42);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule30, (java.lang.Object) executorServiceArray36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        synonymsAnalysisTest47.assertFieldsEquals("tests.nightly", indexReader49, fields50, fields51, false);
        java.lang.String str54 = synonymsAnalysisTest47.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest47.analysisService;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        synonymsAnalysisTest47.assertDocsSkippingEquals("tests.nightly", indexReader57, (int) '#', postingsEnum59, postingsEnum60, true);
        synonymsAnalysisTest47.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest47.resetCheckIndexStatus();
        synonymsAnalysisTest47.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule68 = synonymsAnalysisTest47.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray74 = new java.util.concurrent.ExecutorService[][] { executorServiceArray71, executorServiceArray72, executorServiceArray73 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray80 = new java.util.concurrent.ExecutorService[][] { executorServiceArray77, executorServiceArray78, executorServiceArray79 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList81 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray80);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule68, (java.lang.Object) executorServiceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray89 = new java.util.concurrent.ExecutorService[][] { executorServiceArray86, executorServiceArray87, executorServiceArray88 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList90 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray89);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray89);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader7, fields8, fields9, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.badapples", indexReader14, (-1), postingsEnum16, postingsEnum17);
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        char[] charArray6 = new char[] { 'a', '4', ' ', ' ', '#', 'a' };
        char[] charArray12 = new char[] { 'a', ' ', ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        char[] charArray7 = new char[] { ' ', ' ', '#', '#', '4', '#' };
        char[] charArray10 = new char[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray7, charArray10);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.getlogger();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest1.ruleChain;
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest24.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest24.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray20, (java.lang.Object) synonymsAnalysisTest24);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray29, (-1.0f));
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule19, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass35 = testRule19.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, false);
        java.lang.String str43 = synonymsAnalysisTest36.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest36.analysisService;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest36.assertDocsSkippingEquals("tests.nightly", indexReader46, (int) '#', postingsEnum48, postingsEnum49, true);
        synonymsAnalysisTest36.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = null;
        synonymsAnalysisTest36.analysisService = analysisService54;
        org.junit.rules.TestRule testRule56 = synonymsAnalysisTest36.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass35, (java.lang.Object) testRule56);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) 'a');
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 100L, 10.0f);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        short[] shortArray0 = new short[] {};
        short[] shortArray3 = new short[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray3);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (-1.0d), (double) (short) -1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        short[] shortArray1 = new short[] {};
        short[] shortArray5 = new short[] { (byte) -1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray1, shortArray5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        long[] longArray5 = new long[] { 100L, 0L, '4', 100, (byte) -1 };
        long[] longArray7 = new long[] { 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) '#');
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        int[] intArray3 = new int[] { 10, (-1) };
        int[] intArray9 = new int[] { (byte) -1, (short) -1, 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray9);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) 0, 10L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals(objArray13, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) executorServiceArray5, (java.lang.Object) (short) 1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        int[] intArray6 = new int[] { 0, (short) -1, (byte) 10, (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray6, intArray9);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1L, 0.0d, (double) 100);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        char[] charArray5 = new char[] { ' ', 'a', '#', ' ', '#' };
        char[] charArray7 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader14, terms15, terms16, false);
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.String str10 = synonymsAnalysisTest3.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest3.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) '#', postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        synonymsAnalysisTest3.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest3.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray30 = new java.util.concurrent.ExecutorService[][] { executorServiceArray27, executorServiceArray28, executorServiceArray29 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray33, executorServiceArray34, executorServiceArray35 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray36);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule24, (java.lang.Object) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, false);
        java.lang.String str48 = synonymsAnalysisTest41.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest41.analysisService;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("tests.nightly", indexReader51, (int) '#', postingsEnum53, postingsEnum54, true);
        synonymsAnalysisTest41.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest41.resetCheckIndexStatus();
        synonymsAnalysisTest41.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule62 = synonymsAnalysisTest41.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray68 = new java.util.concurrent.ExecutorService[][] { executorServiceArray65, executorServiceArray66, executorServiceArray67 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray74 = new java.util.concurrent.ExecutorService[][] { executorServiceArray71, executorServiceArray72, executorServiceArray73 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray74);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule62, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray83 = new java.util.concurrent.ExecutorService[][] { executorServiceArray80, executorServiceArray81, executorServiceArray82 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList84 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray83);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray83);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest86 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService87 = synonymsAnalysisTest86.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService88 = null;
        synonymsAnalysisTest86.setanalysisService(analysisService88);
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = synonymsAnalysisTest86.getanalysisService();
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray83, (java.lang.Object) analysisService90);
        java.util.Locale locale94 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale[] localeArray95 = new java.util.Locale[] { locale94 };
        java.util.List<java.util.Locale> localeList96 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, localeArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) localeArray95);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        java.lang.Class<?> wildcardClass11 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest12.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest12.setanalysisService(analysisService14);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.awaitsfix", indexReader18, fields19, fields20, false);
        java.lang.Class<?> wildcardClass23 = synonymsAnalysisTest12.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest24.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest24.setanalysisService(analysisService26);
        synonymsAnalysisTest24.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest24.assertFieldsEquals("tests.awaitsfix", indexReader30, fields31, fields32, false);
        java.lang.Class<?> wildcardClass35 = synonymsAnalysisTest24.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService37 = synonymsAnalysisTest36.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = null;
        synonymsAnalysisTest36.setanalysisService(analysisService38);
        synonymsAnalysisTest36.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.awaitsfix", indexReader42, fields43, fields44, false);
        java.lang.Class<?> wildcardClass47 = synonymsAnalysisTest36.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass49 = throttling48.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.lang.Class<?> wildcardClass51 = throttling50.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray52 = new java.lang.reflect.AnnotatedElement[] { wildcardClass11, wildcardClass23, wildcardClass35, wildcardClass47, wildcardClass49, wildcardClass51 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet53 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray61);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray52, (java.lang.Object[]) executorServiceArray68);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        long[] longArray5 = new long[] { (-1), (byte) 1, 1, 0L };
        long[] longArray11 = new long[] { (byte) -1, 1, 10, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray11);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest10.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray6, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain14;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest17.analysisService = analysisService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.weekly", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest17.assertDocsEnumEquals("tests.nightly", postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.monster", indexReader32, fields33, fields34, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain14, (java.lang.Object) fields34);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService5);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1.0d), (double) 0L, (double) 1L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { ' ', '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray6);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray8);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale[] localeArray4 = new java.util.Locale[] { locale3 };
        java.util.List<java.util.Locale> localeList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, localeArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = null;
        synonymsAnalysisTest8.analysisService = analysisService9;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest8.assertFieldsEquals("tests.weekly", indexReader12, fields13, fields14, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest8.analysisService;
        synonymsAnalysisTest8.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest8.logger;
        synonymsAnalysisTest8.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest21.assertFieldsEquals("tests.nightly", indexReader23, fields24, fields25, false);
        java.lang.String str28 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest21.analysisService;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest21.assertDocsSkippingEquals("tests.nightly", indexReader31, (int) '#', postingsEnum33, postingsEnum34, true);
        synonymsAnalysisTest21.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) synonymsAnalysisTest21);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) executorServiceArray41);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) localeArray4, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        char[] charArray0 = new char[] {};
        char[] charArray4 = new char[] { '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) '#', 100.0d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest9.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray5, (java.lang.Object) synonymsAnalysisTest9);
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader16, fields17, fields18, false);
        synonymsAnalysisTest0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { (-1.0f), (short) 1, (byte) 0, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray1, doubleArray6, 0.0d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray3);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.getlogger();
        float[] floatArray23 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray28 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray33 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray38 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray43 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray44 = new float[][] { floatArray23, floatArray28, floatArray33, floatArray38, floatArray43 };
        java.util.Set<float[]> floatArraySet45 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.nightly", indexReader48, fields49, fields50, false);
        java.lang.String str53 = synonymsAnalysisTest46.getTestName();
        synonymsAnalysisTest46.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule55 = synonymsAnalysisTest46.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) floatArray44, (java.lang.Object) testRule55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray3);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals(objArray5, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) 0L);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.junit.rules.RuleChain[] ruleChainArray22 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray23 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray24 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray25 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray26 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[] ruleChainArray27 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray28 = new org.junit.rules.RuleChain[][] { ruleChainArray22, ruleChainArray23, ruleChainArray24, ruleChainArray25, ruleChainArray26, ruleChainArray27 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) ruleChainArray28);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 0, (double) (short) 100, (double) 10L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger1 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (byte) 0, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = null;
        synonymsAnalysisTest2.analysisService = analysisService25;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSLogger1, (java.lang.Object) true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        short[] shortArray7 = new short[] { (byte) 10, (short) 10, (byte) 100, (byte) 100, (short) 100, (short) 0 };
        short[] shortArray12 = new short[] { (short) 10, (short) -1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray7, shortArray12);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        int[] intArray4 = new int[] { '4', 'a', (byte) -1, (short) 10 };
        int[] intArray7 = new int[] { 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, obj12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals(objArray10, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray11, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray0, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest13.analysisService = analysisService14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.weekly", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest13.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) executorServiceArray5, (java.lang.Object) analysisService23);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService16);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain4;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        double[] doubleArray5 = new double[] { 100.0f, 10.0d, 1.0f, 1 };
        double[] doubleArray8 = new double[] { (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain5 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain5;
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray14 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray19 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray24 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray29 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray34 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray35 = new float[][] { floatArray14, floatArray19, floatArray24, floatArray29, floatArray34 };
        java.util.Set<float[]> floatArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest37.assertFieldsEquals("tests.nightly", indexReader39, fields40, fields41, false);
        java.lang.String str44 = synonymsAnalysisTest37.getTestName();
        synonymsAnalysisTest37.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest37.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) floatArray35, (java.lang.Object) testRule46);
        java.util.Set<float[]> floatArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray35);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) floatArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = synonymsAnalysisTest50.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService52 = null;
        synonymsAnalysisTest50.setanalysisService(analysisService52);
        synonymsAnalysisTest50.ensureCleanedUp();
        synonymsAnalysisTest50.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger56 = synonymsAnalysisTest50.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger56);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        double[] doubleArray5 = new double[] { 100.0d, (short) 0, 0.0f, 100, (byte) 1 };
        double[] doubleArray10 = new double[] { 100.0f, 100, ' ', 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        double[] doubleArray2 = new double[] { 0.0d, 0.0f };
        double[] doubleArray7 = new double[] { (byte) -1, 100.0d, (short) 100, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 10, (double) 1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '#');
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray5, byteArray7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        double[] doubleArray6 = new double[] { 1L, 'a', 0, (byte) 1, 1.0d, (-1L) };
        double[] doubleArray10 = new double[] { 1.0d, 0.0d, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (byte) 100);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) analysisService11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 0, (short) 10, (byte) 10 };
        int[] intArray11 = new int[] { (-1), (byte) 1, 'a', '#', (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, 10.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        java.lang.String str17 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = null;
        synonymsAnalysisTest19.analysisService = analysisService20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest19.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = synonymsAnalysisTest19.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        synonymsAnalysisTest19.assertTermsEquals("tests.weekly", indexReader33, terms34, terms35, false);
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest19.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest19.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) eSLogger18, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        java.lang.String str17 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest0.getlogger();
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        int[] intArray4 = new int[] { 10, (byte) 0, 0, 100 };
        int[] intArray8 = new int[] { 1, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray8);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.setUp();
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray9, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest13.getanalysisService();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotNull((java.lang.Object) eSLogger21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger21);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        synonymsAnalysisTest4.overrideTestDefaultQueryCache();
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest4.getanalysisService();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest4.match("tests.monster", "tests.badapples", "tests.slow");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest5.setanalysisService(analysisService7);
        synonymsAnalysisTest5.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest5.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray1, (java.lang.Object) synonymsAnalysisTest5);
        java.lang.String str18 = synonymsAnalysisTest5.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest20.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, false);
        java.lang.String str27 = synonymsAnalysisTest20.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest20.analysisService;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("tests.nightly", indexReader30, (int) '#', postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("tests.monster", indexReader37, (int) (byte) 0, postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest20.analysisService = analysisService43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) analysisService19, (java.lang.Object) synonymsAnalysisTest20);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (byte) 10, 0, 0, 10.0d, '#', 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray1, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray4);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (byte) 1, (double) 0.0f, (double) 100L);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest0.analysisService = analysisService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader21, terms22, terms23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService26);
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass29 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.nightly", indexReader32, fields33, fields34, false);
        java.lang.String str37 = synonymsAnalysisTest30.getTestName();
        synonymsAnalysisTest30.ensureAllSearchContextsReleased();
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.awaitsfix", indexReader41, fields42, fields43, false);
        synonymsAnalysisTest30.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest30.ensureCleanedUp();
        synonymsAnalysisTest30.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest30.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass29, (java.lang.Object) synonymsAnalysisTest30);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        long[] longArray2 = new long[] { (byte) 10 };
        long[] longArray4 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray2, longArray4);
        long[] longArray8 = new long[] { (byte) 10 };
        long[] longArray10 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        long[] longArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray8, longArray13);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        short[] shortArray3 = new short[] { (short) 100, (byte) 0 };
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray5);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 0.0f, (double) 100);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1L), (long) (byte) -1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.nightly", indexReader11, fields12, fields13, false);
        java.lang.String str16 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest9.analysisService;
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest9.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        int[] intArray7 = new int[] { (-1), '#', (byte) 100, (byte) -1, (byte) -1, 0 };
        int[] intArray13 = new int[] { 100, 'a', (byte) 1, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray7, intArray13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        double[] doubleArray4 = new double[] { 1.0d, (byte) -1, (short) 1 };
        double[] doubleArray8 = new double[] { 100L, 1.0d, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray4, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) executorServiceArray5);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        long[] longArray2 = new long[] { (byte) 10 };
        long[] longArray4 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray2, longArray4);
        long[] longArray8 = new long[] { (byte) 10 };
        long[] longArray10 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        long[] longArray17 = new long[] { (-1), (-1L), (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray17);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        float[] floatArray4 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray9 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray14 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray19 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray24 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray25 = new float[][] { floatArray4, floatArray9, floatArray14, floatArray19, floatArray24 };
        java.util.Set<float[]> floatArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) floatArray25, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest0.getanalysisService();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        double[] doubleArray2 = new double[] { 10.0d };
        double[] doubleArray5 = new double[] { 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray2, doubleArray5, (-1.0d));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest22.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger24 = synonymsAnalysisTest22.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray18, (java.lang.Object) synonymsAnalysisTest22);
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain26;
        long[] longArray31 = new long[] { (byte) 10 };
        long[] longArray33 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray31, longArray33);
        long[] longArray37 = new long[] { (byte) 10 };
        long[] longArray39 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray37, longArray39);
        org.junit.Assert.assertArrayEquals(longArray33, longArray37);
        long[] longArray44 = new long[] { (byte) 10 };
        long[] longArray46 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray44, longArray46);
        long[] longArray50 = new long[] { (byte) 10 };
        long[] longArray52 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray50, longArray52);
        org.junit.Assert.assertArrayEquals(longArray46, longArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray37, longArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) ruleChain26, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.getanalysisService();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest11.setUp();
        synonymsAnalysisTest11.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        java.lang.String str17 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 1, (long) (-1));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        char[] charArray3 = new char[] { ' ', '#', ' ' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        long[] longArray3 = new long[] { 0L, (byte) 1, (-1) };
        long[] longArray6 = new long[] { (byte) 10 };
        long[] longArray8 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray6, longArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) 0, (float) (short) 10, 0.0f);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest0.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        double[] doubleArray4 = new double[] { (short) -1, 10L, '#' };
        double[] doubleArray8 = new double[] { '4', 0.0f, 100.0d };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray8, 1.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (short) 100, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (short) 1, 10, (short) 0, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        char[] charArray4 = new char[] { ' ', '#', '#', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray11);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray11);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals(objArray15, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 1, (java.lang.Object) executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 100L, (long) '4');
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray1, intArray3);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService17);
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals(objArray21, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest26.assertFieldsEquals("tests.nightly", indexReader28, fields29, fields30, false);
        java.lang.String str33 = synonymsAnalysisTest26.getTestName();
        synonymsAnalysisTest26.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest26.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule35;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "random", (java.lang.Object) testRule35);
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService17, (java.lang.Object) testRule35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = synonymsAnalysisTest39.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger41 = synonymsAnalysisTest39.logger;
        synonymsAnalysisTest39.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest39.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest39.assertDocsSkippingEquals("tests.awaitsfix", indexReader45, (int) (short) 1, postingsEnum47, postingsEnum48, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService17, (java.lang.Object) postingsEnum47);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain10);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest17.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray13, (java.lang.Object) synonymsAnalysisTest17);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest23.assertFieldsEquals("tests.nightly", indexReader25, fields26, fields27, false);
        java.lang.String str30 = synonymsAnalysisTest23.getTestName();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest23.failureAndSuccessEvents;
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray33, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain41);
        org.junit.rules.RuleChain[] ruleChainArray44 = new org.junit.rules.RuleChain[] { ruleChain10, ruleChain21, ruleChain31, ruleChain41 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet45 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray44);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet46 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray44);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService53 = synonymsAnalysisTest52.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger54 = synonymsAnalysisTest52.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray48, (java.lang.Object) synonymsAnalysisTest52);
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest52.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain56;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain56);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService64 = synonymsAnalysisTest63.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger65 = synonymsAnalysisTest63.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray59, (java.lang.Object) synonymsAnalysisTest63);
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest63.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain67;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        org.apache.lucene.index.Fields fields73 = null;
        synonymsAnalysisTest69.assertFieldsEquals("tests.nightly", indexReader71, fields72, fields73, false);
        java.lang.String str76 = synonymsAnalysisTest69.getTestName();
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest69.failureAndSuccessEvents;
        float[] floatArray79 = new float[] {};
        float[] floatArray80 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray79, floatArray80, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest83 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService84 = synonymsAnalysisTest83.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger85 = synonymsAnalysisTest83.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray79, (java.lang.Object) synonymsAnalysisTest83);
        org.junit.rules.RuleChain ruleChain87 = synonymsAnalysisTest83.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain87;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain87);
        org.junit.rules.RuleChain[] ruleChainArray90 = new org.junit.rules.RuleChain[] { ruleChain56, ruleChain67, ruleChain77, ruleChain87 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet91 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray90);
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet92 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray90);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) ruleChainArray44, (java.lang.Object[]) ruleChainArray90);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain5 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader9, (int) (byte) -1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.String str21 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService12);
        synonymsAnalysisTest10.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.awaitsfix", indexReader16, fields17, fields18, false);
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest22.assertPositionsSkippingEquals("tests.nightly", indexReader25, (int) (byte) 1, postingsEnum27, postingsEnum28);
        synonymsAnalysisTest22.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest31.setUp();
        synonymsAnalysisTest31.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest35.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger37 = synonymsAnalysisTest35.getlogger();
        java.lang.String str38 = synonymsAnalysisTest35.getTestName();
        org.junit.rules.RuleChain ruleChain39 = synonymsAnalysisTest35.failureAndSuccessEvents;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain39;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain39;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray5);
        short[] shortArray15 = new short[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray15);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        char[] charArray6 = new char[] { '#', 'a', ' ', '4', ' ', ' ' };
        char[] charArray13 = new char[] { '#', 'a', ' ', 'a', '#', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray6);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        double[] doubleArray3 = new double[] { 100L, 'a', (short) 10 };
        double[] doubleArray9 = new double[] { 10, 0.0f, 10.0f, 1.0d, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray9, 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest2.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = synonymsAnalysisTest2.getanalysisService();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray26 = new org.junit.rules.RuleChain[] { ruleChain25 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, ruleChainArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertEquals(objArray44, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) ruleChainArray26, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setUp();
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray9, (java.lang.Object) synonymsAnalysisTest13);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, false);
        java.lang.String str20 = synonymsAnalysisTest13.getTestName();
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain23 = null;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest4.match("tests.failfast", "tests.failfast", "enwiki.random.lines.txt");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str6 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 10, (double) 1L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) ' ', (long) (byte) 10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray16);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        double[] doubleArray6 = new double[] { 100L, (byte) 10, 'a', 100, 1, (byte) -1 };
        double[] doubleArray12 = new double[] { (byte) 1, 10.0f, ' ', (-1L), 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0L, (double) 10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        char[] charArray4 = new char[] { '4', '4', '#' };
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, 100.0f, 0.0f);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, 1, 100, (byte) 10 };
        int[] intArray13 = new int[] { (short) 100, '#', (short) 10, 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray6, intArray13);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        double[] doubleArray4 = new double[] { 1L, 0, 1.0d, 0.0d };
        double[] doubleArray10 = new double[] { 1, 100.0d, (short) 0, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray10, (double) (short) 100);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) -1, (long) (short) 10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = null;
        synonymsAnalysisTest21.analysisService = analysisService22;
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy25 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) queryCachingPolicy25);
        org.junit.Assert.assertNotEquals((java.lang.Object) "<unknown>", (java.lang.Object) synonymsAnalysisTest21);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = synonymsAnalysisTest32.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest32.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray28, (java.lang.Object) synonymsAnalysisTest32);
        synonymsAnalysisTest32.overrideTestDefaultQueryCache();
        synonymsAnalysisTest32.setIndexWriterMaxDocs((int) (short) 0);
        synonymsAnalysisTest32.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest21, (java.lang.Object) synonymsAnalysisTest32);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray7 = new char[] { ' ', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray1, charArray7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 10, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) (byte) 100);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray2, (double) 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray7, byteArray12);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        double[] doubleArray6 = new double[] { 0, 'a', 1.0d, 0, (-1.0f) };
        double[] doubleArray13 = new double[] { 10.0d, 1.0d, 1.0f, '#', (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray6, doubleArray13, (double) (byte) 100);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray11, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray7, (float) 10);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) '4');
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray28, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray21, floatArray24, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray4, floatArray24, (float) 0);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray42, (float) 100);
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) '4');
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) '4');
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray57, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray53, 0.0f);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService70 = synonymsAnalysisTest69.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger71 = synonymsAnalysisTest69.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray65, (java.lang.Object) synonymsAnalysisTest69);
        float[] floatArray73 = new float[] {};
        float[] floatArray74 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray74, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray74, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray49, floatArray74, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray49, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray24, floatArray38, (float) (byte) -1);
        float[] floatArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray85, (float) (byte) 10);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        float[] floatArray5 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray10 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray15 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray20 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray25 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray26 = new float[][] { floatArray5, floatArray10, floatArray15, floatArray20, floatArray25 };
        java.util.Set<float[]> floatArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray26);
        java.util.Set<java.lang.Cloneable> cloneableSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) floatArray26);
        org.junit.Assert.assertNotEquals((java.lang.Object) 100.0d, (java.lang.Object) floatArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray50);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray48);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) floatArray26, (java.lang.Object[]) executorServiceArray35);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        short[] shortArray7 = new short[] { (byte) 1, (short) 0, (short) 1, (short) 10, (byte) 100, (short) 0 };
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray9, shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray7, shortArray12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0, 0.0d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 100);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        java.lang.String str26 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.awaitsfix", indexReader30, fields31, fields32, false);
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest19.getlogger();
        synonymsAnalysisTest19.setUp();
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest19.ruleChain;
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest42.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest42.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray38, (java.lang.Object) synonymsAnalysisTest42);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray47, (-1.0f));
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) testRule37, (java.lang.Object) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger17, (java.lang.Object) testRule37);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4, executorServiceArray5 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray9, executorServiceArray10, executorServiceArray11 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray12);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray12);
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals(objArray26, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray27, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { 100, (-1), '4', ' ', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 100, (double) (-1L), (double) (short) 100);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray19);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray19);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale31 };
        java.util.List<java.util.Locale> localeList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 1, localeArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) localeArray32);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, 1L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest10.analysisService = analysisService11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.weekly", indexReader14, fields15, fields16, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest10.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = null;
        synonymsAnalysisTest10.setanalysisService(analysisService23);
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) 0, (double) (-1));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray3);
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals(objArray7, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.String str21 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest14.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray24 = new org.apache.lucene.util.LuceneTestCase[] { synonymsAnalysisTest14 };
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest25.assertFieldsEquals("tests.nightly", indexReader27, fields28, fields29, false);
        java.lang.String str32 = synonymsAnalysisTest25.getTestName();
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest25.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray35 = new org.apache.lucene.util.LuceneTestCase[] { synonymsAnalysisTest25 };
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, false);
        java.lang.String str43 = synonymsAnalysisTest36.getTestName();
        synonymsAnalysisTest36.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest36.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray46 = new org.apache.lucene.util.LuceneTestCase[] { synonymsAnalysisTest36 };
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        synonymsAnalysisTest47.assertFieldsEquals("tests.nightly", indexReader49, fields50, fields51, false);
        java.lang.String str54 = synonymsAnalysisTest47.getTestName();
        synonymsAnalysisTest47.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule56 = synonymsAnalysisTest47.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray57 = new org.apache.lucene.util.LuceneTestCase[] { synonymsAnalysisTest47 };
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        synonymsAnalysisTest58.assertFieldsEquals("tests.nightly", indexReader60, fields61, fields62, false);
        java.lang.String str65 = synonymsAnalysisTest58.getTestName();
        synonymsAnalysisTest58.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule67 = synonymsAnalysisTest58.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray68 = new org.apache.lucene.util.LuceneTestCase[] { synonymsAnalysisTest58 };
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray69 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray24, luceneTestCaseArray35, luceneTestCaseArray46, luceneTestCaseArray57, luceneTestCaseArray68 };
        java.util.List<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArrayList70 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, luceneTestCaseArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) luceneTestCaseArray69);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, false);
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) 1.0d, (java.lang.Object) eSLogger13);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest1.analysisService = analysisService7;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, false);
        java.lang.String str17 = synonymsAnalysisTest10.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        synonymsAnalysisTest10.assertPathHasBeenCleared("hi!");
        org.elasticsearch.common.logging.ESLogger eSLogger22 = synonymsAnalysisTest10.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger22);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) '4');
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        long[] longArray4 = new long[] { (byte) 10 };
        long[] longArray6 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray6);
        long[] longArray10 = new long[] { (byte) 10 };
        long[] longArray12 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray12);
        long[] longArray18 = new long[] { (byte) 10 };
        long[] longArray20 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray20);
        long[] longArray24 = new long[] { (byte) 10 };
        long[] longArray26 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        long[] longArray31 = new long[] { (byte) 10 };
        long[] longArray33 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray31, longArray33);
        long[] longArray37 = new long[] { (byte) 10 };
        long[] longArray39 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray37, longArray39);
        org.junit.Assert.assertArrayEquals(longArray33, longArray37);
        org.junit.Assert.assertArrayEquals("", longArray20, longArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray6, longArray20);
        long[] longArray47 = new long[] { (-1), 1, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray20, longArray47);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), 1.0f, 1.0f);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
        byte[] byteArray9 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray5, byteArray9);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 100, (double) ' ');
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (byte) 0, (float) 1L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest1.logger;
        java.lang.String str18 = synonymsAnalysisTest1.getTestName();
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) str18, obj19);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.nightly", indexReader42, fields43, fields44, false);
        java.lang.String str47 = synonymsAnalysisTest40.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest40.analysisService;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("tests.nightly", indexReader50, (int) '#', postingsEnum52, postingsEnum53, true);
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest40.resetCheckIndexStatus();
        synonymsAnalysisTest40.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule61 = synonymsAnalysisTest40.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray67 = new java.util.concurrent.ExecutorService[][] { executorServiceArray64, executorServiceArray65, executorServiceArray66 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray73 = new java.util.concurrent.ExecutorService[][] { executorServiceArray70, executorServiceArray71, executorServiceArray72 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray73);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule61, (java.lang.Object) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray82 = new java.util.concurrent.ExecutorService[][] { executorServiceArray79, executorServiceArray80, executorServiceArray81 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList83 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray82);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray82);
        float[] floatArray85 = new float[] {};
        float[] floatArray86 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray85, floatArray86, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest89 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = synonymsAnalysisTest89.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger91 = synonymsAnalysisTest89.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray85, (java.lang.Object) synonymsAnalysisTest89);
        synonymsAnalysisTest89.overrideTestDefaultQueryCache();
        synonymsAnalysisTest89.setIndexWriterMaxDocs((int) (short) 0);
        org.elasticsearch.index.analysis.AnalysisService analysisService96 = synonymsAnalysisTest89.getanalysisService();
        synonymsAnalysisTest89.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray82, (java.lang.Object) synonymsAnalysisTest89);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) ' ', (float) 1L);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest1.analysisService = analysisService15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) analysisService15);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '#');
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) ' ');
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        int[] intArray5 = new int[] { 2, 100, 100, (short) 100, (short) 10 };
        int[] intArray12 = new int[] { 2, '4', '4', (byte) 0, (-1), 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (byte) -1);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        java.lang.Object[] objArray1 = null;
        float[] floatArray6 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray11 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray16 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray21 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray26 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray27 = new float[][] { floatArray6, floatArray11, floatArray16, floatArray21, floatArray26 };
        java.util.Set<float[]> floatArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray27);
        java.util.Set<java.lang.Cloneable> cloneableSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) floatArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", objArray1, (java.lang.Object[]) floatArray27);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 10, 0L);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray8);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray18);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) -1, (-1L));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        long[] longArray3 = new long[] { (byte) 10 };
        long[] longArray5 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray3, longArray5);
        long[] longArray9 = new long[] { (byte) 10 };
        long[] longArray11 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
        long[] longArray16 = new long[] { (byte) 10 };
        long[] longArray18 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray16, longArray18);
        long[] longArray22 = new long[] { (byte) 10 };
        long[] longArray24 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray22, longArray24);
        org.junit.Assert.assertArrayEquals(longArray18, longArray22);
        org.junit.Assert.assertArrayEquals("", longArray5, longArray18);
        long[] longArray33 = new long[] { 0, (short) 10, (short) 1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray33);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        double[] doubleArray3 = new double[] { (short) 10, 0.0d };
        double[] doubleArray10 = new double[] { '#', (-1.0d), (short) 0, 1L, 0, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray3, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        int[] intArray6 = new int[] { (short) 10, 'a', ' ', 10, (byte) 1, (short) -1 };
        int[] intArray9 = new int[] { 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        int[] intArray7 = new int[] { (byte) -1, (short) 10, (byte) 100, 0, '4', (short) -1 };
        int[] intArray10 = new int[] { ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray7, intArray10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        double[] doubleArray5 = new double[] { (-1.0f), 10, 10, 10.0d, (byte) -1 };
        double[] doubleArray7 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.monster", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.common.logging.ESLogger eSLogger17 = synonymsAnalysisTest0.logger;
        java.lang.String str18 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str18);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) (byte) -1);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        int[] intArray5 = new int[] { (short) 100, '#', ' ', (byte) 0, (short) 100 };
        int[] intArray12 = new int[] { (-1), 100, '#', 100, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        double[] doubleArray4 = new double[] { (short) -1, 10, 100.0f };
        double[] doubleArray6 = new double[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray4, doubleArray6, (double) 0L);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", 0.0d, 0.0d, (double) 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray11);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray1, byteArray24);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0L, (long) (short) 1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) queryCachingPolicy4);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (short) 10, 1 };
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, 0L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        long[] longArray4 = new long[] { (byte) 10 };
        long[] longArray6 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray6);
        long[] longArray10 = new long[] { (byte) 10 };
        long[] longArray12 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) longArray12, (java.lang.Object) synonymsAnalysisTest15);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 10, (long) (short) 100);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray9 = new int[] { '#', (byte) 0, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray3, intArray9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        short[] shortArray0 = null;
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
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.junit.rules.RuleChain ruleChain21 = null;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest19.assertFieldsEquals("", indexReader25, fields26, fields27, true);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray31);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray34);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields27, (java.lang.Object) shortArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest39.setUp();
        org.junit.rules.RuleChain ruleChain41 = null;
        synonymsAnalysisTest39.failureAndSuccessEvents = ruleChain41;
        synonymsAnalysisTest39.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        synonymsAnalysisTest39.assertFieldsEquals("", indexReader45, fields46, fields47, true);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray54);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields47, (java.lang.Object) shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray54);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray5);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) '#', (double) 'a');
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader3, fields4, fields5, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) 100);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("hi!", indexReader6, (int) (byte) 0, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray16);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        org.junit.Assert.assertArrayEquals(charArray5, charArray21);
        char[] charArray29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray21, charArray29);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain3;
        org.elasticsearch.common.logging.ESLogger eSLogger5 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("<unknown>", indexReader7, fields8, fields9, true);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest1.logger;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest19.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = null;
        synonymsAnalysisTest19.setanalysisService(analysisService21);
        synonymsAnalysisTest19.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.awaitsfix", indexReader25, fields26, fields27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        synonymsAnalysisTest19.assertTermsEquals("random", indexReader31, terms32, terms33, true);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest19.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum37, postingsEnum38, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        double[] doubleArray3 = new double[] { '4', (-1L), 10L };
        double[] doubleArray9 = new double[] { (-1.0f), 1L, '4', 100L, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray9, (double) 100);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
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
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray8, (java.lang.Object) executorServiceArray29);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray8, byteArray11);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray24);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray37);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray53);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray46, byteArray49);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray62);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray69);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray46, byteArray62);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray79);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray83);
        byte[] byteArray85 = new byte[] {};
        byte[] byteArray86 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray85, byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray86);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray79, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) byteArray37, (java.lang.Object) byteArray82);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest3.analysisService = analysisService4;
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray0, (java.lang.Object) synonymsAnalysisTest3);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest3.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("tests.monster", postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest15.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest40.analysisService = analysisService41;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.weekly", indexReader44, fields45, fields46, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest40.analysisService;
        synonymsAnalysisTest40.setUp();
        synonymsAnalysisTest40.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest40.assertDocsEnumEquals("tests.monster", postingsEnum53, postingsEnum54, true);
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest40.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) synonymsAnalysisTest40);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, '4', 0 };
        int[] intArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 1, '4', (short) 100, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray6, (double) 1);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 0, (long) 10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        char[] charArray2 = new char[] { '#', 'a' };
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        org.junit.Assert.assertArrayEquals("", charArray11, charArray18);
        org.junit.Assert.assertArrayEquals(charArray7, charArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray11);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
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
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        org.junit.Assert.assertArrayEquals(charArray4, charArray20);
        char[] charArray29 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray29);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", 1L, (long) 1);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest15.assertDocsEnumEquals("tests.monster", postingsEnum35, postingsEnum36, true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals(objArray40, (java.lang.Object[]) executorServiceArray41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService45 = synonymsAnalysisTest44.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest44.setanalysisService(analysisService46);
        synonymsAnalysisTest44.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest44.assertFieldsEquals("tests.awaitsfix", indexReader50, fields51, fields52, false);
        synonymsAnalysisTest44.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray40, (java.lang.Object) synonymsAnalysisTest44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) postingsEnum35, (java.lang.Object) synonymsAnalysisTest44);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1L), (long) 'a');
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (-1.0f));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray10 = new int[] { (byte) 100, 'a', '#', (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray11, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray7, (float) 10);
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) '4');
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray28, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray21, floatArray24, (float) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray4, floatArray24, (float) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) '#');
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (short) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.monster", indexReader18, (int) (byte) 0, postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest1.analysisService = analysisService24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, true);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray39);
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray50);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) terms28, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray10, (-1.0f));
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray24, (float) 100);
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals(objArray30, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray20, (java.lang.Object) executorServiceArray31);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray16, (float) ' ');
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = synonymsAnalysisTest43.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger45 = synonymsAnalysisTest43.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray39, (java.lang.Object) synonymsAnalysisTest43);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray48, (-1.0f));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray10, floatArray39, 0.0f);
        float[] floatArray55 = new float[] {};
        float[] floatArray56 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray56, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = synonymsAnalysisTest59.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger61 = synonymsAnalysisTest59.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray55, (java.lang.Object) synonymsAnalysisTest59);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray64, (-1.0f));
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) '4');
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) '4');
        float[] floatArray78 = new float[] {};
        float[] floatArray79 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray79, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray78, (float) 100);
        java.lang.Object[] objArray84 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertEquals(objArray84, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray74, (java.lang.Object) executorServiceArray85);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray74, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray70, (float) ' ');
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray64, (float) (byte) 10);
        float[] floatArray95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray95, 0.0f);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 2, (long) (byte) 0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) (short) -1);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService11);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = null;
        synonymsAnalysisTest0.analysisService = analysisService13;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest17.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest17.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray13, (java.lang.Object) synonymsAnalysisTest17);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain21);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest26.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = null;
        synonymsAnalysisTest26.setanalysisService(analysisService28);
        synonymsAnalysisTest26.ensureAllSearchContextsReleased();
        synonymsAnalysisTest26.resetCheckIndexStatus();
        synonymsAnalysisTest26.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest26.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) eSLogger33);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2);
        synonymsAnalysisTest2.setIndexWriterMaxDocs(10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest16.setUp();
        synonymsAnalysisTest16.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest16.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest16.overrideTestDefaultQueryCache();
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest26.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest26.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray22, (java.lang.Object) synonymsAnalysisTest26);
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest26.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain30;
        org.elasticsearch.common.logging.ESLogger eSLogger33 = synonymsAnalysisTest16.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest16.analysisService = analysisService34;
        synonymsAnalysisTest16.setIndexWriterMaxDocs(100);
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest16.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.common.logging.ESLogger eSLogger40 = synonymsAnalysisTest39.getlogger();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest39);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest42.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest42.setanalysisService(analysisService44);
        synonymsAnalysisTest42.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest42.assertDocsEnumEquals("tests.badapples", postingsEnum48, postingsEnum49, true);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest56.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger58 = synonymsAnalysisTest56.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray52, (java.lang.Object) synonymsAnalysisTest56);
        org.elasticsearch.index.analysis.AnalysisService analysisService60 = synonymsAnalysisTest56.analysisService;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest61.setUp();
        synonymsAnalysisTest61.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest61.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest61.overrideTestDefaultQueryCache();
        float[] floatArray67 = new float[] {};
        float[] floatArray68 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray68, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService72 = synonymsAnalysisTest71.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger73 = synonymsAnalysisTest71.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray67, (java.lang.Object) synonymsAnalysisTest71);
        org.junit.rules.RuleChain ruleChain75 = synonymsAnalysisTest71.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        synonymsAnalysisTest61.failureAndSuccessEvents = ruleChain75;
        org.elasticsearch.common.logging.ESLogger eSLogger78 = synonymsAnalysisTest61.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService79 = null;
        synonymsAnalysisTest61.analysisService = analysisService79;
        synonymsAnalysisTest61.setIndexWriterMaxDocs(100);
        org.junit.rules.TestRule testRule83 = synonymsAnalysisTest61.ruleChain;
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray84 = new org.elasticsearch.test.ESTestCase[] { synonymsAnalysisTest2, synonymsAnalysisTest16, synonymsAnalysisTest39, synonymsAnalysisTest42, synonymsAnalysisTest56, synonymsAnalysisTest61 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList85 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray84);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest89 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService90 = null;
        synonymsAnalysisTest89.analysisService = analysisService90;
        org.junit.rules.RuleChain ruleChain92 = synonymsAnalysisTest89.failureAndSuccessEvents;
        synonymsAnalysisTest89.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray86, (java.lang.Object) synonymsAnalysisTest89);
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTestCaseArray84, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        long[] longArray4 = new long[] { (byte) 10 };
        long[] longArray6 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray6);
        long[] longArray10 = new long[] { (byte) 10 };
        long[] longArray12 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest15.setUp();
        synonymsAnalysisTest15.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest19.getlogger();
        java.lang.String str22 = synonymsAnalysisTest19.getTestName();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) longArray12, (java.lang.Object) ruleChain23);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) annotatedElementArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) executorServiceArray6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        int[] intArray6 = new int[] { (short) -1, (byte) 1, (short) 10, 'a', (byte) 0, 1 };
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals(intArray9, intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray9);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        int[] intArray5 = new int[] { (byte) 1, 1, ' ', 10, '#' };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals(intArray8, intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (-1), numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) '#', (float) (byte) 10, 10.0f);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.analysisService;
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) 'a');
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest16.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest16.setanalysisService(analysisService18);
        synonymsAnalysisTest16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.awaitsfix", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        synonymsAnalysisTest16.assertTermsEquals("random", indexReader28, terms29, terms30, true);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest16.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum34, postingsEnum35, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest16.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = null;
        synonymsAnalysisTest16.setanalysisService(analysisService39);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        char[] charArray1 = null;
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
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("", charArray10, charArray17);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        org.junit.Assert.assertArrayEquals(charArray6, charArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray22);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest12.assertDocsSkippingEquals("tests.nightly", indexReader22, (int) '#', postingsEnum24, postingsEnum25, true);
        synonymsAnalysisTest12.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest12.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService32);
        org.elasticsearch.common.logging.ESLogger eSLogger34 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) '4', (float) 10, (float) 2);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) '#', (double) (byte) 100, (double) 100L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (-1L), (long) 10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, 10.0d, (double) (-1));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray0, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
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
        char[] charArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = null;
        synonymsAnalysisTest4.analysisService = analysisService5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest4.assertFieldsEquals("tests.weekly", indexReader8, fields9, fields10, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest4.analysisService;
        synonymsAnalysisTest4.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest4.logger;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        java.lang.String str24 = synonymsAnalysisTest17.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest17.analysisService;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("tests.nightly", indexReader27, (int) '#', postingsEnum29, postingsEnum30, true);
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) synonymsAnalysisTest17);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) executorServiceArray37);
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", objArray1, (java.lang.Object[]) executorServiceArray37);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.getlogger();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        synonymsAnalysisTest0.match("random", "tests.slow", "tests.failfast");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 10L, (double) (short) 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) '#', (float) ' ');
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.badapples", postingsEnum7, postingsEnum8, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest1.analysisService = analysisService19;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader22, terms23, terms24, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService27);
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest1.assertFieldsEquals("enwiki.random.lines.txt", indexReader31, fields32, fields33, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest36.assertPositionsSkippingEquals("tests.nightly", indexReader39, (int) (byte) 1, postingsEnum41, postingsEnum42);
        synonymsAnalysisTest36.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest45.setUp();
        synonymsAnalysisTest45.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest49.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger51 = synonymsAnalysisTest49.getlogger();
        java.lang.String str52 = synonymsAnalysisTest49.getTestName();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain53;
        synonymsAnalysisTest36.failureAndSuccessEvents = ruleChain53;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        synonymsAnalysisTest1.assertTermsEquals("random", indexReader58, terms59, terms60, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        synonymsAnalysisTest63.assertFieldsEquals("tests.nightly", indexReader65, fields66, fields67, false);
        java.lang.String str70 = synonymsAnalysisTest63.getTestName();
        synonymsAnalysisTest63.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule72 = synonymsAnalysisTest63.ruleChain;
        org.junit.rules.TestRule testRule73 = synonymsAnalysisTest63.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) indexReader58, (java.lang.Object) testRule73);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        long[] longArray5 = new long[] { 0L, (short) 100, '#', 10, (byte) 10 };
        long[] longArray9 = new long[] { (byte) 10 };
        long[] longArray11 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray9, longArray11);
        long[] longArray15 = new long[] { (byte) 10 };
        long[] longArray17 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray15, longArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray11, longArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray17);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.assertPathHasBeenCleared("hi!");
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", obj1, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 100.0f);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (-1), (double) (short) -1);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0f, (float) 'a', 0.0f);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (byte) 0, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray3, (double) (byte) 100);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        byte[] byteArray1 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray10, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray10);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray28, byteArray31);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray28, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        double[] doubleArray2 = new double[] { 100L };
        double[] doubleArray4 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray4, 100.0d);
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) 2);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 2, 1.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        long[] longArray1 = null;
        long[] longArray5 = new long[] { (byte) 10 };
        long[] longArray7 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray7);
        long[] longArray11 = new long[] { (byte) 10 };
        long[] longArray13 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals(longArray7, longArray11);
        long[] longArray18 = new long[] { (byte) 10 };
        long[] longArray20 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray20);
        long[] longArray24 = new long[] { (byte) 10 };
        long[] longArray26 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray20);
        long[] longArray33 = new long[] { (byte) 10 };
        long[] longArray35 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray33, longArray35);
        long[] longArray39 = new long[] { (byte) 10 };
        long[] longArray41 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals(longArray35, longArray39);
        long[] longArray46 = new long[] { (byte) 10 };
        long[] longArray48 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray46, longArray48);
        long[] longArray52 = new long[] { (byte) 10 };
        long[] longArray54 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray52, longArray54);
        org.junit.Assert.assertArrayEquals(longArray48, longArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals(longArray11, longArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray11);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        java.lang.String str6 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 2);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) -1, (-1L));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.getlogger();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest1.analysisService = analysisService4;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("", postingsEnum7, postingsEnum8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 100.0f, (java.lang.Object) postingsEnum8);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1L), (double) 10L, (double) 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 1L);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        double[] doubleArray3 = new double[] { 100L };
        double[] doubleArray5 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray5, 100.0d);
        double[] doubleArray12 = new double[] { 10, (short) 100, 10L, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray12, (double) 1L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (-1L));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest13.getlogger();
        java.lang.String str16 = synonymsAnalysisTest13.getTestName();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain17;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest21.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger23 = synonymsAnalysisTest21.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService24 = null;
        synonymsAnalysisTest21.analysisService = analysisService24;
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest21.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSLogger20, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 1, (float) 100, (float) (byte) 1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray5);
        java.lang.Object[] objArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray5, objArray14);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals(objArray8, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray28 = new java.util.concurrent.ExecutorService[][] { executorServiceArray25, executorServiceArray26, executorServiceArray27 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList29 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray34 = new java.util.concurrent.ExecutorService[][] { executorServiceArray31, executorServiceArray32, executorServiceArray33 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray34);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray34);
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger3 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.awaitsfix", indexReader7, (int) (short) 1, postingsEnum9, postingsEnum10, false);
        java.lang.String str13 = synonymsAnalysisTest1.getTestName();
        java.lang.Object obj14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, obj14);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) annotatedElementArraySet1);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) 'a', (java.lang.Object) synonymsAnalysisTest2);
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest2.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) analysisService22);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray14);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) annotatedElementArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        java.lang.String str24 = synonymsAnalysisTest17.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService25 = synonymsAnalysisTest17.analysisService;
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest17.getanalysisService();
        synonymsAnalysisTest17.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest17.assertDocsSkippingEquals("tests.monster", indexReader31, 0, postingsEnum33, postingsEnum34, false);
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals(objArray38, (java.lang.Object[]) executorServiceArray39);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest42.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService44 = null;
        synonymsAnalysisTest42.setanalysisService(analysisService44);
        synonymsAnalysisTest42.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        synonymsAnalysisTest42.assertFieldsEquals("tests.awaitsfix", indexReader48, fields49, fields50, false);
        synonymsAnalysisTest42.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) objArray38, (java.lang.Object) synonymsAnalysisTest42);
        synonymsAnalysisTest42.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.junit.Assert.assertNotSame((java.lang.Object) 0, (java.lang.Object) synonymsAnalysisTest42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) annotatedElementArray14, (java.lang.Object) 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        float[] floatArray6 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray11 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray16 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray21 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray26 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray27 = new float[][] { floatArray6, floatArray11, floatArray16, floatArray21, floatArray26 };
        java.util.Set<float[]> floatArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        synonymsAnalysisTest29.assertFieldsEquals("tests.nightly", indexReader31, fields32, fields33, false);
        java.lang.String str36 = synonymsAnalysisTest29.getTestName();
        synonymsAnalysisTest29.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule38 = synonymsAnalysisTest29.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) floatArray27, (java.lang.Object) testRule38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) testRule38);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 100, (double) '#');
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest5.assertFieldsEquals("tests.nightly", indexReader7, fields8, fields9, false);
        java.lang.String str12 = synonymsAnalysisTest5.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService13 = synonymsAnalysisTest5.analysisService;
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest5.ruleChain;
        synonymsAnalysisTest5.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest5.assertPositionsSkippingEquals("tests.nightly", indexReader18, (int) (byte) 10, postingsEnum20, postingsEnum21);
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) ' ');
        java.lang.Class<?> wildcardClass18 = synonymsAnalysisTest0.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest19.getlogger();
        java.lang.String str22 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.assertPathHasBeenCleared("tests.slow");
        synonymsAnalysisTest19.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass18, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) 0.0f, (double) 100);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 0, (-1.0d), 10.0d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (-1));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest11.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest11.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray7, (java.lang.Object) synonymsAnalysisTest11);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain15;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        java.lang.String str26 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService27 = synonymsAnalysisTest19.analysisService;
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest19.assertPositionsSkippingEquals("", indexReader30, (int) (byte) 0, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest19.assertTermsEquals("tests.badapples", indexReader36, terms37, terms38, true);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        synonymsAnalysisTest19.assertTermsEquals("tests.weekly", indexReader42, terms43, terms44, false);
        synonymsAnalysisTest19.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = null;
        synonymsAnalysisTest19.analysisService = analysisService48;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) eSLogger18, (java.lang.Object) analysisService48);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest0.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest0.analysisService = analysisService19;
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain21);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        java.lang.Class<?> wildcardClass14 = assertArray12.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) assertArray12);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray16);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        org.junit.Assert.assertArrayEquals(charArray5, charArray21);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) charArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.nightly", indexReader32, fields33, fields34, false);
        java.lang.String str37 = synonymsAnalysisTest30.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest30.analysisService;
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("", indexReader41, (int) (byte) 0, postingsEnum43, postingsEnum44);
        org.elasticsearch.common.logging.ESLogger eSLogger46 = synonymsAnalysisTest30.logger;
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray5, (java.lang.Object) synonymsAnalysisTest30);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (-1), 0.0f, (float) (byte) -1);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, (double) '#', (double) 100L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, 1.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.nightly", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.assertPathHasBeenCleared("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest13.getlogger();
        java.lang.String str16 = synonymsAnalysisTest13.getTestName();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain17;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService21 = synonymsAnalysisTest0.getanalysisService();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 10.0d, (double) 10L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals(objArray3, (java.lang.Object[]) executorServiceArray4);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray4);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals(objArray8, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest9.assertFieldsEquals("tests.nightly", indexReader11, fields12, fields13, false);
        java.lang.String str16 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest9.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest9.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest9.setanalysisService(analysisService19);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.Class<?> wildcardClass20 = synonymsAnalysisTest1.getClass();
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) '4');
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) '4');
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray30, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray26, 0.0f);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = synonymsAnalysisTest42.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger44 = synonymsAnalysisTest42.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray38, (java.lang.Object) synonymsAnalysisTest42);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray47, (-1.0f));
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray22, floatArray47, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) floatArray47);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (byte) 100, (float) '#', (float) (byte) 1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0f, (float) ' ', 0.0f);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) 1, (float) 1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) '#');
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray13);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.nightly", indexReader24, fields25, fields26, false);
        java.lang.String str29 = synonymsAnalysisTest22.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest22.analysisService;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest22.assertDocsSkippingEquals("tests.nightly", indexReader32, (int) '#', postingsEnum34, postingsEnum35, true);
        synonymsAnalysisTest22.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest22.resetCheckIndexStatus();
        synonymsAnalysisTest22.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule43 = synonymsAnalysisTest22.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray49 = new java.util.concurrent.ExecutorService[][] { executorServiceArray46, executorServiceArray47, executorServiceArray48 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray55 = new java.util.concurrent.ExecutorService[][] { executorServiceArray52, executorServiceArray53, executorServiceArray54 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList56 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray55);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule43, (java.lang.Object) executorServiceArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        synonymsAnalysisTest60.assertFieldsEquals("tests.nightly", indexReader62, fields63, fields64, false);
        java.lang.String str67 = synonymsAnalysisTest60.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService68 = synonymsAnalysisTest60.analysisService;
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        synonymsAnalysisTest60.assertDocsSkippingEquals("tests.nightly", indexReader70, (int) '#', postingsEnum72, postingsEnum73, true);
        synonymsAnalysisTest60.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest60.resetCheckIndexStatus();
        synonymsAnalysisTest60.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule81 = synonymsAnalysisTest60.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray87 = new java.util.concurrent.ExecutorService[][] { executorServiceArray84, executorServiceArray85, executorServiceArray86 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray87);
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray91 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray92 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray93 = new java.util.concurrent.ExecutorService[][] { executorServiceArray90, executorServiceArray91, executorServiceArray92 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList94 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray93);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray87, (java.lang.Object[]) executorServiceArray93);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule81, (java.lang.Object) executorServiceArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray49);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray4, doubleArray6, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray4, (double) (byte) 1);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray7, 100.0d);
        double[] doubleArray12 = new double[] { 100L };
        double[] doubleArray14 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray12, doubleArray14, 100.0d);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray5, doubleArray12, (double) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), 0.0d, (double) 2);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 100.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 'a');
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        synonymsAnalysisTest5.overrideTestDefaultQueryCache();
        synonymsAnalysisTest5.setIndexWriterMaxDocs((int) (short) 0);
        synonymsAnalysisTest5.assertPathHasBeenCleared("<unknown>");
        synonymsAnalysisTest5.restoreIndexWriterMaxDocs();
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest5, obj15);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (byte) 100);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain4;
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService3);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) ruleChain10);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.String str10 = synonymsAnalysisTest3.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest3.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) '#', postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        synonymsAnalysisTest3.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest3.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray30 = new java.util.concurrent.ExecutorService[][] { executorServiceArray27, executorServiceArray28, executorServiceArray29 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray33, executorServiceArray34, executorServiceArray35 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray36);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule24, (java.lang.Object) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, false);
        java.lang.String str48 = synonymsAnalysisTest41.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest41.analysisService;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("tests.nightly", indexReader51, (int) '#', postingsEnum53, postingsEnum54, true);
        synonymsAnalysisTest41.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest41.resetCheckIndexStatus();
        synonymsAnalysisTest41.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule62 = synonymsAnalysisTest41.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray68 = new java.util.concurrent.ExecutorService[][] { executorServiceArray65, executorServiceArray66, executorServiceArray67 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray74 = new java.util.concurrent.ExecutorService[][] { executorServiceArray71, executorServiceArray72, executorServiceArray73 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray74);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule62, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray83 = new java.util.concurrent.ExecutorService[][] { executorServiceArray80, executorServiceArray81, executorServiceArray82 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList84 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray83);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray83);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        java.util.concurrent.ExecutorService[] executorServiceArray92 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray92);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray90, (java.lang.Object[]) executorServiceArray92);
        boolean boolean95 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray86, (java.lang.Object[]) executorServiceArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray90);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, 100.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.awaitsfix", indexReader6, (int) (short) 1, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) ' ', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        short[] shortArray0 = new short[] {};
        short[] shortArray1 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray1);
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.setUp();
        org.junit.rules.RuleChain ruleChain12 = null;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain12;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest10.assertFieldsEquals("", indexReader16, fields17, fields18, true);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray25);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields18, (java.lang.Object) shortArray25);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest30.setUp();
        org.junit.rules.RuleChain ruleChain32 = null;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain32;
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest30.assertFieldsEquals("", indexReader36, fields37, fields38, true);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray45);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields38, (java.lang.Object) shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray25);
        short[] shortArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray51);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.badapples", indexReader14, terms15, terms16, true);
        org.elasticsearch.common.logging.ESLogger eSLogger19 = synonymsAnalysisTest2.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", obj1, (java.lang.Object) eSLogger19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest0.analysisService = analysisService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader21, terms22, terms23, true);
        org.elasticsearch.index.analysis.AnalysisService analysisService26 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService26);
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) (short) 1, (java.lang.Object) locale3);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        long[] longArray3 = new long[] { (byte) 10 };
        long[] longArray5 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray3, longArray5);
        long[] longArray9 = new long[] { (byte) 10 };
        long[] longArray11 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.String str21 = synonymsAnalysisTest14.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest14.analysisService;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.nightly", indexReader24, (int) '#', postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = null;
        synonymsAnalysisTest14.analysisService = analysisService32;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest34.setUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest34.assertPositionsSkippingEquals("tests.nightly", indexReader37, (int) (byte) 1, postingsEnum39, postingsEnum40);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) "tests.nightly");
        synonymsAnalysisTest14.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest14.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) longArray5, (java.lang.Object) ruleChain44);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray2, floatArray5, (float) 10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.nightly", indexReader19, fields20, fields21, false);
        java.lang.String str24 = synonymsAnalysisTest17.getTestName();
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        synonymsAnalysisTest17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        synonymsAnalysisTest17.assertFieldsEquals("tests.awaitsfix", indexReader28, fields29, fields30, false);
        synonymsAnalysisTest17.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest17.ensureCleanedUp();
        synonymsAnalysisTest17.assertPathHasBeenCleared("tests.failfast");
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray5, (java.lang.Object) synonymsAnalysisTest17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService40 = null;
        synonymsAnalysisTest39.analysisService = analysisService40;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest39.assertFieldsEquals("tests.weekly", indexReader43, fields44, fields45, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService48 = synonymsAnalysisTest39.analysisService;
        synonymsAnalysisTest39.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger50 = synonymsAnalysisTest39.logger;
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService57 = synonymsAnalysisTest56.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger58 = synonymsAnalysisTest56.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray52, (java.lang.Object) synonymsAnalysisTest56);
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest56.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain60;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain60);
        synonymsAnalysisTest39.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain60;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain60;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest17, (java.lang.Object) ruleChain60);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        int[] intArray1 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray5);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService5 = synonymsAnalysisTest4.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger6 = synonymsAnalysisTest4.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray0, (java.lang.Object) synonymsAnalysisTest4);
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest4);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest4.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) -1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, true);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest21.setUp();
        synonymsAnalysisTest21.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest21.ensureCleanedUp();
        synonymsAnalysisTest21.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest21);
        synonymsAnalysisTest21.tearDown();
        org.elasticsearch.common.logging.ESLogger eSLogger29 = synonymsAnalysisTest21.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) eSLogger29);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) 10);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) -1, (double) 100);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 100, (long) 100);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.badapples", indexReader13, terms14, terms15, true);
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) eSLogger18);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) -1, (double) 2);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        double[] doubleArray3 = new double[] { 100L };
        double[] doubleArray5 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray5, 100.0d);
        double[] doubleArray10 = new double[] { 100L };
        double[] doubleArray12 = new double[] { 10L };
        org.junit.Assert.assertArrayEquals("", doubleArray10, doubleArray12, 100.0d);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray3, doubleArray10, (double) (-1L));
        double[] doubleArray22 = new double[] { 10.0f, 0, 0L, 0L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray22, (double) 10);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 100, (double) 1L, (double) (byte) 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 10L, (float) (short) 1, 1.0f);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (-1.0d));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray23);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals(objArray27, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray34);
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals(objArray43, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) 1, (java.lang.Object) executorServiceArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest50.assertFieldsEquals("tests.nightly", indexReader52, fields53, fields54, false);
        java.lang.String str57 = synonymsAnalysisTest50.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = synonymsAnalysisTest50.analysisService;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        synonymsAnalysisTest50.assertDocsSkippingEquals("tests.nightly", indexReader60, (int) '#', postingsEnum62, postingsEnum63, true);
        synonymsAnalysisTest50.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest50.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService69 = null;
        synonymsAnalysisTest50.analysisService = analysisService69;
        org.junit.rules.RuleChain ruleChain71 = synonymsAnalysisTest50.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) "", (java.lang.Object) ruleChain71);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.nightly", indexReader4, fields5, fields6, false);
        java.lang.String str9 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest2.analysisService;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) '#', postingsEnum14, postingsEnum15, true);
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        synonymsAnalysisTest2.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest2.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray29 = new java.util.concurrent.ExecutorService[][] { executorServiceArray26, executorServiceArray27, executorServiceArray28 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray35 = new java.util.concurrent.ExecutorService[][] { executorServiceArray32, executorServiceArray33, executorServiceArray34 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray35);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule23, (java.lang.Object) executorServiceArray29);
        org.junit.rules.RuleChain[][][] ruleChainArray39 = new org.junit.rules.RuleChain[][][] {};
        java.util.Set<org.junit.rules.RuleChain[][]> ruleChainArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) ruleChainArray39);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) (byte) 1, (double) '4');
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest0.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService11);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.badapples", indexReader17, (int) '4', postingsEnum19, postingsEnum20, true);
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray15);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray31, byteArray34);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray31, byteArray46);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 1L, (long) 100);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray4);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray18 = new java.util.concurrent.ExecutorService[][] { executorServiceArray15, executorServiceArray16, executorServiceArray17 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray24 = new java.util.concurrent.ExecutorService[][] { executorServiceArray21, executorServiceArray22, executorServiceArray23 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray24);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray24);
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), 1.0f, 0.0f);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        float[] floatArray5 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray10 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray15 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray20 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray25 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray26 = new float[][] { floatArray5, floatArray10, floatArray15, floatArray20, floatArray25 };
        java.util.Set<float[]> floatArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray26);
        java.util.Set<java.lang.Cloneable> cloneableSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) floatArray26);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.failfast", "hi!", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) floatArray26, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest19.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger21 = synonymsAnalysisTest19.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray15, (java.lang.Object) synonymsAnalysisTest19);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain23);
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain23;
        synonymsAnalysisTest2.setUp();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) "tests.badapples");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService31 = null;
        synonymsAnalysisTest30.analysisService = analysisService31;
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain34 = null;
        synonymsAnalysisTest30.failureAndSuccessEvents = ruleChain34;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) "tests.failfast", (java.lang.Object) ruleChain34);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        float[] floatArray4 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray9 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray14 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray19 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray24 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray25 = new float[][] { floatArray4, floatArray9, floatArray14, floatArray19, floatArray24 };
        java.util.Set<float[]> floatArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray25);
        java.util.Set<java.lang.Cloneable> cloneableSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) floatArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableSet27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) cloneableSet27);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (short) 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 1);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.String str21 = synonymsAnalysisTest14.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService22 = synonymsAnalysisTest14.analysisService;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.nightly", indexReader24, (int) '#', postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.assertPathHasBeenCleared("hi!");
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest14.assertPositionsSkippingEquals("", indexReader36, (int) (short) 10, postingsEnum38, postingsEnum39);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, false);
        java.lang.String str48 = synonymsAnalysisTest41.getTestName();
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest41.failureAndSuccessEvents;
        org.elasticsearch.common.logging.ESLogger eSLogger50 = synonymsAnalysisTest41.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum38, (java.lang.Object) eSLogger50);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (-1L));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, 100.0d, 10.0d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
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
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals(charArray16, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray24, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray31);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals(charArray24, charArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray12, charArray37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest41.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest41.setanalysisService(analysisService43);
        synonymsAnalysisTest41.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.awaitsfix", indexReader47, fields48, fields49, false);
        synonymsAnalysisTest41.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest41.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest41.overrideTestDefaultQueryCache();
        synonymsAnalysisTest41.ensureCleanedUp();
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest41.getlogger();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray37, (java.lang.Object) eSLogger57);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals(objArray3, (java.lang.Object[]) executorServiceArray4);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray4);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals(objArray8, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray14, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain22);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest29.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest29.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray25, (java.lang.Object) synonymsAnalysisTest29);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        synonymsAnalysisTest35.assertFieldsEquals("tests.nightly", indexReader37, fields38, fields39, false);
        java.lang.String str42 = synonymsAnalysisTest35.getTestName();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest35.failureAndSuccessEvents;
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest49.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger51 = synonymsAnalysisTest49.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray45, (java.lang.Object) synonymsAnalysisTest49);
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest49.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain53;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain53);
        org.junit.rules.RuleChain[] ruleChainArray56 = new org.junit.rules.RuleChain[] { ruleChain22, ruleChain33, ruleChain43, ruleChain53 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet57 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray56);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChainArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) ruleChainArray56);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        java.lang.String str7 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields16, false);
        java.lang.String str19 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService20 = synonymsAnalysisTest12.analysisService;
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        org.elasticsearch.common.logging.ESLogger eSLogger28 = synonymsAnalysisTest12.logger;
        java.lang.String str29 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.common.logging.ESLogger eSLogger30 = synonymsAnalysisTest12.getlogger();
        synonymsAnalysisTest12.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest32.analysisService = analysisService33;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        synonymsAnalysisTest32.assertFieldsEquals("tests.weekly", indexReader36, fields37, fields38, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest32.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService42 = synonymsAnalysisTest32.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService43 = null;
        synonymsAnalysisTest32.setanalysisService(analysisService43);
        synonymsAnalysisTest32.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService46 = null;
        synonymsAnalysisTest32.setanalysisService(analysisService46);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) analysisService46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) '4', (double) 'a', (double) (-1L));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 100.0f, 0.0d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) '#');
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        long[] longArray5 = new long[] { (byte) 10 };
        long[] longArray7 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray7);
        long[] longArray11 = new long[] { (byte) 10 };
        long[] longArray13 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray13);
        long[] longArray19 = new long[] { (byte) 10 };
        long[] longArray21 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray19, longArray21);
        long[] longArray25 = new long[] { (byte) 10 };
        long[] longArray27 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray25, longArray27);
        org.junit.Assert.assertArrayEquals(longArray21, longArray25);
        long[] longArray32 = new long[] { (byte) 10 };
        long[] longArray34 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray32, longArray34);
        long[] longArray38 = new long[] { (byte) 10 };
        long[] longArray40 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray38, longArray40);
        org.junit.Assert.assertArrayEquals(longArray34, longArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray25, longArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray13, longArray25);
        long[] longArray46 = new long[] { (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray25, longArray46);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 0L, (float) 100, (float) 1L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = null;
        synonymsAnalysisTest0.analysisService = analysisService7;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, false);
        java.lang.String str17 = synonymsAnalysisTest10.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = synonymsAnalysisTest10.analysisService;
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("", indexReader21, (int) (byte) 0, postingsEnum23, postingsEnum24);
        org.elasticsearch.common.logging.ESLogger eSLogger26 = synonymsAnalysisTest10.logger;
        java.lang.String str27 = synonymsAnalysisTest10.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.nightly", indexReader29, fields30, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        synonymsAnalysisTest10.assertTermsEquals("<unknown>", indexReader35, terms36, terms37, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) indexReader35);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest0.analysisService = analysisService18;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest20.setUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("tests.nightly", indexReader23, (int) (byte) 1, postingsEnum25, postingsEnum26);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "tests.nightly");
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        synonymsAnalysisTest31.assertFieldsEquals("tests.nightly", indexReader33, fields34, fields35, false);
        java.lang.String str38 = synonymsAnalysisTest31.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService39 = synonymsAnalysisTest31.analysisService;
        synonymsAnalysisTest31.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = synonymsAnalysisTest31.getanalysisService();
        synonymsAnalysisTest31.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("tests.monster", indexReader45, 0, postingsEnum47, postingsEnum48, false);
        synonymsAnalysisTest31.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        synonymsAnalysisTest31.assertTermsEquals("tests.failfast", indexReader53, terms54, terms55, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) terms55);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0L, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertArrayEquals(intArray4, intArray21);
        int[] intArray32 = new int[] { 0, (byte) 1, 0, (-1), 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray32);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), 10L);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest0.logger;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.nightly", indexReader18, fields19, fields20, false);
        java.lang.String str23 = synonymsAnalysisTest16.getTestName();
        synonymsAnalysisTest16.ensureAllSearchContextsReleased();
        synonymsAnalysisTest16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest16.assertFieldsEquals("tests.awaitsfix", indexReader27, fields28, fields29, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) (byte) 10, (float) 2);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
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
        org.junit.Assert.assertArrayEquals(charArray0, charArray8);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("", charArray28, charArray35);
        org.junit.Assert.assertArrayEquals(charArray24, charArray28);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray28, charArray41);
        org.junit.Assert.assertArrayEquals(charArray0, charArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.lang.Object[] objArray55 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals(objArray55, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray56, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray41, (java.lang.Object) executorServiceArray56);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        long[] longArray1 = null;
        long[] longArray5 = new long[] { (byte) 10 };
        long[] longArray7 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray7);
        long[] longArray11 = new long[] { (byte) 10 };
        long[] longArray13 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals(longArray7, longArray11);
        long[] longArray18 = new long[] { (byte) 10 };
        long[] longArray20 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray18, longArray20);
        long[] longArray24 = new long[] { (byte) 10 };
        long[] longArray26 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray24, longArray26);
        org.junit.Assert.assertArrayEquals(longArray20, longArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray11, longArray20);
        long[] longArray33 = new long[] { (byte) 10 };
        long[] longArray35 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray33, longArray35);
        long[] longArray39 = new long[] { (byte) 10 };
        long[] longArray41 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray39, longArray41);
        org.junit.Assert.assertArrayEquals(longArray35, longArray39);
        long[] longArray46 = new long[] { (byte) 10 };
        long[] longArray48 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray46, longArray48);
        long[] longArray52 = new long[] { (byte) 10 };
        long[] longArray54 = new long[] { (byte) 10 };
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray52, longArray54);
        org.junit.Assert.assertArrayEquals(longArray48, longArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals(longArray11, longArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray11);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
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
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("", charArray10, charArray17);
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        org.junit.Assert.assertArrayEquals(charArray6, charArray22);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) charArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray11);
        int[] intArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray15);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.common.logging.ESLogger eSLogger16 = synonymsAnalysisTest0.logger;
        java.lang.String str17 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", (int) (short) 0, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray8);
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray13);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray18);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray21, intArray22);
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        org.junit.Assert.assertArrayEquals(intArray4, intArray21);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals("hi!", intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray27);
        int[] intArray31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray27, intArray31);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals(objArray15, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray16, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray45);
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals(objArray49, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", objArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 0, (double) 10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) '4');
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) '4');
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray9, (float) 100);
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertEquals(objArray15, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray5, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray4);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = null;
        synonymsAnalysisTest46.analysisService = analysisService47;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.weekly", indexReader50, fields51, fields52, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService55 = synonymsAnalysisTest46.analysisService;
        synonymsAnalysisTest46.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger57 = synonymsAnalysisTest46.logger;
        synonymsAnalysisTest46.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        synonymsAnalysisTest59.assertFieldsEquals("tests.nightly", indexReader61, fields62, fields63, false);
        java.lang.String str66 = synonymsAnalysisTest59.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService67 = synonymsAnalysisTest59.analysisService;
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        synonymsAnalysisTest59.assertDocsSkippingEquals("tests.nightly", indexReader69, (int) '#', postingsEnum71, postingsEnum72, true);
        synonymsAnalysisTest59.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest46, (java.lang.Object) synonymsAnalysisTest59);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) synonymsAnalysisTest59, (java.lang.Object) executorServiceArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray79);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) ' ');
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.nightly", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.String str14 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        java.lang.Class<?> wildcardClass16 = synonymsAnalysisTest1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) wildcardClass16);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 'a');
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0d, (double) (short) 10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray16);
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray9, charArray22);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray37, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("", charArray37, charArray44);
        org.junit.Assert.assertArrayEquals(charArray33, charArray37);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray37, charArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray27, charArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray9, charArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray9);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray9, charArray10);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        org.junit.Assert.assertArrayEquals(charArray9, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray9, charArray16);
        org.junit.Assert.assertArrayEquals(charArray1, charArray9);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("", charArray29, charArray36);
        org.junit.Assert.assertArrayEquals(charArray25, charArray29);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray29, charArray42);
        org.junit.Assert.assertArrayEquals(charArray1, charArray42);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        synonymsAnalysisTest46.assertFieldsEquals("tests.nightly", indexReader48, fields49, fields50, false);
        java.lang.String str53 = synonymsAnalysisTest46.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = synonymsAnalysisTest46.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) charArray42, (java.lang.Object) synonymsAnalysisTest46);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest2.logger;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        synonymsAnalysisTest15.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, false);
        java.lang.String str22 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService23 = synonymsAnalysisTest15.analysisService;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertDocsSkippingEquals("tests.nightly", indexReader25, (int) '#', postingsEnum27, postingsEnum28, true);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest15);
        java.lang.Class<?> wildcardClass34 = synonymsAnalysisTest15.getClass();
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray42);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals(objArray48, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray49);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService58 = null;
        synonymsAnalysisTest57.analysisService = analysisService58;
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest57.failureAndSuccessEvents;
        synonymsAnalysisTest57.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray54, (java.lang.Object) synonymsAnalysisTest57);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) executorServiceArray40);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService7 = synonymsAnalysisTest6.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = synonymsAnalysisTest6.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray2, (java.lang.Object) synonymsAnalysisTest6);
        float[] floatArray10 = new float[] {};
        float[] floatArray11 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray11, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray11, (-1.0f));
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) '4');
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray21, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray20, (float) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray2, floatArray20, 0.0f);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = synonymsAnalysisTest33.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger35 = synonymsAnalysisTest33.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray29, (java.lang.Object) synonymsAnalysisTest33);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray38, (-1.0f));
        float[] floatArray43 = new float[] {};
        float[] floatArray44 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray44, (float) '4');
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) '4');
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray52, (float) 100);
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals(objArray58, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray48, (java.lang.Object) executorServiceArray59);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray48, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray44, (float) ' ');
        float[] floatArray67 = new float[] {};
        float[] floatArray68 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray68, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest71 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService72 = synonymsAnalysisTest71.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger73 = synonymsAnalysisTest71.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray67, (java.lang.Object) synonymsAnalysisTest71);
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray76, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray76, (-1.0f));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray38, floatArray67, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray20, floatArray67, (float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.slow");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) (short) 100, 0.0f);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray14, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain22);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader29, (int) (byte) -1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.analysis.AnalysisService analysisService34 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService34);
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest1.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService2);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.weekly");
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) (byte) 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray11);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals(objArray27, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray28, (java.lang.Object) 0L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray57);
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.lang.Object[] objArray61 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals(objArray61, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService4 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService4);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.awaitsfix", indexReader8, fields9, fields10, false);
        java.lang.Class<?> wildcardClass13 = synonymsAnalysisTest2.getClass();
        org.junit.rules.TestRule testRule14 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) testRule14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) testRule14);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 'a');
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (short) 0, (double) (byte) 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.failfast", "hi!", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray5);
        float[] floatArray13 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray18 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray23 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray28 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray33 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray34 = new float[][] { floatArray13, floatArray18, floatArray23, floatArray28, floatArray33 };
        java.util.Set<float[]> floatArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest36 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest36.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, false);
        java.lang.String str43 = synonymsAnalysisTest36.getTestName();
        synonymsAnalysisTest36.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest36.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) floatArray34, (java.lang.Object) testRule45);
        java.util.Set<float[]> floatArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) floatArray34);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader3, (int) (short) 0, postingsEnum5, postingsEnum6, false);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest13.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = synonymsAnalysisTest13.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray9, (java.lang.Object) synonymsAnalysisTest13);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray18, (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) floatArray9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) (byte) 1, (float) '4', (float) (byte) 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) '#', (long) (short) -1);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 'a', 100.0d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0f), (float) 'a', (float) (byte) 1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService6 = synonymsAnalysisTest5.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger7 = synonymsAnalysisTest5.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray1, (java.lang.Object) synonymsAnalysisTest5);
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray10, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray10, (-1.0f));
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray16, (float) '4');
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray20, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray19, (float) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray19, 0.0f);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) '4');
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray31, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray27, (float) 'a');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        synonymsAnalysisTest39.assertFieldsEquals("tests.nightly", indexReader41, fields42, fields43, false);
        java.lang.String str46 = synonymsAnalysisTest39.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = synonymsAnalysisTest39.analysisService;
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest39.ruleChain;
        synonymsAnalysisTest39.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.common.logging.ESLogger eSLogger51 = synonymsAnalysisTest39.logger;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray27, (java.lang.Object) synonymsAnalysisTest39);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 10, (long) (byte) 100);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray1, shortArray4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (byte) -1, 1.0f, (float) 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = null;
        synonymsAnalysisTest0.analysisService = analysisService1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService14 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService15);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = null;
        synonymsAnalysisTest0.setanalysisService(analysisService17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        java.lang.String str26 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        synonymsAnalysisTest19.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest19.assertFieldsEquals("tests.awaitsfix", indexReader30, fields31, fields32, false);
        synonymsAnalysisTest19.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest19.ensureCleanedUp();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest19.analysisService;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) analysisService17, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, (double) (-1L));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 1, (float) (short) -1, (float) 0L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService1 = synonymsAnalysisTest0.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger2 = synonymsAnalysisTest0.logger;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader5, (int) (short) 10, postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (byte) -1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1L), (long) 10);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService10 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = synonymsAnalysisTest1.logger;
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = synonymsAnalysisTest18.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger20 = synonymsAnalysisTest18.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray14, (java.lang.Object) synonymsAnalysisTest18);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain22);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService28 = synonymsAnalysisTest1.getanalysisService();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService32 = synonymsAnalysisTest31.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService33 = null;
        synonymsAnalysisTest31.setanalysisService(analysisService33);
        synonymsAnalysisTest31.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest31);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray15 = new java.util.concurrent.ExecutorService[][] { executorServiceArray12, executorServiceArray13, executorServiceArray14 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray21 = new java.util.concurrent.ExecutorService[][] { executorServiceArray18, executorServiceArray19, executorServiceArray20 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList22 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray21);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest7.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger9 = synonymsAnalysisTest7.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray3, (java.lang.Object) synonymsAnalysisTest7);
        float[] floatArray11 = new float[] {};
        float[] floatArray12 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray12, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray12, (-1.0f));
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) '4');
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray21, (float) 100);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray3, floatArray21, 0.0f);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService35 = synonymsAnalysisTest34.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger36 = synonymsAnalysisTest34.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray30, (java.lang.Object) synonymsAnalysisTest34);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray39, (-1.0f));
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray45, (float) '4');
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) '4');
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray53, (float) 100);
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals(objArray59, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertNotSame("", (java.lang.Object) floatArray49, (java.lang.Object) executorServiceArray60);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray49, (float) (short) 10);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray45, (float) ' ');
        float[] floatArray68 = new float[] {};
        float[] floatArray69 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray69, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService73 = synonymsAnalysisTest72.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger74 = synonymsAnalysisTest72.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray68, (java.lang.Object) synonymsAnalysisTest72);
        float[] floatArray76 = new float[] {};
        float[] floatArray77 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray77, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray77, (-1.0f));
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray39, floatArray68, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray21, floatArray68, (float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray68, (float) (short) 10);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, 0.0d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService2 = null;
        synonymsAnalysisTest1.analysisService = analysisService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.weekly", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = synonymsAnalysisTest1.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService16 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService16);
        org.elasticsearch.index.analysis.AnalysisService analysisService18 = null;
        synonymsAnalysisTest1.setanalysisService(analysisService18);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals(objArray22, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        synonymsAnalysisTest27.assertFieldsEquals("tests.nightly", indexReader29, fields30, fields31, false);
        java.lang.String str34 = synonymsAnalysisTest27.getTestName();
        synonymsAnalysisTest27.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest27.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule36;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) "random", (java.lang.Object) testRule36);
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService18, (java.lang.Object) testRule36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService41 = null;
        synonymsAnalysisTest40.analysisService = analysisService41;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.weekly", indexReader44, fields45, fields46, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest40.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService50 = synonymsAnalysisTest40.getanalysisService();
        org.elasticsearch.index.analysis.AnalysisService analysisService51 = null;
        synonymsAnalysisTest40.setanalysisService(analysisService51);
        synonymsAnalysisTest40.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.AnalysisService analysisService54 = null;
        synonymsAnalysisTest40.setanalysisService(analysisService54);
        synonymsAnalysisTest40.assertPathHasBeenCleared("tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) analysisService18, (java.lang.Object) synonymsAnalysisTest40);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService3 = null;
        synonymsAnalysisTest2.analysisService = analysisService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, false);
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest2.analysisService;
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest2.analysisService;
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.failfast");
        org.elasticsearch.index.analysis.AnalysisService analysisService15 = null;
        synonymsAnalysisTest2.setanalysisService(analysisService15);
        org.elasticsearch.index.analysis.AnalysisService analysisService17 = synonymsAnalysisTest2.analysisService;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) analysisService17, (java.lang.Object) executorServiceArray22);
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals(objArray35, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray36);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals(objArray40, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService47 = null;
        synonymsAnalysisTest46.analysisService = analysisService47;
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain50 = null;
        synonymsAnalysisTest46.failureAndSuccessEvents = ruleChain50;
        synonymsAnalysisTest46.ensureCleanedUp();
        synonymsAnalysisTest46.overrideTestDefaultQueryCache();
        float[] floatArray59 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray64 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray69 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray74 = new float[] { (short) 0, (-1), 100, 0L };
        float[] floatArray79 = new float[] { (short) 0, (-1), 100, 0L };
        float[][] floatArray80 = new float[][] { floatArray59, floatArray64, floatArray69, floatArray74, floatArray79 };
        java.util.Set<float[]> floatArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray80);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest82 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Fields fields85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        synonymsAnalysisTest82.assertFieldsEquals("tests.nightly", indexReader84, fields85, fields86, false);
        java.lang.String str89 = synonymsAnalysisTest82.getTestName();
        synonymsAnalysisTest82.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule91 = synonymsAnalysisTest82.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) floatArray80, (java.lang.Object) testRule91);
        java.util.Set<float[]> floatArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray80);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest46, (java.lang.Object) floatArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) floatArray80);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest13.setUp();
        org.junit.rules.RuleChain ruleChain15 = null;
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest13.assertFieldsEquals("", indexReader19, fields20, fields21, true);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray25);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray28);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields21, (java.lang.Object) shortArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest33.setUp();
        org.junit.rules.RuleChain ruleChain35 = null;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest33.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        synonymsAnalysisTest33.assertFieldsEquals("", indexReader39, fields40, fields41, true);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray48);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) fields41, (java.lang.Object) shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray48);
        org.junit.Assert.assertArrayEquals("hi!", shortArray5, shortArray28);
        short[] shortArray54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray54);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 'a', (long) 'a');
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) 0L, (-1.0f));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray0);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.nightly", indexReader5, fields6, fields7, false);
        java.lang.String str10 = synonymsAnalysisTest3.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest3.analysisService;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("tests.nightly", indexReader13, (int) '#', postingsEnum15, postingsEnum16, true);
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        synonymsAnalysisTest3.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest3.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray30 = new java.util.concurrent.ExecutorService[][] { executorServiceArray27, executorServiceArray28, executorServiceArray29 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray36 = new java.util.concurrent.ExecutorService[][] { executorServiceArray33, executorServiceArray34, executorServiceArray35 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray36);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule24, (java.lang.Object) executorServiceArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest41.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, false);
        java.lang.String str48 = synonymsAnalysisTest41.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService49 = synonymsAnalysisTest41.analysisService;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest41.assertDocsSkippingEquals("tests.nightly", indexReader51, (int) '#', postingsEnum53, postingsEnum54, true);
        synonymsAnalysisTest41.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest41.resetCheckIndexStatus();
        synonymsAnalysisTest41.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule62 = synonymsAnalysisTest41.ruleChain;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray68 = new java.util.concurrent.ExecutorService[][] { executorServiceArray65, executorServiceArray66, executorServiceArray67 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray74 = new java.util.concurrent.ExecutorService[][] { executorServiceArray71, executorServiceArray72, executorServiceArray73 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, executorServiceArray74);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule62, (java.lang.Object) executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray0, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader2, fields3, fields4, false);
        java.lang.String str7 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService8 = synonymsAnalysisTest0.analysisService;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest23.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest23.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService29 = null;
        synonymsAnalysisTest23.analysisService = analysisService29;
        synonymsAnalysisTest23.ensureAllSearchContextsReleased();
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService38 = synonymsAnalysisTest37.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger39 = synonymsAnalysisTest37.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray33, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest37.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotNull("", (java.lang.Object) ruleChain41);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        synonymsAnalysisTest23.failureAndSuccessEvents = ruleChain41;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain41);
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("random", 0, numericDocValues49, numericDocValues50);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.AnalysisService analysisService11 = synonymsAnalysisTest1.getanalysisService();
        org.junit.Assert[] assertArray12 = new org.junit.Assert[] { synonymsAnalysisTest1 };
        java.util.Set<org.junit.Assert> assertSet13 = org.apache.lucene.util.LuceneTestCase.asSet(assertArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.nightly", indexReader16, fields17, fields18, false);
        java.lang.String str21 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        synonymsAnalysisTest14.assertFieldsEquals("tests.awaitsfix", indexReader25, fields26, fields27, false);
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) ' ');
        synonymsAnalysisTest14.ensureCleanedUp();
        synonymsAnalysisTest14.assertPathHasBeenCleared("tests.failfast");
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) assertSet13, (java.lang.Object) synonymsAnalysisTest14);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest14.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader3, fields4, fields5, false);
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.AnalysisService analysisService9 = synonymsAnalysisTest1.analysisService;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService30 = synonymsAnalysisTest29.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger31 = synonymsAnalysisTest29.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray25, (java.lang.Object) synonymsAnalysisTest29);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest29.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) testRule35);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.monster");
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) '4');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.elasticsearch.index.analysis.AnalysisService analysisService12 = synonymsAnalysisTest11.analysisService;
        org.elasticsearch.common.logging.ESLogger eSLogger13 = synonymsAnalysisTest11.logger;
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray7, (java.lang.Object) synonymsAnalysisTest11);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain15;
        org.elasticsearch.common.logging.ESLogger eSLogger18 = synonymsAnalysisTest1.logger;
        org.elasticsearch.index.analysis.AnalysisService analysisService19 = null;
        synonymsAnalysisTest1.analysisService = analysisService19;
        synonymsAnalysisTest1.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }
}

