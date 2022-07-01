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
        org.junit.Assert.assertEquals(0.0d, (double) (-1.0f));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        long[] longArray3 = new long[] { (byte) 1, (-1L) };
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        org.junit.Assert.assertArrayEquals(longArray9, longArray14);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray18, longArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray9, longArray18);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray32, longArray33);
        org.junit.Assert.assertArrayEquals(longArray29, longArray32);
        org.junit.Assert.assertArrayEquals(longArray18, longArray29);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray39, longArray40);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray43, longArray44);
        org.junit.Assert.assertArrayEquals(longArray39, longArray44);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray48, longArray49);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray48, longArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray29, longArray48);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray60, longArray64);
        org.junit.Assert.assertArrayEquals("", longArray29, longArray60);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray70, longArray71);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray74, longArray75);
        org.junit.Assert.assertArrayEquals(longArray70, longArray75);
        long[] longArray79 = new long[] {};
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray79, longArray80);
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray83, longArray84);
        org.junit.Assert.assertArrayEquals(longArray79, longArray84);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray75, longArray84);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray29, longArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray75);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) (byte) 1);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) (byte) -1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray16, (double) (byte) -1);
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray26, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray12, doubleArray26, (double) 0L);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray39, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str46 = synonymsAnalysisTest45.getTestName();
        java.lang.String str47 = synonymsAnalysisTest45.getTestName();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest45.assertPositionsSkippingEquals("", indexReader49, (int) ' ', postingsEnum51, postingsEnum52);
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest45.failureAndSuccessEvents;
        synonymsAnalysisTest45.ensureCleanedUp();
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest45, (java.lang.Object) doubleArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray35, doubleArray57, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray12, doubleArray35, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray12, (double) 0L);
        double[] doubleArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray67, (double) 10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, (float) (short) 1, (float) (short) -1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", 0.0d, (double) 0, (double) (short) 10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 0L, (long) 0);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray10);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray15);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray25, shortArray30);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray35, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray45);
        org.junit.Assert.assertArrayEquals("", shortArray20, shortArray30);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray52, shortArray53);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray52, shortArray57);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray62);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray15, shortArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray57);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest6.tearDown();
        synonymsAnalysisTest6.assertPathHasBeenCleared("enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) ' ', (double) 0L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest13.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) strArray24);
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        synonymsAnalysisTest29.assertTermsEquals("europarl.lines.txt.gz", indexReader31, terms32, terms33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        synonymsAnalysisTest29.assertDocsSkippingEquals("tests.maxfailures", indexReader37, (-1), postingsEnum39, postingsEnum40, true);
        synonymsAnalysisTest29.ensureCheckIndexPassed();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) synonymsAnalysisTest29);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (short) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray21, shortArray26);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray26);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray37, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray47, shortArray52);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray57);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray26, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray26);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray67, shortArray72);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray72);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray78, shortArray79);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray78, shortArray83);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray87, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray88);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray83);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest0);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 100, (long) (byte) 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 5, (long) (-1));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray1, (double) (byte) 1);
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray4, (double) (byte) -1);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray21, intArray24);
        org.junit.Assert.assertArrayEquals(intArray16, intArray21);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray33, intArray36);
        org.junit.Assert.assertArrayEquals(intArray28, intArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray16, intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray4, (java.lang.Object) intArray16);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        char[][][] charArray3 = new char[][][] {};
        java.util.Set<char[][]> charArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charArray3);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) (short) 100, (java.lang.Object) charArraySet4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        synonymsAnalysisTest6.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str16 = synonymsAnalysisTest6.getTestName();
        java.lang.String str17 = synonymsAnalysisTest6.getTestName();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest6.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.maxfailures", (java.lang.Object) synonymsAnalysisTest6);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", 100.0d, (double) 3, (double) (byte) 100);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) '4', (double) (byte) 0);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        java.lang.Object obj0 = null;
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray6, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray26);
        org.junit.Assert.assertArrayEquals(intArray18, intArray23);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray18, intArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray9, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray38, intArray41);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray50);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray56, intArray59);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray64, intArray67);
        org.junit.Assert.assertArrayEquals(intArray59, intArray64);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("", intArray59, intArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray50, intArray71);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray41, intArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray30, intArray41);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        int[] intArray82 = new int[] {};
        int[] intArray83 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray82, intArray83);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray80, intArray83);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray87, intArray88);
        int[] intArray90 = new int[] {};
        int[] intArray91 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray90, intArray91);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray88, intArray91);
        org.junit.Assert.assertArrayEquals(intArray83, intArray88);
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray30, intArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) intArray88);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("<unknown>", postingsEnum6, postingsEnum7, false);
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray18 = new char[] { '#' };
        char[] charArray20 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray18);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray15, byteArray22);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray26);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray35, byteArray36);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray39, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray40);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray40, byteArray47);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray51, byteArray52);
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray51);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray58, byteArray59);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray59);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray68, byteArray69);
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray59, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray68);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray77, byteArray78);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray81, byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray82);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray86, byteArray87);
        byte[] byteArray89 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray86, byteArray89);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray82, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray1, byteArray3);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        java.lang.String str18 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain22;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain22;
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader28, (int) (short) 0, postingsEnum30, postingsEnum31);
        java.lang.String str33 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader35, fields36, fields37, true);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader41, (int) (byte) 1, postingsEnum43, postingsEnum44, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str48 = synonymsAnalysisTest47.getTestName();
        java.lang.String str49 = synonymsAnalysisTest47.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule51 = synonymsAnalysisTest50.ruleChain;
        synonymsAnalysisTest50.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest50.failureAndSuccessEvents;
        synonymsAnalysisTest47.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        synonymsAnalysisTest47.assertTermsEquals("tests.maxfailures", indexReader56, terms57, terms58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        synonymsAnalysisTest47.assertFieldsEquals("tests.awaitsfix", indexReader62, fields63, fields64, true);
        org.junit.rules.TestRule testRule67 = synonymsAnalysisTest47.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) indexReader41, (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set[] setArray32 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray33 = (java.util.Set<java.lang.String>[]) setArray32;
        strSetArray33[0] = strSet5;
        strSetArray33[1] = strSet10;
        strSetArray33[2] = strSet15;
        strSetArray33[3] = strSet20;
        strSetArray33[4] = strSet25;
        strSetArray33[5] = strSet30;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray33);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray71);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray79);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray86);
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray76);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strSetArray33, (java.lang.Object[]) executorServiceArray49);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) intArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest10.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest10.assertDocsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21, true);
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        java.lang.String str25 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray6, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) synonymsAnalysisTestArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray43);
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray65, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray81);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) synonymsAnalysisTestArray1, (java.lang.Object[]) executorServiceArray65);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray19);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        char[] charArray31 = new char[] { '#' };
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        char[] charArray37 = new char[] { '#' };
        char[] charArray39 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        char[] charArray42 = new char[] { '#' };
        char[] charArray44 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        char[] charArray47 = new char[] { '#' };
        char[] charArray49 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray47, charArray49);
        org.junit.Assert.assertArrayEquals(charArray44, charArray49);
        org.junit.Assert.assertArrayEquals(charArray39, charArray44);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray31, charArray39);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray55, shortArray56);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray60, shortArray65);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray65);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) charArray39, (java.lang.Object) shortArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.lang.Class<?> wildcardClass12 = executorServiceArray9.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray9);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.lang.Class<?> wildcardClass15 = synonymsAnalysisTest0.getClass();
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass15, obj16);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("<unknown>", indexReader14, 4, postingsEnum16, postingsEnum17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) 4);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (-1), (long) (short) 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.tearDown();
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray13);
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) objSet16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5, throttling6, throttling7, throttling8 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet10 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) throttlingArray9);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        java.lang.String str15 = synonymsAnalysisTest12.getTestName();
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest12.failureAndSuccessEvents;
        java.lang.String str18 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        java.lang.String str24 = synonymsAnalysisTest22.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest25.failureAndSuccessEvents;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest3);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader36, (int) (byte) 0, postingsEnum38, postingsEnum39);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain42 = null;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain42;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest41.assertDocsEnumEquals("hi!", postingsEnum45, postingsEnum46, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray13, (java.lang.Object) synonymsAnalysisTest20);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray31);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 10L);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) -1, 0.0f, (float) (short) 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) (short) 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 6, (long) (byte) 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.awaitsfix", 1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        float[] floatArray16 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray21 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray21, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray21);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest28.ruleChain;
        synonymsAnalysisTest28.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain31 = synonymsAnalysisTest28.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray21, (java.lang.Object) synonymsAnalysisTest28);
        synonymsAnalysisTest28.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest28.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray1, (java.lang.Object) synonymsAnalysisTest28);
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest28.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues38, numericDocValues39);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str11 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray8);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        org.junit.Assert.assertArrayEquals("", intArray8, intArray16);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray26);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray31, intArray34);
        org.junit.Assert.assertArrayEquals(intArray26, intArray31);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray39);
        org.junit.Assert.assertArrayEquals(intArray26, intArray39);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray47, intArray50);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest53 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        synonymsAnalysisTest53.assertTermsEquals("europarl.lines.txt.gz", indexReader55, terms56, terms57, false);
        synonymsAnalysisTest53.setIndexWriterMaxDocs(1);
        java.lang.String str62 = synonymsAnalysisTest53.getTestName();
        java.lang.String str63 = synonymsAnalysisTest53.getTestName();
        synonymsAnalysisTest53.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray47, (java.lang.Object) synonymsAnalysisTest53);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray39, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray16, intArray47);
        java.lang.Object obj68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) intArray47, obj68);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 5, (long) (-1));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray2, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray12, shortArray17);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray22);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest26.ruleChain;
        synonymsAnalysisTest26.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray7, (java.lang.Object) synonymsAnalysisTest26);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 'a');
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest11.ruleChain;
        synonymsAnalysisTest11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain14);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.lang.String str18 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain20 = null;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain20;
        synonymsAnalysisTest19.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest19);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, (double) 3, (double) ' ');
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 1L);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("hi!", (int) (byte) 1, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str16 = synonymsAnalysisTest15.getTestName();
        java.lang.String str17 = synonymsAnalysisTest15.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain21;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain21;
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, (int) (short) 0, postingsEnum29, postingsEnum30);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", (int) '#', numericDocValues35, numericDocValues36);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 100, (float) ' ', (float) (short) 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str10 = synonymsAnalysisTest9.getTestName();
        java.lang.String str11 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        synonymsAnalysisTest12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest9.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.ensureCheckIndexPassed();
        synonymsAnalysisTest9.setUp();
        synonymsAnalysisTest9.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray5, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader12, fields13, fields14, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain23);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain23;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain23;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) (short) 100, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        double[] doubleArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader6, (int) ' ', postingsEnum8, postingsEnum9);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest2.failureAndSuccessEvents;
        synonymsAnalysisTest2.ensureCleanedUp();
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) doubleArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray1, doubleArray14, (double) 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(3);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", obj1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray8, byteArray15);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray19);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray31);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray19, byteArray27);
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray40);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) (byte) 1);
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray12, doubleArray15, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) doubleArray12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        org.junit.Assert.assertArrayEquals(charArray8, charArray16);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        char[] charArray31 = new char[] { '#' };
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        char[] charArray36 = new char[] { '#' };
        char[] charArray38 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        org.junit.Assert.assertArrayEquals(charArray33, charArray38);
        org.junit.Assert.assertArrayEquals(charArray28, charArray33);
        char[] charArray43 = new char[] { '#' };
        char[] charArray45 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        char[] charArray48 = new char[] { '#' };
        char[] charArray50 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray48, charArray50);
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        org.junit.Assert.assertArrayEquals(charArray33, charArray45);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray62);
        char[] charArray66 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray62, charArray66);
        org.junit.Assert.assertArrayEquals(charArray33, charArray66);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray16, charArray33);
        java.lang.Object obj71 = null;
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray73, longArray74);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray77, longArray78);
        org.junit.Assert.assertArrayEquals(longArray73, longArray78);
        org.junit.Assert.assertNotEquals("tests.weekly", obj71, (java.lang.Object) longArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) charArray16, (java.lang.Object) longArray73);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 1, (double) (short) -1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader12, fields13, fields14, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 0, (long) (byte) 100);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str10 = synonymsAnalysisTest9.getTestName();
        java.lang.String str11 = synonymsAnalysisTest9.getTestName();
        java.lang.String str12 = synonymsAnalysisTest9.getTestName();
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest9.failureAndSuccessEvents;
        java.lang.String str15 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str20 = synonymsAnalysisTest19.getTestName();
        java.lang.String str21 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        synonymsAnalysisTest22.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain25;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) 100L, 10.0f);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) (byte) 10, 1.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray59);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray21);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) -1, (double) 10);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray7 = new char[] { '#' };
        char[] charArray9 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray7, charArray9);
        char[] charArray12 = new char[] { '#' };
        char[] charArray14 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray12, charArray14);
        org.junit.Assert.assertArrayEquals(charArray9, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray9);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        org.junit.Assert.assertArrayEquals(charArray9, charArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray18, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str25 = synonymsAnalysisTest24.getTestName();
        java.lang.String str26 = synonymsAnalysisTest24.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest24.assertPositionsSkippingEquals("", indexReader28, (int) ' ', postingsEnum30, postingsEnum31);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest24.ensureCleanedUp();
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest24, (java.lang.Object) doubleArray36);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray14, doubleArray36, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) doubleArray36);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) synonymsAnalysisTestArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray15);
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray36, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray64);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) synonymsAnalysisTestArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) -1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        java.util.Set<int[]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray8);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray1, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) 6, (float) (byte) 1, (float) 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) '#', (float) (byte) 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) '4');
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 1.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray18, byteArray25);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray29);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray25);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray43, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray50);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray57, byteArray58);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray61, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray62);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray69);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray62, byteArray69);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray73, byteArray74);
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray73);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray80, byteArray81);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray81);
        byte[] byteArray90 = new byte[] {};
        byte[] byteArray91 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray90, byteArray91);
        byte[] byteArray93 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray90, byteArray93);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray81, byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) byteArray90);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray1, longArray2);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray8, intArray11);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray20);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray29);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray34, intArray37);
        org.junit.Assert.assertArrayEquals(intArray29, intArray34);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("", intArray29, intArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray20, intArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray11, intArray41);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        synonymsAnalysisTest47.assertTermsEquals("europarl.lines.txt.gz", indexReader49, terms50, terms51, false);
        synonymsAnalysisTest47.setIndexWriterMaxDocs(1);
        java.lang.String str56 = synonymsAnalysisTest47.getTestName();
        java.lang.String str57 = synonymsAnalysisTest47.getTestName();
        synonymsAnalysisTest47.restoreIndexWriterMaxDocs();
        java.lang.String str59 = synonymsAnalysisTest47.getTestName();
        synonymsAnalysisTest47.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) intArray11, (java.lang.Object) synonymsAnalysisTest47);
        synonymsAnalysisTest47.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) longArray2, (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain20;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray5, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray64);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray81);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray86, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray86, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 10L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray8, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray18, shortArray23);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray28);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest33 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain34 = null;
        synonymsAnalysisTest33.failureAndSuccessEvents = ruleChain34;
        java.lang.String str36 = synonymsAnalysisTest33.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest33.assertDocsEnumEquals("<unknown>", postingsEnum38, postingsEnum39, false);
        synonymsAnalysisTest33.ensureCleanedUp();
        synonymsAnalysisTest33.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest33.assertPositionsSkippingEquals("tests.badapples", indexReader45, (int) (byte) -1, postingsEnum47, postingsEnum48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) shortArray3, (java.lang.Object) synonymsAnalysisTest33);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest10.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, false);
        synonymsAnalysisTest10.ensureAllSearchContextsReleased();
        synonymsAnalysisTest10.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest10.assertTermsEquals("tests.failfast", indexReader21, terms22, terms23, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1), (java.lang.Object) terms22);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray7, intArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest13.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        synonymsAnalysisTest13.setIndexWriterMaxDocs(1);
        java.lang.String str22 = synonymsAnalysisTest13.getTestName();
        java.lang.String str23 = synonymsAnalysisTest13.getTestName();
        synonymsAnalysisTest13.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray7, (java.lang.Object) synonymsAnalysisTest13);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray32, intArray35);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray40, intArray43);
        org.junit.Assert.assertArrayEquals(intArray35, intArray40);
        org.junit.Assert.assertArrayEquals("", intArray28, intArray40);
        org.junit.Assert.assertArrayEquals(intArray7, intArray28);
        org.junit.Assert.assertArrayEquals(intArray2, intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, true);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray17, (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest24.ensureCheckIndexPassed();
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        synonymsAnalysisTest32.assertTermsEquals("europarl.lines.txt.gz", indexReader34, terms35, terms36, false);
        synonymsAnalysisTest32.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest32.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest24.failureAndSuccessEvents = ruleChain43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest24);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray24, shortArray29);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray34, shortArray39);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray44);
        org.junit.Assert.assertArrayEquals("", shortArray19, shortArray29);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray51, shortArray56);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray61);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray56);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray14, shortArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray14);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        short[] shortArray7 = new short[] { (byte) 100, (byte) -1, (short) 1, (byte) 0, (byte) 1, (short) 1 };
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray11, shortArray16);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray21);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray26, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray36, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray21, shortArray46);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray54, shortArray59);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray54);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray64);
        java.lang.Object obj69 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray64, obj69);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray74, shortArray75);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray78, shortArray79);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray74, shortArray79);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray74);
        short[] shortArray84 = new short[] {};
        short[] shortArray85 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray84, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray7, shortArray64);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) (short) 0, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray17, byteArray24);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray28);
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray24);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray37, byteArray38);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray42);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray46, byteArray47);
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray42, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray49);
        byte[] byteArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray53);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 'a', (long) 'a');
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (short) 1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain21);
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain21;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest25.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, false);
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest25.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule36;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule36, (java.lang.Object) (short) 0);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule36;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain21, (java.lang.Object) testRule36);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray0 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray0, throttlingArray1 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class[] classArray11 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        java.lang.Class[][] classArray14 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray15 = (java.lang.Class<?>[][]) classArray14;
        wildcardClassArray15[0] = wildcardClassArray6;
        wildcardClassArray15[1] = wildcardClassArray9;
        wildcardClassArray15[2] = wildcardClassArray12;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) wildcardClassArray15);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 100, (float) 1L, (float) 10L);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", (int) ' ', numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) 1.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.setIndexWriterMaxDocs(4);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray5);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray25);
        java.lang.Object obj28 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray25, obj28);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray32, shortArray37);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray25, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray42);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str48 = synonymsAnalysisTest47.getTestName();
        java.lang.String str49 = synonymsAnalysisTest47.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) shortArray14, (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceSet8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray13);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray23, longArray24);
        org.junit.Assert.assertArrayEquals("random", longArray13, longArray23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str28 = synonymsAnalysisTest27.getTestName();
        java.lang.String str29 = synonymsAnalysisTest27.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        synonymsAnalysisTest30.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest30.failureAndSuccessEvents;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain33;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest27.assertTermsEquals("tests.maxfailures", indexReader36, terms37, terms38, false);
        java.lang.Class<?> wildcardClass41 = synonymsAnalysisTest27.getClass();
        java.lang.Class[] classArray43 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        wildcardClassArray44[0] = wildcardClass41;
        java.util.Set<java.lang.Class<?>> wildcardClassSet47 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray44);
        java.util.Set<java.lang.Class<?>> wildcardClassSet48 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray44);
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) "random", (java.lang.Object) wildcardClassSet48);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        synonymsAnalysisTest50.assertTermsEquals("europarl.lines.txt.gz", indexReader52, terms53, terms54, false);
        synonymsAnalysisTest50.ensureAllSearchContextsReleased();
        synonymsAnalysisTest50.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        synonymsAnalysisTest50.assertTermsEquals("tests.failfast", indexReader61, terms62, terms63, false);
        synonymsAnalysisTest50.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) synonymsAnalysisTest50);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray3, charArray8);
        char[] charArray15 = new char[] { '#' };
        char[] charArray17 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray21, charArray26);
        org.junit.Assert.assertArrayEquals(charArray17, charArray26);
        char[] charArray33 = new char[] { '#' };
        char[] charArray35 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray35);
        char[] charArray39 = new char[] { '#' };
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        char[] charArray44 = new char[] { '#' };
        char[] charArray46 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray39, charArray44);
        org.junit.Assert.assertArrayEquals(charArray35, charArray44);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray17, charArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray35);
        char[] charArray54 = new char[] { '#' };
        char[] charArray56 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray54, charArray56);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        char[] charArray65 = new char[] { '#' };
        char[] charArray67 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray60, charArray65);
        org.junit.Assert.assertArrayEquals(charArray56, charArray65);
        char[] charArray72 = new char[] { '#' };
        char[] charArray74 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray72, charArray74);
        char[] charArray78 = new char[] { '#' };
        char[] charArray80 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray78, charArray80);
        char[] charArray83 = new char[] { '#' };
        char[] charArray85 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray83, charArray85);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray78, charArray83);
        org.junit.Assert.assertArrayEquals(charArray74, charArray83);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray56, charArray74);
        org.junit.Assert.assertArrayEquals(charArray3, charArray56);
        char[] charArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray91);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) ' ', postingsEnum21, postingsEnum22, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader33, (-1), postingsEnum35, postingsEnum36, true);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum40, postingsEnum41);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 100.0f);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.monster", postingsEnum21, postingsEnum22, false);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest14.assertDocsSkippingEquals("tests.slow", indexReader28, (int) (byte) 10, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("", postingsEnum35, postingsEnum36, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        synonymsAnalysisTest39.assertTermsEquals("europarl.lines.txt.gz", indexReader41, terms42, terms43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest39.assertDocsSkippingEquals("tests.maxfailures", indexReader47, (-1), postingsEnum49, postingsEnum50, true);
        synonymsAnalysisTest39.ensureCheckIndexPassed();
        java.lang.String str54 = synonymsAnalysisTest39.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest39.assertDocsEnumEquals("", postingsEnum56, postingsEnum57, true);
        synonymsAnalysisTest39.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) true, (java.lang.Object) synonymsAnalysisTest39);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        char[][][] charArray0 = new char[][][] {};
        java.util.Set<char[][]> charArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(charArray0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.setIndexWriterMaxDocs(4);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray18);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) '4');
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        char[] charArray5 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray11 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray17 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray18 = new char[][] { charArray5, charArray11, charArray17 };
        java.util.Set<char[]> charArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(charArray18);
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) charArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray31, intArray34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest37 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        synonymsAnalysisTest37.assertTermsEquals("europarl.lines.txt.gz", indexReader39, terms40, terms41, false);
        synonymsAnalysisTest37.setIndexWriterMaxDocs(1);
        java.lang.String str46 = synonymsAnalysisTest37.getTestName();
        java.lang.String str47 = synonymsAnalysisTest37.getTestName();
        synonymsAnalysisTest37.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray31, (java.lang.Object) synonymsAnalysisTest37);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray25, (java.lang.Object) synonymsAnalysisTest37);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray18, (java.lang.Object[]) strArray25);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray9, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray20);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray20, byteArray28);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) byteArray28);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) '4', 1.0d, (double) 0.0f);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader6, fields7, fields8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) fields8);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, false);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '4', (double) (short) 1, (double) 1.0f);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields5, (java.lang.Object) "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 6, (float) (short) 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0f, 10.0f, (float) (short) 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest2.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.maxfailures", indexReader10, (-1), postingsEnum12, postingsEnum13, true);
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 10.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader10, terms11, terms12, true);
        java.lang.Object obj15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) indexReader10, obj15);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        java.util.Set<int[]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray14);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray29);
        org.junit.Assert.assertArrayEquals(longArray14, longArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray1, (java.lang.Object) longArray14);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy34 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray35 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy34 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet36 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray35);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet37 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray35);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray1, (java.lang.Object[]) queryCachingPolicyArray35);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 5);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray21, shortArray26);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray26);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray37, shortArray42);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray47, shortArray52);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray57);
        org.junit.Assert.assertArrayEquals("", shortArray32, shortArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray26, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray26);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray67, shortArray68);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray67, shortArray72);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray72);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray78, shortArray79);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray78, shortArray83);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray87, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray88);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray83);
        short[] shortArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray94);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("", intArray6, intArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotEquals((java.lang.Object) intArray18, (java.lang.Object) boolean24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str27 = synonymsAnalysisTest26.getTestName();
        java.lang.String str28 = synonymsAnalysisTest26.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest26.assertDocsEnumEquals("tests.slow", postingsEnum30, postingsEnum31, false);
        synonymsAnalysisTest26.tearDown();
        synonymsAnalysisTest26.setUp();
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule50 = synonymsAnalysisTest49.ruleChain;
        synonymsAnalysisTest49.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest49.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray42, (java.lang.Object) synonymsAnalysisTest49);
        synonymsAnalysisTest49.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        synonymsAnalysisTest49.assertDocsEnumEquals("tests.monster", postingsEnum56, postingsEnum57, false);
        org.junit.rules.RuleChain ruleChain60 = synonymsAnalysisTest49.failureAndSuccessEvents;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain60;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) boolean24, (java.lang.Object) synonymsAnalysisTest26);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, (double) 2, (double) 0.0f);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, 1.0f, 1.0f);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray40);
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray30);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet54 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        java.util.Set<java.lang.CharSequence> charSequenceSet55 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) charSequenceArray53);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 2, (long) (short) 1);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100.0f, (float) 1L, (float) (short) -1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 10, (long) (short) 100);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, true);
        java.lang.String str18 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) (byte) 10, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        java.lang.Object obj12 = null;
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertNotEquals("tests.weekly", obj12, (java.lang.Object) longArray14);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray26, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray26, longArray31);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray35, longArray36);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray35, longArray40);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray26, longArray35);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray45, longArray46);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray46, longArray49);
        org.junit.Assert.assertArrayEquals(longArray35, longArray46);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray55, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        org.junit.Assert.assertArrayEquals(longArray56, longArray60);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray35, longArray56);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray66, longArray67);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray66, longArray71);
        long[] longArray75 = new long[] {};
        long[] longArray76 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray75, longArray76);
        long[] longArray79 = new long[] {};
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray79, longArray80);
        org.junit.Assert.assertArrayEquals(longArray75, longArray80);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray66, longArray75);
        long[] longArray85 = new long[] {};
        long[] longArray86 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray85, longArray86);
        long[] longArray89 = new long[] {};
        long[] longArray90 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray89, longArray90);
        org.junit.Assert.assertArrayEquals(longArray86, longArray90);
        org.junit.Assert.assertArrayEquals(longArray75, longArray90);
        org.junit.Assert.assertArrayEquals(longArray56, longArray75);
        org.junit.Assert.assertArrayEquals(longArray14, longArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) longArray14);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 100);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray12, longArray17);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray8, longArray17);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray23, longArray24);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray23, longArray28);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray32, longArray33);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray36, longArray37);
        org.junit.Assert.assertArrayEquals(longArray32, longArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray23, longArray32);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray42, longArray43);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray46, longArray47);
        org.junit.Assert.assertArrayEquals(longArray43, longArray47);
        org.junit.Assert.assertArrayEquals(longArray32, longArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray17, longArray47);
        java.lang.Object obj52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray17, obj52);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray12, longArray17);
        org.junit.Assert.assertArrayEquals(longArray8, longArray17);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) longArray17);
        java.lang.Object obj23 = null;
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray25, longArray30);
        org.junit.Assert.assertNotEquals("tests.weekly", obj23, (java.lang.Object) longArray25);
        org.junit.Assert.assertArrayEquals(longArray17, longArray25);
        long[] longArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray17, longArray35);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) ' ', (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        int[] intArray0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 1, (long) 3);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 10L);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 100, (float) (short) 0, (float) 3);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        java.lang.Object obj11 = null;
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray18);
        org.junit.Assert.assertNotEquals("tests.weekly", obj11, (java.lang.Object) longArray13);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray24, longArray29);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray33, longArray34);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray33, longArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray29, longArray38);
        org.junit.Assert.assertArrayEquals(longArray13, longArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray7, longArray29);
        long[] longArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray29, longArray44);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray31);
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertNotNull("random", (java.lang.Object) executorServiceArray46);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) strArray58);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        short[] shortArray4 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray5 = new short[][] { shortArray4 };
        java.util.Set<short[]> shortArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray5);
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) shortArray5);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray11, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray23);
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest47.ruleChain;
        synonymsAnalysisTest47.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest47.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray40, (java.lang.Object) synonymsAnalysisTest47);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray70);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray5, (java.lang.Object[]) executorServiceArray57);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray23, (float) 100);
        float[] floatArray32 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray37 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray37, (float) (byte) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray49, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray49, (float) (short) 0);
        float[] floatArray60 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray65 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray65, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray49, floatArray60, (float) (byte) 100);
        float[] floatArray74 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray79 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray79, (float) (byte) 100);
        float[] floatArray86 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray91 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray86, floatArray91, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray91, (float) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray60, floatArray91, 0.0f);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 100.0d, (double) 1);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 4, (float) (short) 100, (float) 0L);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (short) -1, (double) (short) 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain7;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest10.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        synonymsAnalysisTest12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest16.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain19;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        java.lang.String str24 = synonymsAnalysisTest21.getTestName();
        synonymsAnalysisTest21.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest21.failureAndSuccessEvents;
        java.lang.String str27 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest28.ruleChain;
        synonymsAnalysisTest28.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str32 = synonymsAnalysisTest31.getTestName();
        java.lang.String str33 = synonymsAnalysisTest31.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain37;
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain37;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain37;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain37;
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) synonymsAnalysisTest12);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("", indexReader45, (int) (byte) 0, postingsEnum47, postingsEnum48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum47);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 100, (double) 100, (double) (byte) 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        java.lang.Object obj2 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.maxfailures", indexReader7, fields8, fields9, true);
        java.lang.String str12 = synonymsAnalysisTest3.getTestName();
        synonymsAnalysisTest3.tearDown();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.nightly", obj2, (java.lang.Object) synonymsAnalysisTest3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray14);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray25);
        java.lang.Object obj28 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray25, obj28);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray32, shortArray37);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray25, shortArray42);
        org.junit.Assert.assertArrayEquals("", shortArray14, shortArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) shortArray14);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray9 = new char[] { '#' };
        char[] charArray11 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray9, charArray14);
        org.junit.Assert.assertArrayEquals(charArray5, charArray14);
        char[] charArray22 = new char[] { '#' };
        char[] charArray24 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray22, charArray24);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        org.junit.Assert.assertArrayEquals(charArray24, charArray27);
        char[] charArray33 = new char[] { '#' };
        char[] charArray35 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray35);
        char[] charArray38 = new char[] { '#' };
        char[] charArray40 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        char[] charArray43 = new char[] { '#' };
        char[] charArray45 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        org.junit.Assert.assertArrayEquals(charArray40, charArray45);
        org.junit.Assert.assertArrayEquals(charArray35, charArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray27, charArray35);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        org.junit.Assert.assertArrayEquals(charArray55, charArray60);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray55);
        org.junit.Assert.assertArrayEquals(charArray27, charArray55);
        char[] charArray68 = new char[] { '#' };
        char[] charArray70 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray68, charArray70);
        char[] charArray73 = new char[] { '#' };
        char[] charArray75 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray73, charArray75);
        org.junit.Assert.assertArrayEquals(charArray70, charArray75);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray70);
        org.junit.Assert.assertArrayEquals(charArray55, charArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray14, charArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) charArray14);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 'a', (-1.0d));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        char[] charArray5 = new char[] { '#' };
        char[] charArray7 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
        char[] charArray10 = new char[] { '#' };
        char[] charArray12 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray12);
        org.junit.Assert.assertArrayEquals(charArray7, charArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charArray10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertPathHasBeenCleared("");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray25);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray33);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("", intArray25, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray16, intArray37);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray7, intArray37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        synonymsAnalysisTest43.assertTermsEquals("europarl.lines.txt.gz", indexReader45, terms46, terms47, false);
        synonymsAnalysisTest43.setIndexWriterMaxDocs(1);
        java.lang.String str52 = synonymsAnalysisTest43.getTestName();
        java.lang.String str53 = synonymsAnalysisTest43.getTestName();
        synonymsAnalysisTest43.restoreIndexWriterMaxDocs();
        java.lang.String str55 = synonymsAnalysisTest43.getTestName();
        synonymsAnalysisTest43.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) intArray7, (java.lang.Object) synonymsAnalysisTest43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str4 = synonymsAnalysisTest3.getTestName();
        java.lang.String str5 = synonymsAnalysisTest3.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest3.assertPositionsSkippingEquals("", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest3);
        java.lang.Object obj17 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest3, obj17);
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest3.ruleChain;
        java.lang.String str21 = synonymsAnalysisTest3.getTestName();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest3.assertPositionsSkippingEquals("tests.failfast", indexReader23, (int) (byte) 1, postingsEnum25, postingsEnum26);
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        synonymsAnalysisTest3.assertFieldsEquals("tests.maxfailures", indexReader30, fields31, fields32, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest35.ruleChain;
        synonymsAnalysisTest35.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain38;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str42 = synonymsAnalysisTest41.getTestName();
        java.lang.String str43 = synonymsAnalysisTest41.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule45 = synonymsAnalysisTest44.ruleChain;
        synonymsAnalysisTest44.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest44.failureAndSuccessEvents;
        synonymsAnalysisTest41.failureAndSuccessEvents = ruleChain47;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        synonymsAnalysisTest41.assertTermsEquals("tests.maxfailures", indexReader50, terms51, terms52, false);
        java.lang.Class<?> wildcardClass55 = synonymsAnalysisTest41.getClass();
        java.lang.Class[] classArray57 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass55;
        java.util.Set<java.lang.Class<?>> wildcardClassSet61 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray58);
        java.util.List<java.lang.reflect.Type> typeList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain38, (java.lang.Object) typeList62);
        java.lang.Class<?> wildcardClass64 = ruleChain38.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) wildcardClass64);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 'a', (double) 100L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) (byte) 10, (float) 0, 1.0f);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray22, (float) 100);
        float[] floatArray31 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray36 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (byte) 100);
        float[] floatArray43 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray48 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray31, 1.0f);
        float[] floatArray59 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray64 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray64, (float) (byte) 100);
        float[] floatArray71 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray76 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray76, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray76, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray59, (float) 1);
        float[] floatArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray83, (float) 100);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray9);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray15, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray20);
        short[] shortArray30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray20, shortArray30);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest3.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("tests.maxfailures", indexReader11, (-1), postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest0, synonymsAnalysisTest3 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet18 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray17);
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray21 = new java.lang.CharSequence[][][] { charSequenceArray20 };
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray23 = new java.lang.CharSequence[][][] { charSequenceArray22 };
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray25 = new java.lang.CharSequence[][][] { charSequenceArray24 };
        java.lang.CharSequence[][] charSequenceArray26 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray27 = new java.lang.CharSequence[][][] { charSequenceArray26 };
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray29 = new java.lang.CharSequence[][][] { charSequenceArray28 };
        java.lang.CharSequence[][] charSequenceArray30 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray31 = new java.lang.CharSequence[][][] { charSequenceArray30 };
        java.lang.CharSequence[][][][] charSequenceArray32 = new java.lang.CharSequence[][][][] { charSequenceArray21, charSequenceArray23, charSequenceArray25, charSequenceArray27, charSequenceArray29, charSequenceArray31 };
        java.util.List<java.lang.CharSequence[][][]> charSequenceArrayList33 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, charSequenceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) synonymsAnalysisTestArray17, (java.lang.Object[]) charSequenceArray32);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 100);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray3, (java.lang.Object) 100L);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray17, (java.lang.Object) synonymsAnalysisTest24);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) "tests.badapples", (java.lang.Object) synonymsAnalysisTest24);
        synonymsAnalysisTest24.setIndexWriterMaxDocs((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest24);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1L), (double) 100L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 5, (long) (short) 100);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (-1L), (long) (-1));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) ' ', postingsEnum21, postingsEnum22, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("random", 100, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        float[] floatArray7 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray12 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray12, (float) (byte) 100);
        float[] floatArray19 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray24 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray24, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray24, 10.0f);
        float[] floatArray33 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray38 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray38, (float) (byte) 100);
        float[] floatArray45 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray50 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray50, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray24, floatArray50, (float) 10);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) floatArray24);
        float[] floatArray62 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray67 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray67, (float) (byte) 100);
        float[] floatArray74 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray79 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray79, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray74, (float) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray24, floatArray74, (float) 0L);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest15.ruleChain;
        synonymsAnalysisTest15.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest15.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray8, (java.lang.Object) synonymsAnalysisTest15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        synonymsAnalysisTest20.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, false);
        synonymsAnalysisTest20.ensureAllSearchContextsReleased();
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest20.resetCheckIndexStatus();
        synonymsAnalysisTest20.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest64.ruleChain;
        synonymsAnalysisTest64.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest64.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray57, (java.lang.Object) synonymsAnalysisTest64);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray79);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray57);
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        short[] shortArray89 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray90 = new short[][] { shortArray89 };
        java.util.Set<short[]> shortArraySet91 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray90);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) shortArray90);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain13;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        java.lang.String str18 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest16.assertTermsEquals("tests.maxfailures", indexReader25, terms26, terms27, false);
        java.lang.Class<?> wildcardClass30 = synonymsAnalysisTest16.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.util.Set<java.lang.Class<?>> wildcardClassSet36 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray33);
        java.util.List<java.lang.reflect.Type> typeList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain13, (java.lang.Object) typeList37);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain13;
        org.junit.rules.RuleChain ruleChain40 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.nightly", indexReader42, terms43, terms44, true);
        float[] floatArray51 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray56 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray56, (float) (byte) 100);
        float[] floatArray63 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray68 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray68, (float) (byte) 100);
        float[] floatArray75 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray80 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray80, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray80, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray63, 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms43, (java.lang.Object) 100.0f);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, (double) 5);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) -1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        java.lang.Class<?> wildcardClass7 = synonymsAnalysisTest1.getClass();
        char[] charArray14 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray26 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray27 = new char[][] { charArray14, charArray20, charArray26 };
        java.util.Set<char[]> charArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(charArray27);
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) charArray27);
        java.util.List<char[]> charArrayList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, charArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) wildcardClass7, (java.lang.Object) (short) 1);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule61 = synonymsAnalysisTest60.ruleChain;
        synonymsAnalysisTest60.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain63 = synonymsAnalysisTest60.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray53, (java.lang.Object) synonymsAnalysisTest60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) executorServiceArray19, (java.lang.Object) executorServiceArray53);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 'a');
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) (byte) 1, (double) 1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray22, (float) 100);
        float[] floatArray31 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray36 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (byte) 100);
        float[] floatArray43 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray48 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray48, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) floatArray22);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1.0f), (float) ' ', (float) 6);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 5);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader18, 100, postingsEnum20, postingsEnum21, false);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest25.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("tests.maxfailures", indexReader33, (-1), postingsEnum35, postingsEnum36, true);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str41 = synonymsAnalysisTest40.getTestName();
        java.lang.String str42 = synonymsAnalysisTest40.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule44 = synonymsAnalysisTest43.ruleChain;
        synonymsAnalysisTest43.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain46 = synonymsAnalysisTest43.failureAndSuccessEvents;
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain46;
        synonymsAnalysisTest25.failureAndSuccessEvents = ruleChain46;
        org.junit.rules.TestRule testRule49 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.setIndexWriterMaxDocs((int) 'a');
        synonymsAnalysisTest25.ensureAllSearchContextsReleased();
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.TestRule testRule54 = synonymsAnalysisTest25.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray13);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray13, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray20);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray33);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray44, byteArray51);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray55);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray63, byteArray64);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray68);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray73, byteArray74);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray78);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray82, byteArray83);
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray85);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray78, byteArray85);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray64, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray55, byteArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray4, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (byte) 1, (float) (byte) 10, (float) (short) -1);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest14);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest14.assertFieldsEquals("europarl.lines.txt.gz", indexReader20, fields21, fields22, false);
        synonymsAnalysisTest14.setIndexWriterMaxDocs((int) (short) 0);
        synonymsAnalysisTest14.setIndexWriterMaxDocs(5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 0, (double) 'a');
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest39.ruleChain;
        synonymsAnalysisTest39.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) boolean38, (java.lang.Object) synonymsAnalysisTest39);
        synonymsAnalysisTest39.ensureCheckIndexPassed();
        synonymsAnalysisTest39.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest39.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum46, postingsEnum47);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray3, doubleArray6, 10.0d);
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray17, (double) (byte) -1);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray27, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray13, doubleArray27, (double) 0L);
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray27, (double) 10);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str44 = synonymsAnalysisTest43.getTestName();
        java.lang.String str45 = synonymsAnalysisTest43.getTestName();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest43.assertPositionsSkippingEquals("", indexReader47, (int) ' ', postingsEnum49, postingsEnum50);
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest43.failureAndSuccessEvents;
        synonymsAnalysisTest43.ensureCleanedUp();
        double[] doubleArray54 = new double[] {};
        double[] doubleArray55 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray55, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest43, (java.lang.Object) doubleArray55);
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) (byte) 1);
        double[] doubleArray64 = new double[] {};
        double[] doubleArray65 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray65, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray64, (double) (byte) -1);
        double[] doubleArray70 = new double[] {};
        double[] doubleArray71 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray71, (double) (byte) 1);
        double[] doubleArray74 = new double[] {};
        double[] doubleArray75 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray74, doubleArray75, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray70, doubleArray74, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray60, doubleArray74, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray55, doubleArray74, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray39, doubleArray55, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray55, (double) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) doubleArray55);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (byte) 10, (float) (byte) 0, (float) 1L);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 0L, (double) 3);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) 1, 1.0d, (double) 100L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        char[] charArray6 = new char[] { 'a', '4', ' ', ' ', '#' };
        char[] charArray11 = new char[] { '#' };
        char[] charArray13 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray13);
        char[] charArray16 = new char[] { '#' };
        char[] charArray18 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray16, charArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray11, charArray16);
        char[] charArray22 = new char[] { '#' };
        char[] charArray24 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray22, charArray24);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        org.junit.Assert.assertArrayEquals(charArray24, charArray29);
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        org.junit.Assert.assertArrayEquals("", charArray11, charArray29);
        char[] charArray37 = new char[] { '#' };
        char[] charArray39 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        org.junit.Assert.assertArrayEquals(charArray11, charArray39);
        char[] charArray43 = new char[] { '#' };
        char[] charArray45 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        char[] charArray48 = new char[] { '#' };
        char[] charArray50 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray48, charArray50);
        org.junit.Assert.assertArrayEquals(charArray45, charArray50);
        org.junit.Assert.assertArrayEquals("hi!", charArray39, charArray50);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        char[] charArray65 = new char[] { '#' };
        char[] charArray67 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        org.junit.Assert.assertArrayEquals(charArray62, charArray67);
        org.junit.Assert.assertArrayEquals(charArray57, charArray62);
        org.junit.Assert.assertArrayEquals(charArray50, charArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray57);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest11.assertPositionsSkippingEquals("", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest11.ensureCleanedUp();
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) doubleArray23);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        double[] doubleArray32 = new double[] {};
        double[] doubleArray33 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray33, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray32, (double) (byte) -1);
        double[] doubleArray38 = new double[] {};
        double[] doubleArray39 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray39, (double) (byte) 1);
        double[] doubleArray42 = new double[] {};
        double[] doubleArray43 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray43, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray42, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray28, doubleArray42, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray23, doubleArray42, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray7, doubleArray23, 100.0d);
        org.junit.Assert.assertArrayEquals("random", doubleArray2, doubleArray7, 10.0d);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray56, 10.0d);
        double[] doubleArray62 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray62, (double) '4');
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray33, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray61);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) executorServiceArray2);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain11 = null;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, true);
        synonymsAnalysisTest10.setUp();
        synonymsAnalysisTest10.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest10);
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str24 = synonymsAnalysisTest23.getTestName();
        java.lang.String str25 = synonymsAnalysisTest23.getTestName();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("", indexReader27, (int) ' ', postingsEnum29, postingsEnum30);
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest23.assertPositionsSkippingEquals("tests.maxfailures", indexReader35, 4, postingsEnum37, postingsEnum38);
        synonymsAnalysisTest23.setUp();
        synonymsAnalysisTest23.assertPathHasBeenCleared("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest10, (java.lang.Object) synonymsAnalysisTest23);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest2);
        java.lang.Class<?> wildcardClass7 = synonymsAnalysisTest2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest8.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, false);
        synonymsAnalysisTest8.setIndexWriterMaxDocs(1);
        java.lang.String str17 = synonymsAnalysisTest8.getTestName();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest8.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule18;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) testRule18);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.slow", postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) ' ', postingsEnum12, postingsEnum13);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest12.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        synonymsAnalysisTest12.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        synonymsAnalysisTest22.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest22.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain25;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str29 = synonymsAnalysisTest28.getTestName();
        java.lang.String str30 = synonymsAnalysisTest28.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest31.failureAndSuccessEvents;
        synonymsAnalysisTest28.failureAndSuccessEvents = ruleChain34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        synonymsAnalysisTest28.assertTermsEquals("tests.maxfailures", indexReader37, terms38, terms39, false);
        java.lang.Class<?> wildcardClass42 = synonymsAnalysisTest28.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.util.Set<java.lang.Class<?>> wildcardClassSet48 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray45);
        java.util.List<java.lang.reflect.Type> typeList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain25, (java.lang.Object) typeList49);
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain25;
        org.junit.rules.RuleChain ruleChain52 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain52;
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", (-1), numericDocValues56, numericDocValues57);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (short) 1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        synonymsAnalysisTest20.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31, true);
        synonymsAnalysisTest20.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str36 = synonymsAnalysisTest35.getTestName();
        java.lang.String str37 = synonymsAnalysisTest35.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest38.ruleChain;
        synonymsAnalysisTest38.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain41 = synonymsAnalysisTest38.failureAndSuccessEvents;
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain41;
        synonymsAnalysisTest20.failureAndSuccessEvents = ruleChain41;
        org.junit.rules.TestRule testRule44 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.tearDown();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("tests.awaitsfix", indexReader47, (int) (short) 0, postingsEnum49, postingsEnum50);
        java.lang.String str52 = synonymsAnalysisTest20.getTestName();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        synonymsAnalysisTest20.assertFieldsEquals("tests.awaitsfix", indexReader54, fields55, fields56, true);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        synonymsAnalysisTest20.assertDocsSkippingEquals("<unknown>", indexReader60, (int) (byte) 1, postingsEnum62, postingsEnum63, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) -1, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) ' ');
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setUp();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule4);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray8, byteArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray8);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        java.lang.Object obj1 = null;
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray18, (double) (byte) -1);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray28, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray14, doubleArray28, (double) 0L);
        double[] doubleArray37 = new double[] {};
        double[] doubleArray38 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray38, (double) (byte) 1);
        double[] doubleArray41 = new double[] {};
        double[] doubleArray42 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray42, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray41, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str48 = synonymsAnalysisTest47.getTestName();
        java.lang.String str49 = synonymsAnalysisTest47.getTestName();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest47.assertPositionsSkippingEquals("", indexReader51, (int) ' ', postingsEnum53, postingsEnum54);
        org.junit.rules.RuleChain ruleChain56 = synonymsAnalysisTest47.failureAndSuccessEvents;
        synonymsAnalysisTest47.ensureCleanedUp();
        double[] doubleArray58 = new double[] {};
        double[] doubleArray59 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray59, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest47, (java.lang.Object) doubleArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray37, doubleArray59, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray14, doubleArray37, (double) 'a');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray14, (double) 0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", obj1, (java.lang.Object) doubleArray14);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) '4', (long) 100);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, (int) (short) 100, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest11.ruleChain;
        synonymsAnalysisTest11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest11.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain14);
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain14;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) ruleChain14);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
        char[] charArray16 = new char[] { '#' };
        char[] charArray18 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray16, charArray18);
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        org.junit.Assert.assertArrayEquals(charArray18, charArray23);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray18);
        org.junit.Assert.assertArrayEquals(charArray5, charArray18);
        char[] charArray29 = new char[] { '#' };
        char[] charArray31 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray31);
        char[] charArray34 = new char[] { '#' };
        char[] charArray36 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray36);
        org.junit.Assert.assertArrayEquals(charArray31, charArray34);
        char[] charArray40 = new char[] { '#' };
        char[] charArray42 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        char[] charArray45 = new char[] { '#' };
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        org.junit.Assert.assertArrayEquals(charArray42, charArray47);
        org.junit.Assert.assertArrayEquals(charArray34, charArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray18, charArray34);
        char[] charArray54 = new char[] { '#' };
        char[] charArray56 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray54, charArray56);
        char[] charArray59 = new char[] { '#' };
        char[] charArray61 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray59, charArray61);
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        char[] charArray65 = new char[] { '#' };
        char[] charArray67 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        char[] charArray70 = new char[] { '#' };
        char[] charArray72 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        char[] charArray75 = new char[] { '#' };
        char[] charArray77 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray75, charArray77);
        org.junit.Assert.assertArrayEquals(charArray72, charArray77);
        org.junit.Assert.assertArrayEquals(charArray67, charArray72);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray59, charArray67);
        org.junit.Assert.assertArrayEquals(charArray18, charArray67);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest83 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        synonymsAnalysisTest83.assertTermsEquals("europarl.lines.txt.gz", indexReader85, terms86, terms87, false);
        synonymsAnalysisTest83.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain92 = synonymsAnalysisTest83.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule93 = synonymsAnalysisTest83.ruleChain;
        synonymsAnalysisTest83.ensureAllSearchContextsReleased();
        synonymsAnalysisTest83.overrideTestDefaultQueryCache();
        synonymsAnalysisTest83.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule97 = synonymsAnalysisTest83.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) charArray67, (java.lang.Object) synonymsAnalysisTest83);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 100);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1L), 100L);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
        long[] longArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        float[] floatArray1 = null;
        float[] floatArray7 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray12 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray12, (float) (byte) 100);
        float[] floatArray19 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray24 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray24, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray24, (float) 100);
        float[] floatArray33 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray38 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray38, (float) (byte) 100);
        float[] floatArray45 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray50 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray50, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray50, (float) (short) 0);
        float[] floatArray61 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray66 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray66, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray50, floatArray61, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray50, (float) (byte) 10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) (-1L), (double) 4);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain13 = null;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain13;
        java.lang.String str15 = synonymsAnalysisTest12.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) (short) 100, (double) 100);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set[] setArray32 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray33 = (java.util.Set<java.lang.String>[]) setArray32;
        strSetArray33[0] = strSet5;
        strSetArray33[1] = strSet10;
        strSetArray33[2] = strSet15;
        strSetArray33[3] = strSet20;
        strSetArray33[4] = strSet25;
        strSetArray33[5] = strSet30;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray33);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) strSetArray33);
        java.lang.CharSequence[][] charSequenceArray48 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray49 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray50 = new java.lang.CharSequence[][][] { charSequenceArray48, charSequenceArray49 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray33, (java.lang.Object[]) charSequenceArray50);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, (int) ' ', postingsEnum7, postingsEnum8);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        java.lang.String str15 = synonymsAnalysisTest12.getTestName();
        synonymsAnalysisTest12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest12.failureAndSuccessEvents;
        java.lang.String str18 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        java.lang.String str24 = synonymsAnalysisTest22.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest25.failureAndSuccessEvents;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain28;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain28;
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) synonymsAnalysisTest1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "<unknown>");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", 0.0d, 1.0d, 1.0d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 100.0f, (float) (short) -1, (float) 6);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray8, obj11);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray15, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray8, shortArray25);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray31, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray46);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray51);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray57);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray61, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray61, shortArray66);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray66);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray51);
        short[] shortArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray78);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 10L, (long) 'a');
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray2);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray6, shortArray11);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray11);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        synonymsAnalysisTest21.tearDown();
        synonymsAnalysisTest21.ensureCleanedUp();
        java.lang.String str26 = synonymsAnalysisTest21.getTestName();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray11, (java.lang.Object) testRule28);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest11.assertPositionsSkippingEquals("", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest11.ensureCleanedUp();
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) doubleArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray23, (double) '#');
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) (byte) 1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray31, doubleArray34, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray34, (double) 2);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest42 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain43 = null;
        synonymsAnalysisTest42.failureAndSuccessEvents = ruleChain43;
        synonymsAnalysisTest42.resetCheckIndexStatus();
        java.lang.String str46 = synonymsAnalysisTest42.getTestName();
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest42.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArray34, (java.lang.Object) ruleChain47);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, (int) ' ', postingsEnum7, postingsEnum8);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest12.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        synonymsAnalysisTest12.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        synonymsAnalysisTest12.assertTermsEquals("", indexReader23, terms24, terms25, true);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        synonymsAnalysisTest29.assertTermsEquals("europarl.lines.txt.gz", indexReader31, terms32, terms33, false);
        synonymsAnalysisTest29.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        synonymsAnalysisTest41.assertTermsEquals("europarl.lines.txt.gz", indexReader43, terms44, terms45, false);
        synonymsAnalysisTest41.ensureAllSearchContextsReleased();
        synonymsAnalysisTest41.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str51 = synonymsAnalysisTest41.getTestName();
        java.lang.String str52 = synonymsAnalysisTest41.getTestName();
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest41.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain53;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain53;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain57 = null;
        synonymsAnalysisTest56.failureAndSuccessEvents = ruleChain57;
        java.lang.String str59 = synonymsAnalysisTest56.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        synonymsAnalysisTest56.assertDocsEnumEquals("<unknown>", postingsEnum61, postingsEnum62, false);
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest56.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain53, (java.lang.Object) synonymsAnalysisTest56);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 6, (double) 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest2.assertPositionsSkippingEquals("", indexReader6, (int) ' ', postingsEnum8, postingsEnum9);
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest2.failureAndSuccessEvents;
        synonymsAnalysisTest2.ensureCleanedUp();
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray14, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) doubleArray14);
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) (byte) 1);
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray23, (double) (byte) -1);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray33, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray19, doubleArray33, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray14, doubleArray33, (double) (short) 0);
        double[] doubleArray44 = new double[] {};
        double[] doubleArray45 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray45, (double) (byte) 1);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray49 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray49, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray48, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str55 = synonymsAnalysisTest54.getTestName();
        java.lang.String str56 = synonymsAnalysisTest54.getTestName();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        synonymsAnalysisTest54.assertPositionsSkippingEquals("", indexReader58, (int) ' ', postingsEnum60, postingsEnum61);
        org.junit.rules.RuleChain ruleChain63 = synonymsAnalysisTest54.failureAndSuccessEvents;
        synonymsAnalysisTest54.ensureCleanedUp();
        double[] doubleArray65 = new double[] {};
        double[] doubleArray66 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray66, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest54, (java.lang.Object) doubleArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray44, doubleArray66, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray14, doubleArray44, (double) 6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray44);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray1, longArray2);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray10, longArray11);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        org.junit.Assert.assertArrayEquals(longArray10, longArray15);
        org.junit.Assert.assertArrayEquals(longArray6, longArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        synonymsAnalysisTest21.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest19, (java.lang.Object) synonymsAnalysisTest21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray6, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(2);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        long[] longArray0 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray18);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray9, longArray18);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray24, longArray29);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray33, longArray34);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray33, longArray38);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray24, longArray33);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray43, longArray44);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray47, longArray48);
        org.junit.Assert.assertArrayEquals(longArray44, longArray48);
        org.junit.Assert.assertArrayEquals(longArray33, longArray48);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray18, longArray48);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray55, longArray56);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        org.junit.Assert.assertArrayEquals(longArray55, longArray60);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray64, longArray65);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray68, longArray69);
        org.junit.Assert.assertArrayEquals(longArray64, longArray69);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray60, longArray69);
        org.junit.Assert.assertArrayEquals(longArray48, longArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray48);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray20, intArray23);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray28, intArray31);
        org.junit.Assert.assertArrayEquals(intArray23, intArray28);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray38, intArray41);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray46, intArray49);
        org.junit.Assert.assertArrayEquals("", intArray41, intArray49);
        org.junit.Assert.assertArrayEquals(intArray23, intArray41);
        org.junit.Assert.assertArrayEquals(intArray11, intArray41);
        int[] intArray55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray41, intArray55);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ' ');
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) (short) 0, (double) (-1L), (double) 100);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        java.lang.String str8 = synonymsAnalysisTest6.getTestName();
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest6.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest6.tearDown();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest6);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest6.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest6.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) 'a', (float) 4);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        synonymsAnalysisTest12.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, false);
        synonymsAnalysisTest12.overrideTestDefaultQueryCache();
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) strArray23);
        synonymsAnalysisTest12.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest12);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest12.assertTermsEquals("tests.maxfailures", indexReader29, terms30, terms31, true);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest12.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.monster", indexReader7, (-1), postingsEnum9, postingsEnum10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 3, (double) ' ');
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0L, (long) 6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (-1));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest12.ensureCleanedUp();
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) doubleArray24);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        double[] doubleArray33 = new double[] {};
        double[] doubleArray34 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray34, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray33, (double) (byte) -1);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        double[] doubleArray43 = new double[] {};
        double[] doubleArray44 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray44, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray43, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray29, doubleArray43, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray24, doubleArray43, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray8, doubleArray24, 100.0d);
        org.junit.Assert.assertArrayEquals("random", doubleArray3, doubleArray8, 10.0d);
        double[] doubleArray57 = new double[] {};
        double[] doubleArray58 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray58, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray3, doubleArray57, (double) (byte) 0);
        double[] doubleArray64 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray64, 10.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        char[] charArray1 = new char[] { '#' };
        char[] charArray3 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
        char[] charArray7 = new char[] { '#' };
        char[] charArray9 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray7, charArray9);
        char[] charArray13 = new char[] { '#' };
        char[] charArray15 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray15);
        char[] charArray18 = new char[] { '#' };
        char[] charArray20 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray13, charArray18);
        org.junit.Assert.assertArrayEquals(charArray9, charArray18);
        char[] charArray25 = new char[] { '#' };
        char[] charArray27 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        char[] charArray31 = new char[] { '#' };
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        char[] charArray36 = new char[] { '#' };
        char[] charArray38 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray31, charArray36);
        org.junit.Assert.assertArrayEquals(charArray27, charArray36);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray9, charArray27);
        char[] charArray45 = new char[] { '#' };
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        char[] charArray50 = new char[] { '#' };
        char[] charArray52 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray50, charArray52);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray62);
        org.junit.Assert.assertArrayEquals(charArray52, charArray57);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray47, charArray52);
        org.junit.Assert.assertArrayEquals(charArray27, charArray52);
        org.junit.Assert.assertArrayEquals(charArray1, charArray27);
        char[] charArray75 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray27, charArray75);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.monster", (int) (byte) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray8, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray4, doubleArray7, 10.0d);
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray19, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray18, (double) (byte) -1);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        double[] doubleArray28 = new double[] {};
        double[] doubleArray29 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray29, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray28, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray14, doubleArray28, (double) 0L);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray14, (double) 5);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray41, intArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest47 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        synonymsAnalysisTest47.assertTermsEquals("europarl.lines.txt.gz", indexReader49, terms50, terms51, false);
        synonymsAnalysisTest47.setIndexWriterMaxDocs(1);
        java.lang.String str56 = synonymsAnalysisTest47.getTestName();
        java.lang.String str57 = synonymsAnalysisTest47.getTestName();
        synonymsAnalysisTest47.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray41, (java.lang.Object) synonymsAnalysisTest47);
        synonymsAnalysisTest47.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "", (java.lang.Object) synonymsAnalysisTest47);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 2, 10.0f, (float) 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest2.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        synonymsAnalysisTest2.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("random", indexReader13, (int) (short) 10, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest2.assertDocsSkippingEquals("tests.nightly", indexReader20, (int) ' ', postingsEnum22, postingsEnum23, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        synonymsAnalysisTest2.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        synonymsAnalysisTest2.assertFieldsEquals("enwiki.random.lines.txt", indexReader34, fields35, fields36, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        synonymsAnalysisTest39.assertTermsEquals("europarl.lines.txt.gz", indexReader41, terms42, terms43, false);
        synonymsAnalysisTest39.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        synonymsAnalysisTest39.assertPositionsSkippingEquals("tests.nightly", indexReader49, 0, postingsEnum51, postingsEnum52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) false, (java.lang.Object) synonymsAnalysisTest39);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "tests.maxfailures" };
        java.util.Set<java.lang.CharSequence> charSequenceSet5 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        synonymsAnalysisTest6.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest6.resetCheckIndexStatus();
        synonymsAnalysisTest6.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) charSequenceArray4, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray45);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        java.lang.String[] strArray76 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray81);
        java.util.Set[] setArray84 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray85 = (java.util.Set<java.lang.String>[]) setArray84;
        strSetArray85[0] = strSet57;
        strSetArray85[1] = strSet62;
        strSetArray85[2] = strSet67;
        strSetArray85[3] = strSet72;
        strSetArray85[4] = strSet77;
        strSetArray85[5] = strSet82;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet98 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) strSetArray85);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray3);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 3, (long) '4');
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader5, (-1), postingsEnum7, postingsEnum8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str20 = synonymsAnalysisTest19.getTestName();
        java.lang.String str21 = synonymsAnalysisTest19.getTestName();
        java.lang.String str22 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest19.failureAndSuccessEvents;
        java.lang.String str25 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest26.ruleChain;
        synonymsAnalysisTest26.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str30 = synonymsAnalysisTest29.getTestName();
        java.lang.String str31 = synonymsAnalysisTest29.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest32.ruleChain;
        synonymsAnalysisTest32.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest3.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, false);
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest3.resetCheckIndexStatus();
        synonymsAnalysisTest3.ensureCleanedUp();
        synonymsAnalysisTest3.tearDown();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest3.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) locale2, (java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.setUp();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str9 = synonymsAnalysisTest8.getTestName();
        java.lang.String str10 = synonymsAnalysisTest8.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("", indexReader12, (int) ' ', postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest8.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest8.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str20 = synonymsAnalysisTest19.getTestName();
        java.lang.String str21 = synonymsAnalysisTest19.getTestName();
        java.lang.String str22 = synonymsAnalysisTest19.getTestName();
        synonymsAnalysisTest19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest19.failureAndSuccessEvents;
        java.lang.String str25 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule27 = synonymsAnalysisTest26.ruleChain;
        synonymsAnalysisTest26.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str30 = synonymsAnalysisTest29.getTestName();
        java.lang.String str31 = synonymsAnalysisTest29.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest32.ruleChain;
        synonymsAnalysisTest32.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest26.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain35;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain35;
        java.lang.Object obj40 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain35, obj40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) ruleChain7, obj40);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader11, 0, postingsEnum13, postingsEnum14);
        java.lang.String str16 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        java.util.Set[] setArray49 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray50 = (java.util.Set<java.lang.String>[]) setArray49;
        strSetArray50[0] = strSet22;
        strSetArray50[1] = strSet27;
        strSetArray50[2] = strSet32;
        strSetArray50[3] = strSet37;
        strSetArray50[4] = strSet42;
        strSetArray50[5] = strSet47;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) strSetArray50);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 1.0d, (double) (short) 1);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) '4');
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) ' ');
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 100L, (double) (short) 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (-1), (float) 100, (-1.0f));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray9, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray20);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray28);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray28, byteArray37);
        byte[] byteArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray37, byteArray43);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        java.lang.String str8 = synonymsAnalysisTest6.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        synonymsAnalysisTest9.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest6.failureAndSuccessEvents = ruleChain12;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest6.assertTermsEquals("tests.maxfailures", indexReader15, terms16, terms17, false);
        java.lang.Class<?> wildcardClass20 = synonymsAnalysisTest6.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass20;
        java.util.Set<java.lang.Class<?>> wildcardClassSet26 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray23);
        java.util.List<java.lang.reflect.Type> typeList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain3, (java.lang.Object) typeList27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        synonymsAnalysisTest29.assertTermsEquals("europarl.lines.txt.gz", indexReader31, terms32, terms33, false);
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.overrideTestDefaultQueryCache();
        synonymsAnalysisTest29.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest39.ruleChain;
        synonymsAnalysisTest39.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain42;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str46 = synonymsAnalysisTest45.getTestName();
        java.lang.String str47 = synonymsAnalysisTest45.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule49 = synonymsAnalysisTest48.ruleChain;
        synonymsAnalysisTest48.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest48.failureAndSuccessEvents;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain51;
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        synonymsAnalysisTest45.assertTermsEquals("tests.maxfailures", indexReader54, terms55, terms56, false);
        java.lang.Class<?> wildcardClass59 = synonymsAnalysisTest45.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        wildcardClassArray62[0] = wildcardClass59;
        java.util.Set<java.lang.Class<?>> wildcardClassSet65 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray62);
        java.util.List<java.lang.reflect.Type> typeList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain42, (java.lang.Object) typeList66);
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) typeList27, (java.lang.Object) ruleChain42);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain22);
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain22;
        java.lang.String str25 = synonymsAnalysisTest14.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest26 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str27 = synonymsAnalysisTest26.getTestName();
        java.lang.String str28 = synonymsAnalysisTest26.getTestName();
        synonymsAnalysisTest26.tearDown();
        synonymsAnalysisTest26.ensureCleanedUp();
        java.lang.String str31 = synonymsAnalysisTest26.getTestName();
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest26.failureAndSuccessEvents;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain32;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest34.assertTermsEquals("europarl.lines.txt.gz", indexReader36, terms37, terms38, false);
        synonymsAnalysisTest34.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        synonymsAnalysisTest34.assertFieldsEquals("hi!", indexReader43, fields44, fields45, true);
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest34.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) ruleChain32, (java.lang.Object) ruleChain48);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", 1.0d, (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest8.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, false);
        synonymsAnalysisTest8.ensureAllSearchContextsReleased();
        synonymsAnalysisTest8.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest8.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest8.assertFieldsEquals("", indexReader20, fields21, fields22, true);
        synonymsAnalysisTest8.ensureCheckIndexPassed();
        synonymsAnalysisTest8.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest8.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray22, (float) 100);
        float[] floatArray31 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray36 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (byte) 100);
        float[] floatArray43 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray48 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray5, floatArray31, 1.0f);
        float[] floatArray59 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray64 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray64, (float) (byte) 100);
        float[] floatArray71 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray76 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray76, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray76, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray59, (float) 1);
        float[] floatArray89 = new float[] { 5, '#', 1L, 1, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray89, (float) (short) 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader15, (int) 'a', postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray9, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray20);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray33);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray43, byteArray50);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray54, byteArray55);
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray54);
        org.junit.Assert.assertArrayEquals("", byteArray33, byteArray50);
        org.junit.Assert.assertArrayEquals("", byteArray16, byteArray33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest62 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        synonymsAnalysisTest62.assertTermsEquals("europarl.lines.txt.gz", indexReader64, terms65, terms66, false);
        synonymsAnalysisTest62.overrideTestDefaultQueryCache();
        synonymsAnalysisTest62.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest62.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        synonymsAnalysisTest62.assertPositionsSkippingEquals("tests.badapples", indexReader73, (int) (short) 10, postingsEnum75, postingsEnum76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "", (java.lang.Object) indexReader73);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, true);
        java.lang.String str11 = synonymsAnalysisTest2.getTestName();
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray18, (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest25);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 0, 100.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (byte) 1);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 10, (double) 10, (double) (short) 1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        float[] floatArray2 = new float[] { 4 };
        float[] floatArray8 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray13 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray13, (float) (byte) 100);
        float[] floatArray20 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray25 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray25, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray25, (float) 100);
        float[] floatArray34 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray39 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray39, (float) (byte) 100);
        float[] floatArray46 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray51 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray51, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray51, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray51, (float) (short) 0);
        float[] floatArray62 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray67 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray67, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals("", floatArray51, floatArray62, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray2, floatArray62, (float) 0L);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 2);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str6 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str11 = synonymsAnalysisTest10.getTestName();
        java.lang.String str12 = synonymsAnalysisTest10.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain16;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain16;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain16;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) (short) 100, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        java.lang.Class<?> wildcardClass6 = synonymsAnalysisTest1.getClass();
        char[] charArray9 = new char[] { '#' };
        char[] charArray11 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray11);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        org.junit.Assert.assertArrayEquals(charArray21, charArray26);
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray11, charArray16);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) wildcardClass6, (java.lang.Object) charArray16);
        char[] charArray32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray16, charArray32);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, 4, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.nightly", indexReader18, fields19, fields20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, false);
        java.lang.Class<?> wildcardClass14 = synonymsAnalysisTest0.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.util.Set<java.lang.Class<?>> wildcardClassSet20 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray17);
        java.util.Set<java.io.Serializable> serializableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) wildcardClassArray17);
        java.util.Set<java.lang.Class<?>> wildcardClassSet22 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray17);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        char[][] charArray28 = new char[][] { charArray24, charArray25, charArray26, charArray27 };
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        char[][] charArray33 = new char[][] { charArray29, charArray30, charArray31, charArray32 };
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        char[][] charArray38 = new char[][] { charArray34, charArray35, charArray36, charArray37 };
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        char[][] charArray43 = new char[][] { charArray39, charArray40, charArray41, charArray42 };
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        char[][] charArray48 = new char[][] { charArray44, charArray45, charArray46, charArray47 };
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        char[][] charArray53 = new char[][] { charArray49, charArray50, charArray51, charArray52 };
        char[][][] charArray54 = new char[][][] { charArray28, charArray33, charArray38, charArray43, charArray48, charArray53 };
        java.util.List<char[][]> charArrayList55 = org.elasticsearch.test.ESTestCase.randomSubsetOf(5, charArray54);
        java.util.Set<java.lang.Cloneable> cloneableSet56 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) charArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray17, (java.lang.Object[]) charArray54);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
        java.lang.Object obj11 = null;
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray13, longArray14);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray13, longArray18);
        org.junit.Assert.assertNotEquals("tests.weekly", obj11, (java.lang.Object) longArray13);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray24, longArray29);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray33, longArray34);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray33, longArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray29, longArray38);
        org.junit.Assert.assertArrayEquals(longArray13, longArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray7, longArray29);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest44 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        synonymsAnalysisTest44.assertTermsEquals("europarl.lines.txt.gz", indexReader46, terms47, terms48, false);
        synonymsAnalysisTest44.setIndexWriterMaxDocs(1);
        java.lang.String str53 = synonymsAnalysisTest44.getTestName();
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest44, obj54);
        synonymsAnalysisTest44.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) longArray7, (java.lang.Object) synonymsAnalysisTest44);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray2 };
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray4 };
        int[] intArray6 = new int[] {};
        int[][] intArray7 = new int[][] { intArray6 };
        int[] intArray8 = new int[] {};
        int[][] intArray9 = new int[][] { intArray8 };
        int[] intArray10 = new int[] {};
        int[][] intArray11 = new int[][] { intArray10 };
        int[][][] intArray12 = new int[][][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        java.util.Set<int[][]> intArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        java.util.Set<int[][]> intArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) intArraySet14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        synonymsAnalysisTest16.setIndexWriterMaxDocs(1);
        java.lang.String str25 = synonymsAnalysisTest16.getTestName();
        java.lang.String str26 = synonymsAnalysisTest16.getTestName();
        synonymsAnalysisTest16.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArraySet14, (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.failfast", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str21 = synonymsAnalysisTest20.getTestName();
        java.lang.String str22 = synonymsAnalysisTest20.getTestName();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest20.assertPositionsSkippingEquals("", indexReader24, (int) ' ', postingsEnum26, postingsEnum27);
        org.junit.rules.RuleChain ruleChain29 = synonymsAnalysisTest20.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest20.failureAndSuccessEvents;
        synonymsAnalysisTest20.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest20);
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest20, obj34);
        synonymsAnalysisTest20.ensureCleanedUp();
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest20.ruleChain;
        java.lang.String str38 = synonymsAnalysisTest20.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain41 = null;
        synonymsAnalysisTest40.failureAndSuccessEvents = ruleChain41;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        synonymsAnalysisTest40.assertFieldsEquals("tests.maxfailures", indexReader44, fields45, fields46, true);
        java.lang.String str49 = synonymsAnalysisTest40.getTestName();
        synonymsAnalysisTest40.tearDown();
        org.junit.rules.TestRule testRule51 = synonymsAnalysisTest40.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest40.assertDocsEnumEquals("tests.slow", postingsEnum53, postingsEnum54, true);
        java.lang.String str57 = synonymsAnalysisTest40.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest20, (java.lang.Object) str57);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, true);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray24, (java.lang.Object) synonymsAnalysisTest31);
        synonymsAnalysisTest31.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        synonymsAnalysisTest31.assertDocsEnumEquals("tests.monster", postingsEnum38, postingsEnum39, false);
        synonymsAnalysisTest31.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule43 = synonymsAnalysisTest31.ruleChain;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest31.assertDocsSkippingEquals("tests.slow", indexReader45, (int) (byte) 10, postingsEnum47, postingsEnum48, false);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        synonymsAnalysisTest52.assertTermsEquals("europarl.lines.txt.gz", indexReader54, terms55, terms56, false);
        synonymsAnalysisTest52.ensureAllSearchContextsReleased();
        synonymsAnalysisTest52.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str62 = synonymsAnalysisTest52.getTestName();
        java.lang.String str63 = synonymsAnalysisTest52.getTestName();
        org.junit.rules.RuleChain ruleChain64 = synonymsAnalysisTest52.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) ruleChain51, (java.lang.Object) synonymsAnalysisTest52);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain51;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum68, postingsEnum69);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) -1, (double) 4);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("random");
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) -1, (double) (short) 1, (double) 1L);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling10, throttling11, throttling12, throttling13, throttling14 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet16 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) throttlingSet16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain5, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 3);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        int[] intArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray8, intArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        synonymsAnalysisTest14.setIndexWriterMaxDocs(1);
        java.lang.String str23 = synonymsAnalysisTest14.getTestName();
        java.lang.String str24 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray8, (java.lang.Object) synonymsAnalysisTest14);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray33, intArray36);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray41, intArray44);
        org.junit.Assert.assertArrayEquals(intArray36, intArray41);
        org.junit.Assert.assertArrayEquals("", intArray29, intArray41);
        org.junit.Assert.assertArrayEquals(intArray8, intArray29);
        org.junit.Assert.assertArrayEquals(intArray3, intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray29);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray9, obj12);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) ' ', (double) (short) 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) '4');
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) (byte) 1, (-1.0f));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set[] setArray7 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray8 = (java.util.Set<java.lang.String>[]) setArray7;
        strSetArray8[0] = strSet5;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray8);
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.String>[]) strSetArray8);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) strIterableSet12, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.monster", indexReader7, (-1), postingsEnum9, postingsEnum10);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray45);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest54 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule55 = synonymsAnalysisTest54.ruleChain;
        synonymsAnalysisTest54.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) boolean53, (java.lang.Object) synonymsAnalysisTest54);
        synonymsAnalysisTest54.ensureCheckIndexPassed();
        synonymsAnalysisTest54.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule60 = synonymsAnalysisTest54.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest54);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.setUp();
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "random");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        char[] charArray15 = new char[] { '#' };
        char[] charArray17 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray21, charArray26);
        org.junit.Assert.assertArrayEquals(charArray17, charArray26);
        char[] charArray33 = new char[] { '#' };
        char[] charArray35 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray35);
        char[] charArray39 = new char[] { '#' };
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        char[] charArray44 = new char[] { '#' };
        char[] charArray46 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray39, charArray44);
        org.junit.Assert.assertArrayEquals(charArray35, charArray44);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray17, charArray35);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        char[] charArray63 = new char[] { '#' };
        char[] charArray65 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray63, charArray65);
        char[] charArray68 = new char[] { '#' };
        char[] charArray70 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray68, charArray70);
        org.junit.Assert.assertArrayEquals(charArray65, charArray70);
        org.junit.Assert.assertArrayEquals(charArray60, charArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray55, charArray60);
        org.junit.Assert.assertArrayEquals(charArray35, charArray60);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray60);
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum78, postingsEnum79);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '#', (double) 0.0f);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) 10, 0.0f);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        java.lang.String str12 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) testRule13);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray35, (float) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        float[] floatArray56 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray61 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray61, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray11, floatArray61, (float) 100);
        float[] floatArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray61, floatArray70, (float) (byte) 1);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray15, shortArray20);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray15);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        synonymsAnalysisTest30.ensureCleanedUp();
        java.lang.String str33 = synonymsAnalysisTest30.getTestName();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest30.assertFieldsEquals("tests.monster", indexReader35, fields36, fields37, false);
        synonymsAnalysisTest30.setUp();
        synonymsAnalysisTest30.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest30.assertPositionsSkippingEquals("<unknown>", indexReader43, 4, postingsEnum45, postingsEnum46);
        org.junit.rules.TestRule testRule48 = synonymsAnalysisTest30.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray15, (java.lang.Object) synonymsAnalysisTest30);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 100, (double) 0.0f);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100, (double) ' ');
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) (short) 10);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (long) 0, (long) (short) 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str9 = synonymsAnalysisTest8.getTestName();
        java.lang.String str10 = synonymsAnalysisTest8.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest8.assertPositionsSkippingEquals("", indexReader12, (int) ' ', postingsEnum14, postingsEnum15);
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest8.failureAndSuccessEvents;
        synonymsAnalysisTest8.ensureCleanedUp();
        double[] doubleArray19 = new double[] {};
        double[] doubleArray20 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray20, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest8, (java.lang.Object) doubleArray20);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) (byte) 1);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (byte) -1);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray39, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray25, doubleArray39, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray20, doubleArray39, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray4, doubleArray20, 100.0d);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) (byte) 1);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray56, (double) (byte) -1);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) (byte) 1);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray66, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray52, doubleArray66, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray20, doubleArray52, (double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray20, (-1.0d));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) 1);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray11, longArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.failfast", (java.lang.Object) 1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        float[] floatArray16 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray21 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray21, (float) 100);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        float[] floatArray42 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray47 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray47, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray47, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray47, (float) (short) 0);
        float[] floatArray58 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray63 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray63, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray58, (float) (byte) -1);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) -1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        java.lang.String str11 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        float[] floatArray0 = null;
        float[] floatArray7 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray12 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray12, (float) (byte) 100);
        float[] floatArray19 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray24 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray24, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray24, 10.0f);
        float[] floatArray33 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray38 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray38, (float) (byte) 100);
        float[] floatArray45 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray50 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray50, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray50, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray24, floatArray50, (float) 10);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) floatArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray24, (float) (short) 1);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 1.0f, (double) 5);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain13;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str17 = synonymsAnalysisTest16.getTestName();
        java.lang.String str18 = synonymsAnalysisTest16.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest19.ruleChain;
        synonymsAnalysisTest19.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest19.failureAndSuccessEvents;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain22;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest16.assertTermsEquals("tests.maxfailures", indexReader25, terms26, terms27, false);
        java.lang.Class<?> wildcardClass30 = synonymsAnalysisTest16.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.util.Set<java.lang.Class<?>> wildcardClassSet36 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray33);
        java.util.List<java.lang.reflect.Type> typeList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain13, (java.lang.Object) typeList37);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain13;
        synonymsAnalysisTest0.setUp();
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService executorService69 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] { executorService69 };
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray73);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray73);
        java.util.concurrent.ExecutorService executorService78 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] { executorService78 };
        boolean boolean80 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray79);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray79, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray79);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray58, (java.lang.Object) executorServiceArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray58);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum92, postingsEnum93);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.lang.Class<?> wildcardClass13 = executorServiceArray10.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray10);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.failfast", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.weekly", postingsEnum22, postingsEnum23, false);
        java.lang.String str26 = synonymsAnalysisTest1.getTestName();
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) byteArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 'a', (double) 4);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray3);
        char[] charArray11 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray17 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray23 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray29 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray35 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray41 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[][] charArray42 = new char[][] { charArray11, charArray17, charArray23, charArray29, charArray35, charArray41 };
        char[] charArray48 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray54 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray60 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray66 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray72 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[] charArray78 = new char[] { '#', ' ', '#', 'a', 'a' };
        char[][] charArray79 = new char[][] { charArray48, charArray54, charArray60, charArray66, charArray72, charArray78 };
        char[][][] charArray80 = new char[][][] { charArray42, charArray79 };
        java.util.Set<char[][]> charArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(charArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) charArray80);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (short) 1, (float) 10, (float) (byte) 1);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray15);
        org.junit.Assert.assertArrayEquals(intArray7, intArray12);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray20);
        org.junit.Assert.assertArrayEquals(intArray7, intArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray20);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) ' ', (long) (short) -1);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray25);
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray63);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray53);
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str73 = synonymsAnalysisTest72.getTestName();
        java.lang.String str74 = synonymsAnalysisTest72.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule76 = synonymsAnalysisTest75.ruleChain;
        synonymsAnalysisTest75.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain78 = synonymsAnalysisTest75.failureAndSuccessEvents;
        synonymsAnalysisTest72.failureAndSuccessEvents = ruleChain78;
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        synonymsAnalysisTest72.assertTermsEquals("tests.maxfailures", indexReader81, terms82, terms83, false);
        java.lang.Class<?> wildcardClass86 = synonymsAnalysisTest72.getClass();
        java.lang.Class[] classArray88 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray89 = (java.lang.Class<?>[]) classArray88;
        wildcardClassArray89[0] = wildcardClass86;
        java.util.Set<java.lang.Class<?>> wildcardClassSet92 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray89);
        java.util.Set<java.lang.Class<?>> wildcardClassSet93 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray89);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) wildcardClassArray89);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        char[] charArray5 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray11 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray17 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray18 = new char[][] { charArray5, charArray11, charArray17 };
        java.util.Set<char[]> charArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(charArray18);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray39);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray43, byteArray44);
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray39, byteArray46);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray50, byteArray51);
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray46);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray18, (java.lang.Object) byteArray30);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray8, obj11);
        java.lang.Class<?> wildcardClass13 = shortArray8.getClass();
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray18, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray30);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray36, intArray39);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray47);
        org.junit.Assert.assertArrayEquals(intArray39, intArray44);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("", intArray39, intArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray30, intArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray21, intArray51);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest57 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        synonymsAnalysisTest57.assertTermsEquals("europarl.lines.txt.gz", indexReader59, terms60, terms61, false);
        synonymsAnalysisTest57.setIndexWriterMaxDocs(1);
        java.lang.String str66 = synonymsAnalysisTest57.getTestName();
        java.lang.String str67 = synonymsAnalysisTest57.getTestName();
        synonymsAnalysisTest57.restoreIndexWriterMaxDocs();
        java.lang.String str69 = synonymsAnalysisTest57.getTestName();
        synonymsAnalysisTest57.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) intArray21, (java.lang.Object) synonymsAnalysisTest57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) wildcardClass13, (java.lang.Object) synonymsAnalysisTest57);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 10);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest17.ruleChain;
        synonymsAnalysisTest17.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest17.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray10, (java.lang.Object) synonymsAnalysisTest17);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray78);
        java.util.concurrent.ExecutorService executorService82 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] { executorService82 };
        boolean boolean84 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray83);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray83, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) executorServiceArray23);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) -1, (double) 3, (double) 0L);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100.0f, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 10L, (float) (byte) 1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray9, intArray12);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray18, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray38);
        org.junit.Assert.assertArrayEquals(intArray30, intArray35);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("", intArray30, intArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray21, intArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray12, intArray42);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        synonymsAnalysisTest48.assertTermsEquals("europarl.lines.txt.gz", indexReader50, terms51, terms52, false);
        synonymsAnalysisTest48.setIndexWriterMaxDocs(1);
        java.lang.String str57 = synonymsAnalysisTest48.getTestName();
        java.lang.String str58 = synonymsAnalysisTest48.getTestName();
        synonymsAnalysisTest48.restoreIndexWriterMaxDocs();
        java.lang.String str60 = synonymsAnalysisTest48.getTestName();
        synonymsAnalysisTest48.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) intArray12, (java.lang.Object) synonymsAnalysisTest48);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray65, intArray68);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray12, intArray68);
        org.junit.Assert.assertArrayEquals(intArray1, intArray12);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest73 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        synonymsAnalysisTest73.assertTermsEquals("europarl.lines.txt.gz", indexReader75, terms76, terms77, false);
        synonymsAnalysisTest73.ensureAllSearchContextsReleased();
        synonymsAnalysisTest73.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest73.resetCheckIndexStatus();
        synonymsAnalysisTest73.assertPathHasBeenCleared("hi!");
        synonymsAnalysisTest73.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest73);
        java.lang.String str88 = synonymsAnalysisTest73.getTestName();
        synonymsAnalysisTest73.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) intArray1, (java.lang.Object) synonymsAnalysisTest73);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 0, 0L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.awaitsfix", indexReader13, terms14, terms15, false);
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray27, charArray32);
        org.junit.Assert.assertArrayEquals(charArray23, charArray32);
        char[] charArray39 = new char[] { '#' };
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        char[] charArray45 = new char[] { '#' };
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        char[] charArray50 = new char[] { '#' };
        char[] charArray52 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray50, charArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray45, charArray50);
        org.junit.Assert.assertArrayEquals(charArray41, charArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray23, charArray41);
        char[] charArray59 = new char[] { '#' };
        char[] charArray61 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray59, charArray61);
        char[] charArray64 = new char[] { '#' };
        char[] charArray66 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray64, charArray66);
        char[] charArray69 = new char[] { '#' };
        char[] charArray71 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray69, charArray71);
        char[] charArray74 = new char[] { '#' };
        char[] charArray76 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray74, charArray76);
        org.junit.Assert.assertArrayEquals(charArray71, charArray76);
        org.junit.Assert.assertArrayEquals(charArray66, charArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray61, charArray66);
        org.junit.Assert.assertArrayEquals(charArray41, charArray66);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest82 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        synonymsAnalysisTest82.assertTermsEquals("europarl.lines.txt.gz", indexReader84, terms85, terms86, false);
        org.apache.lucene.index.IndexReader indexReader90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        synonymsAnalysisTest82.assertDocsSkippingEquals("tests.maxfailures", indexReader90, (-1), postingsEnum92, postingsEnum93, true);
        synonymsAnalysisTest82.ensureCheckIndexPassed();
        synonymsAnalysisTest82.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) charArray41, (java.lang.Object) synonymsAnalysisTest82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader13, (java.lang.Object) synonymsAnalysisTest82);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray16, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray54);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray44);
        java.lang.Object[] objArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, objArray64);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), (float) ' ', (float) 1L);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str18 = synonymsAnalysisTest17.getTestName();
        java.lang.String str19 = synonymsAnalysisTest17.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest17.assertDocsEnumEquals("tests.slow", postingsEnum21, postingsEnum22, false);
        synonymsAnalysisTest17.tearDown();
        synonymsAnalysisTest17.setUp();
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray33);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest40.ruleChain;
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest40.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray33, (java.lang.Object) synonymsAnalysisTest40);
        synonymsAnalysisTest40.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest40.assertDocsEnumEquals("tests.monster", postingsEnum47, postingsEnum48, false);
        org.junit.rules.RuleChain ruleChain51 = synonymsAnalysisTest40.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain51;
        synonymsAnalysisTest17.ensureAllSearchContextsReleased();
        java.lang.String str54 = synonymsAnalysisTest17.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "", (java.lang.Object) str54);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 10, (double) 1, (double) '#');
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) '#', (double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) 100, (double) 100.0f);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '#', (long) 1);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.nightly", (int) (byte) 10, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.nightly", postingsEnum7, postingsEnum8, true);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray12);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray23, intArray26);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray31, intArray34);
        org.junit.Assert.assertArrayEquals(intArray26, intArray31);
        org.junit.Assert.assertArrayEquals("", intArray19, intArray31);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray41, intArray44);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray50, intArray53);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray59, intArray62);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray68, intArray71);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray76, intArray79);
        org.junit.Assert.assertArrayEquals(intArray71, intArray76);
        int[] intArray83 = new int[] {};
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray83, intArray84);
        org.junit.Assert.assertArrayEquals("", intArray71, intArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray62, intArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray53, intArray83);
        org.junit.Assert.assertArrayEquals(intArray41, intArray53);
        org.junit.Assert.assertArrayEquals("", intArray31, intArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray12, intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "tests.nightly", (java.lang.Object) intArray12);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        char[] charArray15 = new char[] { '#' };
        char[] charArray17 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray15, charArray17);
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray26 = new char[] { '#' };
        char[] charArray28 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray21, charArray26);
        org.junit.Assert.assertArrayEquals(charArray17, charArray26);
        char[] charArray33 = new char[] { '#' };
        char[] charArray35 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray33, charArray35);
        char[] charArray39 = new char[] { '#' };
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray41);
        char[] charArray44 = new char[] { '#' };
        char[] charArray46 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray44, charArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray39, charArray44);
        org.junit.Assert.assertArrayEquals(charArray35, charArray44);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray17, charArray35);
        char[] charArray53 = new char[] { '#' };
        char[] charArray55 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray55);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        char[] charArray63 = new char[] { '#' };
        char[] charArray65 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray63, charArray65);
        char[] charArray68 = new char[] { '#' };
        char[] charArray70 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray68, charArray70);
        org.junit.Assert.assertArrayEquals(charArray65, charArray70);
        org.junit.Assert.assertArrayEquals(charArray60, charArray65);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray55, charArray60);
        org.junit.Assert.assertArrayEquals(charArray35, charArray60);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArray60);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest77 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule78 = synonymsAnalysisTest77.ruleChain;
        synonymsAnalysisTest77.ensureCleanedUp();
        java.lang.String str80 = synonymsAnalysisTest77.getTestName();
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        synonymsAnalysisTest77.assertFieldsEquals("tests.monster", indexReader82, fields83, fields84, false);
        synonymsAnalysisTest77.setUp();
        synonymsAnalysisTest77.resetCheckIndexStatus();
        synonymsAnalysisTest77.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) charArray60, (java.lang.Object) synonymsAnalysisTest77);
        org.apache.lucene.index.NumericDocValues numericDocValues93 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest77.assertDocValuesEquals("", 2, numericDocValues93, numericDocValues94);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, false);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.failfast", (int) '4', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray9, obj12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray9, shortArray26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        synonymsAnalysisTest30.assertTermsEquals("europarl.lines.txt.gz", indexReader32, terms33, terms34, false);
        synonymsAnalysisTest30.ensureAllSearchContextsReleased();
        synonymsAnalysisTest30.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest30.assertDocsSkippingEquals("random", indexReader41, (int) (short) 10, postingsEnum43, postingsEnum44, false);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray9, (java.lang.Object) synonymsAnalysisTest30);
        org.junit.rules.RuleChain ruleChain48 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str50 = synonymsAnalysisTest49.getTestName();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        synonymsAnalysisTest49.assertFieldsEquals("tests.slow", indexReader52, fields53, fields54, false);
        synonymsAnalysisTest49.setIndexWriterMaxDocs(4);
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest49.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) ruleChain48, (java.lang.Object) synonymsAnalysisTest49);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 10, (double) 1L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader13, (int) ' ', postingsEnum15, postingsEnum16, true);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1);
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        synonymsAnalysisTest21.overrideTestDefaultQueryCache();
        synonymsAnalysisTest21.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) (short) 1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 'a', 0.0f);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        int[] intArray13 = new int[] {};
        int[][] intArray14 = new int[][] { intArray13 };
        java.util.Set<int[]> intArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(intArray14);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray18, longArray23);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray27, longArray28);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray31, longArray32);
        org.junit.Assert.assertArrayEquals(longArray27, longArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray18, longArray27);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray37, longArray38);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray41, longArray42);
        org.junit.Assert.assertArrayEquals(longArray38, longArray42);
        org.junit.Assert.assertArrayEquals(longArray27, longArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray14, (java.lang.Object) longArray27);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) intArray14);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray15);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray15);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray25);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray33);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("", intArray25, intArray37);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray15, intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest13.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader23, (-1), postingsEnum25, postingsEnum26, true);
        org.junit.rules.TestRule testRule29 = synonymsAnalysisTest13.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest13);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        char[] charArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain4 = null;
        synonymsAnalysisTest3.failureAndSuccessEvents = ruleChain4;
        synonymsAnalysisTest3.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest3.ruleChain;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest3.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, true);
        synonymsAnalysisTest3.ensureCheckIndexPassed();
        char[] charArray17 = new char[] { '#' };
        char[] charArray19 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray17, charArray19);
        char[] charArray23 = new char[] { '#' };
        char[] charArray25 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray23, charArray25);
        char[] charArray28 = new char[] { '#' };
        char[] charArray30 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray28, charArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray23, charArray28);
        org.junit.Assert.assertArrayEquals(charArray19, charArray28);
        char[] charArray35 = new char[] { '#' };
        char[] charArray37 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        char[] charArray41 = new char[] { '#' };
        char[] charArray43 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray41, charArray43);
        char[] charArray46 = new char[] { '#' };
        char[] charArray48 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray46, charArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray41, charArray46);
        org.junit.Assert.assertArrayEquals(charArray37, charArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray37);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        char[] charArray65 = new char[] { '#' };
        char[] charArray67 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        char[] charArray70 = new char[] { '#' };
        char[] charArray72 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        org.junit.Assert.assertArrayEquals(charArray67, charArray72);
        org.junit.Assert.assertArrayEquals(charArray62, charArray67);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray57, charArray62);
        org.junit.Assert.assertArrayEquals(charArray37, charArray62);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) charArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray62);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) '#', 100L);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule6 = synonymsAnalysisTest5.ruleChain;
        synonymsAnalysisTest5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = synonymsAnalysisTest5.failureAndSuccessEvents;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str11 = synonymsAnalysisTest10.getTestName();
        java.lang.String str12 = synonymsAnalysisTest10.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("", indexReader14, (int) ' ', postingsEnum16, postingsEnum17);
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) ruleChain8, (java.lang.Object) synonymsAnalysisTest10);
        synonymsAnalysisTest10.setIndexWriterMaxDocs(4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", obj1, (java.lang.Object) 4);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.assertPathHasBeenCleared("random");
        org.junit.rules.TestRule testRule18 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        java.lang.String str24 = synonymsAnalysisTest22.getTestName();
        synonymsAnalysisTest22.assertPathHasBeenCleared("tests.badapples");
        java.lang.Class<?> wildcardClass27 = synonymsAnalysisTest22.getClass();
        char[] charArray30 = new char[] { '#' };
        char[] charArray32 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        char[] charArray35 = new char[] { '#' };
        char[] charArray37 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        char[] charArray40 = new char[] { '#' };
        char[] charArray42 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        char[] charArray45 = new char[] { '#' };
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        org.junit.Assert.assertArrayEquals(charArray42, charArray47);
        org.junit.Assert.assertArrayEquals(charArray37, charArray42);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray32, charArray37);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) wildcardClass27, (java.lang.Object) charArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) testRule20, (java.lang.Object) charArray37);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest1.ruleChain;
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray18, (double) (byte) 1);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray21, (double) (byte) -1);
        double[] doubleArray27 = new double[] {};
        double[] doubleArray28 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray28, (double) (byte) 1);
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray31, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray17, doubleArray31, (double) 0L);
        java.lang.Class<?> wildcardClass39 = doubleArray31.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) testRule15, (java.lang.Object) doubleArray31);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) '4', (float) ' ');
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray16, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1L, (java.lang.Object) executorServiceArray16);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray15);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray15);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray25);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray33);
        org.junit.Assert.assertArrayEquals(intArray25, intArray30);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray38);
        org.junit.Assert.assertArrayEquals(intArray25, intArray38);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray46, intArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest52 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        synonymsAnalysisTest52.assertTermsEquals("europarl.lines.txt.gz", indexReader54, terms55, terms56, false);
        synonymsAnalysisTest52.setIndexWriterMaxDocs(1);
        java.lang.String str61 = synonymsAnalysisTest52.getTestName();
        java.lang.String str62 = synonymsAnalysisTest52.getTestName();
        synonymsAnalysisTest52.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray46, (java.lang.Object) synonymsAnalysisTest52);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray38, intArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray46);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest68 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str69 = synonymsAnalysisTest68.getTestName();
        java.lang.String str70 = synonymsAnalysisTest68.getTestName();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest68.assertPositionsSkippingEquals("", indexReader72, (int) ' ', postingsEnum74, postingsEnum75);
        org.junit.rules.RuleChain ruleChain77 = synonymsAnalysisTest68.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain78 = synonymsAnalysisTest68.failureAndSuccessEvents;
        synonymsAnalysisTest68.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest68);
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        synonymsAnalysisTest68.assertDocsSkippingEquals("tests.weekly", indexReader83, 0, postingsEnum85, postingsEnum86, false);
        synonymsAnalysisTest68.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", (java.lang.Object) synonymsAnalysisTest68);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 10L, (float) 1L, (float) 4);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray17, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (short) 100, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader11, 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        org.junit.rules.RuleChain ruleChain22 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("", postingsEnum24, postingsEnum25, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str29 = synonymsAnalysisTest28.getTestName();
        java.lang.String str30 = synonymsAnalysisTest28.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest28.assertPositionsSkippingEquals("", indexReader32, (int) ' ', postingsEnum34, postingsEnum35);
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest28.failureAndSuccessEvents;
        synonymsAnalysisTest28.ensureCleanedUp();
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest28, (java.lang.Object) doubleArray40);
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest28.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) postingsEnum25, (java.lang.Object) synonymsAnalysisTest28);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader10, fields11, fields12, true);
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str20 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        synonymsAnalysisTest1.assertFieldsEquals("random", indexReader22, fields23, fields24, false);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray37, intArray40);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        synonymsAnalysisTest43.assertTermsEquals("europarl.lines.txt.gz", indexReader45, terms46, terms47, false);
        synonymsAnalysisTest43.setIndexWriterMaxDocs(1);
        java.lang.String str52 = synonymsAnalysisTest43.getTestName();
        java.lang.String str53 = synonymsAnalysisTest43.getTestName();
        synonymsAnalysisTest43.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray37, (java.lang.Object) synonymsAnalysisTest43);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray31, (java.lang.Object) synonymsAnalysisTest43);
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) indexReader22, (java.lang.Object) strArray31);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray18, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray46);
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray1, (java.lang.Object[]) executorServiceArray46);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 10, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        java.lang.String str14 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest11.failureAndSuccessEvents;
        java.lang.String str17 = synonymsAnalysisTest11.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest24.failureAndSuccessEvents;
        synonymsAnalysisTest21.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain27;
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest2);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader35, (int) (byte) 0, postingsEnum37, postingsEnum38);
        java.lang.String str40 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str42 = synonymsAnalysisTest41.getTestName();
        java.lang.String str43 = synonymsAnalysisTest41.getTestName();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest41.assertPositionsSkippingEquals("", indexReader45, (int) ' ', postingsEnum47, postingsEnum48);
        org.junit.rules.RuleChain ruleChain50 = synonymsAnalysisTest41.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str40, (java.lang.Object) synonymsAnalysisTest41);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, 0.0d, (double) 1);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, false);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 10, (double) 1, (double) 5);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray25);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray30);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray36, shortArray41);
        java.lang.Object obj44 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray41, obj44);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray48, shortArray53);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray58);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray41, shortArray58);
        org.junit.Assert.assertArrayEquals("", shortArray30, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        synonymsAnalysisTest64.assertTermsEquals("europarl.lines.txt.gz", indexReader66, terms67, terms68, false);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        synonymsAnalysisTest64.assertDocsSkippingEquals("tests.maxfailures", indexReader72, (-1), postingsEnum74, postingsEnum75, true);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray78 = new org.elasticsearch.test.ESTestCase[] { synonymsAnalysisTest64 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet79 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray3, (java.lang.Object) eSTestCaseSet79);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.maxfailures", indexReader9, terms10, terms11, false);
        java.lang.Class<?> wildcardClass14 = synonymsAnalysisTest0.getClass();
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray17, intArray20);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray29);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray38);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray47);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray52, intArray55);
        org.junit.Assert.assertArrayEquals(intArray47, intArray52);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        org.junit.Assert.assertArrayEquals("", intArray47, intArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray38, intArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray29, intArray59);
        org.junit.Assert.assertArrayEquals(intArray17, intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) intArray29);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        long[] longArray1 = null;
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray14);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray28);
        org.junit.Assert.assertArrayEquals(longArray14, longArray25);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray34, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray35, longArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray14, longArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray35);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule32 = synonymsAnalysisTest31.ruleChain;
        synonymsAnalysisTest31.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest31.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray24, (java.lang.Object) synonymsAnalysisTest31);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray57);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray67, (java.lang.Object[]) executorServiceArray71);
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray57);
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray57);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) executorServiceArray57);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.lang.Class<?> wildcardClass13 = executorServiceArray10.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) executorServiceArray10);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.failfast", indexReader16, fields17, fields18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.weekly", postingsEnum22, postingsEnum23, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader9, fields10, fields11, false);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest27.ruleChain;
        synonymsAnalysisTest27.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray20, (java.lang.Object) synonymsAnalysisTest27);
        synonymsAnalysisTest27.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest27.assertDocsEnumEquals("tests.monster", postingsEnum34, postingsEnum35, false);
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest27.ruleChain;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("tests.slow", indexReader41, (int) (byte) 10, postingsEnum43, postingsEnum44, false);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        synonymsAnalysisTest27.assertDocsEnumEquals("", postingsEnum48, postingsEnum49, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) fields10, (java.lang.Object) synonymsAnalysisTest27);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (byte) -1, 0.0d, (double) 1.0f);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.monster", postingsEnum20, postingsEnum21, false);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule25 = synonymsAnalysisTest13.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        synonymsAnalysisTest13.assertDocsSkippingEquals("tests.slow", indexReader27, (int) (byte) 10, postingsEnum29, postingsEnum30, false);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        synonymsAnalysisTest13.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 1.0f);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 5, (long) 100);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray22, (float) 100);
        float[] floatArray31 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray36 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (byte) 100);
        float[] floatArray43 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray48 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray48, (float) (short) 0);
        float[] floatArray59 = new float[] { 0.0f, 1.0f, 5, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray22, floatArray59, (float) '4');
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray3, (java.lang.Object) 100L);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray15);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray21, intArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest27.assertTermsEquals("europarl.lines.txt.gz", indexReader29, terms30, terms31, false);
        synonymsAnalysisTest27.setIndexWriterMaxDocs(1);
        java.lang.String str36 = synonymsAnalysisTest27.getTestName();
        java.lang.String str37 = synonymsAnalysisTest27.getTestName();
        synonymsAnalysisTest27.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray21, (java.lang.Object) synonymsAnalysisTest27);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray15, (java.lang.Object) synonymsAnalysisTest27);
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray15);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0f, (float) (byte) 0, (float) 0);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (long) 10, (long) (short) 10);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain13 = null;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        synonymsAnalysisTest12.assertFieldsEquals("tests.maxfailures", indexReader16, fields17, fields18, true);
        java.lang.String str21 = synonymsAnalysisTest12.getTestName();
        synonymsAnalysisTest12.tearDown();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest12.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest12);
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) -1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        synonymsAnalysisTest30.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest30.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray23, (java.lang.Object) synonymsAnalysisTest30);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        synonymsAnalysisTest35.assertTermsEquals("europarl.lines.txt.gz", indexReader37, terms38, terms39, false);
        synonymsAnalysisTest35.ensureAllSearchContextsReleased();
        synonymsAnalysisTest35.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest35.resetCheckIndexStatus();
        synonymsAnalysisTest35.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest66 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str67 = synonymsAnalysisTest66.getTestName();
        java.lang.String str68 = synonymsAnalysisTest66.getTestName();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        synonymsAnalysisTest66.assertPositionsSkippingEquals("tests.nightly", indexReader70, (-1), postingsEnum72, postingsEnum73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray49, (java.lang.Object) synonymsAnalysisTest66);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set[] setArray6 = new java.util.Set[1];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray7 = (java.util.Set<java.lang.String>[]) setArray6;
        strSetArray7[0] = strSet4;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray7);
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.String>[]) strSetArray7);
        java.util.Set<java.util.Collection<java.lang.String>> strCollectionSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.String>[]) strSetArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray7, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray17);
        java.lang.Object obj21 = null;
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray23, longArray24);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray23, longArray28);
        org.junit.Assert.assertNotEquals("tests.weekly", obj21, (java.lang.Object) longArray23);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray34, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray34, longArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray43, longArray44);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray47, longArray48);
        org.junit.Assert.assertArrayEquals(longArray43, longArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray39, longArray48);
        org.junit.Assert.assertArrayEquals(longArray23, longArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray17, longArray39);
        org.junit.Assert.assertArrayEquals("", longArray7, longArray39);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray57, longArray58);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray61, longArray62);
        org.junit.Assert.assertArrayEquals(longArray58, longArray62);
        long[] longArray66 = new long[] {};
        long[] longArray67 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray66, longArray67);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray66, longArray71);
        org.junit.Assert.assertArrayEquals(longArray62, longArray71);
        java.lang.Object obj76 = null;
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray78, longArray79);
        long[] longArray82 = new long[] {};
        long[] longArray83 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray82, longArray83);
        org.junit.Assert.assertArrayEquals(longArray78, longArray83);
        org.junit.Assert.assertNotEquals("tests.weekly", obj76, (java.lang.Object) longArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray71, longArray78);
        org.junit.Assert.assertArrayEquals(longArray39, longArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray39);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 100.0f);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) -1, (long) (short) 0);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 10, (double) 2);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1 };
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray4 };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] { charSequenceArray6, charSequenceArray7 };
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] { charSequenceArray9, charSequenceArray10 };
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray2, charSequenceArray5, charSequenceArray8, charSequenceArray11 };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray13, charSequenceArray14 };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] { charSequenceArray16, charSequenceArray17 };
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray21 = new java.lang.CharSequence[][] { charSequenceArray19, charSequenceArray20 };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] { charSequenceArray22, charSequenceArray23 };
        java.lang.CharSequence[][][] charSequenceArray25 = new java.lang.CharSequence[][][] { charSequenceArray15, charSequenceArray18, charSequenceArray21, charSequenceArray24 };
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] { charSequenceArray26, charSequenceArray27 };
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] { charSequenceArray29, charSequenceArray30 };
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] { charSequenceArray32, charSequenceArray33 };
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray37 = new java.lang.CharSequence[][] { charSequenceArray35, charSequenceArray36 };
        java.lang.CharSequence[][][] charSequenceArray38 = new java.lang.CharSequence[][][] { charSequenceArray28, charSequenceArray31, charSequenceArray34, charSequenceArray37 };
        java.lang.CharSequence[][][][] charSequenceArray39 = new java.lang.CharSequence[][][][] { charSequenceArray12, charSequenceArray25, charSequenceArray38 };
        java.util.Set<java.lang.CharSequence[][][]> charSequenceArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray39);
        java.lang.Object[] objArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray39, objArray41);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (-1.0d), (double) (-1L));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        java.util.Set<java.lang.Class<?>[][][]> wildcardClassArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray2, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) -1, (double) 100.0f, (double) 100);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray15);
        org.junit.Assert.assertArrayEquals(intArray7, intArray12);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("", intArray7, intArray19);
        int[] intArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray19, intArray23);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set[] setArray32 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray33 = (java.util.Set<java.lang.String>[]) setArray32;
        strSetArray33[0] = strSet5;
        strSetArray33[1] = strSet10;
        strSetArray33[2] = strSet15;
        strSetArray33[3] = strSet20;
        strSetArray33[4] = strSet25;
        strSetArray33[5] = strSet30;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray33);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) strSetArray33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling49, throttling50, throttling51, throttling52 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet54 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray53);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet55 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray33, (java.lang.Object[]) throttlingArray53);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) 3, (double) 10.0f);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader10, terms11, terms12, true);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class[][] classArray18 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray19 = (java.lang.Class<?>[][]) classArray18;
        wildcardClassArray19[0] = wildcardClassArray16;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray19);
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray19);
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray19);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) wildcardClassArray19);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 4, (long) 2);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.resetCheckIndexStatus();
        synonymsAnalysisTest1.assertPathHasBeenCleared("hi!");
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) "hi!", (java.lang.Object) executorServiceArray15);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str32 = synonymsAnalysisTest31.getTestName();
        java.lang.String str33 = synonymsAnalysisTest31.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain37;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        synonymsAnalysisTest31.assertTermsEquals("tests.maxfailures", indexReader40, terms41, terms42, false);
        java.lang.Class<?> wildcardClass45 = synonymsAnalysisTest31.getClass();
        java.lang.Class[] classArray47 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        wildcardClassArray48[0] = wildcardClass45;
        java.util.Set<java.lang.Class<?>> wildcardClassSet51 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray48);
        java.util.List<java.lang.reflect.Type> typeList52 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray48);
        java.util.Set<java.lang.reflect.Type> typeSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.Type[]) wildcardClassArray48);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) wildcardClassArray48);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '4', (double) (short) 10, (double) 1L);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("<unknown>", indexReader8, 5, postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest16.ensureCheckIndexPassed();
        java.lang.String str31 = synonymsAnalysisTest16.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest16.assertDocsEnumEquals("", postingsEnum33, postingsEnum34, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum17, postingsEnum18, true);
        synonymsAnalysisTest0.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain23 = null;
        synonymsAnalysisTest22.failureAndSuccessEvents = ruleChain23;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        synonymsAnalysisTest22.assertFieldsEquals("tests.maxfailures", indexReader26, fields27, fields28, true);
        synonymsAnalysisTest22.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        synonymsAnalysisTest11.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, false);
        synonymsAnalysisTest11.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        synonymsAnalysisTest11.assertFieldsEquals("hi!", indexReader20, fields21, fields22, true);
        synonymsAnalysisTest11.setUp();
        synonymsAnalysisTest11.setIndexWriterMaxDocs((int) '4');
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest11.resetCheckIndexStatus();
        java.lang.String str30 = synonymsAnalysisTest11.getTestName();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        synonymsAnalysisTest11.assertFieldsEquals("random", indexReader32, fields33, fields34, false);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule10, (java.lang.Object) fields34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest38.ruleChain;
        synonymsAnalysisTest38.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest38.assertDocsEnumEquals("tests.awaitsfix", postingsEnum42, postingsEnum43, true);
        synonymsAnalysisTest38.assertPathHasBeenCleared("tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule10, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str11 = synonymsAnalysisTest1.getTestName();
        java.lang.String str12 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        synonymsAnalysisTest14.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest14.ensureCleanedUp();
        java.lang.String str24 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.badapples", indexReader11, (int) (short) 10, postingsEnum13, postingsEnum14);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        char[] charArray10 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray16 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray22 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray23 = new char[][] { charArray10, charArray16, charArray22 };
        java.util.Set<char[]> charArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(charArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) charArray23);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, (double) 4);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (byte) 100, (float) ' ', (float) (-1));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest2.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        synonymsAnalysisTest12.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str19 = synonymsAnalysisTest18.getTestName();
        java.lang.String str20 = synonymsAnalysisTest18.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest21.ruleChain;
        synonymsAnalysisTest21.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest18.assertTermsEquals("tests.maxfailures", indexReader27, terms28, terms29, false);
        java.lang.Class<?> wildcardClass32 = synonymsAnalysisTest18.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.util.Set<java.lang.Class<?>> wildcardClassSet38 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray35);
        java.util.List<java.lang.reflect.Type> typeList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain15, (java.lang.Object) typeList39);
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest2.setUp();
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        boolean boolean73 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray72);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray75);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray81, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray60, (java.lang.Object) executorServiceArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) executorServiceArray60);
        boolean boolean92 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", objArray1, (java.lang.Object[]) executorServiceArray60);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, false);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray13, intArray16);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray21, intArray24);
        org.junit.Assert.assertArrayEquals("", intArray16, intArray24);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray31, intArray34);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray39, intArray42);
        org.junit.Assert.assertArrayEquals(intArray34, intArray39);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray47);
        org.junit.Assert.assertArrayEquals(intArray34, intArray47);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray55, intArray58);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest61 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        synonymsAnalysisTest61.assertTermsEquals("europarl.lines.txt.gz", indexReader63, terms64, terms65, false);
        synonymsAnalysisTest61.setIndexWriterMaxDocs(1);
        java.lang.String str70 = synonymsAnalysisTest61.getTestName();
        java.lang.String str71 = synonymsAnalysisTest61.getTestName();
        synonymsAnalysisTest61.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray55, (java.lang.Object) synonymsAnalysisTest61);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray47, intArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray24, intArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) intArray55);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) 10, (long) (byte) 1);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        java.lang.Object obj2 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        org.junit.Assert.assertNotEquals("tests.weekly", obj2, (java.lang.Object) longArray4);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray15, longArray20);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray24, longArray29);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray20, longArray29);
        org.junit.Assert.assertArrayEquals(longArray4, longArray20);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray36, longArray37);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray40, longArray41);
        org.junit.Assert.assertArrayEquals(longArray37, longArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray45, longArray46);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray45, longArray50);
        org.junit.Assert.assertArrayEquals(longArray41, longArray50);
        java.lang.Object obj55 = null;
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray57, longArray58);
        long[] longArray61 = new long[] {};
        long[] longArray62 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray61, longArray62);
        org.junit.Assert.assertArrayEquals(longArray57, longArray62);
        org.junit.Assert.assertNotEquals("tests.weekly", obj55, (java.lang.Object) longArray57);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray50, longArray57);
        org.junit.Assert.assertArrayEquals(longArray20, longArray57);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray70, longArray71);
        long[] longArray74 = new long[] {};
        long[] longArray75 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray74, longArray75);
        org.junit.Assert.assertArrayEquals(longArray70, longArray75);
        long[] longArray79 = new long[] {};
        long[] longArray80 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray79, longArray80);
        long[] longArray83 = new long[] {};
        long[] longArray84 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray83, longArray84);
        org.junit.Assert.assertArrayEquals(longArray79, longArray84);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray70, longArray79);
        long[] longArray89 = new long[] {};
        long[] longArray90 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray89, longArray90);
        long[] longArray93 = new long[] {};
        long[] longArray94 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray93, longArray94);
        org.junit.Assert.assertArrayEquals(longArray90, longArray93);
        org.junit.Assert.assertArrayEquals(longArray79, longArray90);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray57, longArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray79);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, (double) ' ');
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.Set<java.lang.String[][]> strArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.util.Set<java.lang.String[][]> strArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray0);
        java.lang.Class<?> wildcardClass3 = strArraySet2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest4.assertDocsEnumEquals("tests.awaitsfix", postingsEnum8, postingsEnum9, true);
        synonymsAnalysisTest4.setIndexWriterMaxDocs(3);
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArraySet2, (java.lang.Object) synonymsAnalysisTest4);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray16, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray2, doubleArray16, (double) 0L);
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) (byte) 1);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str36 = synonymsAnalysisTest35.getTestName();
        java.lang.String str37 = synonymsAnalysisTest35.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest35.assertPositionsSkippingEquals("", indexReader39, (int) ' ', postingsEnum41, postingsEnum42);
        org.junit.rules.RuleChain ruleChain44 = synonymsAnalysisTest35.failureAndSuccessEvents;
        synonymsAnalysisTest35.ensureCleanedUp();
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest35, (java.lang.Object) doubleArray47);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray25, doubleArray47, (double) '#');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray2, doubleArray25, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 'a');
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100L, (double) (short) 0, (double) '4');
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray10);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray5);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray15);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray25, shortArray30);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray21);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray42, shortArray43);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray47, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray57, shortArray62);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray67);
        org.junit.Assert.assertArrayEquals("", shortArray42, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray1, shortArray52);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.util.Set<java.lang.CharSequence> charSequenceSet9 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray12, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray18, shortArray23);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray28);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray33, shortArray38);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray43, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray43, shortArray48);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray28, shortArray53);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray61, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray65, shortArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray61, shortArray66);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray61);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray13, shortArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) charSequenceSet9, (java.lang.Object) shortArray28);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        org.junit.Assert.assertArrayEquals(charArray29, charArray34);
        char[] charArray38 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray38);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        synonymsAnalysisTest40.assertTermsEquals("europarl.lines.txt.gz", indexReader42, terms43, terms44, false);
        synonymsAnalysisTest40.ensureAllSearchContextsReleased();
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest40.resetCheckIndexStatus();
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) charArray34, (java.lang.Object) synonymsAnalysisTest40);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray60);
        char[] charArray66 = new char[] { '#' };
        char[] charArray68 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray66, charArray68);
        char[] charArray71 = new char[] { '#' };
        char[] charArray73 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray71, charArray73);
        char[] charArray76 = new char[] { '#' };
        char[] charArray78 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray76, charArray78);
        org.junit.Assert.assertArrayEquals(charArray73, charArray78);
        org.junit.Assert.assertArrayEquals(charArray68, charArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray60, charArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray34, charArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) boolean23, (java.lang.Object) charArray34);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        char[] charArray5 = new char[] { '#' };
        char[] charArray7 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray5, charArray7);
        char[] charArray10 = new char[] { '#' };
        char[] charArray12 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray12);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray10);
        char[] charArray16 = new char[] { '#' };
        char[] charArray18 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray16, charArray18);
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        org.junit.Assert.assertArrayEquals(charArray18, charArray23);
        char[] charArray27 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray23, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray23);
        char[] charArray31 = new char[] { '#' };
        char[] charArray33 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray31, charArray33);
        org.junit.Assert.assertArrayEquals(charArray5, charArray33);
        char[] charArray38 = new char[] { '#' };
        char[] charArray40 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray38, charArray40);
        char[] charArray43 = new char[] { '#' };
        char[] charArray45 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray38, charArray43);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) charArray5);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        java.lang.String str6 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest8.ruleChain;
        synonymsAnalysisTest8.ensureCleanedUp();
        java.lang.String str11 = synonymsAnalysisTest8.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest8.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, true);
        synonymsAnalysisTest8.ensureCleanedUp();
        synonymsAnalysisTest8.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        synonymsAnalysisTest8.assertTermsEquals("tests.slow", indexReader21, terms22, terms23, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray8, intArray11);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray16, intArray19);
        org.junit.Assert.assertArrayEquals(intArray11, intArray16);
        org.junit.Assert.assertArrayEquals("", intArray4, intArray16);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray26, intArray29);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray38);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray47);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray53, intArray56);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray61, intArray64);
        org.junit.Assert.assertArrayEquals(intArray56, intArray61);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        org.junit.Assert.assertArrayEquals("", intArray56, intArray68);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray47, intArray68);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray38, intArray68);
        org.junit.Assert.assertArrayEquals(intArray26, intArray38);
        org.junit.Assert.assertArrayEquals("", intArray16, intArray26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest76 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        synonymsAnalysisTest76.assertTermsEquals("europarl.lines.txt.gz", indexReader78, terms79, terms80, false);
        synonymsAnalysisTest76.ensureAllSearchContextsReleased();
        synonymsAnalysisTest76.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest76.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader88 = null;
        org.apache.lucene.index.Fields fields89 = null;
        org.apache.lucene.index.Fields fields90 = null;
        synonymsAnalysisTest76.assertFieldsEquals("", indexReader88, fields89, fields90, true);
        synonymsAnalysisTest76.ensureCheckIndexPassed();
        synonymsAnalysisTest76.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) intArray26, (java.lang.Object) synonymsAnalysisTest76);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (byte) 100, 100.0d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.awaitsfix", indexReader11, fields12, fields13, false);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray19, shortArray24);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray19);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray29);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray39, shortArray44);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields13, (java.lang.Object) shortArray35);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader14, fields15, fields16, true);
        java.lang.String str19 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        char[] charArray26 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray32 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray38 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray39 = new char[][] { charArray26, charArray32, charArray38 };
        java.util.Set<char[]> charArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(charArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) charArraySet40);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest12.ensureCleanedUp();
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) doubleArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray2, doubleArray24, (double) '#');
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) (byte) 1);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray32, doubleArray35, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray35, (double) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) doubleArray35);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray14, shortArray19);
        java.lang.Object obj22 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray19, obj22);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray26, shortArray31);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray19, shortArray36);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        synonymsAnalysisTest40.assertTermsEquals("europarl.lines.txt.gz", indexReader42, terms43, terms44, false);
        synonymsAnalysisTest40.ensureAllSearchContextsReleased();
        synonymsAnalysisTest40.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest40.assertDocsSkippingEquals("random", indexReader51, (int) (short) 10, postingsEnum53, postingsEnum54, false);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray19, (java.lang.Object) synonymsAnalysisTest40);
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest40.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain58;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest60 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str61 = synonymsAnalysisTest60.getTestName();
        java.lang.String str62 = synonymsAnalysisTest60.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest63 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule64 = synonymsAnalysisTest63.ruleChain;
        synonymsAnalysisTest63.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain66 = synonymsAnalysisTest63.failureAndSuccessEvents;
        synonymsAnalysisTest60.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        synonymsAnalysisTest60.assertTermsEquals("tests.maxfailures", indexReader69, terms70, terms71, false);
        java.lang.Class<?> wildcardClass74 = synonymsAnalysisTest60.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray77 = (java.lang.Class<?>[]) classArray76;
        wildcardClassArray77[0] = wildcardClass74;
        java.util.Set<java.lang.Class<?>> wildcardClassSet80 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray77);
        java.util.Set<java.io.Serializable> serializableSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) wildcardClassArray77);
        java.util.Set<java.lang.Class<?>> wildcardClassSet82 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) wildcardClassSet82);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        synonymsAnalysisTest1.assertFieldsEquals("hi!", indexReader10, fields11, fields12, true);
        synonymsAnalysisTest1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        java.util.Set<int[]> intArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(intArray1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray5, longArray6);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray14);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray24, longArray25);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray29);
        org.junit.Assert.assertArrayEquals(longArray14, longArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray1, (java.lang.Object) longArray14);
        java.lang.Object obj35 = null;
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray39, longArray40);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray43, longArray44);
        org.junit.Assert.assertArrayEquals(longArray39, longArray44);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray48, longArray49);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray48, longArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray44, longArray53);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray59, longArray60);
        long[] longArray63 = new long[] {};
        long[] longArray64 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray63, longArray64);
        org.junit.Assert.assertArrayEquals(longArray59, longArray64);
        long[] longArray68 = new long[] {};
        long[] longArray69 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray68, longArray69);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray72, longArray73);
        org.junit.Assert.assertArrayEquals(longArray68, longArray73);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray59, longArray68);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray78, longArray79);
        long[] longArray82 = new long[] {};
        long[] longArray83 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray82, longArray83);
        org.junit.Assert.assertArrayEquals(longArray79, longArray83);
        org.junit.Assert.assertArrayEquals(longArray68, longArray83);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray53, longArray83);
        org.junit.Assert.assertNotSame("", obj35, (java.lang.Object) longArray53);
        org.junit.Assert.assertArrayEquals(longArray14, longArray53);
        long[] longArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray53, longArray90);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        short[] shortArray0 = null;
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) (-1L), (java.lang.Object) shortArray17);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray24, shortArray29);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray29);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray35, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray45);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray40);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray17, shortArray40);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray53, shortArray54);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray53, shortArray58);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray63, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray63, shortArray68);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray73);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray17, shortArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray17);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, (int) ' ', postingsEnum7, postingsEnum8);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.nightly", indexReader15, fields16, fields17, true);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray26, (java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray50);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray50);
        java.lang.Object[] objArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, objArray66);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        synonymsAnalysisTest7.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest7.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest7.tearDown();
        synonymsAnalysisTest7.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest7);
        synonymsAnalysisTest7.tearDown();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest7.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) ruleChain17);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        float[] floatArray5 = new float[] { 0L, (short) 100, (short) -1, (-1) };
        float[] floatArray11 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray16 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray16, (float) (byte) 100);
        float[] floatArray23 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray28 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray28, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray28, (float) 100);
        float[] floatArray37 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray42 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (byte) 100);
        float[] floatArray49 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray54 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray54, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray54, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray11, floatArray37, 1.0f);
        float[] floatArray65 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray70 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray70, (float) (byte) 100);
        float[] floatArray77 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray82 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray82, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray82, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray65, (float) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray11, 0.0f);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) '#', (long) '#');
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) 10, 100.0f, (float) '#');
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest5.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, false);
        synonymsAnalysisTest5.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        synonymsAnalysisTest16.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest16.failureAndSuccessEvents;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest16);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray28 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest0, synonymsAnalysisTest5, synonymsAnalysisTest16 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet29 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray28);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet30 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray28);
        short[] shortArray36 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray37 = new short[][] { shortArray36 };
        java.util.Set<short[]> shortArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) shortArraySet38, (java.lang.Object) executorServiceArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) synonymsAnalysisTestArray28, (java.lang.Object[]) executorServiceArray50);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray40, (java.lang.Object) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray52);
        java.lang.Object obj61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray52, obj61);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 6);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1L), (double) 0L);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) -1, (long) ' ');
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (short) 1);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 1.0d, (double) (-1), (double) 0);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) (short) 0, 10.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        float[] floatArray6 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray11 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) (byte) 100);
        float[] floatArray18 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray23 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (byte) 100);
        float[] floatArray30 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray35 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray35, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray35, (float) 100);
        float[] floatArray44 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray49 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray49, (float) (byte) 100);
        float[] floatArray56 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray61 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray61, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray11, floatArray61, (float) 100);
        float[] floatArray74 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray79 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray79, (float) (byte) 100);
        float[] floatArray86 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray91 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray86, floatArray91, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray91, 10.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray61, floatArray91, (float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray91);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray9);
        java.lang.Object obj12 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray9, obj12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray9, shortArray26);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest30 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule31 = synonymsAnalysisTest30.ruleChain;
        synonymsAnalysisTest30.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest30.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest30.ensureCheckIndexPassed();
        synonymsAnalysisTest30.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "tests.badapples", (java.lang.Object) synonymsAnalysisTest30);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 10, (long) (byte) -1);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 5, (long) (byte) 10);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 100.0f, (double) 100.0f);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray22, 10.0f);
        float[] floatArray31 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray36 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (byte) 100);
        float[] floatArray43 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray48 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray48, 10.0f);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray31, 100.0f);
        float[] floatArray59 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray64 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray64, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray31, floatArray64, (float) 6);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        java.lang.String str11 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.weekly", indexReader6, (int) '4', postingsEnum8, postingsEnum9, true);
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) ' ', postingsEnum16, postingsEnum17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum17);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.setUp();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray11, shortArray16);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray21);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray26, shortArray27);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray30, shortArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray26, shortArray31);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray36, shortArray37);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray36, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray21, shortArray46);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray54, shortArray59);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray54);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray64);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        synonymsAnalysisTest69.assertTermsEquals("europarl.lines.txt.gz", indexReader71, terms72, terms73, false);
        synonymsAnalysisTest69.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain78 = synonymsAnalysisTest69.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule79 = synonymsAnalysisTest69.ruleChain;
        synonymsAnalysisTest69.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest81 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader83 = null;
        org.apache.lucene.index.Terms terms84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        synonymsAnalysisTest81.assertTermsEquals("europarl.lines.txt.gz", indexReader83, terms84, terms85, false);
        synonymsAnalysisTest81.ensureAllSearchContextsReleased();
        synonymsAnalysisTest81.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str91 = synonymsAnalysisTest81.getTestName();
        java.lang.String str92 = synonymsAnalysisTest81.getTestName();
        org.junit.rules.RuleChain ruleChain93 = synonymsAnalysisTest81.failureAndSuccessEvents;
        synonymsAnalysisTest69.failureAndSuccessEvents = ruleChain93;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) shortArray64, (java.lang.Object) synonymsAnalysisTest69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest69);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray7, (java.lang.Object) synonymsAnalysisTest14);
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest14.assertDocsEnumEquals("tests.monster", postingsEnum21, postingsEnum22, false);
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest14.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray6, (java.lang.Object) synonymsAnalysisTest13);
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.monster", postingsEnum20, postingsEnum21, false);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str26 = synonymsAnalysisTest13.getTestName();
        synonymsAnalysisTest13.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        synonymsAnalysisTest13.assertTermsEquals("tests.monster", indexReader30, terms31, terms32, true);
        synonymsAnalysisTest13.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        synonymsAnalysisTest13.assertFieldsEquals("tests.maxfailures", indexReader38, fields39, fields40, false);
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest13.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum45, postingsEnum46);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 10L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain3 = null;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest2.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, true);
        java.lang.String str11 = synonymsAnalysisTest2.getTestName();
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest25 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule26 = synonymsAnalysisTest25.ruleChain;
        synonymsAnalysisTest25.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain28 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray18, (java.lang.Object) synonymsAnalysisTest25);
        synonymsAnalysisTest25.ensureCheckIndexPassed();
        synonymsAnalysisTest25.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) synonymsAnalysisTest25);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("tests.slow", indexReader34, 1, postingsEnum36, postingsEnum37, true);
        char[] charArray41 = new char[] { '#' };
        char[] charArray43 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray41, charArray43);
        char[] charArray47 = new char[] { '#' };
        char[] charArray49 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray47, charArray49);
        char[] charArray52 = new char[] { '#' };
        char[] charArray54 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray52, charArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray47, charArray52);
        org.junit.Assert.assertArrayEquals(charArray43, charArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) "tests.slow", (java.lang.Object) charArray52);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) 6, (double) (short) 100);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        java.lang.String str12 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (short) -1, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.lang.String str5 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest17.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest17.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest17.failureAndSuccessEvents;
        synonymsAnalysisTest17.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest17);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest1, synonymsAnalysisTest6, synonymsAnalysisTest17 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet30 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray29);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet31 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray29);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule47 = synonymsAnalysisTest46.ruleChain;
        synonymsAnalysisTest46.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain49 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray39, (java.lang.Object) synonymsAnalysisTest46);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) synonymsAnalysisTestArray29, (java.lang.Object[]) executorServiceArray52);
    }
}

