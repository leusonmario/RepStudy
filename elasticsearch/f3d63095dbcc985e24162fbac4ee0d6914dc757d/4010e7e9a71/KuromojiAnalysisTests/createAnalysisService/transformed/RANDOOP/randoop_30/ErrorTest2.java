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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.monster");
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests26.assertPositionsSkippingEquals("hi!", indexReader34, (int) (byte) 0, postingsEnum36, postingsEnum37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        kuromojiAnalysisTests26.assertTermsEquals("random", indexReader40, terms41, terms42, true);
        kuromojiAnalysisTests26.setUp();
        kuromojiAnalysisTests26.tearDown();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("", indexReader48, fields49, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests26.assertTermsEquals("", indexReader54, terms55, terms56, true);
        kuromojiAnalysisTests26.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests26);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.List<java.io.Serializable> serializableList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, (double) 'a');
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet15, (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum46, postingsEnum47, true);
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum52, postingsEnum53);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        double[] doubleArray47 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray52 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray47, doubleArray52, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray47, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray34, (-1.0d));
        double[] doubleArray65 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray70 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray65, doubleArray70, (double) (byte) 100);
        double[] doubleArray78 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray83 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray78, doubleArray83, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray65, doubleArray78, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray20, doubleArray78, (double) 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray20, (double) (short) 1);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, 100.0d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray6, shortArray12);
        short[] shortArray17 = new short[] { (short) 10 };
        short[] shortArray19 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        short[] shortArray24 = new short[] { (short) 10 };
        short[] shortArray26 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray26);
        short[] shortArray31 = new short[] { (short) 10 };
        short[] shortArray33 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray33);
        short[] shortArray37 = new short[] { (short) 10 };
        short[] shortArray39 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray33, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray39);
        short[] shortArray46 = new short[] { (short) 10 };
        short[] shortArray48 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray48);
        short[] shortArray52 = new short[] { (short) 10 };
        short[] shortArray54 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray54);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray48, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray54);
        short[] shortArray60 = new short[] { (short) 10 };
        short[] shortArray62 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray62);
        short[] shortArray67 = new short[] { (short) 10 };
        short[] shortArray69 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray67, shortArray69);
        short[] shortArray73 = new short[] { (short) 10 };
        short[] shortArray75 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray69, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray75);
        short[] shortArray82 = new short[] { (short) 10 };
        short[] shortArray84 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray82, shortArray84);
        short[] shortArray88 = new short[] { (short) 10 };
        short[] shortArray90 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray88, shortArray90);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray84, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", 10, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        char[] charArray4 = new char[] { '#', 'a', '#' };
        char[] charArray8 = new char[] { '4', '4', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0L, (long) 100);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray18 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray8, floatArray18, (float) 1L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        float[] floatArray5 = new float[] { 1.0f, ' ', ' ', '#' };
        float[] floatArray14 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray21 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray14, floatArray21, (float) (byte) 100);
        float[] floatArray31 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray38 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray31, floatArray38, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray14, floatArray31, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray5, floatArray14, (float) 100L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        double[] doubleArray5 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray10, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        double[] doubleArray33 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray38 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray38, (double) (byte) 100);
        double[] doubleArray46 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray51 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray46, doubleArray51, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray46, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray33, (-1.0d));
        double[] doubleArray64 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray69 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray69, (double) (byte) 100);
        double[] doubleArray77 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray82 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray77, doubleArray82, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray77, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray19, doubleArray77, (double) 10.0f);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray19, (double) 0);
        double[] doubleArray96 = new double[] { (short) -1, ' ', (-1L), 0L, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray96, (double) 1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (long) (byte) 0, (long) (short) 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (byte) -1, (double) (short) 0, (double) '4');
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray2);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray2);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet13, (java.lang.Object) kuromojiAnalysisTests14);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests14.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, true);
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests14.ruleChain;
        kuromojiAnalysisTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.badapples", indexReader26, terms27, terms28, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) strComparableSet4, (java.lang.Object) false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (byte) 100);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
        long[] longArray11 = new long[] { 1 };
        long[] longArray13 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray11, longArray13);
        long[] longArray17 = new long[] { 1 };
        long[] longArray19 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray17, longArray19);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray13, longArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray17);
        long[] longArray26 = new long[] { 1 };
        long[] longArray28 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray26, longArray28);
        long[] longArray32 = new long[] { 1 };
        long[] longArray34 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray32, longArray34);
        org.junit.Assert.assertArrayEquals("random", longArray28, longArray34);
        long[] longArray40 = new long[] { 1 };
        long[] longArray42 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray40, longArray42);
        long[] longArray47 = new long[] { 1 };
        long[] longArray49 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray47, longArray49);
        long[] longArray53 = new long[] { 1 };
        long[] longArray55 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray53, longArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray49, longArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray40, longArray53);
        org.junit.Assert.assertArrayEquals(longArray34, longArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray4, longArray34);
        long[] longArray64 = new long[] { 1 };
        long[] longArray66 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray64, longArray66);
        long[] longArray71 = new long[] { 1 };
        long[] longArray73 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray71, longArray73);
        long[] longArray77 = new long[] { 1 };
        long[] longArray79 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray77, longArray79);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray73, longArray77);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray64, longArray77);
        org.junit.Assert.assertArrayEquals(longArray34, longArray77);
        long[] longArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray34, longArray84);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale6, locale8, locale10, locale12, locale14 };
        java.util.Set<java.util.Locale> localeSet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        java.util.List<java.io.Serializable> serializableList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray15);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray15, (java.lang.Object) 0.0f);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray32, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray15, (java.lang.Object[]) localeArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) localeArray15);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests15.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests15);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum28, postingsEnum29, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray2);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet4 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray2);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1, (java.lang.Object) genericDeclarationArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) genericDeclarationArray2, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, obj17);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0L, (long) '4');
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', 10.0f, (float) (byte) 10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        kuromojiAnalysisTests9.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.badapples", indexReader21, terms22, terms23, false);
        short[] shortArray28 = new short[] { (short) 10 };
        short[] shortArray30 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray28, shortArray30);
        short[] shortArray35 = new short[] { (short) 10 };
        short[] shortArray37 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray35, shortArray37);
        short[] shortArray41 = new short[] { (short) 10 };
        short[] shortArray43 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray41, shortArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray37, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray43);
        short[] shortArray50 = new short[] { (short) 10 };
        short[] shortArray52 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray50, shortArray52);
        short[] shortArray56 = new short[] { (short) 10 };
        short[] shortArray58 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray56, shortArray58);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray52, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray58);
        short[] shortArray66 = new short[] { (short) 10 };
        short[] shortArray68 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray68);
        short[] shortArray72 = new short[] { (short) 10 };
        short[] shortArray74 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray68, shortArray74);
        short[] shortArray80 = new short[] { (short) 10 };
        short[] shortArray82 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray80, shortArray82);
        short[] shortArray86 = new short[] { (short) 10 };
        short[] shortArray88 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray86, shortArray88);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray82, shortArray88);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray68, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) shortArray88);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        java.util.Set<java.lang.Cloneable> cloneableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray29, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray29);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale39, locale41, locale43, locale45, locale47 };
        java.util.Set<java.util.Locale> localeSet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        java.util.List<java.io.Serializable> serializableList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray48);
        java.util.Set<java.lang.Cloneable> cloneableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray48);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray48, (java.lang.Object) (byte) -1);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale56, locale58, locale60, locale62, locale64 };
        java.util.Set<java.util.Locale> localeSet66 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray65);
        java.util.List<java.io.Serializable> serializableList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray65);
        java.util.Set<java.lang.Cloneable> cloneableSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray65);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray65, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray48, (java.lang.Object[]) localeArray65);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests72 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        kuromojiAnalysisTests72.assertFieldsEquals("europarl.lines.txt.gz", indexReader74, fields75, fields76, false);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        kuromojiAnalysisTests72.assertPositionsSkippingEquals("tests.failfast", indexReader80, 1, postingsEnum82, postingsEnum83);
        kuromojiAnalysisTests72.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests72.ensureCleanedUp();
        kuromojiAnalysisTests72.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray65, (java.lang.Object) kuromojiAnalysisTests72);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray65);
        java.lang.Object[] objArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, objArray91);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass5 = locale4.getClass();
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass8 = locale7.getClass();
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass11 = locale10.getClass();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass14 = locale13.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet16 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray24 = new java.util.concurrent.ExecutorService[][] { executorServiceArray18, executorServiceArray19, executorServiceArray20, executorServiceArray21, executorServiceArray22, executorServiceArray23 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray15, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader16, terms17, terms18, true);
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule26 = kuromojiAnalysisTests2.ruleChain;
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) testRule26, (java.lang.Object) 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) testRule26);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) ' ', (float) (short) 1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (long) (byte) 100, (long) (byte) 100);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) ' ');
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) -1);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) '#', (double) 100.0f);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, 0.0d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests2.assertTermsEquals("random", indexReader16, terms17, terms18, true);
        kuromojiAnalysisTests2.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.nightly", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        kuromojiAnalysisTests27.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("hi!", indexReader46, (int) (byte) 0, postingsEnum48, postingsEnum49);
        kuromojiAnalysisTests38.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests2, kuromojiAnalysisTests27, kuromojiAnalysisTests38 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet53 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray52);
        java.util.Set<org.junit.Assert> assertSet54 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray52);
        org.junit.rules.RuleChain[] ruleChainArray55 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray56 = new org.junit.rules.RuleChain[][] { ruleChainArray55 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray56);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTestsArray52, (java.lang.Object) ruleChainArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) kuromojiAnalysisTestsArray52);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale1, locale3, locale5 };
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale8, locale10, locale12 };
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale15, locale17, locale19 };
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale22, locale24, locale26 };
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale29, locale31, locale33 };
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale36, locale38, locale40 };
        java.util.Locale[][] localeArray42 = new java.util.Locale[][] { localeArray6, localeArray13, localeArray20, localeArray27, localeArray34, localeArray41 };
        java.util.Set<java.util.Locale[]> localeArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        java.lang.Object[] objArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray42, objArray44);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        char[] charArray4 = new char[] { ' ', '#', ' ' };
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray14);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray14, (java.lang.Object) (byte) -1);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.List<java.io.Serializable> serializableList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray31);
        java.util.Set<java.lang.Cloneable> cloneableSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray31);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray31, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("tests.failfast", indexReader46, 1, postingsEnum48, postingsEnum49);
        kuromojiAnalysisTests38.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests38.ensureCleanedUp();
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray31, (java.lang.Object) kuromojiAnalysisTests38);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale58, locale60, locale62, locale64, locale66 };
        java.util.Set<java.util.Locale> localeSet68 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray67);
        java.util.List<java.io.Serializable> serializableList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray67);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray67);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) localeArray31, (java.lang.Object[]) executorServiceArray74);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) 1L, obj2);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.lang.String str15 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet31, (java.lang.Object) kuromojiAnalysisTests32);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests32.assertDocsEnumEquals("tests.badapples", postingsEnum37, postingsEnum38, true);
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests32.ruleChain;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("tests.maxfailures", indexReader43, (int) (byte) 100, postingsEnum45, postingsEnum46, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("europarl.lines.txt.gz", indexReader51, fields52, fields53, false);
        kuromojiAnalysisTests49.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain58 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        kuromojiAnalysisTests32.failureAndSuccessEvents = ruleChain58;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("<unknown>", postingsEnum62, postingsEnum63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.slow", indexReader67, terms68, terms69, true);
        java.lang.Class<?> wildcardClass72 = kuromojiAnalysisTests16.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        char[] charArray6 = new char[] { 'a', '4', '4', '4', '4' };
        char[] charArray12 = new char[] { '#', 'a', '4', '#', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray12);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) '#');
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100, (double) '4', (double) 100.0f);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) 10, (double) 10L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray10 = new char[] { '4', '#', 'a', '4', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray3, charArray10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) '4', (float) 100, (float) 10L);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet25, (java.lang.Object) kuromojiAnalysisTests26);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests26.assertDocsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests26.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests36.assertDocsEnumEquals("", postingsEnum38, postingsEnum39, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, false);
        kuromojiAnalysisTests42.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain51 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        kuromojiAnalysisTests42.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("enwiki.random.lines.txt", indexReader54, fields55, fields56, false);
        kuromojiAnalysisTests42.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests61 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        kuromojiAnalysisTests61.assertFieldsEquals("europarl.lines.txt.gz", indexReader63, fields64, fields65, false);
        kuromojiAnalysisTests61.ensureCleanedUp();
        kuromojiAnalysisTests61.resetCheckIndexStatus();
        kuromojiAnalysisTests61.ensureCleanedUp();
        kuromojiAnalysisTests61.ensureCheckIndexPassed();
        kuromojiAnalysisTests61.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests73 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        org.apache.lucene.index.Fields fields77 = null;
        kuromojiAnalysisTests73.assertFieldsEquals("europarl.lines.txt.gz", indexReader75, fields76, fields77, false);
        kuromojiAnalysisTests73.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain82 = kuromojiAnalysisTests73.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain82;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain82;
        kuromojiAnalysisTests61.failureAndSuccessEvents = ruleChain82;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain82;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain82;
        kuromojiAnalysisTests42.failureAndSuccessEvents = ruleChain82;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain82;
        kuromojiAnalysisTests36.failureAndSuccessEvents = ruleChain82;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) testRule35, (java.lang.Object) ruleChain82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (-1), (long) '4');
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        java.lang.Object[] objArray1 = null;
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        java.util.Set<java.lang.Cloneable> cloneableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray14);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray14, (java.lang.Object) (byte) -1);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale35, locale37, locale39, locale41, locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        java.util.List<java.io.Serializable> serializableList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray44);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale50, locale52, locale54, locale56, locale58 };
        java.util.Set<java.util.Locale> localeSet60 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray59);
        java.util.List<java.io.Serializable> serializableList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray59);
        java.util.Set<java.lang.Cloneable> cloneableSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray44, (java.lang.Object[]) localeArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray44);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale67, locale69, locale71, locale73, locale75 };
        java.util.Set<java.util.Locale> localeSet77 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray76);
        java.util.List<java.io.Serializable> serializableList78 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray76);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray44, (java.lang.Object[]) localeArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray1, (java.lang.Object[]) localeArray44);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        float[] floatArray3 = new float[] { 0.0f, 1.0f, 100L };
        float[] floatArray12 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray19 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray12, floatArray19, (float) (byte) 100);
        float[] floatArray29 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray36 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray29, floatArray36, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray12, floatArray29, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray29, (float) 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        byte[] byteArray0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray4);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) -1, (double) 10L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList11 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, testRuleIgnoreAfterMaxFailuresArray10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.ensureCleanedUp();
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests13.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests13);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray31 = new java.util.concurrent.ExecutorService[][] { executorServiceArray25, executorServiceArray26, executorServiceArray27, executorServiceArray28, executorServiceArray29, executorServiceArray30 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray31);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) kuromojiAnalysisTests13, (java.lang.Object) executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, (java.lang.Object[]) executorServiceArray31);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0f), (float) '#', (float) (byte) 1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) 0);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.setUp();
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet25, (java.lang.Object) kuromojiAnalysisTests26);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests26.assertDocsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32, true);
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests26.ruleChain;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests26.assertDocsSkippingEquals("tests.maxfailures", indexReader37, (int) (byte) 100, postingsEnum39, postingsEnum40, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests43.assertFieldsEquals("europarl.lines.txt.gz", indexReader45, fields46, fields47, false);
        kuromojiAnalysisTests43.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain52 = kuromojiAnalysisTests43.failureAndSuccessEvents;
        kuromojiAnalysisTests26.failureAndSuccessEvents = ruleChain52;
        kuromojiAnalysisTests26.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests26);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 'a', (float) (short) 10, (float) ' ');
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) ' ', (float) (-1L), (float) ' ');
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray4);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray4);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.List<java.io.Serializable> serializableList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray19);
        java.util.Set<java.lang.Cloneable> cloneableSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray19, (java.lang.Object) (byte) -1);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale27, locale29, locale31, locale33, locale35 };
        java.util.Set<java.util.Locale> localeSet37 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray36);
        java.util.List<java.io.Serializable> serializableList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray36);
        java.util.Set<java.lang.Cloneable> cloneableSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray36);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray36, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray19, (java.lang.Object[]) localeArray36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests43.assertFieldsEquals("europarl.lines.txt.gz", indexReader45, fields46, fields47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests43.assertPositionsSkippingEquals("tests.failfast", indexReader51, 1, postingsEnum53, postingsEnum54);
        kuromojiAnalysisTests43.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests43.ensureCleanedUp();
        kuromojiAnalysisTests43.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray36, (java.lang.Object) kuromojiAnalysisTests43);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale63, locale65, locale67, locale69, locale71 };
        java.util.Set<java.util.Locale> localeSet73 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray72);
        java.util.List<java.io.Serializable> serializableList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray72);
        java.util.Set<java.lang.Cloneable> cloneableSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray72);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray72, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) localeArray72);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        java.util.Set<java.lang.Cloneable> cloneableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray29, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        kuromojiAnalysisTests36.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain45 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests36.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray12, (java.lang.Object) kuromojiAnalysisTests36);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.awaitsfix", indexReader49, 10, postingsEnum51, postingsEnum52, true);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("random", indexReader56, fields57, fields58, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests11.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule20);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests25.assertDocsSkippingEquals("tests.slow", indexReader36, (int) (short) -1, postingsEnum38, postingsEnum39, false);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests25.ensureCheckIndexPassed();
        kuromojiAnalysisTests25.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule24, (java.lang.Object) kuromojiAnalysisTests25);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) (short) 100);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (long) (-1), (-1L));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 10);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) localeArray12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 0L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.lang.String str15 = kuromojiAnalysisTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader17, (int) '4', postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.awaitsfix", indexReader23, terms24, terms25, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests28.assertPositionsSkippingEquals("tests.failfast", indexReader36, 1, postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests28.assertPositionsSkippingEquals("<unknown>", indexReader42, (int) '#', postingsEnum44, postingsEnum45);
        kuromojiAnalysisTests28.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests28.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) indexReader23, (java.lang.Object) kuromojiAnalysisTests28);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, 0.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        kuromojiAnalysisTests37.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests37.failureAndSuccessEvents;
        kuromojiAnalysisTests37.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray13, (java.lang.Object) kuromojiAnalysisTests37);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests37.assertDocsSkippingEquals("tests.awaitsfix", indexReader50, 10, postingsEnum52, postingsEnum53, true);
        kuromojiAnalysisTests37.ensureAllSearchContextsReleased();
        java.lang.Object obj57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests37, obj57);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 0.0f);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        char[] charArray2 = new char[] { '4' };
        char[] charArray7 = new char[] { '#', '4', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray7);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.awaitsfix");
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("tests.failfast", indexReader23, 1, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("hi!", indexReader37, (int) (byte) 0, postingsEnum39, postingsEnum40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        kuromojiAnalysisTests29.assertTermsEquals("random", indexReader43, terms44, terms45, true);
        kuromojiAnalysisTests29.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests29.assertDocsEnumEquals("tests.nightly", postingsEnum50, postingsEnum51, true);
        kuromojiAnalysisTests29.tearDown();
        java.lang.Object obj55 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests29, obj55);
        kuromojiAnalysisTests29.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) kuromojiAnalysisTests29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests29);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0.0d, (double) '4');
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', 1L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray6);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet18, (java.lang.Object) kuromojiAnalysisTests19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("", indexReader34, (int) (byte) 0, postingsEnum36, postingsEnum37);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests23);
        kuromojiAnalysisTests23.setUp();
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests23);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, 100.0f, (float) (short) 100);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.List<java.io.Serializable> serializableList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray11);
        java.util.Set<java.lang.Cloneable> cloneableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray11);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray11, (java.lang.Object) (byte) -1);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale19, locale21, locale23, locale25, locale27 };
        java.util.Set<java.util.Locale> localeSet29 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray28);
        java.util.List<java.io.Serializable> serializableList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray28);
        java.util.Set<java.lang.Cloneable> cloneableSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray28);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray28, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) localeArray28);
        java.lang.Object[] objArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray28, objArray35);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", obj1, (java.lang.Object) kuromojiAnalysisTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale1, locale3, locale5, locale7, locale9 };
        java.util.Set<java.util.Locale> localeSet11 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("hi!", indexReader20, (int) (byte) 0, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests12.assertTermsEquals("random", indexReader26, terms27, terms28, true);
        kuromojiAnalysisTests12.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests12.assertDocsEnumEquals("tests.nightly", postingsEnum33, postingsEnum34, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        kuromojiAnalysisTests37.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests37.failureAndSuccessEvents;
        kuromojiAnalysisTests37.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests48.assertPositionsSkippingEquals("hi!", indexReader56, (int) (byte) 0, postingsEnum58, postingsEnum59);
        kuromojiAnalysisTests48.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests12, kuromojiAnalysisTests37, kuromojiAnalysisTests48 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet63 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray62);
        java.util.Set<org.junit.Assert> assertSet64 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) kuromojiAnalysisTestsArray62);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.awaitsfix", indexReader14, fields15, fields16, true);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.badapples");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        kuromojiAnalysisTests34.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        kuromojiAnalysisTests22.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests49 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        kuromojiAnalysisTests49.assertFieldsEquals("europarl.lines.txt.gz", indexReader51, fields52, fields53, false);
        kuromojiAnalysisTests49.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain58 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        kuromojiAnalysisTests49.resetCheckIndexStatus();
        java.lang.String str60 = kuromojiAnalysisTests49.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests49);
        kuromojiAnalysisTests49.tearDown();
        kuromojiAnalysisTests49.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests49.failureAndSuccessEvents;
        kuromojiAnalysisTests49.tearDown();
        kuromojiAnalysisTests49.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain43, (java.lang.Object) kuromojiAnalysisTests49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain43);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray3, byteArray9);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        short[] shortArray22 = new short[] { (short) 10 };
        short[] shortArray24 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray18, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray24);
        short[] shortArray31 = new short[] { (short) 10 };
        short[] shortArray33 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray33);
        short[] shortArray37 = new short[] { (short) 10 };
        short[] shortArray39 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray33, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray39);
        short[] shortArray47 = new short[] { (short) 10 };
        short[] shortArray49 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray47, shortArray49);
        short[] shortArray53 = new short[] { (short) 10 };
        short[] shortArray55 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray53, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray49, shortArray55);
        short[] shortArray61 = new short[] { (short) 10 };
        short[] shortArray63 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray61, shortArray63);
        short[] shortArray67 = new short[] { (short) 10 };
        short[] shortArray69 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray63, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray49, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray5, shortArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray5);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 0, (long) 10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray14, (java.lang.Object) 0.0f);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.List<java.io.Serializable> serializableList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray31, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        kuromojiAnalysisTests38.assertPositionsSkippingEquals("tests.failfast", indexReader46, 1, postingsEnum48, postingsEnum49);
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests38.setUp();
        kuromojiAnalysisTests38.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests38.assertPathHasBeenCleared("tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) executorServiceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray31, (java.lang.Object[]) executorServiceArray59);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (short) 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, (double) (short) 1, (double) 0L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("tests.failfast", indexReader20, 1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("<unknown>", indexReader26, (int) '#', postingsEnum28, postingsEnum29);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.nightly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        kuromojiAnalysisTests12.failureAndSuccessEvents = ruleChain42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (short) 1);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1, (double) (short) 100);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray21 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray26 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray26, (double) (byte) 100);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray34, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray21, (-1.0d));
        double[] doubleArray52 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray57 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray52, doubleArray57, (double) (byte) 100);
        double[] doubleArray65 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray70 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray65, doubleArray70, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray52, doubleArray65, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray7, doubleArray65, (double) 10.0f);
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray83);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) doubleArray7, (java.lang.Object) strArray83);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray86 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet87 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray86);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet88 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray83, (java.lang.Object[]) genericDeclarationArray86);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, 0.0d, (double) 10L);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale13, locale15, locale17, locale19, locale21 };
        java.util.Set<java.util.Locale> localeSet23 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray22, (java.lang.Object[]) localeArray35);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale43, locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.List<java.io.Serializable> serializableList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray50);
        java.util.Set<java.lang.Cloneable> cloneableSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) localeArray50);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray12);
        short[] shortArray18 = new short[] { (short) 10 };
        short[] shortArray20 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray18, shortArray20);
        short[] shortArray24 = new short[] { (short) 10 };
        short[] shortArray26 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray20, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray20);
        short[] shortArray30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray12, shortArray30);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        long[] longArray5 = new long[] { 1 };
        long[] longArray7 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray5, longArray7);
        long[] longArray11 = new long[] { 1 };
        long[] longArray13 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray11, longArray13);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray7, longArray11);
        long[] longArray18 = new long[] { 1 };
        long[] longArray20 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray18, longArray20);
        org.junit.Assert.assertArrayEquals("hi!", longArray11, longArray18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("hi!", indexReader31, (int) (byte) 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests23.assertTermsEquals("random", indexReader37, terms38, terms39, true);
        kuromojiAnalysisTests23.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests23.assertDocsEnumEquals("tests.nightly", postingsEnum44, postingsEnum45, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, false);
        kuromojiAnalysisTests48.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests48.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests48.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests23, (java.lang.Object) kuromojiAnalysisTests48);
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader65, (int) (short) 100, postingsEnum67, postingsEnum68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) longArray11, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray21 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray26 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray26, (double) (byte) 100);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray21, doubleArray34, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray21, (-1.0d));
        double[] doubleArray52 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray57 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray52, doubleArray57, (double) (byte) 100);
        double[] doubleArray65 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray70 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray65, doubleArray70, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray52, doubleArray65, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray7, doubleArray65, (double) 10.0f);
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray83);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) doubleArray7, (java.lang.Object) strArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray7);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        int[][] intArray1 = new int[][] {};
        int[][][] intArray2 = new int[][][] { intArray1 };
        java.util.Set<int[][]> intArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(intArray2);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale8, locale10, locale12, locale14, locale16 };
        java.util.Set<java.util.Locale> localeSet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        java.util.List<java.io.Serializable> serializableList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray17);
        java.util.Set<java.lang.Cloneable> cloneableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray17);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray17, (java.lang.Object) (byte) -1);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale25, locale27, locale29, locale31, locale33 };
        java.util.Set<java.util.Locale> localeSet35 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray34);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale38, locale40, locale42, locale44, locale46 };
        java.util.Set<java.util.Locale> localeSet48 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray47);
        java.util.List<java.io.Serializable> serializableList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray34, (java.lang.Object[]) localeArray47);
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale53, locale55, locale57, locale59, locale61 };
        java.util.Set<java.util.Locale> localeSet63 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray62);
        java.util.List<java.io.Serializable> serializableList64 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray62);
        java.util.Set<java.lang.Cloneable> cloneableSet65 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray47, (java.lang.Object[]) localeArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray17, (java.lang.Object[]) localeArray47);
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray78 = new java.util.Locale[] { locale69, locale71, locale73, locale75, locale77 };
        java.util.Set<java.util.Locale> localeSet79 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray78);
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale86 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale90 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale82, locale84, locale86, locale88, locale90 };
        java.util.Set<java.util.Locale> localeSet92 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray91);
        java.util.List<java.io.Serializable> serializableList93 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray91);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray78, (java.lang.Object[]) localeArray91);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) localeArray47, (java.lang.Object[]) localeArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) intArray2, (java.lang.Object[]) localeArray47);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 0, (double) 100.0f, (double) 10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, true);
        java.lang.Class<?> wildcardClass17 = kuromojiAnalysisTests1.getClass();
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClass17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.resetCheckIndexStatus();
        kuromojiAnalysisTests19.ensureCleanedUp();
        java.lang.String str29 = kuromojiAnalysisTests19.getTestName();
        kuromojiAnalysisTests19.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests19.ruleChain;
        kuromojiAnalysisTests19.setUp();
        kuromojiAnalysisTests19.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) wildcardClass17, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (short) 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        char[] charArray0 = new char[] {};
        char[] charArray7 = new char[] { 'a', ' ', ' ', '#', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray7);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        char[] charArray6 = new char[] { '#', '#', 'a', '4', ' ' };
        char[] charArray10 = new char[] { 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray6, charArray10);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        double[] doubleArray5 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray10, (double) (byte) 100);
        double[] doubleArray18 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray23 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray18, doubleArray23, (double) (byte) 100);
        double[] doubleArray32 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray37 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray32, doubleArray37, (double) (byte) 100);
        double[] doubleArray45 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray50 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray45, doubleArray50, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray32, doubleArray45, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray32, (-1.0d));
        double[] doubleArray63 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray68 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray63, doubleArray68, (double) (byte) 100);
        double[] doubleArray76 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray81 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray76, doubleArray81, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray63, doubleArray76, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray76, 0.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray76, (double) ' ');
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        char[] charArray3 = new char[] { ' ', '4', '4' };
        char[] charArray8 = new char[] { 'a', '4', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (short) 10, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale13, locale15, locale17, locale19, locale21 };
        java.util.Set<java.util.Locale> localeSet23 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray22, (java.lang.Object[]) localeArray35);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale43, locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.List<java.io.Serializable> serializableList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray50);
        java.util.Set<java.lang.Cloneable> cloneableSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) localeArray50);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader58, terms59, terms60, false);
        org.apache.lucene.index.NumericDocValues numericDocValues65 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", 10, numericDocValues65, numericDocValues66);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, 0, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("random", (int) (byte) 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray7);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray6 = new java.util.Locale[] { locale1, locale3, locale5 };
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale8, locale10, locale12 };
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale15, locale17, locale19 };
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale22, locale24, locale26 };
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale29, locale31, locale33 };
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale36, locale38, locale40 };
        java.util.Locale[][] localeArray42 = new java.util.Locale[][] { localeArray6, localeArray13, localeArray20, localeArray27, localeArray34, localeArray41 };
        java.util.Set<java.util.Locale[]> localeArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) localeArray42);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 1.0d, (double) (byte) -1, (double) 100L);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 100L);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        double[] doubleArray6 = new double[] { (short) 0, 100L, 100.0d, 100.0f, (short) 0, (byte) 1 };
        double[] doubleArray12 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray17 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray12, doubleArray17, (double) (byte) 100);
        double[] doubleArray26 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray31 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray26, doubleArray31, (double) (byte) 100);
        double[] doubleArray39 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray44 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray39, doubleArray44, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray26, doubleArray39, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray26, (-1.0d));
        double[] doubleArray57 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray62 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray57, doubleArray62, (double) (byte) 100);
        double[] doubleArray70 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray75 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray70, doubleArray75, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray57, doubleArray70, (double) 0);
        double[] doubleArray85 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray90 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray85, doubleArray90, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray85, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray70, 1.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray70, (double) (-1L));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        int[] intArray0 = null;
        int[] intArray4 = new int[] { '#' };
        int[] intArray6 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray9, intArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray4, intArray9);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray16, intArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray21);
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        org.junit.Assert.assertArrayEquals(intArray21, intArray30);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        int[] intArray40 = new int[] { '#' };
        int[] intArray42 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray35, intArray40);
        org.junit.Assert.assertArrayEquals(intArray30, intArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray30);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        char[] charArray2 = new char[] { '#' };
        char[] charArray6 = new char[] { '4', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray2, charArray6);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass10 = locale9.getClass();
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass13 = locale12.getClass();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass16 = locale15.getClass();
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass19 = locale18.getClass();
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass22 = locale21.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray23 = new java.lang.reflect.AnnotatedElement[] { wildcardClass10, wildcardClass13, wildcardClass16, wildcardClass19, wildcardClass22 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet24 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) annotatedElementArray23);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", 0.0d, (double) (short) 0, (double) (-1));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.List<java.io.Serializable> serializableList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) localeArray24);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale30, locale32, locale34, locale36, locale38 };
        java.util.Set<java.util.Locale> localeSet40 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray39);
        java.util.List<java.io.Serializable> serializableList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray39);
        java.util.Set<java.lang.Cloneable> cloneableSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) localeArray39);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 100.0d, 100.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum18, postingsEnum19, false);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) genericDeclarationArray22);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray12, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) shortArray18);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        short[] shortArray14 = new short[] { (short) 10 };
        short[] shortArray16 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray14, shortArray16);
        short[] shortArray21 = new short[] { (short) 10 };
        short[] shortArray23 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray21, shortArray23);
        short[] shortArray27 = new short[] { (short) 10 };
        short[] shortArray29 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray23, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray29);
        short[] shortArray36 = new short[] { (short) 10 };
        short[] shortArray38 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray36, shortArray38);
        short[] shortArray42 = new short[] { (short) 10 };
        short[] shortArray44 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray42, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray38, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray44);
        short[] shortArray52 = new short[] { (short) 10 };
        short[] shortArray54 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray54);
        short[] shortArray58 = new short[] { (short) 10 };
        short[] shortArray60 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray54, shortArray60);
        short[] shortArray66 = new short[] { (short) 10 };
        short[] shortArray68 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray66, shortArray68);
        short[] shortArray72 = new short[] { (short) 10 };
        short[] shortArray74 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray68, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray54, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray74);
        short[] shortArray81 = new short[] { (short) 10 };
        short[] shortArray83 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray81, shortArray83);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray74, shortArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) shortArray74);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass12 = kuromojiAnalysisTests1.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("tests.failfast", indexReader21, 1, postingsEnum23, postingsEnum24);
        kuromojiAnalysisTests13.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) wildcardClass12, (java.lang.Object) kuromojiAnalysisTests13);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet10, (java.lang.Object) kuromojiAnalysisTests11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        kuromojiAnalysisTests15.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("", indexReader26, (int) (byte) 0, postingsEnum28, postingsEnum29);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests15);
        kuromojiAnalysisTests15.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.slow", indexReader15, fields16, fields17, true);
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests37.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet36, (java.lang.Object) kuromojiAnalysisTests37);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests37.assertDocsEnumEquals("tests.badapples", postingsEnum42, postingsEnum43, true);
        org.junit.rules.TestRule testRule46 = kuromojiAnalysisTests37.ruleChain;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests37.assertDocsSkippingEquals("tests.maxfailures", indexReader48, (int) (byte) 100, postingsEnum50, postingsEnum51, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        kuromojiAnalysisTests54.assertFieldsEquals("europarl.lines.txt.gz", indexReader56, fields57, fields58, false);
        kuromojiAnalysisTests54.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain63 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        kuromojiAnalysisTests37.failureAndSuccessEvents = ruleChain63;
        kuromojiAnalysisTests21.failureAndSuccessEvents = ruleChain63;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain63;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests67 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        kuromojiAnalysisTests67.assertFieldsEquals("europarl.lines.txt.gz", indexReader69, fields70, fields71, false);
        kuromojiAnalysisTests67.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests67);
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests67.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum77, postingsEnum78);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 1, (-1.0f));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        byte[] byteArray0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale1, locale3, locale5, locale7, locale9 };
        java.util.Set<java.util.Locale> localeSet11 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale14, locale16, locale18, locale20, locale22 };
        java.util.Set<java.util.Locale> localeSet24 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray23);
        java.util.List<java.io.Serializable> serializableList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) localeArray23);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass29 = locale28.getClass();
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass32 = locale31.getClass();
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass35 = locale34.getClass();
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass38 = locale37.getClass();
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass41 = locale40.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray42 = new java.lang.reflect.AnnotatedElement[] { wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38, wildcardClass41 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet43 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray42);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) annotatedElementArray42);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        double[] doubleArray33 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray38 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray38, (double) (byte) 100);
        double[] doubleArray46 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray51 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray46, doubleArray51, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray46, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray33, (-1.0d));
        double[] doubleArray64 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray69 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray69, (double) (byte) 100);
        double[] doubleArray77 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray82 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray77, doubleArray82, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray77, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray64, (double) (short) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray11, doubleArray64, (double) 1.0f);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet15, (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum46, postingsEnum47, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.monster", indexReader53, (int) (byte) 10, postingsEnum55, postingsEnum56);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader53, (java.lang.Object) locale59);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        double[] doubleArray33 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray38 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray33, doubleArray38, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray33, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray20, (-1.0d));
        double[] doubleArray51 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray56 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray51, doubleArray56, (double) (byte) 100);
        double[] doubleArray64 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray69 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray64, doubleArray69, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray51, doubleArray64, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray51, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray6, (double) ' ');
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale13, locale15, locale17, locale19, locale21 };
        java.util.Set<java.util.Locale> localeSet23 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray22, (java.lang.Object[]) localeArray35);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale43, locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.List<java.io.Serializable> serializableList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray50);
        java.util.Set<java.lang.Cloneable> cloneableSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) localeArray50);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.NumericDocValues numericDocValues61 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (byte) 0, numericDocValues61, numericDocValues62);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale7, locale9, locale11, locale13, locale15 };
        java.util.Set<java.util.Locale> localeSet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        java.util.List<java.io.Serializable> serializableList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray16);
        java.util.Set<java.lang.Cloneable> cloneableSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray16);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray16, (java.lang.Object) (byte) -1);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale24, locale26, locale28, locale30, locale32 };
        java.util.Set<java.util.Locale> localeSet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale37, locale39, locale41, locale43, locale45 };
        java.util.Set<java.util.Locale> localeSet47 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray46);
        java.util.List<java.io.Serializable> serializableList48 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray33, (java.lang.Object[]) localeArray46);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale52, locale54, locale56, locale58, locale60 };
        java.util.Set<java.util.Locale> localeSet62 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray61);
        java.util.List<java.io.Serializable> serializableList63 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray61);
        java.util.Set<java.lang.Cloneable> cloneableSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray61);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray46, (java.lang.Object[]) localeArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray16, (java.lang.Object[]) localeArray46);
        java.util.Set<java.lang.Cloneable> cloneableSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) localeArray16);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (byte) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        kuromojiAnalysisTests23.ensureCleanedUp();
        kuromojiAnalysisTests23.resetCheckIndexStatus();
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("", indexReader34, (int) (byte) 0, postingsEnum36, postingsEnum37);
        kuromojiAnalysisTests23.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests23.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests23);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader20, terms21, terms22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests25.assertPositionsSkippingEquals("tests.failfast", indexReader33, 1, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests25.assertPositionsSkippingEquals("<unknown>", indexReader39, (int) '#', postingsEnum41, postingsEnum42);
        kuromojiAnalysisTests25.setUp();
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        java.lang.String str46 = kuromojiAnalysisTests25.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) terms22, (java.lang.Object) str46);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.slow", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader19, 100, postingsEnum21, postingsEnum22);
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("tests.failfast", indexReader26, fields27, fields28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 0, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.slow", indexReader15, fields16, fields17, true);
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests1.ruleChain;
        java.lang.String str21 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests22.ruleChain;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (short) -1, postingsEnum35, postingsEnum36);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) str21, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray6, longArray10);
        long[] longArray18 = new long[] { 1 };
        long[] longArray20 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray18, longArray20);
        long[] longArray25 = new long[] { 1 };
        long[] longArray27 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray25, longArray27);
        long[] longArray31 = new long[] { 1 };
        long[] longArray33 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray31, longArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray27, longArray31);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray18, longArray31);
        org.junit.Assert.assertArrayEquals(longArray6, longArray18);
        long[] longArray41 = new long[] { 1 };
        long[] longArray43 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray41, longArray43);
        long[] longArray47 = new long[] { 1 };
        long[] longArray49 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray47, longArray49);
        org.junit.Assert.assertArrayEquals("random", longArray43, longArray49);
        org.junit.Assert.assertArrayEquals(longArray18, longArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) longArray18);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0L, (long) ' ');
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        int[] intArray18 = new int[] { '#' };
        int[] intArray20 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray18, intArray20);
        int[] intArray23 = new int[] { '#' };
        int[] intArray25 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray18, intArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, 100.0d, (double) 1L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        int[][] intArray0 = new int[][] {};
        int[][] intArray1 = new int[][] {};
        int[][] intArray2 = new int[][] {};
        int[][] intArray3 = new int[][] {};
        int[][][] intArray4 = new int[][][] { intArray0, intArray1, intArray2, intArray3 };
        int[][] intArray5 = new int[][] {};
        int[][] intArray6 = new int[][] {};
        int[][] intArray7 = new int[][] {};
        int[][] intArray8 = new int[][] {};
        int[][][] intArray9 = new int[][][] { intArray5, intArray6, intArray7, intArray8 };
        int[][][][] intArray10 = new int[][][][] { intArray4, intArray9 };
        java.util.Set<int[][][]> intArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(intArray10);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.List<java.io.Serializable> serializableList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray24);
        java.util.Set<java.lang.Cloneable> cloneableSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray24);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray24, (java.lang.Object) (byte) -1);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale32, locale34, locale36, locale38, locale40 };
        java.util.Set<java.util.Locale> localeSet42 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        java.util.List<java.io.Serializable> serializableList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray41);
        java.util.Set<java.lang.Cloneable> cloneableSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray41);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray41, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray41);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests48.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        kuromojiAnalysisTests48.assertPositionsSkippingEquals("tests.failfast", indexReader56, 1, postingsEnum58, postingsEnum59);
        kuromojiAnalysisTests48.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests48.ensureCleanedUp();
        kuromojiAnalysisTests48.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray41, (java.lang.Object) kuromojiAnalysisTests48);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale68, locale70, locale72, locale74, locale76 };
        java.util.Set<java.util.Locale> localeSet78 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray77);
        java.util.List<java.io.Serializable> serializableList79 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray77);
        java.util.Set<java.lang.Cloneable> cloneableSet80 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray77);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray77, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray41, (java.lang.Object[]) localeArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) intArray10, (java.lang.Object[]) localeArray77);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) ' ', 0.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale16, locale18, locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.List<java.io.Serializable> serializableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray25);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale31, locale33, locale35, locale37, locale39 };
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        java.util.List<java.io.Serializable> serializableList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray40);
        java.util.Set<java.lang.Cloneable> cloneableSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray25, (java.lang.Object[]) localeArray40);
        java.util.List[] listArray46 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray47 = (java.util.List<java.io.Serializable>[]) listArray46;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray47);
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) localeArray25, (java.lang.Object[]) serializableListArray47);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) 1, (double) (short) 100);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 0, (double) (short) 10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray12);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests25);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests39.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests39);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        float[] floatArray42 = new float[] { 0.0f, 10L, (-1.0f), (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray9, floatArray42, (float) 0L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        char[] charArray2 = new char[] { 'a', ' ' };
        char[] charArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray5, shortArray11);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        short[] shortArray21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray21);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray9);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader19, 10, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet39 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray38);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests40.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet39, (java.lang.Object) kuromojiAnalysisTests40);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests40.assertDocsEnumEquals("tests.badapples", postingsEnum45, postingsEnum46, true);
        org.junit.rules.TestRule testRule49 = kuromojiAnalysisTests40.ruleChain;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        kuromojiAnalysisTests40.assertDocsSkippingEquals("tests.maxfailures", indexReader51, (int) (byte) 100, postingsEnum53, postingsEnum54, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests57.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        kuromojiAnalysisTests40.failureAndSuccessEvents = ruleChain66;
        kuromojiAnalysisTests24.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("hi!", indexReader70, (int) ' ', postingsEnum72, postingsEnum73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) 10, (java.lang.Object) postingsEnum73);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 100.0d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests10.assertDocsSkippingEquals("tests.maxfailures", indexReader21, (int) (byte) 100, postingsEnum23, postingsEnum24, false);
        float[] floatArray36 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray43 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray36, floatArray43, (float) (byte) 100);
        float[] floatArray53 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray60 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray53, floatArray60, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray36, floatArray53, (float) (-1));
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests66 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        kuromojiAnalysisTests66.assertFieldsEquals("europarl.lines.txt.gz", indexReader68, fields69, fields70, false);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        kuromojiAnalysisTests66.assertPositionsSkippingEquals("hi!", indexReader74, (int) (byte) 0, postingsEnum76, postingsEnum77);
        kuromojiAnalysisTests66.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests80 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests66, (java.lang.Object) kuromojiAnalysisTests80);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) indexReader21, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) ' ', (double) 0.0f);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray32 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray25, (float) (-1));
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray62 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray69 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray62, floatArray69, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray45, floatArray62, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray62, (float) 1);
        float[] floatArray76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray76, (float) ' ');
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("tests.failfast", indexReader37, 1, postingsEnum39, postingsEnum40);
        kuromojiAnalysisTests29.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("tests.slow", indexReader45, fields46, fields47, false);
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule51 = kuromojiAnalysisTests29.ruleChain;
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) testRule51);
        org.junit.rules.TestRule[] testRuleArray53 = new org.junit.rules.TestRule[] { ruleChain22, testRule51 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet54 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray53);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray62);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests64.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet63, (java.lang.Object) kuromojiAnalysisTests64);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, false);
        kuromojiAnalysisTests68.ensureCleanedUp();
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        kuromojiAnalysisTests68.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        kuromojiAnalysisTests68.assertPositionsSkippingEquals("", indexReader79, (int) (byte) 0, postingsEnum81, postingsEnum82);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests68);
        kuromojiAnalysisTests68.setUp();
        kuromojiAnalysisTests68.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests68.assertPathHasBeenCleared("random");
        kuromojiAnalysisTests68.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) testRuleSet54, (java.lang.Object) kuromojiAnalysisTests68);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        kuromojiAnalysisTests7.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests7.assertPositionsSkippingEquals("hi!", indexReader15, (int) (byte) 0, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests7.assertTermsEquals("random", indexReader21, terms22, terms23, true);
        kuromojiAnalysisTests7.setUp();
        kuromojiAnalysisTests7.tearDown();
        kuromojiAnalysisTests7.tearDown();
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) intArray5, (java.lang.Object) kuromojiAnalysisTests7);
        int[] intArray31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray5, intArray31);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        kuromojiAnalysisTests26.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("hi!", indexReader45, (int) (byte) 0, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray51 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests1, kuromojiAnalysisTests26, kuromojiAnalysisTests37 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet52 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray51);
        java.util.Set<org.junit.Assert> assertSet53 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) kuromojiAnalysisTestsArray51);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray66, (java.lang.Object) 0.0f);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale74, locale76, locale78, locale80, locale82 };
        java.util.Set<java.util.Locale> localeSet84 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray83);
        java.util.List<java.io.Serializable> serializableList85 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray83);
        java.util.Set<java.lang.Cloneable> cloneableSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray83);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray83, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray66, (java.lang.Object[]) localeArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) kuromojiAnalysisTestsArray51, (java.lang.Object[]) localeArray66);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14, true);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.weekly");
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray5);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1), 0.0d, (double) (byte) -1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests18.ruleChain;
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) "tests.slow", (java.lang.Object) kuromojiAnalysisTests18);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests18.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests18.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 100, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 10.0d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        java.lang.String[] strArray4 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        int[][] intArray6 = new int[][] {};
        int[][] intArray7 = new int[][] {};
        int[][] intArray8 = new int[][] {};
        int[][] intArray9 = new int[][] {};
        int[][][] intArray10 = new int[][][] { intArray6, intArray7, intArray8, intArray9 };
        int[][] intArray11 = new int[][] {};
        int[][] intArray12 = new int[][] {};
        int[][] intArray13 = new int[][] {};
        int[][] intArray14 = new int[][] {};
        int[][][] intArray15 = new int[][][] { intArray11, intArray12, intArray13, intArray14 };
        int[][][][] intArray16 = new int[][][][] { intArray10, intArray15 };
        java.util.Set<int[][][]> intArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(intArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray4, (java.lang.Object[]) intArray16);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet15, (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("<unknown>", postingsEnum46, postingsEnum47, true);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader51, terms52, terms53, true);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader57, (int) (byte) 0, postingsEnum59, postingsEnum60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray87 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray80, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray80, (float) 1L);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray26, floatArray80, (float) 'a');
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray96, 10.0f);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray2 = new org.junit.rules.RuleChain[][] { ruleChainArray1 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray2);
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[][]) ruleChainArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, false);
        kuromojiAnalysisTests5.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        kuromojiAnalysisTests5.resetCheckIndexStatus();
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests5.ruleChain;
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray32, (java.lang.Object) 0.0f);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale40, locale42, locale44, locale46, locale48 };
        java.util.Set<java.util.Locale> localeSet50 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.List<java.io.Serializable> serializableList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray49);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray49, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray32, (java.lang.Object[]) localeArray49);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale56, locale58, locale60, locale62, locale64 };
        java.util.Set<java.util.Locale> localeSet66 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray65);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray32, (java.lang.Object[]) localeArray65);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests5, (java.lang.Object) localeArray65);
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale71, locale73, locale75, locale77, locale79 };
        java.util.Set<java.util.Locale> localeSet81 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray80);
        java.util.List<java.io.Serializable> serializableList82 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray65, (java.lang.Object[]) localeArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) ruleChainArray2, (java.lang.Object[]) localeArray80);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader15, (int) (short) -1, postingsEnum17, postingsEnum18, false);
        long[] longArray24 = new long[] { 1 };
        long[] longArray26 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray24, longArray26);
        long[] longArray30 = new long[] { 1 };
        long[] longArray32 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray30, longArray32);
        org.junit.Assert.assertArrayEquals("random", longArray26, longArray32);
        long[] longArray39 = new long[] { 1 };
        long[] longArray41 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray39, longArray41);
        long[] longArray45 = new long[] { 1 };
        long[] longArray47 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray45, longArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray41, longArray45);
        long[] longArray52 = new long[] { 1 };
        long[] longArray54 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray52, longArray54);
        org.junit.Assert.assertArrayEquals("hi!", longArray45, longArray52);
        long[] longArray60 = new long[] { 1 };
        long[] longArray62 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray60, longArray62);
        long[] longArray66 = new long[] { 1 };
        long[] longArray68 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray66, longArray68);
        org.junit.Assert.assertArrayEquals("random", longArray62, longArray68);
        org.junit.Assert.assertArrayEquals(longArray52, longArray62);
        org.junit.Assert.assertArrayEquals(longArray26, longArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) longArray62);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests25);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader42, (int) (short) 100, postingsEnum44, postingsEnum45);
        kuromojiAnalysisTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        kuromojiAnalysisTests9.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.badapples", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray8 = new char[] { ' ', 'a', ' ', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray2, charArray8);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 100L, 100.0d, (double) 10L);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        kuromojiAnalysisTests14.ensureCleanedUp();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("", indexReader25, (int) (byte) 0, postingsEnum27, postingsEnum28);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests14.setUp();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule35 = kuromojiAnalysisTests14.ruleChain;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures37 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures36);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.junit.rules.TestRule[] testRuleArray42 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures36, testRuleIgnoreAfterMaxFailures39, testRuleIgnoreAfterMaxFailures41 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet43 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests14, (java.lang.Object) testRuleArray42);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, 10.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 'a', (float) 100L, (float) (-1L));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        float[] floatArray44 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray51 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray44, floatArray51, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray27, floatArray44, (float) (-1));
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray44, floatArray63, (float) (-1L));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray63, (float) 1);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        char[] charArray6 = new char[] { '4', 'a', '4', 'a', ' ', 'a' };
        char[] charArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 100L, (double) 10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        java.lang.Object[] objArray1 = null;
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests5.assertPositionsSkippingEquals("tests.failfast", indexReader13, 1, postingsEnum15, postingsEnum16);
        kuromojiAnalysisTests5.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests5.ensureCleanedUp();
        kuromojiAnalysisTests5.resetCheckIndexStatus();
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests5.assertDocsSkippingEquals("tests.weekly", indexReader30, (int) (byte) 0, postingsEnum32, postingsEnum33, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray3, (java.lang.Object) "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", objArray1, (java.lang.Object[]) genericDeclarationArray3);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        char[] charArray7 = new char[] { 'a', ' ', ' ', 'a', ' ', '#' };
        char[] charArray14 = new char[] { '#', '4', ' ', ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray7, charArray14);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 100.0f);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        float[] floatArray19 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray26 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray19, floatArray26, (float) (byte) 100);
        float[] floatArray36 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray43 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray36, floatArray43, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray19, floatArray36, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain10, (java.lang.Object) floatArray19);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale9, locale11, locale13, locale15, locale17 };
        java.util.Set<java.util.Locale> localeSet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray18);
        java.util.List<java.io.Serializable> serializableList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray18);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray18);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray35, (java.lang.Object) 0.0f);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale45, locale47, locale49, locale51 };
        java.util.Set<java.util.Locale> localeSet53 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray52);
        java.util.List<java.io.Serializable> serializableList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray52);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray52, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) localeArray18, (java.lang.Object[]) localeArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) localeArray35);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) throttlingArray3);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests10.assertPositionsSkippingEquals("tests.failfast", indexReader18, 1, postingsEnum20, postingsEnum21);
        kuromojiAnalysisTests10.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("tests.slow", indexReader26, fields27, fields28, false);
        kuromojiAnalysisTests10.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests10.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) testRule32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests35.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain44 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        kuromojiAnalysisTests35.resetCheckIndexStatus();
        java.lang.String str46 = kuromojiAnalysisTests35.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests35);
        kuromojiAnalysisTests35.tearDown();
        kuromojiAnalysisTests35.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests35.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain51 = kuromojiAnalysisTests35.failureAndSuccessEvents;
        kuromojiAnalysisTests35.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) testRule32, (java.lang.Object) kuromojiAnalysisTests35);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        char[] charArray4 = new char[] { '4', '4', '4', ' ' };
        char[] charArray6 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader32, 10, postingsEnum34, postingsEnum35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) 10);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 1, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str18 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 10, (long) 'a');
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader17, (int) '#', postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.weekly", indexReader23, (int) (short) 10, postingsEnum25, postingsEnum26);
        java.lang.String str28 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        int[] intArray1 = null;
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray10);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        org.junit.Assert.assertArrayEquals(intArray10, intArray16);
        int[] intArray23 = new int[] { '#' };
        int[] intArray25 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray23, intArray25);
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray23, intArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray10, intArray28);
        int[] intArray37 = new int[] { '#' };
        int[] intArray39 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray37, intArray39);
        int[] intArray42 = new int[] { '#' };
        int[] intArray44 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray42, intArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray37, intArray42);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals(intArray42, intArray48);
        int[] intArray55 = new int[] { '#' };
        int[] intArray57 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray55, intArray57);
        int[] intArray60 = new int[] { '#' };
        int[] intArray62 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray60, intArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray55, intArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray42, intArray60);
        org.junit.Assert.assertArrayEquals(intArray28, intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray28);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests1.assertTermsEquals("<unknown>", indexReader28, terms29, terms30, false);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet41, (java.lang.Object) kuromojiAnalysisTests42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("europarl.lines.txt.gz", indexReader48, fields49, fields50, false);
        kuromojiAnalysisTests46.ensureCleanedUp();
        kuromojiAnalysisTests46.resetCheckIndexStatus();
        kuromojiAnalysisTests46.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        kuromojiAnalysisTests46.assertPositionsSkippingEquals("", indexReader57, (int) (byte) 0, postingsEnum59, postingsEnum60);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) indexReader28, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        long[] longArray14 = new long[] { 1 };
        long[] longArray16 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray14, longArray16);
        long[] longArray20 = new long[] { 1 };
        long[] longArray22 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray20, longArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray16, longArray20);
        long[] longArray27 = new long[] { 1 };
        long[] longArray29 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray27, longArray29);
        org.junit.Assert.assertArrayEquals("hi!", longArray20, longArray27);
        long[] longArray35 = new long[] { 1 };
        long[] longArray37 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray35, longArray37);
        long[] longArray42 = new long[] { 1 };
        long[] longArray44 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray42, longArray44);
        long[] longArray48 = new long[] { 1 };
        long[] longArray50 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray48, longArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray44, longArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray48);
        org.junit.Assert.assertArrayEquals(longArray27, longArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain8, (java.lang.Object) longArray27);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader12, 100, postingsEnum14, postingsEnum15, false);
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 100, obj18);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        byte[] byteArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray7, byteArray8);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        java.util.Set<java.lang.Cloneable> cloneableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray29, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("tests.failfast", indexReader44, 1, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests36.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests36.ensureCleanedUp();
        kuromojiAnalysisTests36.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray29, (java.lang.Object) kuromojiAnalysisTests36);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale56, locale58, locale60, locale62, locale64 };
        java.util.Set<java.util.Locale> localeSet66 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray65);
        java.util.List<java.io.Serializable> serializableList67 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray65);
        java.util.Set<java.lang.Cloneable> cloneableSet68 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray65);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray65, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray65);
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale74, locale76, locale78, locale80, locale82 };
        java.util.Set<java.util.Locale> localeSet84 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray83);
        java.util.List<java.io.Serializable> serializableList85 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray65, (java.lang.Object[]) localeArray83);
        double[][] doubleArray88 = new double[][] {};
        double[][] doubleArray89 = new double[][] {};
        double[][] doubleArray90 = new double[][] {};
        double[][][] doubleArray91 = new double[][][] { doubleArray88, doubleArray89, doubleArray90 };
        java.util.List<double[][]> doubleArrayList92 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, doubleArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray83, (java.lang.Object[]) doubleArray91);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        java.lang.Object obj0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6, executorServiceArray7 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) executorServiceArray8);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 'a', (double) 'a');
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        java.lang.Iterable[][] iterableArray1 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[][] localeIterableArray2 = (java.lang.Iterable<java.util.Locale>[][]) iterableArray1;
        java.util.Set<java.lang.Iterable<java.util.Locale>[]> localeIterableArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeIterableArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("hi!", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests4.assertTermsEquals("random", indexReader18, terms19, terms20, true);
        kuromojiAnalysisTests4.setUp();
        kuromojiAnalysisTests4.tearDown();
        kuromojiAnalysisTests4.tearDown();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests4.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests4.assertPathHasBeenCleared("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) localeIterableArraySet3, (java.lang.Object) kuromojiAnalysisTests4);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.badapples");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        kuromojiAnalysisTests21.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        kuromojiAnalysisTests21.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("enwiki.random.lines.txt", indexReader33, fields34, fields35, false);
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests21.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.ensureCleanedUp();
        kuromojiAnalysisTests39.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests39.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader50, fields51, fields52, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests21, (java.lang.Object) "europarl.lines.txt.gz");
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.badapples", (java.lang.Object) kuromojiAnalysisTests21);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        java.lang.String str17 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str17);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        char[] charArray5 = new char[] { '#', ' ', '4', '#' };
        char[] charArray10 = new char[] { '#', 'a', '#', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray5, charArray10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 0.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray1);
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, false);
        kuromojiAnalysisTests5.ensureCleanedUp();
        kuromojiAnalysisTests5.resetCheckIndexStatus();
        kuromojiAnalysisTests5.ensureCleanedUp();
        kuromojiAnalysisTests5.ensureCheckIndexPassed();
        java.lang.String str16 = kuromojiAnalysisTests5.getTestName();
        java.lang.String str17 = kuromojiAnalysisTests5.getTestName();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) genericDeclarationArray1, (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        float[] floatArray1 = null;
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray27, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray1, floatArray10, (float) (byte) -1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        char[] charArray1 = null;
        char[] charArray3 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray1, charArray3);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        java.lang.String[] strArray3 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("tests.failfast", indexReader14, 1, postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests6.setUp();
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests6.assertPathHasBeenCleared("tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) "tests.monster", (java.lang.Object) executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        double[] doubleArray4 = new double[] { (short) 1, 100L, (byte) -1, 10.0d };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        kuromojiAnalysisTests6.ensureCleanedUp();
        kuromojiAnalysisTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("hi!", indexReader16, 1, postingsEnum18, postingsEnum19);
        double[] doubleArray27 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray32 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray27, doubleArray32, (double) (byte) 100);
        double[] doubleArray41 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray46 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray46, (double) (byte) 100);
        double[] doubleArray54 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray59 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray41, doubleArray54, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray41, (-1.0d));
        double[] doubleArray72 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray77 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray72, doubleArray77, (double) (byte) 100);
        double[] doubleArray85 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray90 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray85, doubleArray90, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray72, doubleArray85, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray27, doubleArray85, (double) 10.0f);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) postingsEnum18, (java.lang.Object) doubleArray85);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray85, (double) (byte) 10);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 100, (double) (short) -1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 0.0d, (double) (short) 1, (double) 100);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        kuromojiAnalysisTests3.assertTermsEquals("tests.weekly", indexReader7, terms8, terms9, true);
        kuromojiAnalysisTests3.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests3.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests3.ensureCheckIndexPassed();
        kuromojiAnalysisTests3.setUp();
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) boolean2, (java.lang.Object) kuromojiAnalysisTests3);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray22, intArray27);
        int[] intArray34 = new int[] { '#' };
        int[] intArray36 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray34, intArray36);
        int[] intArray39 = new int[] { '#' };
        int[] intArray41 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray39, intArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray34, intArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray22, intArray39);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals(intArray39, intArray48);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        int[] intArray58 = new int[] { '#' };
        int[] intArray60 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray58, intArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray53, intArray58);
        org.junit.Assert.assertArrayEquals(intArray39, intArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) intArray58);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray6);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) 'a', 0.0f);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        java.lang.String str19 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", (int) '#', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) '4');
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) '#');
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        org.junit.rules.RuleChain[] ruleChainArray38 = new org.junit.rules.RuleChain[] { ruleChain22, ruleChain36 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet39 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        kuromojiAnalysisTests41.assertFieldsEquals("europarl.lines.txt.gz", indexReader43, fields44, fields45, false);
        kuromojiAnalysisTests41.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests41.failureAndSuccessEvents;
        kuromojiAnalysisTests41.resetCheckIndexStatus();
        java.lang.String str52 = kuromojiAnalysisTests41.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests41);
        kuromojiAnalysisTests41.setUp();
        kuromojiAnalysisTests41.tearDown();
        java.lang.String str56 = kuromojiAnalysisTests41.getTestName();
        java.lang.String str57 = kuromojiAnalysisTests41.getTestName();
        kuromojiAnalysisTests41.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests41.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) ruleChainSet39, (java.lang.Object) kuromojiAnalysisTests41);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        char[] charArray2 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100L, (-1.0d), 0.0d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 'a', (double) (byte) 10);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        double[] doubleArray3 = new double[] { 100, (short) 100 };
        double[] doubleArray6 = new double[] { 100, (short) 100 };
        double[] doubleArray9 = new double[] { 100, (short) 100 };
        double[][] doubleArray10 = new double[][] { doubleArray3, doubleArray6, doubleArray9 };
        java.util.Set<double[]> doubleArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("hi!", indexReader21, (int) (byte) 0, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests13.assertTermsEquals("random", indexReader27, terms28, terms29, true);
        kuromojiAnalysisTests13.setUp();
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("", indexReader35, fields36, fields37, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests40.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields43, fields44, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        kuromojiAnalysisTests47.assertFieldsEquals("europarl.lines.txt.gz", indexReader49, fields50, fields51, false);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests47.assertPositionsSkippingEquals("hi!", indexReader55, (int) (byte) 0, postingsEnum57, postingsEnum58);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray60 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests13, kuromojiAnalysisTests40, kuromojiAnalysisTests47 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) doubleArraySet11, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("random", indexReader3, fields4, fields5, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests15.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests15.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests15);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum28, postingsEnum29, true);
        org.junit.rules.RuleChain ruleChain32 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        kuromojiAnalysisTests34.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        kuromojiAnalysisTests34.resetCheckIndexStatus();
        java.lang.String str45 = kuromojiAnalysisTests34.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests34);
        kuromojiAnalysisTests34.tearDown();
        kuromojiAnalysisTests34.setUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests34.assertPositionsSkippingEquals("", indexReader50, (int) '#', postingsEnum52, postingsEnum53);
        kuromojiAnalysisTests34.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests34.assertDocsEnumEquals("tests.weekly", postingsEnum57, postingsEnum58, false);
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests34.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum62, postingsEnum63, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) postingsEnum63);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray14 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray25 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray32 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray32, (float) (byte) 100);
        float[] floatArray43 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray50 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray43, floatArray50, (float) (byte) 100);
        float[] floatArray60 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray67 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray60, floatArray67, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray43, floatArray60, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray25, floatArray43, (float) (byte) 0);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray43, (float) 10);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) testRule18);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100.0f, 10.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.slow", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCleanedUp();
        java.lang.String str12 = kuromojiAnalysisTests2.getTestName();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.monster", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        float[] floatArray0 = null;
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray15, (-1.0f));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) -1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        float[] floatArray1 = null;
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray28 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray35 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray28, floatArray35, (float) (byte) 100);
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray28, floatArray45, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray10, floatArray28, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray28, 100.0f);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 100, (long) 100);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader13, fields14, fields15, false);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader21, (int) '4', postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.monster", indexReader28, (int) (short) 0, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues35, numericDocValues36);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), (double) 0.0f);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests1.ruleChain;
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale19, locale21, locale23, locale25, locale27 };
        java.util.Set<java.util.Locale> localeSet29 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray28);
        java.util.List<java.io.Serializable> serializableList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray28);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray28, (java.lang.Object) 0.0f);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale36, locale38, locale40, locale42, locale44 };
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        java.util.List<java.io.Serializable> serializableList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray45);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray45, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray28, (java.lang.Object[]) localeArray45);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale52, locale54, locale56, locale58, locale60 };
        java.util.Set<java.util.Locale> localeSet62 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray61);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray28, (java.lang.Object[]) localeArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) localeArray61);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale67, locale69, locale71, locale73, locale75 };
        java.util.Set<java.util.Locale> localeSet77 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray76);
        java.util.List<java.io.Serializable> serializableList78 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray76);
        java.util.Set<java.lang.Cloneable> cloneableSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray61, (java.lang.Object[]) localeArray76);
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale89 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale91 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale83, locale85, locale87, locale89, locale91 };
        java.util.Set<java.util.Locale> localeSet93 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray92);
        java.util.List<java.io.Serializable> serializableList94 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray92);
        java.util.Set<java.lang.Cloneable> cloneableSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) localeArray76, (java.lang.Object) cloneableSet95);
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
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        double[] doubleArray11 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray16 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray11, doubleArray16, (double) (byte) 100);
        double[] doubleArray25 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray30 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray30, (double) (byte) 100);
        double[] doubleArray38 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray43 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray38, doubleArray43, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray38, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray25, (-1.0d));
        double[] doubleArray56 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray61 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray61, (double) (byte) 100);
        double[] doubleArray69 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray74 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray69, doubleArray74, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray56, doubleArray69, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray11, doubleArray69, (double) 10.0f);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray2, (java.lang.Object) "random");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray84 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling83 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList85 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray84);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) throttlingArray84);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (short) 1, (float) 'a', (float) (byte) 1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        char[] charArray4 = new char[] { 'a', '#', '#', '#' };
        char[] charArray11 = new char[] { ' ', 'a', '4', '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray3);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.List<java.io.Serializable> serializableList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray19);
        java.util.Set<java.lang.Cloneable> cloneableSet22 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray19, (java.lang.Object) (byte) -1);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale27, locale29, locale31, locale33, locale35 };
        java.util.Set<java.util.Locale> localeSet37 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray36);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale40, locale42, locale44, locale46, locale48 };
        java.util.Set<java.util.Locale> localeSet50 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.List<java.io.Serializable> serializableList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray49);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale55, locale57, locale59, locale61, locale63 };
        java.util.Set<java.util.Locale> localeSet65 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray64);
        java.util.List<java.io.Serializable> serializableList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray64);
        java.util.Set<java.lang.Cloneable> cloneableSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray64);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray49, (java.lang.Object[]) localeArray64);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray19, (java.lang.Object[]) localeArray49);
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale71, locale73, locale75, locale77, locale79 };
        java.util.Set<java.util.Locale> localeSet81 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray80);
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale86 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale90 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale92 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray93 = new java.util.Locale[] { locale84, locale86, locale88, locale90, locale92 };
        java.util.Set<java.util.Locale> localeSet94 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray93);
        java.util.List<java.io.Serializable> serializableList95 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray93);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray80, (java.lang.Object[]) localeArray93);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) localeArray49, (java.lang.Object[]) localeArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) localeArray49);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, true);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests18.assertPositionsSkippingEquals("hi!", indexReader26, (int) (byte) 0, postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        kuromojiAnalysisTests18.assertTermsEquals("random", indexReader32, terms33, terms34, true);
        kuromojiAnalysisTests18.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests18.assertDocsEnumEquals("tests.nightly", postingsEnum39, postingsEnum40, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests43.assertFieldsEquals("europarl.lines.txt.gz", indexReader45, fields46, fields47, false);
        kuromojiAnalysisTests43.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests43.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests43.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests18, (java.lang.Object) kuromojiAnalysisTests43);
        kuromojiAnalysisTests18.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests57.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain67 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain67;
        kuromojiAnalysisTests18.failureAndSuccessEvents = ruleChain67;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain67;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        kuromojiAnalysisTests71.assertFieldsEquals("europarl.lines.txt.gz", indexReader73, fields74, fields75, false);
        kuromojiAnalysisTests71.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests71.setUp();
        kuromojiAnalysisTests71.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests71);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        char[] charArray6 = new char[] { '4', ' ', 'a', ' ', '4' };
        char[] charArray9 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10, (double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 1L, (float) 100, (float) (short) 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0.0d, (double) (short) -1);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0f, (float) '4', (float) (short) 1);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray11 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray11);
        org.junit.Assert.assertNotEquals((java.lang.Object) (short) -1, (java.lang.Object) strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        char[] charArray3 = new char[] { '4', '#' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray4);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) (short) 10, 10.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray4, byteArray8);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 100, (long) (short) 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][][] doubleArray4 = new double[][][] { doubleArray1, doubleArray2, doubleArray3 };
        java.util.List<double[][]> doubleArrayList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, doubleArray4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        kuromojiAnalysisTests7.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        kuromojiAnalysisTests7.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        kuromojiAnalysisTests7.setUp();
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale33, locale35, locale37, locale39, locale41 };
        java.util.Set<java.util.Locale> localeSet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        java.util.List<java.io.Serializable> serializableList44 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray42);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale48, locale50, locale52, locale54, locale56 };
        java.util.Set<java.util.Locale> localeSet58 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray57);
        java.util.List<java.io.Serializable> serializableList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray57);
        java.util.Set<java.lang.Cloneable> cloneableSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray42, (java.lang.Object[]) localeArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests7, (java.lang.Object) localeArray57);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests63 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        kuromojiAnalysisTests63.assertFieldsEquals("europarl.lines.txt.gz", indexReader65, fields66, fields67, false);
        kuromojiAnalysisTests63.ensureCleanedUp();
        kuromojiAnalysisTests63.resetCheckIndexStatus();
        kuromojiAnalysisTests63.ensureCleanedUp();
        java.lang.String str73 = kuromojiAnalysisTests63.getTestName();
        kuromojiAnalysisTests63.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule75 = kuromojiAnalysisTests63.ruleChain;
        kuromojiAnalysisTests63.setUp();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) localeArray57, (java.lang.Object) kuromojiAnalysisTests63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray4, (java.lang.Object[]) localeArray57);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray7);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray13);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) throttlingArray13);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        char[] charArray5 = new char[] { '#', ' ', '#', '4', '#' };
        char[] charArray7 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        char[] charArray6 = new char[] { '4', '4', '4', 'a', '#' };
        char[] charArray10 = new char[] { '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray6, charArray10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray8);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray16, intArray21);
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        int[] intArray33 = new int[] { '#' };
        int[] intArray35 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray33, intArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray28, intArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray16, intArray33);
        int[] intArray40 = new int[] { '#' };
        int[] intArray42 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray40, intArray42);
        org.junit.Assert.assertArrayEquals(intArray33, intArray42);
        org.junit.Assert.assertArrayEquals(intArray8, intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray8);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.awaitsfix", (int) (short) 1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) 100, (double) 'a');
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        char[] charArray2 = new char[] { '#', '#' };
        char[] charArray9 = new char[] { '4', 'a', 'a', 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray9);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader12, 10, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", 100, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (short) -1, (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (short) 1, (double) (-1.0f));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.lang.String str14 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader16, (int) '4', postingsEnum18, postingsEnum19);
        java.lang.String str21 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) 0, (float) (-1L), 0.0f);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (short) 1, 100.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        float[] floatArray43 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray50 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray43, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray26, floatArray43, (float) (-1));
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray15, floatArray43, (float) (short) 10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("hi!", indexReader10, (int) (byte) 0, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.ensureCheckIndexPassed();
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests18.assertDocsSkippingEquals("tests.slow", indexReader31, (-1), postingsEnum33, postingsEnum34, true);
        kuromojiAnalysisTests18.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests18.assertPositionsSkippingEquals("<unknown>", indexReader39, (int) (byte) -1, postingsEnum41, postingsEnum42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) "tests.slow", (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 0.0d, (double) 0L);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("<unknown>", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.weekly", postingsEnum21, postingsEnum22, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests25.tearDown();
        kuromojiAnalysisTests25.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests25.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        kuromojiAnalysisTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields41, fields42, false);
        kuromojiAnalysisTests38.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        kuromojiAnalysisTests38.assertPathHasBeenCleared("random");
        java.lang.String str51 = kuromojiAnalysisTests38.getTestName();
        org.junit.rules.RuleChain ruleChain52 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        kuromojiAnalysisTests25.failureAndSuccessEvents = ruleChain52;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain52;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, false);
        kuromojiAnalysisTests55.ensureCleanedUp();
        kuromojiAnalysisTests55.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests55.tearDown();
        kuromojiAnalysisTests55.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests55.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, false);
        kuromojiAnalysisTests68.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain77 = kuromojiAnalysisTests68.failureAndSuccessEvents;
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        kuromojiAnalysisTests68.assertPathHasBeenCleared("random");
        java.lang.String str81 = kuromojiAnalysisTests68.getTestName();
        org.junit.rules.RuleChain ruleChain82 = kuromojiAnalysisTests68.failureAndSuccessEvents;
        kuromojiAnalysisTests55.failureAndSuccessEvents = ruleChain82;
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        kuromojiAnalysisTests55.assertDocsSkippingEquals("tests.awaitsfix", indexReader85, 100, postingsEnum87, postingsEnum88, true);
        org.junit.rules.TestRule testRule91 = kuromojiAnalysisTests55.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain52, (java.lang.Object) testRule91);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) (byte) 10);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.lang.String str11 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule13;
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet23, (java.lang.Object) kuromojiAnalysisTests24);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests24.assertDocsEnumEquals("tests.badapples", postingsEnum29, postingsEnum30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, 100, postingsEnum36, postingsEnum37);
        kuromojiAnalysisTests24.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("tests.failfast", indexReader41, fields42, fields43, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) testRule13, (java.lang.Object) indexReader41);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 1, (-1L));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 10L);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.weekly", indexReader18, 10, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", 100, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        java.lang.Object obj0 = null;
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("tests.failfast", indexReader45, 1, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray30, (java.lang.Object) kuromojiAnalysisTests37);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        java.util.Set<java.lang.Cloneable> cloneableSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray66);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray66, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) localeArray30);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray4 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray7);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, (long) 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (byte) 10, (double) 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass5 = locale4.getClass();
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass8 = locale7.getClass();
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass11 = locale10.getClass();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass14 = locale13.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2, wildcardClass5, wildcardClass8, wildcardClass11, wildcardClass14 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet16 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray15);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray15, obj17);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray15, (java.lang.Object[]) localeArray30);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        short[] shortArray23 = new short[] { (short) 10 };
        short[] shortArray25 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray23, shortArray25);
        short[] shortArray29 = new short[] { (short) 10 };
        short[] shortArray31 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray29, shortArray31);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray25, shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray31);
        short[] shortArray38 = new short[] { (short) 10 };
        short[] shortArray40 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray38, shortArray40);
        short[] shortArray44 = new short[] { (short) 10 };
        short[] shortArray46 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray44, shortArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray46);
        short[] shortArray52 = new short[] { (short) 10 };
        short[] shortArray54 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray52, shortArray54);
        short[] shortArray58 = new short[] { (short) 10 };
        short[] shortArray60 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray58, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray54, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray46);
        short[] shortArray70 = new short[] { (short) 10 };
        short[] shortArray72 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray70, shortArray72);
        short[] shortArray76 = new short[] { (short) 10 };
        short[] shortArray78 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray78);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray72, shortArray78);
        short[] shortArray84 = new short[] { (short) 10 };
        short[] shortArray86 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray84, shortArray86);
        short[] shortArray90 = new short[] { (short) 10 };
        short[] shortArray92 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray90, shortArray92);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray86, shortArray92);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray72, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray92);
        short[] shortArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray92, shortArray97);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        java.util.List[] listArray3 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray4 = (java.util.List<java.io.Serializable>[]) listArray3;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray4);
        java.util.List<java.util.List<java.io.Serializable>> serializableListList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, serializableListArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) serializableListList6);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (byte) 1, 1.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        java.lang.Class<?> wildcardClass21 = kuromojiAnalysisTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) wildcardClass21);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale6, locale8, locale10, locale12, locale14 };
        java.util.Set<java.util.Locale> localeSet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        java.util.List<java.io.Serializable> serializableList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray15);
        java.util.Set<java.lang.Cloneable> cloneableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray15);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray15, (java.lang.Object) (byte) -1);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        java.util.Set<java.lang.Cloneable> cloneableSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray32);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray32, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray15, (java.lang.Object[]) localeArray32);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        kuromojiAnalysisTests39.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray15, (java.lang.Object) kuromojiAnalysisTests39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) localeArray15);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray6, byteArray11);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray10, intArray15);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        int[] intArray27 = new int[] { '#' };
        int[] intArray29 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray27, intArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray22, intArray27);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray10, intArray27);
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray36, intArray41);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray48, intArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray36, intArray53);
        org.junit.Assert.assertArrayEquals("random", intArray27, intArray36);
        org.junit.Assert.assertArrayEquals(intArray2, intArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.monster", indexReader19, 0, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader25, fields26, fields27, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertPathHasBeenCleared("");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        char[] charArray1 = new char[] { '4' };
        char[] charArray6 = new char[] { ' ', ' ', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        java.lang.String str13 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray7);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("<unknown>", indexReader12, fields13, fields14, true);
        java.lang.String str17 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) -1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray11 = new int[] { '#' };
        int[] intArray13 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray11, intArray13);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray11, intArray16);
        int[] intArray23 = new int[] { '#' };
        int[] intArray25 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray23, intArray25);
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray23, intArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray11, intArray28);
        int[] intArray37 = new int[] { '#' };
        int[] intArray39 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray37, intArray39);
        int[] intArray42 = new int[] { '#' };
        int[] intArray44 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray42, intArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray37, intArray42);
        int[] intArray49 = new int[] { '#' };
        int[] intArray51 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray49, intArray51);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray49, intArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray37, intArray54);
        org.junit.Assert.assertArrayEquals("random", intArray28, intArray37);
        org.junit.Assert.assertArrayEquals(intArray3, intArray37);
        int[] intArray65 = new int[] { '#' };
        int[] intArray67 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray65, intArray67);
        int[] intArray70 = new int[] { '#' };
        int[] intArray72 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray70, intArray72);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray65, intArray70);
        int[] intArray77 = new int[] { '#' };
        int[] intArray79 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray77, intArray79);
        int[] intArray82 = new int[] { '#' };
        int[] intArray84 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray82, intArray84);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray77, intArray82);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray65, intArray82);
        org.junit.Assert.assertArrayEquals(intArray37, intArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray82);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 10L, 10.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader19, fields20, fields21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader25, terms26, terms27, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader32, terms33, terms34, true);
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (short) 10, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.List<java.io.Serializable> serializableList31 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray29);
        java.util.Set<java.lang.Cloneable> cloneableSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray29);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray29, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        kuromojiAnalysisTests36.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain45 = kuromojiAnalysisTests36.failureAndSuccessEvents;
        kuromojiAnalysisTests36.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray12, (java.lang.Object) kuromojiAnalysisTests36);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests36.assertDocsEnumEquals("", postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests36.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum54, postingsEnum55);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray7 = new char[] { 'a', '#', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray7);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { '#', '#', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 10 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("", indexReader18, (int) '#', postingsEnum20, postingsEnum21);
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.weekly", postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum30, postingsEnum31, true);
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 100L, (-1L));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (short) 100, (long) '4');
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) executorServiceArray2);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray12, shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray18);
        short[] shortArray22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray22);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureCleanedUp();
        int[] intArray29 = new int[] { '#' };
        int[] intArray31 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray29, intArray31);
        int[] intArray34 = new int[] { '#' };
        int[] intArray36 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray34, intArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray29, intArray34);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        int[] intArray46 = new int[] { '#' };
        int[] intArray48 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray46, intArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray29, intArray46);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        org.junit.Assert.assertArrayEquals(intArray46, intArray55);
        int[] intArray60 = new int[] { '#' };
        int[] intArray62 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray60, intArray62);
        int[] intArray65 = new int[] { '#' };
        int[] intArray67 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray65, intArray67);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray60, intArray65);
        org.junit.Assert.assertArrayEquals(intArray55, intArray65);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        kuromojiAnalysisTests71.assertFieldsEquals("europarl.lines.txt.gz", indexReader73, fields74, fields75, false);
        kuromojiAnalysisTests71.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests71.setUp();
        kuromojiAnalysisTests71.ensureCheckIndexPassed();
        kuromojiAnalysisTests71.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) intArray55, (java.lang.Object) kuromojiAnalysisTests71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) intArray55);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale17, locale19, locale21, locale23, locale25 };
        java.util.Set<java.util.Locale> localeSet27 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray26);
        java.util.List<java.io.Serializable> serializableList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray26);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale32, locale34, locale36, locale38, locale40 };
        java.util.Set<java.util.Locale> localeSet42 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        java.util.List<java.io.Serializable> serializableList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray41);
        java.util.Set<java.lang.Cloneable> cloneableSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray26, (java.lang.Object[]) localeArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) 0.0f, (java.lang.Object) localeArray41);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale49, locale51, locale53, locale55, locale57 };
        java.util.Set<java.util.Locale> localeSet59 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray58);
        java.util.List<java.io.Serializable> serializableList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray41, (java.lang.Object[]) localeArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) localeArray58);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray6, longArray8);
        long[] longArray12 = new long[] { 1 };
        long[] longArray14 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray12, longArray14);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray8, longArray12);
        long[] longArray20 = new long[] { 1 };
        long[] longArray22 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray20, longArray22);
        long[] longArray26 = new long[] { 1 };
        long[] longArray28 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray26, longArray28);
        org.junit.Assert.assertArrayEquals("random", longArray22, longArray28);
        long[] longArray34 = new long[] { 1 };
        long[] longArray36 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray34, longArray36);
        long[] longArray41 = new long[] { 1 };
        long[] longArray43 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray41, longArray43);
        long[] longArray47 = new long[] { 1 };
        long[] longArray49 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray47, longArray49);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray43, longArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray34, longArray47);
        org.junit.Assert.assertArrayEquals(longArray28, longArray34);
        org.junit.Assert.assertArrayEquals(longArray12, longArray34);
        long[] longArray58 = new long[] { 1 };
        long[] longArray60 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray58, longArray60);
        long[] longArray65 = new long[] { 1 };
        long[] longArray67 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray65, longArray67);
        long[] longArray71 = new long[] { 1 };
        long[] longArray73 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray71, longArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray67, longArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray58, longArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray34, longArray71);
        long[] longArray81 = new long[] { 1 };
        long[] longArray83 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray81, longArray83);
        long[] longArray87 = new long[] { 1 };
        long[] longArray89 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray87, longArray89);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray83, longArray87);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray71, longArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray71);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 100.0d, (double) (short) 0);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader10, 1, postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        kuromojiAnalysisTests19.resetCheckIndexStatus();
        java.lang.String str30 = kuromojiAnalysisTests19.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests19);
        kuromojiAnalysisTests19.tearDown();
        kuromojiAnalysisTests19.setUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain40);
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (short) 10, numericDocValues44, numericDocValues45);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        float[] floatArray44 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray51 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray44, floatArray51, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray27, floatArray44, (float) (-1));
        float[] floatArray64 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray71 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray64, floatArray71, (float) (byte) 100);
        float[] floatArray81 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray88 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray81, floatArray88, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray64, floatArray81, (float) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray27, floatArray64, (float) 10L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray27, (float) '4');
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        char[] charArray3 = new char[] { '4', ' ', '4' };
        char[] charArray5 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields20, fields21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("tests.failfast", indexReader25, 1, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("<unknown>", indexReader31, (int) '#', postingsEnum33, postingsEnum34);
        kuromojiAnalysisTests17.setUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("random", indexReader38, (int) (byte) -1, postingsEnum40, postingsEnum41);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "random");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests44.assertFieldsEquals("europarl.lines.txt.gz", indexReader46, fields47, fields48, false);
        kuromojiAnalysisTests44.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        kuromojiAnalysisTests44.resetCheckIndexStatus();
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule56 = kuromojiAnalysisTests44.ruleChain;
        kuromojiAnalysisTests44.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("tests.awaitsfix", indexReader59, 10, postingsEnum61, postingsEnum62);
        kuromojiAnalysisTests44.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests44);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass12 = locale11.getClass();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass15 = locale14.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass12, wildcardClass15 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet17 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray16);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet18 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) annotatedElementArray16);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 100, 10L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (byte) 10, (float) (short) 1, (float) (short) 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) '#', (float) (byte) 0);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.nightly", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests0.assertTermsEquals("<unknown>", indexReader30, terms31, terms32, false);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", (int) (byte) 100, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        char[] charArray1 = new char[] { '#' };
        char[] charArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 1, (long) 'a');
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests6.assertPositionsSkippingEquals("hi!", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests6.assertTermsEquals("random", indexReader20, terms21, terms22, true);
        kuromojiAnalysisTests6.setUp();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("", indexReader28, fields29, fields30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests40.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields43, fields44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests40.assertPositionsSkippingEquals("hi!", indexReader48, (int) (byte) 0, postingsEnum50, postingsEnum51);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray53 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests6, kuromojiAnalysisTests33, kuromojiAnalysisTests40 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) eSTestCaseArray53);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) '4', (float) (short) 10);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        short[] shortArray1 = new short[] { (byte) -1 };
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 'a', 0.0f, (float) 1);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.weekly", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests25.resetCheckIndexStatus();
        java.lang.String str36 = kuromojiAnalysisTests25.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests25);
        kuromojiAnalysisTests25.tearDown();
        kuromojiAnalysisTests25.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests25.tearDown();
        kuromojiAnalysisTests25.setUp();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) kuromojiAnalysisTests25);
        kuromojiAnalysisTests25.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum19, (java.lang.Object) kuromojiAnalysisTests25);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        char[] charArray2 = new char[] { '#' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray2, charArray3);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) 0L, 1.0f, (float) 0);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray25);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet26, (java.lang.Object) kuromojiAnalysisTests27);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests27.assertDocsEnumEquals("tests.badapples", postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests27.ruleChain;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("tests.maxfailures", indexReader38, (int) (byte) 100, postingsEnum40, postingsEnum41, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests44.assertFieldsEquals("europarl.lines.txt.gz", indexReader46, fields47, fields48, false);
        kuromojiAnalysisTests44.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain53 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain53;
        kuromojiAnalysisTests11.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        kuromojiAnalysisTests11.assertDocsEnumEquals("<unknown>", postingsEnum57, postingsEnum58, true);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        kuromojiAnalysisTests11.assertTermsEquals("tests.slow", indexReader62, terms63, terms64, true);
        java.lang.Class<?> wildcardClass67 = kuromojiAnalysisTests11.getClass();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray71 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling70 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList72 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray71);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests11, (java.lang.Object) throttlingArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) throttlingArray71);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        float[] floatArray27 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray34 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray27, floatArray34, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray10, floatArray27, (float) (-1));
        float[] floatArray46 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray53 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray46, floatArray53, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray27, floatArray46, (float) (-1L));
        float[] floatArray65 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray72 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray65, floatArray72, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray46, floatArray72, (float) (short) -1);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (short) 10, (double) 100L, (double) (short) 100);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (byte) 10, (-1.0d));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) (-1.0f), 0.0d, (double) ' ');
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, 100.0d, 1.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader13, (-1), postingsEnum15, postingsEnum16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale5, locale7, locale9, locale11, locale13 };
        java.util.Set<java.util.Locale> localeSet15 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray14);
        java.util.List<java.io.Serializable> serializableList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray14);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray14, (java.lang.Object) 0.0f);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray31 = new java.util.Locale[] { locale22, locale24, locale26, locale28, locale30 };
        java.util.Set<java.util.Locale> localeSet32 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray31);
        java.util.List<java.io.Serializable> serializableList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray31, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray14, (java.lang.Object[]) localeArray31);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale39, locale41, locale43, locale45, locale47 };
        java.util.Set<java.util.Locale> localeSet49 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray48);
        java.util.List<java.io.Serializable> serializableList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray48);
        java.util.Set<java.lang.Cloneable> cloneableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray48);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray64 = new java.util.Locale[] { locale55, locale57, locale59, locale61, locale63 };
        java.util.Set<java.util.Locale> localeSet65 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray64);
        java.lang.String[] strArray69 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray69);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) localeSet65, (java.lang.Object) strArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray48, (java.lang.Object[]) strArray69);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        int[] intArray28 = new int[] { '#' };
        int[] intArray30 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray28, intArray30);
        int[] intArray33 = new int[] { '#' };
        int[] intArray35 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray33, intArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray28, intArray33);
        int[] intArray40 = new int[] { '#' };
        int[] intArray42 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray40, intArray42);
        int[] intArray45 = new int[] { '#' };
        int[] intArray47 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray45, intArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray40, intArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray28, intArray45);
        int[] intArray52 = new int[] { '#' };
        int[] intArray54 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray52, intArray54);
        org.junit.Assert.assertArrayEquals(intArray45, intArray54);
        int[] intArray59 = new int[] { '#' };
        int[] intArray61 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray59, intArray61);
        int[] intArray64 = new int[] { '#' };
        int[] intArray66 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray64, intArray66);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray59, intArray64);
        org.junit.Assert.assertArrayEquals(intArray54, intArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) intArray64);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray5 = new char[] { '4', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        byte[] byteArray0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray7);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 0.0d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray2 = new org.junit.rules.RuleChain[][] { ruleChainArray1 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray2);
        java.util.Set<org.junit.rules.TestRule[]> testRuleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[][]) ruleChainArray2);
        java.lang.Class<?> wildcardClass5 = testRuleArraySet4.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet14, (java.lang.Object) kuromojiAnalysisTests15);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.resetCheckIndexStatus();
        kuromojiAnalysisTests19.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("", indexReader30, (int) (byte) 0, postingsEnum32, postingsEnum33);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests19);
        kuromojiAnalysisTests19.setUp();
        kuromojiAnalysisTests19.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) testRuleArraySet4, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.setUp();
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale14, locale16, locale18, locale20, locale22 };
        java.util.Set<java.util.Locale> localeSet24 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray23);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale27, locale29, locale31, locale33, locale35 };
        java.util.Set<java.util.Locale> localeSet37 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray36);
        java.util.List<java.io.Serializable> serializableList38 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray23, (java.lang.Object[]) localeArray36);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        java.util.Set<java.lang.Cloneable> cloneableSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray51);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) localeArray51);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests57.ensureCleanedUp();
        kuromojiAnalysisTests57.resetCheckIndexStatus();
        kuromojiAnalysisTests57.ensureCleanedUp();
        java.lang.String str67 = kuromojiAnalysisTests57.getTestName();
        kuromojiAnalysisTests57.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests57.ruleChain;
        kuromojiAnalysisTests57.setUp();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) localeArray51, (java.lang.Object) kuromojiAnalysisTests57);
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass74 = locale73.getClass();
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass77 = locale76.getClass();
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass80 = locale79.getClass();
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass83 = locale82.getClass();
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass86 = locale85.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray87 = new java.lang.reflect.AnnotatedElement[] { wildcardClass74, wildcardClass77, wildcardClass80, wildcardClass83, wildcardClass86 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet88 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray87);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet89 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray87);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray51, (java.lang.Object[]) annotatedElementArray87);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        org.junit.rules.RuleChain[] ruleChainArray38 = new org.junit.rules.RuleChain[] { ruleChain22, ruleChain36 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet39 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray38);
        java.lang.Iterable[][] iterableArray41 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.util.Locale>[][] localeIterableArray42 = (java.lang.Iterable<java.util.Locale>[][]) iterableArray41;
        java.util.Set<java.lang.Iterable<java.util.Locale>[]> localeIterableArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeIterableArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) ruleChainArray38, (java.lang.Object[]) localeIterableArray42);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader22, (int) 'a', postingsEnum24, postingsEnum25);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("tests.failfast", indexReader37, 1, postingsEnum39, postingsEnum40);
        kuromojiAnalysisTests29.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests29.ensureCleanedUp();
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        kuromojiAnalysisTests29.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("enwiki.random.lines.txt", indexReader48, fields49, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        kuromojiAnalysisTests29.assertTermsEquals("tests.failfast", indexReader54, terms55, terms56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("tests.awaitsfix", indexReader60, 10, postingsEnum62, postingsEnum63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) postingsEnum63);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '#', (double) (byte) 0);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.awaitsfix");
        java.lang.Class<?> wildcardClass12 = kuromojiAnalysisTests1.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests13.ensureCleanedUp();
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests13);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray9, intArray11);
        int[] intArray14 = new int[] { '#' };
        int[] intArray16 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray14, intArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray9, intArray14);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        int[] intArray26 = new int[] { '#' };
        int[] intArray28 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray26, intArray28);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray21, intArray26);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray9, intArray26);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        int[] intArray40 = new int[] { '#' };
        int[] intArray42 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray35, intArray40);
        int[] intArray47 = new int[] { '#' };
        int[] intArray49 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray47, intArray49);
        int[] intArray52 = new int[] { '#' };
        int[] intArray54 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray52, intArray54);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray47, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray35, intArray52);
        org.junit.Assert.assertArrayEquals("random", intArray26, intArray35);
        org.junit.Assert.assertArrayEquals(intArray1, intArray35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests60 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests60.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        kuromojiAnalysisTests60.assertTermsEquals("tests.weekly", indexReader64, terms65, terms66, true);
        kuromojiAnalysisTests60.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests60.assertPathHasBeenCleared("tests.awaitsfix");
        kuromojiAnalysisTests60.assertPathHasBeenCleared("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray35, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray4 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale34, locale36, locale38, locale40, locale42 };
        java.util.Set<java.util.Locale> localeSet44 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        java.util.List<java.io.Serializable> serializableList45 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray43);
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale49, locale51, locale53, locale55, locale57 };
        java.util.Set<java.util.Locale> localeSet59 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray58);
        java.util.List<java.io.Serializable> serializableList60 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray58);
        java.util.Set<java.lang.Cloneable> cloneableSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray58);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray43, (java.lang.Object[]) localeArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray13, (java.lang.Object[]) executorServiceArray67);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 1, 100.0d, (double) (short) -1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.lang.String str10 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList10 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, testRuleIgnoreAfterMaxFailuresArray9);
        double[][] doubleArray12 = new double[][] {};
        double[][] doubleArray13 = new double[][] {};
        double[][] doubleArray14 = new double[][] {};
        double[][][] doubleArray15 = new double[][][] { doubleArray12, doubleArray13, doubleArray14 };
        java.util.List<double[][]> doubleArrayList16 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, doubleArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray9, (java.lang.Object[]) doubleArray15);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 100, (double) 100.0f);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray12, (java.lang.Object) "tests.monster");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.weekly", indexReader21, terms22, terms23, true);
        kuromojiAnalysisTests17.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests17.setUp();
        kuromojiAnalysisTests17.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) localeArray12, (java.lang.Object) kuromojiAnalysisTests17);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        char[] charArray6 = new char[] { 'a', '#', '4', '#', '4', ' ' };
        char[] charArray9 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        kuromojiAnalysisTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests10);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray23 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray23);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        kuromojiAnalysisTests25.assertPositionsSkippingEquals("tests.failfast", indexReader33, 1, postingsEnum35, postingsEnum36);
        kuromojiAnalysisTests25.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.resetCheckIndexStatus();
        kuromojiAnalysisTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("enwiki.random.lines.txt", indexReader44, fields45, fields46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests25.assertDocsSkippingEquals("tests.weekly", indexReader50, (int) (byte) 0, postingsEnum52, postingsEnum53, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray23, (java.lang.Object) "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests10, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        double[] doubleArray5 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray10, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        double[] doubleArray32 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray37 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray32, doubleArray37, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray32, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray19, (-1.0d));
        double[] doubleArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray44, (double) 100.0f);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        float[] floatArray46 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray53 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray46, floatArray53, (float) (byte) 100);
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray46, floatArray63, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray63, (float) 1);
        float[] floatArray84 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray91 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray84, floatArray91, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray91, (float) (short) 10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray5, byteArray8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests11);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        kuromojiAnalysisTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader25, fields26, fields27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests23.assertPositionsSkippingEquals("hi!", indexReader31, (int) (byte) 0, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        kuromojiAnalysisTests23.assertTermsEquals("random", indexReader37, terms38, terms39, true);
        java.lang.String str42 = kuromojiAnalysisTests23.getTestName();
        kuromojiAnalysisTests23.setIndexWriterMaxDocs((int) (short) 0);
        java.lang.String str45 = kuromojiAnalysisTests23.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests23);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 10.0d, (double) 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) (byte) 10, 0.0f);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        java.lang.Object[] objArray1 = null;
        double[] doubleArray4 = new double[] { 100, (short) 100 };
        double[] doubleArray7 = new double[] { 100, (short) 100 };
        double[] doubleArray10 = new double[] { 100, (short) 100 };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        java.util.Set<double[]> doubleArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray11);
        java.util.Set<double[]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) doubleArray11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        kuromojiAnalysisTests9.setUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests9.assertTermsEquals("tests.slow", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocValuesEquals("random", (-1), numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) '4', (double) (short) 10);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) 10, (double) (byte) 100);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 1, (double) 1.0f);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', 10L);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        int[] intArray0 = null;
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray10);
        int[] intArray17 = new int[] { '#' };
        int[] intArray19 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray17, intArray19);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray17, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray22);
        int[] intArray29 = new int[] { '#' };
        int[] intArray31 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray29, intArray31);
        org.junit.Assert.assertArrayEquals(intArray22, intArray31);
        int[] intArray37 = new int[] { '#' };
        int[] intArray39 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray37, intArray39);
        int[] intArray42 = new int[] { '#' };
        int[] intArray44 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray42, intArray44);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray37, intArray42);
        int[] intArray49 = new int[] { '#' };
        int[] intArray51 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray49, intArray51);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray49, intArray54);
        int[] intArray60 = new int[] { '#' };
        int[] intArray62 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray60, intArray62);
        org.junit.Assert.assertArrayEquals(intArray54, intArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray42, intArray54);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray22, intArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray54);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 0.0d, (double) 10L, (double) 10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        char[] charArray3 = new char[] { '#', '4', '4' };
        char[] charArray8 = new char[] { '#', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        char[] charArray6 = new char[] { '4', 'a', 'a', '4', 'a' };
        char[] charArray13 = new char[] { '#', 'a', '#', ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray6, charArray13);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader11, (int) (short) 10, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray12, (java.lang.Object) (byte) -1);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28 };
        java.util.Set<java.util.Locale> localeSet30 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale33, locale35, locale37, locale39, locale41 };
        java.util.Set<java.util.Locale> localeSet43 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray42);
        java.util.List<java.io.Serializable> serializableList44 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray29, (java.lang.Object[]) localeArray42);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale48, locale50, locale52, locale54, locale56 };
        java.util.Set<java.util.Locale> localeSet58 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray57);
        java.util.List<java.io.Serializable> serializableList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray57);
        java.util.Set<java.lang.Cloneable> cloneableSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray57);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray42, (java.lang.Object[]) localeArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray12, (java.lang.Object[]) localeArray42);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale65, locale67, locale69, locale71, locale73 };
        java.util.Set<java.util.Locale> localeSet75 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray74);
        java.util.List<java.io.Serializable> serializableList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray74);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray42, (java.lang.Object[]) localeArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray74, (java.lang.Object[]) executorServiceArray79);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) -1);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.slow", indexReader11, (int) (short) -1, postingsEnum13, postingsEnum14, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("hi!", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        kuromojiAnalysisTests19.assertTermsEquals("random", indexReader33, terms34, terms35, true);
        kuromojiAnalysisTests19.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        char[] charArray6 = new char[] { ' ', ' ', '#', '#', '#', '4' };
        char[] charArray10 = new char[] { 'a', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray10);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        kuromojiAnalysisTests14.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        java.lang.String str25 = kuromojiAnalysisTests14.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests14.tearDown();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum32, postingsEnum33, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", 0, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests26.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests26);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.nightly", indexReader41, (int) (byte) 1, postingsEnum43, postingsEnum44);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum47, postingsEnum48, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, 0.0f, (float) 10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        char[] charArray3 = new char[] { ' ', '#', '#' };
        char[] charArray6 = new char[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (short) 100);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1, (java.lang.Object) genericDeclarationArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        double[] doubleArray16 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray21 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray16, doubleArray21, (double) (byte) 100);
        double[] doubleArray30 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray35 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray30, doubleArray35, (double) (byte) 100);
        double[] doubleArray43 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray48 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray43, doubleArray48, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray30, doubleArray43, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray30, (-1.0d));
        double[] doubleArray61 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray66 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray61, doubleArray66, (double) (byte) 100);
        double[] doubleArray74 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray79 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray74, doubleArray79, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray61, doubleArray74, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray16, doubleArray74, (double) 10.0f);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) executorServiceArray7, (java.lang.Object) "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests4.assertTermsEquals("tests.weekly", indexReader8, terms9, terms10, true);
        kuromojiAnalysisTests4.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests4.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests4.ensureCheckIndexPassed();
        kuromojiAnalysisTests4.setUp();
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) boolean3, (java.lang.Object) kuromojiAnalysisTests4);
        kuromojiAnalysisTests4.ensureCheckIndexPassed();
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale36, locale38, locale40, locale42, locale44 };
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        java.util.List<java.io.Serializable> serializableList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray32, (java.lang.Object[]) localeArray45);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale51, locale53, locale55, locale57, locale59 };
        java.util.Set<java.util.Locale> localeSet61 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray60);
        java.util.List<java.io.Serializable> serializableList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray60);
        java.util.Set<java.lang.Cloneable> cloneableSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray45, (java.lang.Object[]) localeArray60);
        java.lang.Class<?> wildcardClass65 = localeArray45.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests4, (java.lang.Object) localeArray45);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray7);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (short) 100, (double) 1L);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 100, (double) 1);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1L, (long) '#');
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray1);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale8, locale10, locale12, locale14, locale16 };
        java.util.Set<java.util.Locale> localeSet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        java.util.List<java.io.Serializable> serializableList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray17);
        java.util.Set<java.lang.Cloneable> cloneableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray17);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray17, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray17);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale29, locale31, locale33, locale35, locale37 };
        java.util.Set<java.util.Locale> localeSet39 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray38);
        java.util.List<java.io.Serializable> serializableList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray38);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray38, (java.lang.Object) 0.0f);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale46, locale48, locale50, locale52, locale54 };
        java.util.Set<java.util.Locale> localeSet56 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray55);
        java.util.List<java.io.Serializable> serializableList57 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray55);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray55, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray38, (java.lang.Object[]) localeArray55);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale63, locale65, locale67, locale69, locale71 };
        java.util.Set<java.util.Locale> localeSet73 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray72);
        java.util.List<java.io.Serializable> serializableList74 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray72);
        java.util.Set<java.lang.Cloneable> cloneableSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray55, (java.lang.Object[]) localeArray72);
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale86 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale88 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale80, locale82, locale84, locale86, locale88 };
        java.util.Set<java.util.Locale> localeSet90 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray89);
        java.util.List<java.io.Serializable> serializableList91 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray89);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray89, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray55, (java.lang.Object[]) localeArray89);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) localeArray17, (java.lang.Object[]) localeArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) localeArray17);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', (double) 10);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        char[] charArray3 = new char[] { '#', '#' };
        char[] charArray5 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 0);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader12, (int) (short) 1, postingsEnum14, postingsEnum15);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("tests.failfast", indexReader12, 1, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests4.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests4.ensureCleanedUp();
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        kuromojiAnalysisTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("enwiki.random.lines.txt", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.weekly", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) genericDeclarationArray2, (java.lang.Object) "tests.weekly");
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) genericDeclarationArray2, (java.lang.Object[]) executorServiceArray36);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale40, locale42, locale44 };
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale47, locale49, locale51 };
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale54, locale56, locale58 };
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale61, locale63, locale65 };
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale68, locale70, locale72 };
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale75, locale77, locale79 };
        java.util.Locale[][] localeArray81 = new java.util.Locale[][] { localeArray45, localeArray52, localeArray59, localeArray66, localeArray73, localeArray80 };
        java.util.Set<java.util.Locale[]> localeArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) localeArray81);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 100, (double) (short) 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        char[] charArray4 = new char[] { '#', '#', '4' };
        char[] charArray9 = new char[] { '#', 'a', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray9);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("", postingsEnum20, postingsEnum21, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests25.assertDocsEnumEquals("", postingsEnum27, postingsEnum28, false);
        org.junit.rules.TestRule testRule31 = kuromojiAnalysisTests25.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        kuromojiAnalysisTests32.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields35, fields36, false);
        kuromojiAnalysisTests32.ensureCleanedUp();
        kuromojiAnalysisTests32.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests32.tearDown();
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests25, (java.lang.Object) kuromojiAnalysisTests32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) postingsEnum21, (java.lang.Object) kuromojiAnalysisTests32);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray20, (double) 0);
        double[] doubleArray30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray30, (double) (byte) 0);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        char[] charArray7 = new char[] { '#', ' ', '#', ' ', '4', 'a' };
        char[] charArray8 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray7, charArray8);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests1.assertTermsEquals("random", indexReader15, terms16, terms17, true);
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("", indexReader23, fields24, fields25, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        kuromojiAnalysisTests35.assertPositionsSkippingEquals("hi!", indexReader43, (int) (byte) 0, postingsEnum45, postingsEnum46);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray48 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests1, kuromojiAnalysisTests28, kuromojiAnalysisTests35 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.lang.String str21 = kuromojiAnalysisTests0.getTestName();
        java.lang.String str22 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", 1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.ensureCleanedUp();
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        kuromojiAnalysisTests13.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests13.assertPositionsSkippingEquals("", indexReader24, (int) (byte) 0, postingsEnum26, postingsEnum27);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests13);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain30);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) '#');
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.weekly", indexReader13, (int) (short) 100, postingsEnum15, postingsEnum16, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.maxfailures");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader6, terms7, terms8, false);
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        kuromojiAnalysisTests14.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        java.lang.String str25 = kuromojiAnalysisTests14.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests14.tearDown();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests14.tearDown();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) kuromojiAnalysisTests14);
        java.lang.Class<?> wildcardClass32 = kuromojiAnalysisTests14.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) wildcardClass32);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        char[] charArray4 = new char[] { '#', '4', 'a', 'a' };
        char[] charArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray4, byteArray5);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader3, terms4, terms5, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader3);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        int[] intArray5 = new int[] { '#' };
        int[] intArray7 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
        int[] intArray10 = new int[] { '#' };
        int[] intArray12 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray10, intArray12);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray10);
        int[] intArray17 = new int[] { '#' };
        int[] intArray19 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray17, intArray19);
        int[] intArray22 = new int[] { '#' };
        int[] intArray24 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray22, intArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray17, intArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray22);
        int[] intArray29 = new int[] { '#' };
        int[] intArray31 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray29, intArray31);
        org.junit.Assert.assertArrayEquals(intArray22, intArray31);
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray36, intArray41);
        int[] intArray49 = new int[] { '#' };
        int[] intArray51 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray49, intArray51);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray49, intArray54);
        int[] intArray61 = new int[] { '#' };
        int[] intArray63 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray61, intArray63);
        int[] intArray66 = new int[] { '#' };
        int[] intArray68 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray66, intArray68);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray61, intArray66);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray49, intArray66);
        int[] intArray73 = new int[] { '#' };
        int[] intArray75 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray73, intArray75);
        org.junit.Assert.assertArrayEquals(intArray66, intArray75);
        org.junit.Assert.assertArrayEquals(intArray41, intArray66);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests79 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        kuromojiAnalysisTests79.assertFieldsEquals("europarl.lines.txt.gz", indexReader81, fields82, fields83, false);
        kuromojiAnalysisTests79.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests79.setUp();
        kuromojiAnalysisTests79.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) intArray41, (java.lang.Object) kuromojiAnalysisTests79);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray22, intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("tests.failfast", indexReader45, 1, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray30, (java.lang.Object) kuromojiAnalysisTests37);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        java.util.Set<java.lang.Cloneable> cloneableSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray66);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray66, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling74 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling74 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray75);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) localeArray30, (java.lang.Object[]) throttlingArray75);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) intArray2);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests16.resetCheckIndexStatus();
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests16.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        kuromojiAnalysisTests29.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain38 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        kuromojiAnalysisTests29.assertPathHasBeenCleared("random");
        java.lang.String str42 = kuromojiAnalysisTests29.getTestName();
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests29.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 10);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = null;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain17;
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        kuromojiAnalysisTests14.ensureCleanedUp();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("", indexReader25, (int) (byte) 0, postingsEnum27, postingsEnum28);
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.failfast", (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests14.setUp();
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.ensureCleanedUp();
        kuromojiAnalysisTests14.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        kuromojiAnalysisTests36.ensureCleanedUp();
        kuromojiAnalysisTests36.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields48, fields49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests45.assertPositionsSkippingEquals("tests.failfast", indexReader53, 1, postingsEnum55, postingsEnum56);
        kuromojiAnalysisTests45.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("tests.slow", indexReader61, fields62, fields63, false);
        kuromojiAnalysisTests45.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule67 = kuromojiAnalysisTests45.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests36, (java.lang.Object) testRule67);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.weekly", indexReader70, 0, postingsEnum72, postingsEnum73, false);
        kuromojiAnalysisTests36.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests14, (java.lang.Object) kuromojiAnalysisTests36);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        char[] charArray6 = new char[] { 'a', 'a', 'a', '#', '4', 'a' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (byte) 10, (double) (short) 1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        float[] floatArray45 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray52 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray45, floatArray52, (float) (byte) 100);
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray87 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray80, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray80, (float) 1L);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray26, floatArray80, (float) 'a');
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray96, 0.0f);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (-1));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray13, (java.lang.Object) (byte) -1);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray30, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests37.assertPositionsSkippingEquals("tests.failfast", indexReader45, 1, postingsEnum47, postingsEnum48);
        kuromojiAnalysisTests37.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray30, (java.lang.Object) kuromojiAnalysisTests37);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray66);
        long[] longArray75 = new long[] { ' ', 'a', (byte) 10, 100 };
        long[] longArray80 = new long[] { ' ', 'a', (byte) 10, 100 };
        long[] longArray85 = new long[] { ' ', 'a', (byte) 10, 100 };
        long[] longArray90 = new long[] { ' ', 'a', (byte) 10, 100 };
        long[] longArray95 = new long[] { ' ', 'a', (byte) 10, 100 };
        long[][] longArray96 = new long[][] { longArray75, longArray80, longArray85, longArray90, longArray95 };
        java.util.List<long[]> longArrayList97 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, longArray96);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray66, (java.lang.Object[]) longArray96);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        double[] doubleArray2 = new double[] { 100, (short) 100 };
        double[] doubleArray5 = new double[] { 100, (short) 100 };
        double[] doubleArray8 = new double[] { 100, (short) 100 };
        double[][] doubleArray9 = new double[][] { doubleArray2, doubleArray5, doubleArray8 };
        java.util.Set<double[]> doubleArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray9);
        java.util.Set<double[]> doubleArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray9);
        java.lang.Object[] objArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray9, objArray12);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        char[] charArray1 = new char[] {};
        char[] charArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray1, charArray2);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray8);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) ' ');
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10.0f, (-1.0d), 0.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests0.assertTermsEquals("random", indexReader14, terms15, terms16, true);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", (int) '#', numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (-1.0d), (double) (short) 100, 0.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray6, byteArray11);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1, (double) (-1.0f));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray4, byteArray7);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) 0.0f, (double) '4');
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule12);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) 1 };
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        int[] intArray4 = new int[] { '#' };
        int[] intArray6 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
        int[] intArray9 = new int[] { '#' };
        int[] intArray11 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray9, intArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray4, intArray9);
        int[] intArray16 = new int[] { '#' };
        int[] intArray18 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray16, intArray18);
        int[] intArray21 = new int[] { '#' };
        int[] intArray23 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray16, intArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray21);
        int[] intArray31 = new int[] { '#' };
        int[] intArray33 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray31, intArray33);
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray31, intArray36);
        int[] intArray43 = new int[] { '#' };
        int[] intArray45 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray43, intArray45);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray43, intArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray31, intArray48);
        int[] intArray56 = new int[] { '#' };
        int[] intArray58 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray56, intArray58);
        int[] intArray61 = new int[] { '#' };
        int[] intArray63 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray61, intArray63);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray56, intArray61);
        org.junit.Assert.assertArrayEquals("", intArray48, intArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, false);
        kuromojiAnalysisTests68.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain77 = kuromojiAnalysisTests68.failureAndSuccessEvents;
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Fields fields81 = null;
        org.apache.lucene.index.Fields fields82 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("enwiki.random.lines.txt", indexReader80, fields81, fields82, false);
        kuromojiAnalysisTests68.setIndexWriterMaxDocs((int) (byte) 0);
        kuromojiAnalysisTests68.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray21, (java.lang.Object) kuromojiAnalysisTests68);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        kuromojiAnalysisTests2.ensureCleanedUp();
        java.lang.String str12 = kuromojiAnalysisTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("<unknown>", indexReader14, fields15, fields16, true);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) 10, (java.lang.Object) kuromojiAnalysisTests2);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.failfast", indexReader8, 1, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) '#', postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0d), (double) 1.0f);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet15, (java.lang.Object) kuromojiAnalysisTests16);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.badapples", postingsEnum21, postingsEnum22, true);
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests16.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests16.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests16.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain42;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields48, fields49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests45.assertPositionsSkippingEquals("hi!", indexReader53, (int) (byte) 0, postingsEnum55, postingsEnum56);
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain42, (java.lang.Object) kuromojiAnalysisTests45);
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests45.assertDocsAndPositionsEnumEquals("hi!", postingsEnum61, postingsEnum62);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray14 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray17, (float) (-1L));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
    }
}

