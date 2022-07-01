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
        org.junit.Assert.assertNotEquals("tests.nightly", (long) (byte) -1, (long) (-1));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        float[] floatArray3 = new float[] { (short) 1, 0L };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray3, floatArray4, (float) 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
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
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.tearDown();
        kuromojiAnalysisTests19.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests19, (java.lang.Object) "tests.awaitsfix");
        java.lang.Class<?> wildcardClass30 = kuromojiAnalysisTests19.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) wildcardClass30);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, false);
        kuromojiAnalysisTests8.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests8.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRule18);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 100, 1L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray12);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        char[] charArray4 = new char[] { '#', '4', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray4, charArray5);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) -1, (long) 100);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0, (double) '4', (double) (byte) 10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        char[] charArray0 = null;
        char[] charArray3 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.slow", indexReader13, (int) (short) 1, postingsEnum15, postingsEnum16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) postingsEnum15, (java.lang.Object) 1L);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray13 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray13, (double) (byte) 100);
        double[] doubleArray22 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray27 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray22, doubleArray27, (double) (byte) 100);
        double[] doubleArray35 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray40 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray35, doubleArray40, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray22, doubleArray35, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray22, (-1.0d));
        double[] doubleArray53 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray58 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray53, doubleArray58, (double) (byte) 100);
        double[] doubleArray66 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray71 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray66, doubleArray71, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray53, doubleArray66, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray8, doubleArray66, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray1, doubleArray8, (double) (short) 100);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray13, (java.lang.Object) 0.0f);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray30, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray13, (java.lang.Object[]) localeArray30);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale38, locale40, locale42, locale44, locale46 };
        java.util.Set<java.util.Locale> localeSet48 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray47);
        java.util.List<java.io.Serializable> serializableList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray47);
        java.util.Set<java.lang.Cloneable> cloneableSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray47);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("europarl.lines.txt.gz", indexReader54, fields55, fields56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        kuromojiAnalysisTests52.assertPositionsSkippingEquals("hi!", indexReader60, (int) (byte) 0, postingsEnum62, postingsEnum63);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        kuromojiAnalysisTests52.assertTermsEquals("random", indexReader66, terms67, terms68, true);
        kuromojiAnalysisTests52.setUp();
        kuromojiAnalysisTests52.tearDown();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        org.apache.lucene.index.Fields fields76 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("", indexReader74, fields75, fields76, false);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        kuromojiAnalysisTests52.assertTermsEquals("", indexReader80, terms81, terms82, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) localeArray47, (java.lang.Object) terms82);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain35;
        org.junit.rules.RuleChain[] ruleChainArray37 = new org.junit.rules.RuleChain[] { ruleChain21, ruleChain35 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet38 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray37);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        java.util.Set<java.lang.Cloneable> cloneableSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray51);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray51, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray37, (java.lang.Object[]) localeArray51);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        long[] longArray5 = new long[] { (short) 0, (byte) -1, '4', (short) 0, (byte) 100 };
        long[] longArray10 = new long[] { (byte) 0, (-1L), (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("hi!", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests9.assertTermsEquals("random", indexReader23, terms24, terms25, true);
        kuromojiAnalysisTests9.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.nightly", postingsEnum30, postingsEnum31, true);
        kuromojiAnalysisTests9.tearDown();
        java.lang.Object obj35 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests9, obj35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests9);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        float[] floatArray5 = new float[] { 0, 100.0f, 0L, 100, (short) 0 };
        float[] floatArray12 = new float[] { (byte) 0, (byte) 1, 10.0f, '4', (byte) 10, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray12, (float) 'a');
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
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
        java.lang.Class<?> wildcardClass29 = localeArray25.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) wildcardClass29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray2, byteArray3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        char[] charArray7 = new char[] { ' ', 'a', '#', '#', ' ', '#' };
        char[] charArray12 = new char[] { ' ', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray7, charArray12);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 100);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 100 };
        short[] shortArray11 = new short[] { (byte) 1, (byte) -1, (byte) 100, (short) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray4, shortArray11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (long) 10, (long) 10);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        long[] longArray4 = new long[] { 100L, (-1L), (short) 10 };
        long[] longArray6 = new long[] { 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray4, longArray6);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 10, 10L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 100L, (float) 10L, (float) (byte) 10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        java.lang.Object obj2 = new java.lang.Object();
        org.junit.Assert.assertNotNull("hi!", obj2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader8, fields9, fields10, false);
        kuromojiAnalysisTests6.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        kuromojiAnalysisTests6.resetCheckIndexStatus();
        kuromojiAnalysisTests6.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests6.ruleChain;
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale24, locale26, locale28, locale30, locale32 };
        java.util.Set<java.util.Locale> localeSet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        java.util.List<java.io.Serializable> serializableList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray33);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray33, (java.lang.Object) 0.0f);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale43, locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.List<java.io.Serializable> serializableList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray50);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray50, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray33, (java.lang.Object[]) localeArray50);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray33, (java.lang.Object[]) localeArray66);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests6, (java.lang.Object) localeArray66);
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0d, (java.lang.Object) localeArray66);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) "hi!", (java.lang.Object) "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.weekly", (double) '#', (double) 0L, (double) (short) 100);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 100);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray4 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray2, shortArray4);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray7);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        short[] shortArray3 = new short[] { (short) 100, (short) -1, (byte) 1 };
        short[] shortArray6 = new short[] { (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) ' ', (float) 1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
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
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale30, locale32, locale34, locale36, locale38 };
        java.util.Set<java.util.Locale> localeSet40 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray39);
        java.util.List<java.io.Serializable> serializableList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray39);
        java.util.Set<java.lang.Cloneable> cloneableSet42 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray39);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray39, (java.lang.Object) (byte) -1);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale47, locale49, locale51, locale53, locale55 };
        java.util.Set<java.util.Locale> localeSet57 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.List<java.io.Serializable> serializableList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray56, (java.lang.Object[]) localeArray69);
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale75, locale77, locale79, locale81, locale83 };
        java.util.Set<java.util.Locale> localeSet85 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray84);
        java.util.List<java.io.Serializable> serializableList86 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray84);
        java.util.Set<java.lang.Cloneable> cloneableSet87 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray84);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray69, (java.lang.Object[]) localeArray84);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray39, (java.lang.Object[]) localeArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray23, (java.lang.Object[]) localeArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) localeArray39, (java.lang.Object) (short) -1);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', 'a', '#' };
        char[] charArray12 = new char[] { '#', '4', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray7, charArray12);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("hi!", indexReader9, (int) (byte) 0, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
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
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale36, locale38, locale40, locale42, locale44 };
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        java.util.List<java.io.Serializable> serializableList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray45);
        java.util.Set<java.lang.Cloneable> cloneableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray45);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray45, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray28, (java.lang.Object[]) localeArray45);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests52 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        kuromojiAnalysisTests52.assertFieldsEquals("europarl.lines.txt.gz", indexReader54, fields55, fields56, false);
        kuromojiAnalysisTests52.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain61 = kuromojiAnalysisTests52.failureAndSuccessEvents;
        kuromojiAnalysisTests52.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray28, (java.lang.Object) kuromojiAnalysisTests52);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        kuromojiAnalysisTests52.assertDocsSkippingEquals("tests.awaitsfix", indexReader65, 10, postingsEnum67, postingsEnum68, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        kuromojiAnalysisTests71.assertFieldsEquals("europarl.lines.txt.gz", indexReader73, fields74, fields75, false);
        kuromojiAnalysisTests71.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) true, (java.lang.Object) kuromojiAnalysisTests71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        char[] charArray1 = new char[] { '#' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        float[] floatArray3 = new float[] { ' ', (-1.0f) };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray3, floatArray4, (float) '4');
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        short[] shortArray3 = new short[] { (byte) 0, (short) 0, (byte) 1 };
        short[] shortArray8 = new short[] { (short) -1, (short) 0, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
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
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        java.lang.String str18 = kuromojiAnalysisTests2.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("hi!", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30);
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
        java.lang.String[] strArray24 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strComparableSet25);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0L, (long) (short) 10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        long[] longArray3 = new long[] { (byte) 100, 0L };
        long[] longArray5 = new long[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray5);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.awaitsfix");
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests13.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.weekly", indexReader24, terms25, terms26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests13);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray2 = new org.junit.rules.RuleChain[][] { ruleChainArray1 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray2);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) ruleChainArray2, (java.lang.Object[]) localeArray46);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10, (short) 1 };
        short[] shortArray6 = new short[] { (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) 0L, (float) (-1));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 100, 100L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray20, (double) 0);
        double[] doubleArray35 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray40 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray35, doubleArray40, (double) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray40, (double) 1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        long[] longArray2 = new long[] { 1 };
        long[] longArray4 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray2, longArray4);
        long[] longArray8 = new long[] { (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray7, byteArray12);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader2, terms3, terms4, false);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.junit.rules.TestRule[] testRuleArray13 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures10, testRuleIgnoreAfterMaxFailures12 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet14 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) testRuleSet14);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        java.lang.Object obj0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) boolean7);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
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
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray12);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray12, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        short[] shortArray4 = new short[] { (short) 10, (short) 0, (short) -1, (byte) 10 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray5);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
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
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet46 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray24, (java.lang.Object[]) strArray45);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1L), (double) 100.0f, (double) (byte) 100);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        float[] floatArray6 = new float[] { 100L, ' ', 0.0f, 100, 1.0f };
        float[] floatArray9 = new float[] { (short) 10, (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray6, floatArray9, (float) 1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, (double) (byte) 100);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        char[] charArray6 = new char[] { '#', '#', 'a', '#', '4', ' ' };
        char[] charArray12 = new char[] { '4', '#', ' ', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray12);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, true);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
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
        java.lang.String str20 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.ensureCleanedUp();
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale24, locale26, locale28, locale30, locale32 };
        java.util.Set<java.util.Locale> localeSet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        java.util.List<java.io.Serializable> serializableList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) serializableList35);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        kuromojiAnalysisTests11.ensureCleanedUp();
        java.lang.String str21 = kuromojiAnalysisTests11.getTestName();
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests11.ruleChain;
        kuromojiAnalysisTests11.setUp();
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain26);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
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
        java.lang.Object[] objArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray39, objArray44);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        java.util.List[] listArray2 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray3 = (java.util.List<java.io.Serializable>[]) listArray2;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray3);
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
        java.util.List<java.io.Serializable> serializableList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray33);
        java.util.Set<java.lang.Cloneable> cloneableSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray33);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray33, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray16, (java.lang.Object[]) localeArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) serializableListArray3, (java.lang.Object[]) localeArray33);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray3 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) 1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.lang.String str12 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
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
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) 'a');
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        kuromojiAnalysisTests24.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule33 = kuromojiAnalysisTests24.ruleChain;
        org.junit.rules.TestRule testRule34 = kuromojiAnalysisTests24.ruleChain;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("tests.slow", indexReader36, (int) (short) 1, postingsEnum38, postingsEnum39);
        org.junit.rules.TestRule testRule41 = kuromojiAnalysisTests24.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests24);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 1, (long) (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
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
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests25.assertDocValuesEquals("tests.failfast", (int) (byte) 1, numericDocValues40, numericDocValues41);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        int[] intArray1 = new int[] {};
        int[] intArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray1, intArray2);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        short[] shortArray1 = new short[] { (byte) 100 };
        short[] shortArray4 = new short[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 100);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        long[] longArray6 = new long[] { (short) 1, (-1), (byte) 0, '#', 1L };
        long[] longArray9 = new long[] { 1 };
        long[] longArray11 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray9, longArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray6, longArray9);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (short) 1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) '4', 0.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (short) 0, (double) '#', (double) 100.0f);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) (short) 0, (double) 'a');
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests1.ruleChain;
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
        kuromojiAnalysisTests25.setUp();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests25.assertPositionsSkippingEquals("", indexReader41, (int) '#', postingsEnum43, postingsEnum44);
        org.junit.rules.RuleChain ruleChain46 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain46);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("", 0, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1.0d, (double) 100.0f);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray4 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 0, postingsEnum14, postingsEnum15);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests18.assertPositionsSkippingEquals("hi!", indexReader26, (int) (byte) 0, postingsEnum28, postingsEnum29);
        kuromojiAnalysisTests18.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        kuromojiAnalysisTests18.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray4);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests10.ensureCleanedUp();
        kuromojiAnalysisTests10.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests10);
        java.lang.Class<?> wildcardClass20 = kuromojiAnalysisTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass20);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        double[] doubleArray4 = new double[] { (short) -1, 0.0d, (byte) 10 };
        double[] doubleArray10 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray15 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray10, doubleArray15, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray4, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 10, (long) '#');
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (short) 10, (float) 0L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) 100);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) (short) 100, (float) 100L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.resetCheckIndexStatus();
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.ensureCheckIndexPassed();
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        kuromojiAnalysisTests19.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain40;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) '4');
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        short[] shortArray1 = new short[] {};
        short[] shortArray8 = new short[] { (short) 1, (short) 0, (short) 10, (byte) 10, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
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
        java.lang.String[] strArray50 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) localeArray41, (java.lang.Object[]) strArray50);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", (int) 'a', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (short) 100);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        int[] intArray6 = new int[] { 1, 0, (short) 1, (byte) 10, (byte) 100, ' ' };
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray37);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule12);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) '#');
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
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
        java.lang.Class<?> wildcardClass18 = kuromojiAnalysisTests16.getClass();
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray31, (java.lang.Object[]) localeArray48);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, false);
        kuromojiAnalysisTests55.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests55.failureAndSuccessEvents;
        kuromojiAnalysisTests55.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray31, (java.lang.Object) kuromojiAnalysisTests55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) kuromojiAnalysisTests16, (java.lang.Object) localeArray31);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray1, charArray3);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        int[] intArray4 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, ' ', 100, (short) 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        java.util.Set<int[]> intArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray10);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 100, (byte) 10 };
        short[] shortArray10 = new short[] { (short) 1, (byte) 10, (byte) 10, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        char[] charArray4 = new char[] { '#', ' ', 'a', ' ' };
        char[] charArray7 = new char[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        char[] charArray5 = new char[] { ' ', ' ', '#', '#' };
        char[] charArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray5, charArray6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (-1), 1.0d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        short[] shortArray3 = new short[] { (short) 1, (short) 1 };
        short[] shortArray6 = new short[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (byte) 10);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0L, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        java.lang.String str13 = kuromojiAnalysisTests9.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocsAndPositionsEnumEquals("", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray16);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) localeSet12, (java.lang.Object) strArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) localeSet12);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) (short) -1, (float) (short) -1);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
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
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests36.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum56, postingsEnum57);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        short[] shortArray6 = new short[] { (short) 1, (short) -1, (short) 100, (byte) 0, (short) 1 };
        short[] shortArray8 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray8);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray1 = new org.junit.rules.RuleChain[][] { ruleChainArray0 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray4, executorServiceArray5, executorServiceArray6, executorServiceArray7, executorServiceArray8, executorServiceArray9 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList11 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) ruleChainArray1, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, false);
        kuromojiAnalysisTests3.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        java.lang.String str14 = kuromojiAnalysisTests3.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests3);
        kuromojiAnalysisTests3.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", obj1, (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        short[] shortArray7 = new short[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (short) -1, (byte) 0 };
        short[] shortArray11 = new short[] { (short) 0, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray7, shortArray11);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray2, byteArray6);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 10, (byte) -1, (short) 0, (byte) 10, (short) -1 };
        short[] shortArray13 = new short[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray13);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100L, (long) (short) 100);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
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
        int[] intArray67 = new int[] { '#' };
        int[] intArray69 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray67, intArray69);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        kuromojiAnalysisTests71.assertFieldsEquals("europarl.lines.txt.gz", indexReader73, fields74, fields75, false);
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        kuromojiAnalysisTests71.assertPositionsSkippingEquals("hi!", indexReader79, (int) (byte) 0, postingsEnum81, postingsEnum82);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        kuromojiAnalysisTests71.assertTermsEquals("random", indexReader85, terms86, terms87, true);
        kuromojiAnalysisTests71.setUp();
        kuromojiAnalysisTests71.tearDown();
        kuromojiAnalysisTests71.tearDown();
        org.junit.rules.RuleChain ruleChain93 = kuromojiAnalysisTests71.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) intArray69, (java.lang.Object) kuromojiAnalysisTests71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) localeArray61, (java.lang.Object) kuromojiAnalysisTests71);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader15, 10, postingsEnum17, postingsEnum18);
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
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale40, locale42, locale44, locale46, locale48 };
        java.util.Set<java.util.Locale> localeSet50 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.List<java.io.Serializable> serializableList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray49);
        java.util.Set<java.lang.Cloneable> cloneableSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray49);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray49, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray32, (java.lang.Object[]) localeArray49);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        kuromojiAnalysisTests56.assertFieldsEquals("europarl.lines.txt.gz", indexReader58, fields59, fields60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        kuromojiAnalysisTests56.assertPositionsSkippingEquals("tests.failfast", indexReader64, 1, postingsEnum66, postingsEnum67);
        kuromojiAnalysisTests56.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests56.ensureCleanedUp();
        kuromojiAnalysisTests56.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray49, (java.lang.Object) kuromojiAnalysisTests56);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray20, (double) 0);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale31, locale33, locale35, locale37, locale39 };
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) doubleArray7, (java.lang.Object) localeArray40);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0f, (float) 1L, (float) (byte) -1);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        float[] floatArray4 = new float[] { 100.0f, 100.0f, (byte) -1 };
        float[] floatArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray4, floatArray5, (float) (byte) 10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.List<java.io.Serializable> serializableList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) localeArray19);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray3, charArray4);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
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
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (short) 10, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
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
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet57 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests58.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet57, (java.lang.Object) kuromojiAnalysisTests58);
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests58.assertDocsEnumEquals("tests.badapples", postingsEnum63, postingsEnum64, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) localeArray13, (java.lang.Object) postingsEnum63);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("hi!", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale24, locale26, locale28, locale30, locale32 };
        java.util.Set<java.util.Locale> localeSet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        java.util.List<java.io.Serializable> serializableList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray33);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray33, (java.lang.Object) 0.0f);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale41, locale43, locale45, locale47, locale49 };
        java.util.Set<java.util.Locale> localeSet51 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray50);
        java.util.List<java.io.Serializable> serializableList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray50);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray50, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray33, (java.lang.Object[]) localeArray50);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray67 = new java.util.Locale[] { locale58, locale60, locale62, locale64, locale66 };
        java.util.Set<java.util.Locale> localeSet68 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray67);
        java.util.List<java.io.Serializable> serializableList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray67);
        java.util.Set<java.lang.Cloneable> cloneableSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray50, (java.lang.Object[]) localeArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum17, (java.lang.Object) localeArray50);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
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
        kuromojiAnalysisTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) 10L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        char[] charArray0 = null;
        char[] charArray4 = new char[] { '#', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray8);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
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
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray37);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) localeSet33, (java.lang.Object) strArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) strArray37);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        short[] shortArray4 = new short[] { (short) 100, (short) 1, (short) -1, (byte) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 10.0f, (double) 10L);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 1, (short) 0 };
        short[] shortArray11 = new short[] { (byte) 0, (short) 100, (short) 100, (short) 10, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray4, shortArray11);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 1, (double) 100, (double) (short) 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (-1L));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
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
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale19, locale21, locale23, locale25, locale27 };
        java.util.Set<java.util.Locale> localeSet29 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray28);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale32, locale34, locale36, locale38, locale40 };
        java.util.Set<java.util.Locale> localeSet42 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray41);
        java.util.List<java.io.Serializable> serializableList43 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray28, (java.lang.Object[]) localeArray41);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale47, locale49, locale51, locale53, locale55 };
        java.util.Set<java.util.Locale> localeSet57 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray56);
        java.util.List<java.io.Serializable> serializableList58 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray56);
        java.util.Set<java.lang.Cloneable> cloneableSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray41, (java.lang.Object[]) localeArray56);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray15, (java.lang.Object[]) localeArray41);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray12);
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
        org.junit.Assert.assertArrayEquals(longArray12, longArray18);
        long[] longArray38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray12, longArray38);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 10.0f);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        char[] charArray5 = new char[] { '#', 'a', ' ', '#', '#' };
        char[] charArray8 = new char[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1.0f), 100.0f, (float) (short) 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale11, locale13, locale15, locale17, locale19 };
        java.util.Set<java.util.Locale> localeSet21 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray20);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale24, locale26, locale28, locale30, locale32 };
        java.util.Set<java.util.Locale> localeSet34 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray33);
        java.util.List<java.io.Serializable> serializableList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray20, (java.lang.Object[]) localeArray33);
        java.lang.Class<?> wildcardClass37 = localeArray33.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) wildcardClass37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        short[] shortArray3 = new short[] { (byte) 100, (byte) 1 };
        short[] shortArray9 = new short[] { (short) 0, (short) 0, (short) 0, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray9);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
        double[] doubleArray48 = new double[] { (byte) 0, 1L, (short) -1, 10.0d };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray48, (double) (byte) 1);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        float[] floatArray6 = new float[] { (-1.0f), 1, (-1.0f), 10.0f, 100L };
        float[] floatArray7 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray7, (float) (short) -1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) ' ', (float) (byte) 10, (float) (short) -1);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        kuromojiAnalysisTests11.resetCheckIndexStatus();
        java.lang.String str22 = kuromojiAnalysisTests11.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests11);
        kuromojiAnalysisTests11.setUp();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests11.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRule25);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule19;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1L, (java.lang.Object) testRule19);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        kuromojiAnalysisTests3.assertFieldsEquals("europarl.lines.txt.gz", indexReader5, fields6, fields7, false);
        kuromojiAnalysisTests3.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain12 = kuromojiAnalysisTests3.failureAndSuccessEvents;
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        kuromojiAnalysisTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests3.ruleChain;
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray30, (java.lang.Object) 0.0f);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale38, locale40, locale42, locale44, locale46 };
        java.util.Set<java.util.Locale> localeSet48 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray47);
        java.util.List<java.io.Serializable> serializableList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray47);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray47, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray47);
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray63 = new java.util.Locale[] { locale54, locale56, locale58, locale60, locale62 };
        java.util.Set<java.util.Locale> localeSet64 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests3, (java.lang.Object) localeArray63);
        org.junit.Assert.assertNotSame("", (java.lang.Object) 10.0d, (java.lang.Object) localeArray63);
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray75 = new java.util.concurrent.ExecutorService[][] { executorServiceArray69, executorServiceArray70, executorServiceArray71, executorServiceArray72, executorServiceArray73, executorServiceArray74 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList76 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) localeArray63, (java.lang.Object[]) executorServiceArray75);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader18, (int) ' ', postingsEnum20, postingsEnum21, false);
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        float[] floatArray5 = new float[] { (-1L), (short) 100, 100, (-1.0f), '#' };
        float[] floatArray11 = new float[] { 1, 'a', 100, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 10L);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
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
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) kuromojiAnalysisTests37);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        float[] floatArray1 = new float[] { ' ' };
        float[] floatArray2 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (-1));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale18, locale20, locale22, locale24, locale26 };
        java.util.Set<java.util.Locale> localeSet28 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray27);
        java.util.List<java.io.Serializable> serializableList29 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray27);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray27, (java.lang.Object) 0.0f);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale35, locale37, locale39, locale41, locale43 };
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray44);
        java.util.List<java.io.Serializable> serializableList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray44);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray44, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray27, (java.lang.Object[]) localeArray44);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale51, locale53, locale55, locale57, locale59 };
        java.util.Set<java.util.Locale> localeSet61 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray27, (java.lang.Object[]) localeArray60);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) localeArray60);
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 100, numericDocValues66, numericDocValues67);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        char[] charArray3 = new char[] { ' ', 'a', ' ' };
        char[] charArray8 = new char[] { 'a', 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        short[] shortArray4 = new short[] { (short) 1, (byte) -1, (byte) 100 };
        short[] shortArray11 = new short[] { (byte) 1, (byte) 100, (byte) 1, (short) 10, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray4, shortArray11);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) 10, 0.0f);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray5, byteArray9);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), 10.0d, (double) 0);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { 100, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray3, (float) (byte) -1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        long[] longArray6 = new long[] { ' ', (short) 1, 0L, (short) -1, 10L, (byte) 0 };
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray10, longArray12);
        long[] longArray16 = new long[] { 1 };
        long[] longArray18 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray16, longArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray12, longArray16);
        long[] longArray24 = new long[] { 1 };
        long[] longArray26 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray24, longArray26);
        long[] longArray30 = new long[] { 1 };
        long[] longArray32 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray30, longArray32);
        org.junit.Assert.assertArrayEquals("random", longArray26, longArray32);
        long[] longArray38 = new long[] { 1 };
        long[] longArray40 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray38, longArray40);
        long[] longArray45 = new long[] { 1 };
        long[] longArray47 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray45, longArray47);
        long[] longArray51 = new long[] { 1 };
        long[] longArray53 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray51, longArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray47, longArray51);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray38, longArray51);
        org.junit.Assert.assertArrayEquals(longArray32, longArray38);
        org.junit.Assert.assertArrayEquals(longArray16, longArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray16);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        char[] charArray6 = new char[] { '#', '#', 'a', '4', '4' };
        char[] charArray8 = new char[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray8);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests10.ensureCleanedUp();
        kuromojiAnalysisTests10.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 1, (long) (byte) 1);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 0, (double) 'a');
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        kuromojiAnalysisTests16.ensureCleanedUp();
        kuromojiAnalysisTests16.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain26 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet36 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests37.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet36, (java.lang.Object) kuromojiAnalysisTests37);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests37.assertDocsEnumEquals("tests.badapples", postingsEnum42, postingsEnum43, true);
        org.junit.rules.TestRule testRule46 = kuromojiAnalysisTests37.ruleChain;
        kuromojiAnalysisTests37.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests37);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (short) 10, 100.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray6, longArray8);
        long[] longArray12 = new long[] { 1 };
        long[] longArray14 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray12, longArray14);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray8, longArray12);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        org.junit.Assert.assertArrayEquals("hi!", longArray12, longArray19);
        long[] longArray27 = new long[] { 1 };
        long[] longArray29 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray27, longArray29);
        long[] longArray33 = new long[] { 1 };
        long[] longArray35 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("random", longArray29, longArray35);
        org.junit.Assert.assertArrayEquals(longArray19, longArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray1, longArray19);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 0, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        char[] charArray5 = new char[] { ' ', '#', '4', '4' };
        char[] charArray9 = new char[] { '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray5, charArray9);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        long[] longArray2 = new long[] { (-1) };
        long[] longArray5 = new long[] { 1 };
        long[] longArray7 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray5, longArray7);
        long[] longArray13 = new long[] { 1 };
        long[] longArray15 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray13, longArray15);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray19, longArray21);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray15, longArray19);
        long[] longArray26 = new long[] { 1 };
        long[] longArray28 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray26, longArray28);
        org.junit.Assert.assertArrayEquals("hi!", longArray19, longArray26);
        org.junit.Assert.assertArrayEquals(longArray7, longArray19);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray2, longArray19);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray3);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
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
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) '4');
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList8 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray7);
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale12, locale14, locale16, locale18, locale20 };
        java.util.Set<java.util.Locale> localeSet22 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray21);
        java.util.List<java.io.Serializable> serializableList23 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray21);
        java.util.Set<java.lang.Cloneable> cloneableSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray21, (java.lang.Object) (byte) -1);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale29, locale31, locale33, locale35, locale37 };
        java.util.Set<java.util.Locale> localeSet39 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray38);
        java.util.List<java.io.Serializable> serializableList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray38);
        java.util.Set<java.lang.Cloneable> cloneableSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray38);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray38, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray21, (java.lang.Object[]) localeArray38);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields48, fields49, false);
        kuromojiAnalysisTests45.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain54 = kuromojiAnalysisTests45.failureAndSuccessEvents;
        kuromojiAnalysisTests45.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray21, (java.lang.Object) kuromojiAnalysisTests45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) localeArray21);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, 10L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader8, fields9, fields10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", (int) (byte) 10, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests2.ruleChain;
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) testRule11, (java.lang.Object) "random");
        org.junit.rules.RuleChain[] ruleChainArray14 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray15 = new org.junit.rules.RuleChain[][] { ruleChainArray14 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "random", (java.lang.Object) ruleChainArray15);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 100.0d, (double) (short) 100);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        char[] charArray3 = new char[] { '4', 'a' };
        char[] charArray9 = new char[] { '4', '4', '#', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray3, charArray9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        char[] charArray4 = new char[] { '4', '4', '#', ' ' };
        char[] charArray8 = new char[] { ' ', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
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
        int[] intArray29 = new int[] { '#' };
        int[] intArray31 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray29, intArray31);
        int[] intArray34 = new int[] { '#' };
        int[] intArray36 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray34, intArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray29, intArray34);
        org.junit.Assert.assertArrayEquals("", intArray21, intArray34);
        int[] intArray40 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray21, intArray40);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 100, 100.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        kuromojiAnalysisTests20.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("<unknown>", postingsEnum32, postingsEnum33, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) postingsEnum33);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        kuromojiAnalysisTests21.ensureCleanedUp();
        kuromojiAnalysisTests21.resetCheckIndexStatus();
        kuromojiAnalysisTests21.setUp();
        kuromojiAnalysisTests21.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests10, (java.lang.Object) kuromojiAnalysisTests21);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, false);
        kuromojiAnalysisTests4.ensureCleanedUp();
        kuromojiAnalysisTests4.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests4.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests4.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) genericDeclarationArray1, (java.lang.Object) kuromojiAnalysisTests4);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 1.0f, (float) 10L, (float) (short) 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray6);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests54 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        kuromojiAnalysisTests54.assertFieldsEquals("europarl.lines.txt.gz", indexReader56, fields57, fields58, false);
        kuromojiAnalysisTests54.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain63 = kuromojiAnalysisTests54.failureAndSuccessEvents;
        kuromojiAnalysisTests54.resetCheckIndexStatus();
        java.lang.String str65 = kuromojiAnalysisTests54.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests54);
        kuromojiAnalysisTests54.tearDown();
        kuromojiAnalysisTests54.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests54.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests54.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) localeArray31, (java.lang.Object) kuromojiAnalysisTests54);
        java.lang.Object[] objArray72 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray31, objArray72);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        double[] doubleArray4 = new double[] { ' ', 100L, (byte) 100 };
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
        org.junit.Assert.assertArrayEquals("random", doubleArray12, doubleArray70, (double) 10.0f);
        java.lang.Object obj82 = null;
        org.junit.Assert.assertNotEquals("", (java.lang.Object) doubleArray70, obj82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray4, doubleArray70, 1.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray3 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray3);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
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
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6, executorServiceArray7 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, (double) (short) -1);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '4', (long) (byte) 0);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100.0d, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        float[] floatArray2 = new float[] { (byte) -1 };
        float[] floatArray10 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray17 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray10, floatArray17, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray10, (float) (byte) 10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) -1, (long) (byte) 10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.nightly", indexReader11, fields12, fields13, true);
        kuromojiAnalysisTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray8 = new char[] { '#', '#', ' ', '#', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        float[] floatArray1 = new float[] { (short) -1 };
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray16, (float) (byte) 100);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests20.assertDocsEnumEquals("", postingsEnum22, postingsEnum23, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        kuromojiAnalysisTests26.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("enwiki.random.lines.txt", indexReader38, fields39, fields40, false);
        kuromojiAnalysisTests26.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        kuromojiAnalysisTests45.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields48, fields49, false);
        kuromojiAnalysisTests45.ensureCleanedUp();
        kuromojiAnalysisTests45.resetCheckIndexStatus();
        kuromojiAnalysisTests45.ensureCleanedUp();
        kuromojiAnalysisTests45.ensureCheckIndexPassed();
        kuromojiAnalysisTests45.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests57 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests57.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests57.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain66;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain66;
        kuromojiAnalysisTests45.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain66;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain66;
        kuromojiAnalysisTests26.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain66;
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain66;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) testRule19, (java.lang.Object) ruleChain66);
        java.lang.Object obj76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain66, obj76);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.List<java.io.Serializable> serializableList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray11);
        java.util.Set<java.lang.Cloneable> cloneableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray11);
        java.lang.Class<?> wildcardClass15 = cloneableSet14.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain25;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain25;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests28.assertFieldsEquals("europarl.lines.txt.gz", indexReader30, fields31, fields32, false);
        kuromojiAnalysisTests28.ensureCleanedUp();
        kuromojiAnalysisTests28.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests28.tearDown();
        kuromojiAnalysisTests28.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests28.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain25, (java.lang.Object) kuromojiAnalysisTests28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass15, (java.lang.Object) kuromojiAnalysisTests28);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, 0.0f, (float) (byte) 1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 10, (-1L));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, 0.0d, 100.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        short[] shortArray1 = new short[] {};
        short[] shortArray5 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray7);
        short[] shortArray11 = new short[] { (short) 10 };
        short[] shortArray13 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray7, shortArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
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
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) '4', (-1L));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100L, (double) 100);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) -1, 10.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
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
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) queryCachingPolicy0, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray7);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray1, byteArray5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
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
        kuromojiAnalysisTests57.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain66 = kuromojiAnalysisTests57.failureAndSuccessEvents;
        kuromojiAnalysisTests57.resetCheckIndexStatus();
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule69 = kuromojiAnalysisTests57.ruleChain;
        kuromojiAnalysisTests57.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        char[] charArray3 = new char[] { ' ', '4' };
        char[] charArray8 = new char[] { ' ', '4', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        kuromojiAnalysisTests30.assertFieldsEquals("europarl.lines.txt.gz", indexReader32, fields33, fields34, false);
        kuromojiAnalysisTests30.ensureCleanedUp();
        kuromojiAnalysisTests30.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests30.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) testRule39);
        kuromojiAnalysisTests20.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean2, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 0.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) ruleChain22);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale8, locale10, locale12, locale14, locale16 };
        java.util.Set<java.util.Locale> localeSet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale21, locale23, locale25, locale27, locale29 };
        java.util.Set<java.util.Locale> localeSet31 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray30);
        java.util.List<java.io.Serializable> serializableList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray17, (java.lang.Object[]) localeArray30);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale36, locale38, locale40, locale42, locale44 };
        java.util.Set<java.util.Locale> localeSet46 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray45);
        java.util.List<java.io.Serializable> serializableList47 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray45);
        java.util.Set<java.lang.Cloneable> cloneableSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray45);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray30, (java.lang.Object[]) localeArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) localeArray45);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("random", indexReader2, fields3, fields4, true);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
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
        java.lang.String[] strArray92 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet93 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray92);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) doubleArray16, (java.lang.Object) strArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "hi!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) (short) 10, (float) (short) -1);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray32 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray25, (float) (-1));
        float[] floatArray44 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray51 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray44, floatArray51, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray51, (-1.0f));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) 1.0f, 0.0d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0f, (float) 100, 1.0f);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale9, locale11, locale13, locale15, locale17 };
        java.util.Set<java.util.Locale> localeSet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray18);
        java.util.List<java.io.Serializable> serializableList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray18);
        java.util.Set<java.lang.Cloneable> cloneableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray18, (java.lang.Object) (byte) -1);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        java.util.Set<java.lang.Cloneable> cloneableSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray35);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray35, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray18, (java.lang.Object[]) localeArray35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests42.assertPositionsSkippingEquals("tests.failfast", indexReader50, 1, postingsEnum52, postingsEnum53);
        kuromojiAnalysisTests42.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests42.ensureCleanedUp();
        kuromojiAnalysisTests42.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray35, (java.lang.Object) kuromojiAnalysisTests42);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale62, locale64, locale66, locale68, locale70 };
        java.util.Set<java.util.Locale> localeSet72 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray71);
        java.util.List<java.io.Serializable> serializableList73 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray71);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) localeArray35);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) (short) -1, (long) (short) -1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray4 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray2, byteArray5);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) '#', (double) (short) 100);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) -1, (float) (short) 100, (float) 10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (short) -1);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        char[] charArray6 = new char[] { ' ', ' ', '4', 'a', ' ' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        char[] charArray5 = new char[] { '4', ' ', 'a', 'a', '#' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (long) (byte) 0, 0L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 1);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) ' ', (double) 100L, (double) (-1L));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 0, (double) (byte) -1, (double) (short) 1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) 'a', (float) (-1L));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests36.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        org.junit.Assert.assertArrayEquals("", floatArray15, floatArray26, 10.0f);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) '#', 1.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0f, (float) '4', (float) (short) -1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        float[] floatArray7 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray14 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray7, floatArray14, (float) (byte) 100);
        float[] floatArray24 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray31 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray24, floatArray31, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray31, (float) 10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.junit.rules.TestRule[] testRuleArray33 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures30, testRuleIgnoreAfterMaxFailures32 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet34 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) testRuleArray33);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) testRule32);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray8);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.weekly", postingsEnum13, postingsEnum14, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields20, fields21, false);
        kuromojiAnalysisTests17.ensureCleanedUp();
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        kuromojiAnalysisTests17.ensureCleanedUp();
        java.lang.String str27 = kuromojiAnalysisTests17.getTestName();
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum14, (java.lang.Object) kuromojiAnalysisTests17);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
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
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests25.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("hi!", indexReader44, (int) (byte) 0, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests36.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests0, kuromojiAnalysisTests25, kuromojiAnalysisTests36 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet51 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) kuromojiAnalysisTestsArray50, (java.lang.Object[]) strArray58);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        int[] intArray5 = new int[] { (byte) 1, 'a', 10, (-1), (byte) 0 };
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
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
        kuromojiAnalysisTests12.tearDown();
        kuromojiAnalysisTests12.tearDown();
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) intArray10, (java.lang.Object) kuromojiAnalysisTests12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        char[] charArray3 = new char[] { ' ', ' ', '4' };
        char[] charArray9 = new char[] { '4', ' ', 'a', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] { (short) 10 };
        short[] shortArray7 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray7);
        short[] shortArray11 = new short[] { (short) 10 };
        short[] shortArray13 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray1, shortArray7);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader13, 100, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.monster", indexReader20, fields21, fields22, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, false);
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.resetCheckIndexStatus();
        kuromojiAnalysisTests25.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.rules.RuleChain ruleChain36 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain36;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1.0f, (float) 0L, (float) 0L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        char[] charArray3 = new char[] { '4', '4', '#' };
        char[] charArray8 = new char[] { 'a', '#', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests15.assertTermsEquals("random", indexReader29, terms30, terms31, true);
        kuromojiAnalysisTests15.setUp();
        kuromojiAnalysisTests15.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests15.assertPathHasBeenCleared("tests.monster");
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests15.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms12, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) (short) -1, (float) (byte) -1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        float[] floatArray25 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray32 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray32, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray8, floatArray25, (float) (-1));
        float[] floatArray40 = new float[] { (byte) -1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray40, 0.0f);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (-1L), (long) (byte) 10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1), (double) (short) 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        short[] shortArray3 = new short[] { (byte) 0, (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        short[] shortArray8 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray6);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        float[] floatArray5 = new float[] { 10L, ' ', 1L, (-1L), (byte) 0 };
        float[] floatArray14 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray21 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray14, floatArray21, (float) (byte) 100);
        float[] floatArray31 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray38 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray31, floatArray38, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray14, floatArray31, (float) (-1));
        float[] floatArray51 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray58 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray51, floatArray58, (float) (byte) 100);
        float[] floatArray68 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray75 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray68, floatArray75, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray51, floatArray68, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray68, (float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray68, 0.0f);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray3);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        char[] charArray4 = new char[] { '4', 'a', ' ' };
        char[] charArray7 = new char[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray7);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 100.0d, (double) ' ');
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray6);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray2);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 'a', (double) (-1), (double) (short) 10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        org.junit.rules.RuleChain[][] ruleChainArray1 = new org.junit.rules.RuleChain[][] { ruleChainArray0 };
        java.util.Set<org.junit.rules.RuleChain[]> ruleChainArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChainArray1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray3);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests7.ensureCleanedUp();
        kuromojiAnalysisTests7.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests7);
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests7.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingArray3, (java.lang.Object) kuromojiAnalysisTests7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray4, longArray6);
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray10, longArray12);
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader17, fields18, fields19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("tests.failfast", indexReader23, 1, postingsEnum25, postingsEnum26);
        kuromojiAnalysisTests15.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests15.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        kuromojiAnalysisTests31.setUp();
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale44, locale46, locale48, locale50, locale52 };
        java.util.Set<java.util.Locale> localeSet54 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray53, (java.lang.Object[]) localeArray66);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale76 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale80 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale72, locale74, locale76, locale78, locale80 };
        java.util.Set<java.util.Locale> localeSet82 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray81);
        java.util.List<java.io.Serializable> serializableList83 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray81);
        java.util.Set<java.lang.Cloneable> cloneableSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray66, (java.lang.Object[]) localeArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests31, (java.lang.Object) localeArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) kuromojiAnalysisTests31);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray12, (java.lang.Object) kuromojiAnalysisTests31);
        java.lang.Object obj89 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) longArray12, obj89);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray34);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (short) 100, (float) (short) 10, (-1.0f));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) (byte) 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests30.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests30.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.failfast", (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.failfast", indexReader10, 1, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", obj1, (java.lang.Object) indexReader16);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet3 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray2);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet4 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray2);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1, (java.lang.Object) genericDeclarationArray2);
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
        java.util.List<java.io.Serializable> serializableList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray34);
        java.util.Set<java.lang.Cloneable> cloneableSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray34);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray34, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray17, (java.lang.Object[]) localeArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) genericDeclarationArray2, (java.lang.Object[]) localeArray34);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 0, (double) (-1.0f));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, 0L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        char[] charArray5 = new char[] { ' ', 'a', 'a', '#', 'a' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray20, (double) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1.0f, (java.lang.Object) doubleArray7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) (short) 10, (float) 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader13, 100, postingsEnum15, postingsEnum16, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, 0.0d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray18, (double) (short) 0);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("", postingsEnum3, postingsEnum4, false);
        org.junit.rules.TestRule testRule7 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, false);
        kuromojiAnalysisTests8.ensureCleanedUp();
        kuromojiAnalysisTests8.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests8.tearDown();
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests8);
        kuromojiAnalysisTests8.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests21.assertPositionsSkippingEquals("tests.failfast", indexReader29, 1, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("tests.slow", indexReader35, fields36, fields37, true);
        org.junit.rules.TestRule testRule40 = kuromojiAnalysisTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests8, (java.lang.Object) testRule40);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
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
        float[] floatArray63 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray70 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray63, floatArray70, (float) (byte) 100);
        float[] floatArray80 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray87 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray80, floatArray87, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray63, floatArray80, (float) (-1));
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray80, (float) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray15, floatArray43, (float) (-1));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
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
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader14, fields15, fields16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader23, fields24, fields25, false);
        kuromojiAnalysisTests21.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        kuromojiAnalysisTests21.resetCheckIndexStatus();
        java.lang.String str32 = kuromojiAnalysisTests21.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests21);
        kuromojiAnalysisTests21.tearDown();
        kuromojiAnalysisTests21.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain37 = kuromojiAnalysisTests21.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain37);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray5);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray1, (java.lang.Object[]) throttlingArray5);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0f, (float) '4', (float) (byte) -1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", 1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        char[] charArray4 = new char[] { '#', ' ', '#' };
        char[] charArray11 = new char[] { ' ', '#', 'a', 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray11);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
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
        float[] floatArray80 = new float[] { (-1L), (short) 1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray80, (float) '4');
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        char[] charArray6 = new char[] { '#', 'a', '4', '4', ' ' };
        char[] charArray11 = new char[] { '4', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray6, charArray11);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.ensureCleanedUp();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests13.tearDown();
        kuromojiAnalysisTests13.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests13.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain10, (java.lang.Object) kuromojiAnalysisTests13);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        kuromojiAnalysisTests27.ensureCleanedUp();
        java.lang.String str37 = kuromojiAnalysisTests27.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("<unknown>", indexReader39, fields40, fields41, true);
        java.lang.String str44 = kuromojiAnalysisTests27.getTestName();
        kuromojiAnalysisTests27.assertPathHasBeenCleared("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests13, (java.lang.Object) "random");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) 10, 0.0d, (double) 0.0f);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain21;
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (short) 0, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        char[] charArray4 = new char[] { 'a', 'a', ' ' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray5);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
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
        short[] shortArray25 = new short[] { (short) 10 };
        short[] shortArray27 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray25, shortArray27);
        short[] shortArray31 = new short[] { (short) 10 };
        short[] shortArray33 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray27, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray33);
        short[] shortArray37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray5, shortArray37);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.slow", indexReader13, (int) (short) 1, postingsEnum15, postingsEnum16);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests1.assertTermsEquals("", indexReader20, terms21, terms22, false);
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("random", indexReader38, fields39, fields40, true);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) kuromojiAnalysisTests27, (java.lang.Object) fields39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "random");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray11);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass7 = locale6.getClass();
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass10 = locale9.getClass();
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass13 = locale12.getClass();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass16 = locale15.getClass();
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass19 = locale18.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray20 = new java.lang.reflect.AnnotatedElement[] { wildcardClass7, wildcardClass10, wildcardClass13, wildcardClass16, wildcardClass19 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet21 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray20);
        java.lang.Object obj22 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray20, obj22);
        org.junit.Assert.assertNotEquals((java.lang.Object) boolean4, (java.lang.Object) annotatedElementArray20);
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
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale44, locale46, locale48, locale50, locale52 };
        java.util.Set<java.util.Locale> localeSet54 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        java.util.List<java.io.Serializable> serializableList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray53);
        java.util.Set<java.lang.Cloneable> cloneableSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray53);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray53, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray36, (java.lang.Object[]) localeArray53);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) annotatedElementArray20, (java.lang.Object[]) localeArray53);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 0, 0L);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale9, locale11, locale13, locale15, locale17 };
        java.util.Set<java.util.Locale> localeSet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray18);
        java.util.List<java.io.Serializable> serializableList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray18);
        java.util.Set<java.lang.Cloneable> cloneableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray18);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray18, (java.lang.Object) (byte) -1);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale26, locale28, locale30, locale32, locale34 };
        java.util.Set<java.util.Locale> localeSet36 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray35);
        java.util.List<java.io.Serializable> serializableList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray35);
        java.util.Set<java.lang.Cloneable> cloneableSet38 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray35);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray35, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray18, (java.lang.Object[]) localeArray35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        kuromojiAnalysisTests42.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests42.assertPositionsSkippingEquals("tests.failfast", indexReader50, 1, postingsEnum52, postingsEnum53);
        kuromojiAnalysisTests42.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests42.ensureCleanedUp();
        kuromojiAnalysisTests42.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray35, (java.lang.Object) kuromojiAnalysisTests42);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale62, locale64, locale66, locale68, locale70 };
        java.util.Set<java.util.Locale> localeSet72 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray71);
        java.util.List<java.io.Serializable> serializableList73 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray71);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray35, (java.lang.Object[]) localeArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) localeArray35);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 0.0d, (double) 1);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet8, (java.lang.Object) kuromojiAnalysisTests9);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = kuromojiAnalysisTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.maxfailures", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain35 = kuromojiAnalysisTests26.failureAndSuccessEvents;
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests9.assertDocValuesEquals("tests.maxfailures", 100, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
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
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale40, locale42, locale44, locale46, locale48 };
        java.util.Set<java.util.Locale> localeSet50 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray49);
        java.util.List<java.io.Serializable> serializableList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray49);
        java.util.Set<java.lang.Cloneable> cloneableSet52 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray32, (java.lang.Object[]) localeArray49);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        kuromojiAnalysisTests55.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, false);
        kuromojiAnalysisTests55.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain64 = kuromojiAnalysisTests55.failureAndSuccessEvents;
        kuromojiAnalysisTests55.resetCheckIndexStatus();
        java.lang.String str66 = kuromojiAnalysisTests55.getTestName();
        org.junit.Assert.assertNotNull("", (java.lang.Object) kuromojiAnalysisTests55);
        kuromojiAnalysisTests55.tearDown();
        kuromojiAnalysisTests55.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests55.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests55.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) localeArray32, (java.lang.Object) kuromojiAnalysisTests55);
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass79 = locale78.getClass();
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass82 = locale81.getClass();
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass85 = locale84.getClass();
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass88 = locale87.getClass();
        java.util.Locale locale90 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.lang.Class<?> wildcardClass91 = locale90.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray92 = new java.lang.reflect.AnnotatedElement[] { wildcardClass79, wildcardClass82, wildcardClass85, wildcardClass88, wildcardClass91 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet93 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray92);
        java.lang.Object obj94 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray92, obj94);
        org.junit.Assert.assertNotEquals((java.lang.Object) boolean76, (java.lang.Object) annotatedElementArray92);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray32, (java.lang.Object[]) annotatedElementArray92);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale13, locale15, locale17, locale19, locale21 };
        java.util.Set<java.util.Locale> localeSet23 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray22);
        java.util.List<java.io.Serializable> serializableList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray22);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray22, (java.lang.Object) 0.0f);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale30, locale32, locale34, locale36, locale38 };
        java.util.Set<java.util.Locale> localeSet40 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray39);
        java.util.List<java.io.Serializable> serializableList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray39);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray39, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray22, (java.lang.Object[]) localeArray39);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale47, locale49, locale51, locale53, locale55 };
        java.util.Set<java.util.Locale> localeSet57 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray56);
        java.util.List<java.io.Serializable> serializableList58 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray56);
        java.util.Set<java.lang.Cloneable> cloneableSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray39, (java.lang.Object[]) localeArray56);
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale64, locale66, locale68, locale70, locale72 };
        java.util.Set<java.util.Locale> localeSet74 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray73);
        java.util.List<java.io.Serializable> serializableList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray73);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray73, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray39, (java.lang.Object[]) localeArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) localeArray39);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) (short) -1, (float) (byte) 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (byte) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 0, (double) ' ', 0.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 10L, (double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.failfast");
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        kuromojiAnalysisTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, false);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("random");
        java.lang.String str26 = kuromojiAnalysisTests13.getTestName();
        org.junit.rules.RuleChain ruleChain27 = kuromojiAnalysisTests13.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader30, 100, postingsEnum32, postingsEnum33, true);
        org.junit.rules.TestRule testRule36 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) -1, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        char[] charArray1 = new char[] {};
        char[] charArray5 = new char[] { 'a', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray5);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        short[] shortArray3 = new short[] { (short) 10 };
        short[] shortArray5 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray3, shortArray5);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray11);
        short[] shortArray14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray14);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '4', (long) (short) 10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("hi!", indexReader20, (int) (byte) 0, postingsEnum22, postingsEnum23);
        java.lang.String str25 = kuromojiAnalysisTests12.getTestName();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests12.assertDocsSkippingEquals("<unknown>", indexReader27, 100, postingsEnum29, postingsEnum30, false);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) ruleChain10, (java.lang.Object) kuromojiAnalysisTests12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests35 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests35.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests35.assertPositionsSkippingEquals("random", indexReader44, (int) '4', postingsEnum46, postingsEnum47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests35.assertTermsEquals("tests.weekly", indexReader50, terms51, terms52, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests12, (java.lang.Object) terms52);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
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
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray30);
        org.junit.Assert.assertNotNull((java.lang.Object) strComparableSet31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0, (java.lang.Object) strComparableSet31);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) ' ', (double) (short) 100);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 10.0f, (float) 0L, (float) 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0.0d, (double) (short) 0, (double) (byte) 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        int[] intArray36 = new int[] { '#' };
        int[] intArray38 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray36, intArray38);
        int[] intArray41 = new int[] { '#' };
        int[] intArray43 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray41, intArray43);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray36, intArray41);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        int[] intArray53 = new int[] { '#' };
        int[] intArray55 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray53, intArray55);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray48, intArray53);
        int[] intArray59 = new int[] { '#' };
        int[] intArray61 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray59, intArray61);
        org.junit.Assert.assertArrayEquals(intArray53, intArray59);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray41, intArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling67 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling67 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList69 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.monster", (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.resetCheckIndexStatus();
        kuromojiAnalysisTests19.ensureCleanedUp();
        kuromojiAnalysisTests19.ensureCheckIndexPassed();
        kuromojiAnalysisTests19.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests31 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests31.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields34, fields35, false);
        kuromojiAnalysisTests31.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests31.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        kuromojiAnalysisTests19.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", (int) (byte) -1, numericDocValues49, numericDocValues50);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
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
        kuromojiAnalysisTests13.setUp();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests13.assertPathHasBeenCleared("random");
        java.lang.Object obj34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests13, obj34);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray11, doubleArray33, 10.0d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        char[] charArray6 = new char[] { ' ', ' ', 'a', '4', '#' };
        char[] charArray8 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray8);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
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
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests19.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        kuromojiAnalysisTests29.ensureCleanedUp();
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests29.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests19, (java.lang.Object) testRule38);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule38;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule38;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain17, (java.lang.Object) testRule38);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (byte) 10, (float) 0, 0.0f);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray2);
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
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests4.assertFieldsEquals("", indexReader26, fields27, fields28, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) strArray2, (java.lang.Object) fields28);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) '#');
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
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
        org.junit.Assert.assertArrayEquals("random", doubleArray18, doubleArray76, (double) 10.0f);
        java.lang.String[] strArray94 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet95 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray94);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) doubleArray18, (java.lang.Object) strArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray94);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray7 = new int[] { '#' };
        int[] intArray9 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray7, intArray9);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray2, intArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("hi!", indexReader20, (int) (byte) 0, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests12.ensureAllSearchContextsReleased();
        java.lang.String str27 = kuromojiAnalysisTests12.getTestName();
        java.lang.Class<?> wildcardClass28 = kuromojiAnalysisTests12.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray2, (java.lang.Object) wildcardClass28);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (byte) 1, (double) 1, (double) ' ');
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        short[] shortArray6 = new short[] { (byte) 0, (short) 100, (byte) 0, (short) -1, (short) 1, (byte) -1 };
        short[] shortArray10 = new short[] { (short) 10 };
        short[] shortArray12 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray10, shortArray12);
        short[] shortArray16 = new short[] { (short) 10 };
        short[] shortArray18 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray12, shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray12);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 1);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (short) 1, (float) '#', (float) (short) 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.lang.Object[] objArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) localeArray11, objArray13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests13.assertTermsEquals("tests.weekly", indexReader17, terms18, terms19, true);
        kuromojiAnalysisTests13.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests13.ensureCheckIndexPassed();
        kuromojiAnalysisTests13.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) intArray8, (java.lang.Object) kuromojiAnalysisTests13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.List<java.io.Serializable> serializableList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray11);
        java.util.Set<java.lang.Cloneable> cloneableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray11);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray16 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet17 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray16);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet18 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray16);
        org.junit.Assert.assertNotEquals((java.lang.Object) 1, (java.lang.Object) genericDeclarationArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) genericDeclarationArray16);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        java.lang.String str13 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("<unknown>", indexReader15, 100, postingsEnum17, postingsEnum18, false);
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain21);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) 10 };
        short[] shortArray6 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray6);
        short[] shortArray11 = new short[] { (short) 10 };
        short[] shortArray13 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray13);
        short[] shortArray17 = new short[] { (short) 10 };
        short[] shortArray19 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray17, shortArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray13, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray19);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 10L, (double) '4');
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 0.0d, (double) 0, (double) 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
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
        kuromojiAnalysisTests6.tearDown();
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests6.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) intArray4, (java.lang.Object) kuromojiAnalysisTests6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 'a', (long) '#');
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 0L);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
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
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray16, obj18);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) annotatedElementArray16, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
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
        double[] doubleArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray6, doubleArray45, (double) (short) 1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("europarl.lines.txt.gz", indexReader48, fields49, fields50, false);
        kuromojiAnalysisTests46.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests46.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        kuromojiAnalysisTests56.assertFieldsEquals("europarl.lines.txt.gz", indexReader58, fields59, fields60, false);
        kuromojiAnalysisTests56.ensureCleanedUp();
        kuromojiAnalysisTests56.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule65 = kuromojiAnalysisTests56.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests46, (java.lang.Object) testRule65);
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        kuromojiAnalysisTests46.assertDocsSkippingEquals("tests.awaitsfix", indexReader68, (int) (short) 10, postingsEnum70, postingsEnum71, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) "tests.slow", (java.lang.Object) postingsEnum71);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
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
        org.junit.rules.RuleChain ruleChain34 = kuromojiAnalysisTests25.failureAndSuccessEvents;
        kuromojiAnalysisTests25.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("hi!", indexReader44, (int) (byte) 0, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests36.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests0, kuromojiAnalysisTests25, kuromojiAnalysisTests36 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet51 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTestsArray50);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 1);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        char[] charArray5 = new char[] { '4', '4', '#', ' ', 'a' };
        char[] charArray10 = new char[] { 'a', '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
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
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.tearDown();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("tests.failfast", indexReader28, 1, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("<unknown>", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        kuromojiAnalysisTests20.setUp();
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("random", indexReader42, fields43, fields44, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) indexReader42);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, false);
        kuromojiAnalysisTests8.ensureCleanedUp();
        kuromojiAnalysisTests8.resetCheckIndexStatus();
        kuromojiAnalysisTests8.ensureCleanedUp();
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain29 = kuromojiAnalysisTests20.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        kuromojiAnalysisTests34.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain43 = kuromojiAnalysisTests34.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.junit.rules.RuleChain[] ruleChainArray45 = new org.junit.rules.RuleChain[] { ruleChain29, ruleChain43 };
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet46 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) ruleChainArray45);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
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
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("tests.nightly", (int) (short) 100, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) (byte) 0, (float) (short) 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray3);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100.0f, (float) (short) 10, (float) 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 0, 10L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "europarl.lines.txt.gz");
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 100L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (short) 1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        kuromojiAnalysisTests44.assertFieldsEquals("europarl.lines.txt.gz", indexReader46, fields47, fields48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("tests.failfast", indexReader52, 1, postingsEnum54, postingsEnum55);
        kuromojiAnalysisTests44.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        kuromojiAnalysisTests44.assertFieldsEquals("tests.slow", indexReader60, fields61, fields62, false);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        kuromojiAnalysisTests44.assertPositionsSkippingEquals("<unknown>", indexReader66, (int) 'a', postingsEnum68, postingsEnum69);
        kuromojiAnalysisTests44.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain72 = kuromojiAnalysisTests44.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray42, (java.lang.Object) ruleChain72);
        java.util.List[] listArray75 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray76 = (java.util.List<java.io.Serializable>[]) listArray75;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain72, (java.lang.Object) serializableListArray76);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
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
        java.lang.Object obj30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests1, obj30);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) shortArray12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, false);
        kuromojiAnalysisTests8.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests8.failureAndSuccessEvents;
        kuromojiAnalysisTests8.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests8.assertFieldsEquals("enwiki.random.lines.txt", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests8.setIndexWriterMaxDocs((int) (byte) 0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests27.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.ensureCheckIndexPassed();
        kuromojiAnalysisTests27.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        kuromojiAnalysisTests39.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain48 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain48;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain48;
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain48;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain48;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain48;
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain48;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain48;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain48;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "tests.badapples", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        long[] longArray3 = new long[] { 1 };
        long[] longArray5 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray3, longArray5);
        long[] longArray9 = new long[] { 1 };
        long[] longArray11 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray9, longArray11);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray9);
        long[] longArray17 = new long[] { 1 };
        long[] longArray19 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray17, longArray19);
        long[] longArray24 = new long[] { 1 };
        long[] longArray26 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray24, longArray26);
        long[] longArray30 = new long[] { 1 };
        long[] longArray32 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals("", longArray30, longArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray26, longArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray17, longArray30);
        org.junit.Assert.assertArrayEquals(longArray5, longArray17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, false);
        kuromojiAnalysisTests37.ensureCleanedUp();
        kuromojiAnalysisTests37.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule46 = kuromojiAnalysisTests37.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray17, (java.lang.Object) kuromojiAnalysisTests37);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
        kuromojiAnalysisTests10.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
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
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("tests.failfast", indexReader22, 1, postingsEnum24, postingsEnum25);
        kuromojiAnalysisTests14.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests14.ensureCleanedUp();
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        kuromojiAnalysisTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests14.assertFieldsEquals("enwiki.random.lines.txt", indexReader33, fields34, fields35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.failfast", indexReader39, terms40, terms41, false);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.badapples", indexReader45, terms46, terms47, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) terms47);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 100L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray8);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray15, intArray20);
        int[] intArray26 = new int[] { '#' };
        int[] intArray28 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray26, intArray28);
        org.junit.Assert.assertArrayEquals(intArray20, intArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray8, intArray20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader35, fields36, fields37, false);
        kuromojiAnalysisTests33.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain42 = kuromojiAnalysisTests33.failureAndSuccessEvents;
        kuromojiAnalysisTests33.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        kuromojiAnalysisTests33.assertFieldsEquals("enwiki.random.lines.txt", indexReader45, fields46, fields47, false);
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests33.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) (-1.0d), (java.lang.Object) kuromojiAnalysisTests33);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        kuromojiAnalysisTests33.assertDocsSkippingEquals("", indexReader53, (int) '4', postingsEnum55, postingsEnum56, false);
        kuromojiAnalysisTests33.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray20, (java.lang.Object) kuromojiAnalysisTests33);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("europarl.lines.txt.gz", indexReader29, fields30, fields31, false);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 1L, (long) 1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (short) 10, 10.0d, (double) 1L);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10L, (double) 100L, (double) 1);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        kuromojiAnalysisTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader36, fields37, fields38, false);
        kuromojiAnalysisTests34.ensureCleanedUp();
        kuromojiAnalysisTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests34.assertPositionsSkippingEquals("hi!", indexReader44, 1, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests34.assertPathHasBeenCleared("europarl.lines.txt.gz");
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        kuromojiAnalysisTests34.assertTermsEquals("tests.slow", indexReader52, terms53, terms54, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) indexReader52);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
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
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.nightly", indexReader40, (int) (byte) 1, postingsEnum42, postingsEnum43);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum46, postingsEnum47, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum46);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) ' ', (float) 1L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.slow", indexReader11, (int) '#', postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("enwiki.random.lines.txt", indexReader30, fields31, fields32, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        float[] floatArray0 = null;
        float[] floatArray9 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray16 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray9, floatArray16, (float) (byte) 100);
        float[] floatArray26 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray33 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray26, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray9, floatArray26, (float) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray9, 100.0f);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        char[] charArray3 = new char[] { '#', '#', ' ' };
        char[] charArray5 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests16.setUp();
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale29, locale31, locale33, locale35, locale37 };
        java.util.Set<java.util.Locale> localeSet39 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray38);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray38, (java.lang.Object[]) localeArray51);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65 };
        java.util.Set<java.util.Locale> localeSet67 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray66);
        java.util.List<java.io.Serializable> serializableList68 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray66);
        java.util.Set<java.lang.Cloneable> cloneableSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray66);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray51, (java.lang.Object[]) localeArray66);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests16, (java.lang.Object) localeArray66);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        char[] charArray2 = new char[] { '4', '#' };
        char[] charArray5 = new char[] { '#', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        float[] floatArray0 = null;
        float[] floatArray8 = new float[] { (short) 10, (-1.0f), 100.0f, (byte) 0, (short) 100, 1L };
        float[] floatArray15 = new float[] { (byte) -1, (short) -1, 100, (byte) -1, '4', (byte) 100 };
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray15, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray8, (float) '4');
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
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
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests19.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        kuromojiAnalysisTests19.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests19.setUp();
        kuromojiAnalysisTests19.ensureCheckIndexPassed();
        kuromojiAnalysisTests19.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) kuromojiAnalysisTests16, (java.lang.Object) kuromojiAnalysisTests19);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
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
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("hi!", indexReader23, (int) (byte) 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests15.assertTermsEquals("random", indexReader29, terms30, terms31, true);
        java.lang.String str34 = kuromojiAnalysisTests15.getTestName();
        kuromojiAnalysisTests15.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 'a', 1.0d, (double) 0.0f);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        kuromojiAnalysisTests26.ensureCleanedUp();
        kuromojiAnalysisTests26.resetCheckIndexStatus();
        kuromojiAnalysisTests26.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        java.lang.String str13 = kuromojiAnalysisTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) str13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        char[] charArray5 = new char[] { '#', '#', ' ', '4', '#' };
        char[] charArray8 = new char[] { 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale7, locale9, locale11, locale13, locale15 };
        java.util.Set<java.util.Locale> localeSet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        java.util.List<java.io.Serializable> serializableList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) executorServiceArray2, (java.lang.Object) serializableList18);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        char[] charArray4 = new char[] { ' ', ' ', '#' };
        char[] charArray8 = new char[] { '4', '#', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray4, charArray8);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
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
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) annotatedElementArray15, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        kuromojiAnalysisTests11.ensureCleanedUp();
        kuromojiAnalysisTests11.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests11.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain21 = kuromojiAnalysisTests11.failureAndSuccessEvents;
        kuromojiAnalysisTests11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader6, terms7, terms8, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100.0f, (double) (short) 1, 1.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
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
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests15.assertFieldsEquals("tests.slow", indexReader28, fields29, fields30, true);
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests15.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues35, numericDocValues36);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray4 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray2, shortArray4);
        short[] shortArray9 = new short[] { (short) 10 };
        short[] shortArray11 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray9, shortArray11);
        short[] shortArray15 = new short[] { (short) 10 };
        short[] shortArray17 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray11, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray17);
        short[] shortArray24 = new short[] { (short) 10 };
        short[] shortArray26 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray24, shortArray26);
        short[] shortArray30 = new short[] { (short) 10 };
        short[] shortArray32 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray26, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray32);
        short[] shortArray40 = new short[] { (short) 10 };
        short[] shortArray42 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray40, shortArray42);
        short[] shortArray46 = new short[] { (short) 10 };
        short[] shortArray48 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray46, shortArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray42, shortArray48);
        short[] shortArray54 = new short[] { (short) 10 };
        short[] shortArray56 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray54, shortArray56);
        short[] shortArray60 = new short[] { (short) 10 };
        short[] shortArray62 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray60, shortArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray42, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray62);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests68 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        org.apache.lucene.index.Fields fields72 = null;
        kuromojiAnalysisTests68.assertFieldsEquals("europarl.lines.txt.gz", indexReader70, fields71, fields72, false);
        kuromojiAnalysisTests68.ensureCleanedUp();
        kuromojiAnalysisTests68.resetCheckIndexStatus();
        kuromojiAnalysisTests68.ensureCleanedUp();
        kuromojiAnalysisTests68.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray4, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        char[] charArray3 = new char[] { '4', 'a' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray3, charArray4);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
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
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum19, postingsEnum20, false);
        org.junit.rules.RuleChain ruleChain23 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet9, (java.lang.Object) kuromojiAnalysisTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests10.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, true);
        org.junit.rules.TestRule testRule19 = kuromojiAnalysisTests10.ruleChain;
        kuromojiAnalysisTests10.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        kuromojiAnalysisTests10.assertTermsEquals("tests.slow", indexReader22, terms23, terms24, false);
        short[] shortArray30 = new short[] { (short) 10 };
        short[] shortArray32 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray30, shortArray32);
        short[] shortArray37 = new short[] { (short) 10 };
        short[] shortArray39 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray37, shortArray39);
        short[] shortArray43 = new short[] { (short) 10 };
        short[] shortArray45 = new short[] { (short) 10 };
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray39, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray30, shortArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) indexReader22, (java.lang.Object) shortArray30);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, (double) (byte) 1, 1.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
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
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        kuromojiAnalysisTests19.assertPositionsSkippingEquals("tests.weekly", indexReader41, (int) (short) 10, postingsEnum43, postingsEnum44);
        java.lang.String str46 = kuromojiAnalysisTests19.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) str46);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        int[] intArray0 = new int[] {};
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
        int[] intArray30 = new int[] { '#' };
        int[] intArray32 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray30, intArray32);
        int[] intArray35 = new int[] { '#' };
        int[] intArray37 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray35, intArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray30, intArray35);
        org.junit.Assert.assertArrayEquals("", intArray22, intArray35);
        int[] intArray43 = new int[] { '#' };
        int[] intArray45 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray43, intArray45);
        int[] intArray48 = new int[] { '#' };
        int[] intArray50 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray43, intArray48);
        int[] intArray54 = new int[] { '#' };
        int[] intArray56 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray54, intArray56);
        org.junit.Assert.assertArrayEquals(intArray48, intArray54);
        org.junit.Assert.assertArrayEquals(intArray35, intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray35);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.awaitsfix", indexReader14, terms15, terms16, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("tests.failfast", indexReader28, 1, postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests20.assertPositionsSkippingEquals("<unknown>", indexReader34, (int) '#', postingsEnum36, postingsEnum37);
        kuromojiAnalysisTests20.assertPathHasBeenCleared("tests.nightly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests41 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        kuromojiAnalysisTests41.assertFieldsEquals("europarl.lines.txt.gz", indexReader43, fields44, fields45, false);
        kuromojiAnalysisTests41.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests41.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain50;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain50;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain50;
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain50;
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet63 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray62);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests64 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests64.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet63, (java.lang.Object) kuromojiAnalysisTests64);
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        kuromojiAnalysisTests64.assertDocsEnumEquals("tests.badapples", postingsEnum69, postingsEnum70, true);
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        kuromojiAnalysisTests64.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader74, 100, postingsEnum76, postingsEnum77);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) kuromojiAnalysisTests64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) false, (java.lang.Object) kuromojiAnalysisTests64);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0.0f, (double) (short) 0, (-1.0d));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray1, byteArray4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) 0, 0.0d, 1.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("", indexReader11, (int) (byte) 0, postingsEnum13, postingsEnum14);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", (-1), numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray7, byteArray11);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray25 = new java.util.concurrent.ExecutorService[][] { executorServiceArray19, executorServiceArray20, executorServiceArray21, executorServiceArray22, executorServiceArray23, executorServiceArray24 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList26 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) annotatedElementArray16, (java.lang.Object) executorServiceArray25);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10L, (double) '4');
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (short) 0);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, 1.0f, 0.0f);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (long) (short) 100, 100L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1L));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        int[] intArray3 = new int[] { '#' };
        int[] intArray5 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray8 = new int[] { '#' };
        int[] intArray10 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray8);
        int[] intArray15 = new int[] { '#' };
        int[] intArray17 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray15, intArray17);
        int[] intArray20 = new int[] { '#' };
        int[] intArray22 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray20, intArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray15, intArray20);
        int[] intArray26 = new int[] { '#' };
        int[] intArray28 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray26, intArray28);
        org.junit.Assert.assertArrayEquals(intArray20, intArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray8, intArray20);
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
        int[] intArray59 = new int[] { '#' };
        int[] intArray61 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray59, intArray61);
        org.junit.Assert.assertArrayEquals(intArray52, intArray61);
        org.junit.Assert.assertArrayEquals(intArray8, intArray52);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        kuromojiAnalysisTests65.assertFieldsEquals("europarl.lines.txt.gz", indexReader67, fields68, fields69, false);
        kuromojiAnalysisTests65.ensureCleanedUp();
        kuromojiAnalysisTests65.resetCheckIndexStatus();
        kuromojiAnalysisTests65.setUp();
        kuromojiAnalysisTests65.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray52, (java.lang.Object) kuromojiAnalysisTests65);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.nightly", indexReader15, (-1), postingsEnum17, postingsEnum18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
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
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("", 0, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { '4', 'a', 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        float[] floatArray0 = null;
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
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray91, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray26, (float) 1L);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 0);
    }
}

