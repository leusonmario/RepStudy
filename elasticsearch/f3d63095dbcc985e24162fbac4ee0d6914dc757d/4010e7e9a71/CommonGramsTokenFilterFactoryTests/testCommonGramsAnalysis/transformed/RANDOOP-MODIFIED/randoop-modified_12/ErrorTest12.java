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
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests25.setUp();
        commonGramsTokenFilterFactoryTests25.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling23, (java.lang.Object) testRule31);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) strArray17, (java.lang.Object) throttling23);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray47);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray58);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray58, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray61);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray71);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray71, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray61);
        byte[][][] byteArray80 = new byte[][][] {};
        byte[][][] byteArray81 = new byte[][][] {};
        byte[][][] byteArray82 = new byte[][][] {};
        byte[][][] byteArray83 = new byte[][][] {};
        byte[][][][] byteArray84 = new byte[][][][] { byteArray80, byteArray81, byteArray82, byteArray83 };
        java.util.Set<byte[][][]> byteArraySet85 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray61, (java.lang.Object[]) byteArray84);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6002");
        float[] floatArray1 = new float[] { (short) 1 };
        float[] floatArray3 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) '#');
        float[] floatArray7 = new float[] { (short) 1 };
        float[] floatArray9 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray9, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, (float) '4');
        float[] floatArray16 = new float[] { (short) 1 };
        float[] floatArray18 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) '#');
        float[] floatArray22 = new float[] { (short) 1 };
        float[] floatArray24 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray18, floatArray22, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray22, (float) 10L);
        float[] floatArray32 = new float[] { (short) 1 };
        float[] floatArray34 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray34, (float) '#');
        float[] floatArray38 = new float[] { (short) 1 };
        float[] floatArray40 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray40, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray38, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray38, (float) 10L);
        float[] floatArray52 = new float[] { (short) 1 };
        float[] floatArray54 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray54, (float) '#');
        float[] floatArray58 = new float[] { (short) 1 };
        float[] floatArray60 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray60, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray54, floatArray58, (float) 100);
        float[] floatArray66 = new float[] { (short) 1 };
        float[] floatArray68 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray68, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray54, floatArray68, (float) 3);
        float[] floatArray74 = new float[] { (short) 1 };
        float[] floatArray76 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray76, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray68, floatArray76, 100.0f);
        float[] floatArray82 = new float[] { (short) 1 };
        float[] floatArray84 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray82, floatArray84, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray68, floatArray84, 0.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray68, (float) 0);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6003");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader16, fields17, fields18, false);
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("enwiki.random.lines.txt", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader29, terms30, terms31, false);
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("hi!", (int) ' ', numericDocValues36, numericDocValues37);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6004");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("<unknown>", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, true);
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("tests.badapples", indexReader25, (int) (byte) -1, postingsEnum27, postingsEnum28);
        commonGramsTokenFilterFactoryTests18.setUp();
        commonGramsTokenFilterFactoryTests18.tearDown();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests18.ruleChain;
        java.lang.Class<?> wildcardClass35 = testRule34.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) testRule17, (java.lang.Object) wildcardClass35);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6005");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray11);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("", byteArray17, byteArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray26, longArray27);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals(longArray23, longArray29);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray29, (java.lang.Object) byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals("", byteArray44, byteArray46);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray53, longArray54);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        org.junit.Assert.assertArrayEquals(longArray53, longArray56);
        org.junit.Assert.assertArrayEquals(longArray50, longArray56);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray56, (java.lang.Object) byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray61);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray11, byteArray34);
        byte[] byteArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray34, byteArray69);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6006");
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
        double[] doubleArray30 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray37 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray37, (double) 100.0f);
        double[] doubleArray46 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray53 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray53, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray46, (double) 4);
        double[] doubleArray64 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray71 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray64, doubleArray71, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray64, (double) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) doubleArray64);
        double[] doubleArray77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray64, doubleArray77, 10.0d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6007");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests8.assertPositionsSkippingEquals("tests.badapples", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18);
        commonGramsTokenFilterFactoryTests8.setUp();
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) builder7, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests8.assertDocValuesEquals("hi!", (int) (byte) 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6008");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.maxfailures", indexReader13, (int) ' ', postingsEnum15, postingsEnum16, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.maxfailures", indexReader21, terms22, terms23, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("hi!", postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, (int) (byte) 100, postingsEnum36, postingsEnum37);
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder41 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests26.tearDown();
        java.lang.Class<?> wildcardClass43 = commonGramsTokenFilterFactoryTests26.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader21, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6009");
        long[] longArray5 = new long[] { 1, 3, (short) 10, 0, (short) 1 };
        long[] longArray11 = new long[] { 1, 3, (short) 10, 0, (short) 1 };
        long[][] longArray12 = new long[][] { longArray5, longArray11 };
        long[][][] longArray13 = new long[][][] { longArray12 };
        java.util.Set<long[][]> longArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        org.junit.Assert.assertArrayEquals(longArray20, longArray23);
        org.junit.Assert.assertArrayEquals(longArray16, longArray20);
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
        org.junit.Assert.assertArrayEquals("random", longArray20, longArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) longArray13, (java.lang.Object) longArray36);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, (double) 1.0f, 0.0d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6011");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.setUp();
        java.lang.String str22 = commonGramsTokenFilterFactoryTests19.getTestName();
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("<unknown>", indexReader26, 6, postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsSkippingEquals("tests.awaitsfix", indexReader32, (int) (byte) -1, postingsEnum34, postingsEnum35, true);
        commonGramsTokenFilterFactoryTests19.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests39.setUp();
        commonGramsTokenFilterFactoryTests39.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests43.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests43.assertDocsEnumEquals("hi!", postingsEnum46, postingsEnum47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader51, (int) (byte) 100, postingsEnum53, postingsEnum54);
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests43.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests43, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests43.assertPositionsSkippingEquals("<unknown>", indexReader60, 6, postingsEnum62, postingsEnum63);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests43);
        org.elasticsearch.common.settings.Settings.Builder builder66 = commonGramsTokenFilterFactoryTests43.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests67.ruleChain;
        commonGramsTokenFilterFactoryTests67.setUp();
        java.lang.String str70 = commonGramsTokenFilterFactoryTests67.getTestName();
        commonGramsTokenFilterFactoryTests67.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests67.tearDown();
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests67.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests43, (java.lang.Object) commonGramsTokenFilterFactoryTests67);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests67.assertPositionsSkippingEquals("", indexReader76, 2, postingsEnum78, postingsEnum79);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) postingsEnum79);
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum86, postingsEnum87);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6012");
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
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray36, longArray37);
        long[] longArray39 = new long[] {};
        long[] longArray40 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray39, longArray40);
        org.junit.Assert.assertArrayEquals(longArray36, longArray39);
        org.junit.Assert.assertArrayEquals(longArray33, longArray39);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray39, (java.lang.Object) byteArray44);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        java.lang.Iterable[] iterableArray55 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray56 = (java.lang.Iterable<java.lang.String>[]) iterableArray55;
        strIterableArray56[0] = strSet49;
        strIterableArray56[1] = strSet51;
        strIterableArray56[2] = strSet53;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray44, (java.lang.Object) strIterableArray56);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray44);
        byte[] byteArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray66);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6013");
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) luceneTestCaseArray1);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6014");
        java.lang.Object obj1 = null;
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
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("random", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests4);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray27);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests44, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests44.setUp();
        commonGramsTokenFilterFactoryTests44.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests44.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling42, (java.lang.Object) testRule50);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) strArray36, (java.lang.Object) throttling42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) strArray36);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1.0f, (-1.0d));
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6016");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray10);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        org.junit.Assert.assertArrayEquals(longArray16, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        org.junit.Assert.assertArrayEquals("hi!", longArray19, longArray24);
        org.junit.Assert.assertNotNull("", (java.lang.Object) longArray24);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray30, longArray31);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        org.junit.Assert.assertArrayEquals(longArray30, longArray33);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray33, longArray46);
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray33, longArray63);
        org.junit.Assert.assertArrayEquals(longArray24, longArray63);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.setUp();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests66.assertDocsSkippingEquals("", indexReader72, (int) (byte) 0, postingsEnum74, postingsEnum75, true);
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        java.lang.String str79 = commonGramsTokenFilterFactoryTests66.getTestName();
        commonGramsTokenFilterFactoryTests66.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) longArray24, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertArrayEquals(longArray5, longArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) longArray24);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6017");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 1);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6018");
        double[] doubleArray1 = null;
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
        double[] doubleArray59 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray66 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray66, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray59, (double) 4);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray9, doubleArray59, (double) 1);
        double[] doubleArray79 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray86 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray79, doubleArray86, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray79, (double) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray1, doubleArray59, (double) 1);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6019");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("tests.failfast", postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader43, 3, postingsEnum45, postingsEnum46, true);
        commonGramsTokenFilterFactoryTests36.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests36, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotEquals((java.lang.Object) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
        org.elasticsearch.common.settings.Settings.Builder builder54 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests55.ruleChain;
        commonGramsTokenFilterFactoryTests55.setUp();
        commonGramsTokenFilterFactoryTests55.tearDown();
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        commonGramsTokenFilterFactoryTests55.assertDocsSkippingEquals("tests.badapples", indexReader61, (-1), postingsEnum63, postingsEnum64, false);
        commonGramsTokenFilterFactoryTests55.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests55.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) builder54, (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests55);
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests55.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum72, postingsEnum73);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) (short) 100);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6021");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals(intArray15, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray18, intArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray7, intArray18);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray32, intArray35);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray43, intArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray32, intArray43);
        org.junit.Assert.assertArrayEquals(intArray18, intArray32);
        org.junit.Assert.assertArrayEquals(intArray4, intArray18);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals(intArray59, intArray62);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray67);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        org.junit.Assert.assertArrayEquals(intArray66, intArray69);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray59, intArray66);
        org.junit.Assert.assertArrayEquals(intArray4, intArray59);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals(intArray75, intArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray59, intArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray1, intArray59);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6022");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        java.lang.String str6 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader8, fields9, fields10, false);
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
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("<unknown>", indexReader31, 6, postingsEnum33, postingsEnum34);
        java.lang.String str36 = commonGramsTokenFilterFactoryTests14.getTestName();
        commonGramsTokenFilterFactoryTests14.setUp();
        commonGramsTokenFilterFactoryTests14.setIndexWriterMaxDocs(3);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) 3);
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
        org.junit.Assert.assertArrayEquals(intArray45, intArray49);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray57, intArray60);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray49, intArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) 3, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (-1.0f), (float) (byte) 1, 0.0f);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6024");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("", byteArray12, byteArray14);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals(longArray21, longArray24);
        org.junit.Assert.assertArrayEquals(longArray18, longArray24);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray24, (java.lang.Object) byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray29);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("", byteArray39, byteArray41);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray45, longArray46);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray48, longArray49);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray51, longArray52);
        org.junit.Assert.assertArrayEquals(longArray48, longArray51);
        org.junit.Assert.assertArrayEquals(longArray45, longArray51);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray51, (java.lang.Object) byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray29);
        org.junit.Assert.assertNotNull((java.lang.Object) byteArray3);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray70, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray70);
        long[] longArray78 = new long[] {};
        long[] longArray79 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray78, longArray79);
        long[] longArray81 = new long[] {};
        long[] longArray82 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray81, longArray82);
        long[] longArray84 = new long[] {};
        long[] longArray85 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray84, longArray85);
        org.junit.Assert.assertArrayEquals(longArray81, longArray84);
        org.junit.Assert.assertArrayEquals(longArray78, longArray84);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray89, byteArray90);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray84, (java.lang.Object) byteArray89);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray67, byteArray89);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6025");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("", charArray2, charArray5);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests9 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests9.setUp();
        commonGramsTokenFilterFactoryTests9.setUp();
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
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests9, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) charArray5, (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests13);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6026");
        double[] doubleArray6 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray13 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 100.0f);
        double[] doubleArray22 = new double[] { 10.0f, 1.0f, (byte) 10, (-1.0d), (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray22, (double) 5);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100.0f, (double) (short) 100);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6028");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, 1, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("hi!", indexReader20, fields21, fields22, false);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6029");
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
        java.lang.String str20 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader23, 5, postingsEnum25, postingsEnum26, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests29.assertDocsEnumEquals("hi!", postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader37, (int) (byte) 100, postingsEnum39, postingsEnum40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("tests.nightly", indexReader43, fields44, fields45, true);
        commonGramsTokenFilterFactoryTests29.tearDown();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        org.junit.Assert.assertNotEquals((java.lang.Object) false, (java.lang.Object) testRule49);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests54 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule55 = commonGramsTokenFilterFactoryTests54.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests54, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        commonGramsTokenFilterFactoryTests54.assertDocsSkippingEquals("", indexReader59, 0, postingsEnum61, postingsEnum62, true);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Fields fields67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        commonGramsTokenFilterFactoryTests54.assertFieldsEquals("tests.weekly", indexReader66, fields67, fields68, true);
        commonGramsTokenFilterFactoryTests54.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule72 = commonGramsTokenFilterFactoryTests54.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) testRule49, (java.lang.Object) testRule72);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6030");
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
        short[] shortArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray10, shortArray34);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 100L, (double) 100, 100.0d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 5, (float) (byte) 0);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6035");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests3.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", obj1, (java.lang.Object) str10);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6036");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests8.assertTermsEquals("tests.slow", indexReader12, terms13, terms14, false);
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests8.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) builder7, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1.0d), 10.0d, (double) 'a');
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6038");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("tests.awaitsfix", indexReader20, 1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) 100, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.maxfailures", postingsEnum33, postingsEnum34, true);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) true);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1.0d, (double) 100.0f);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6040");
        byte[] byteArray1 = null;
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setUp();
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("tests.nightly", indexReader22, (int) (short) -1, postingsEnum24, postingsEnum25);
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) byteArray8, (java.lang.Object) postingsEnum24);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray29, byteArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray8, byteArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray29);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (short) 1, (double) (-1.0f));
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6042");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '#', (long) 0);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6044");
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
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6045");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.setUp();
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) strArray20);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray48);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray48, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) strArray38);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray61);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        java.util.Set<java.lang.String> strSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray67);
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] { locale73, "<unknown>", "tests.maxfailures" };
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray67, (java.lang.Object[]) serializableArray76);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6046");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray23);
        org.junit.Assert.assertArrayEquals("", shortArray16, shortArray20);
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
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray32);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray56);
        org.junit.Assert.assertArrayEquals("", shortArray49, shortArray53);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray72);
        org.junit.Assert.assertArrayEquals("", shortArray65, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray65);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray8, shortArray32);
        java.lang.Object obj80 = null;
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray82);
        short[] shortArray84 = new short[] {};
        short[] shortArray85 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray85);
        org.junit.Assert.assertNotEquals("tests.monster", obj80, (java.lang.Object) shortArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray32, shortArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray32);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6047");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray7, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals(intArray15, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray22, intArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray18, intArray25);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray7, intArray18);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray32, intArray35);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        org.junit.Assert.assertArrayEquals(intArray40, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray43, intArray50);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray32, intArray43);
        org.junit.Assert.assertArrayEquals(intArray18, intArray32);
        org.junit.Assert.assertArrayEquals(intArray4, intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray18);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 10, 100.0d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 1, 1L);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6050");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests23.setUp();
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) strSet29);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests23.assertDocsEnumEquals("", postingsEnum32, postingsEnum33, false);
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests38 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests38.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests38, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests38.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) commonGramsTokenFilterFactoryTests38);
        org.elasticsearch.common.settings.Settings.Builder builder44 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests45.ruleChain;
        commonGramsTokenFilterFactoryTests45.setUp();
        commonGramsTokenFilterFactoryTests45.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder49 = commonGramsTokenFilterFactoryTests45.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests45);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) commonGramsTokenFilterFactoryTests45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6051");
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
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader21, terms22, terms23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.nightly", (int) 'a', numericDocValues35, numericDocValues36);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6053");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray15, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray27);
        org.junit.Assert.assertArrayEquals(charArray20, charArray27);
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
        org.junit.Assert.assertArrayEquals(charArray20, charArray37);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray48, charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray51, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray60, charArray63);
        org.junit.Assert.assertArrayEquals(charArray56, charArray63);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        org.junit.Assert.assertArrayEquals("", charArray70, charArray73);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray73, charArray78);
        org.junit.Assert.assertArrayEquals(charArray56, charArray73);
        org.junit.Assert.assertArrayEquals(charArray37, charArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray7, (java.lang.Object) charArray56);
        java.util.Set<java.lang.CharSequence> charSequenceSet84 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, strArray7);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6054");
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
        commonGramsTokenFilterFactoryTests3.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        java.lang.String[][][] strArray21 = new java.lang.String[][][] {};
        java.util.Set<java.lang.String[][]> strArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.io.Serializable> serializableSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray21);
        java.lang.Object obj24 = null;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) serializableSet23, obj24);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3, obj24);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests3.assertDocValuesEquals("tests.nightly", 0, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6055");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Locale[] localeArray2 = new java.util.Locale[] {};
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.Locale[] localeArray4 = new java.util.Locale[] {};
        java.util.Locale[][] localeArray5 = new java.util.Locale[][] { localeArray0, localeArray1, localeArray2, localeArray3, localeArray4 };
        java.util.Set<java.util.Locale[]> localeArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray5);
        java.lang.Object[] objArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray5, objArray7);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 100, (long) (short) 0);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6057");
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
        java.lang.String str20 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.nightly", indexReader22, terms23, terms24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader28, terms29, terms30, true);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.nightly", indexReader34, (int) (byte) 1, postingsEnum36, postingsEnum37);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.failfast", postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader46, 3, postingsEnum48, postingsEnum49, true);
        commonGramsTokenFilterFactoryTests39.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests53.ruleChain;
        commonGramsTokenFilterFactoryTests53.setUp();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests53.ruleChain;
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests53.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        java.lang.String str62 = commonGramsTokenFilterFactoryTests39.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests39.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) builder63);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6058");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray10 = new java.io.Serializable[][] { serializableArray3, serializableArray5, serializableArray7, serializableArray9 };
        java.util.Set<java.io.Serializable[]> serializableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.util.Set<java.io.Serializable[]> serializableArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray23 = new java.io.Serializable[][] { serializableArray16, serializableArray18, serializableArray20, serializableArray22 };
        java.util.Set<java.io.Serializable[]> serializableArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray23);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray23);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) serializableArray10, (java.lang.Object[]) serializableArray23);
        java.util.Set<java.lang.Object[]> objArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) serializableArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray23);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray58);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray58, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray39);
        org.apache.lucene.util.LuceneTestCase[][][][] luceneTestCaseArray67 = new org.apache.lucene.util.LuceneTestCase[][][][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[][][]> luceneTestCaseArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray67);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[][][]> luceneTestCaseArraySet69 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray67);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray39, (java.lang.Object[]) luceneTestCaseArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) serializableArray23, (java.lang.Object[]) luceneTestCaseArray67);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6060");
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
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray66);
        short[] shortArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray73);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) ' ', (float) 3, (-1.0f));
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (-1L));
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6063");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader4, terms5, terms6, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.awaitsfix", (int) '#', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6064");
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
        float[] floatArray27 = new float[] { (short) 1 };
        float[] floatArray29 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray29, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray21, floatArray29, 100.0f);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        float[] floatArray41 = new float[] { (short) 1 };
        float[] floatArray43 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, 10.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray29, floatArray43, (float) (short) -1);
        float[] floatArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray50, (float) 0);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6065");
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
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, true);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray18 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray18);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray18);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray18, (java.lang.Object[]) strArray32);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("tests.failfast", postingsEnum43, postingsEnum44, false);
        commonGramsTokenFilterFactoryTests40.setUp();
        commonGramsTokenFilterFactoryTests40.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests40.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) luceneTestCaseArray18, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader13, (java.lang.Object) luceneTestCaseArray18);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, 0.0d, (double) 10.0f);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6067");
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
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals("", charArray38, charArray41);
        org.junit.Assert.assertArrayEquals(charArray34, charArray41);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray48, charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray51, charArray56);
        org.junit.Assert.assertArrayEquals(charArray34, charArray51);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals("", charArray61, charArray64);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray64, charArray68);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray73, charArray76);
        org.junit.Assert.assertArrayEquals(charArray64, charArray76);
        org.junit.Assert.assertArrayEquals("", charArray51, charArray64);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray11, charArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray51);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (-1.0f), (float) 100L, (float) 10L);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 1, 10.0f, (float) 0);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6070");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum8, postingsEnum9, false);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6071");
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
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.monster", indexReader14, terms15, terms16, false);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(3);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder22 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100.0f, 0.0f, (float) ' ');
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6073");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests24.setUp();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests24);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) '4');
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6075");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        commonGramsTokenFilterFactoryTests26.setUp();
        commonGramsTokenFilterFactoryTests26.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests26.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        org.junit.Assert.assertNotNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests26);
        commonGramsTokenFilterFactoryTests26.tearDown();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs(4);
        java.lang.Object obj38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) 4, obj38);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6076");
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
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.badapples", indexReader22, terms23, terms24, false);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder28 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader31, fields32, fields33, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("hi!", postingsEnum39, postingsEnum40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests36.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader44, (int) (byte) 100, postingsEnum46, postingsEnum47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        commonGramsTokenFilterFactoryTests36.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, true);
        java.lang.String str55 = commonGramsTokenFilterFactoryTests36.getTestName();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests36.assertFieldsEquals("", indexReader57, fields58, fields59, true);
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6077");
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
        java.lang.String str12 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str13 = commonGramsTokenFilterFactoryTests0.getTestName();
        java.lang.String str14 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("tests.awaitsfix", indexReader27, 1, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader33, (int) (byte) 100, postingsEnum35, postingsEnum36, false);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("hi!", indexReader40, fields41, fields42, false);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("tests.monster", indexReader47, 0, postingsEnum49, postingsEnum50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6078");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6079");
        short[] shortArray2 = new short[] { (byte) 0 };
        short[] shortArray4 = new short[] { (byte) 0 };
        short[] shortArray6 = new short[] { (byte) 0 };
        short[] shortArray8 = new short[] { (byte) 0 };
        short[] shortArray10 = new short[] { (byte) 0 };
        short[][] shortArray11 = new short[][] { shortArray2, shortArray4, shortArray6, shortArray8, shortArray10 };
        short[] shortArray13 = new short[] { (byte) 0 };
        short[] shortArray15 = new short[] { (byte) 0 };
        short[] shortArray17 = new short[] { (byte) 0 };
        short[] shortArray19 = new short[] { (byte) 0 };
        short[] shortArray21 = new short[] { (byte) 0 };
        short[][] shortArray22 = new short[][] { shortArray13, shortArray15, shortArray17, shortArray19, shortArray21 };
        short[] shortArray24 = new short[] { (byte) 0 };
        short[] shortArray26 = new short[] { (byte) 0 };
        short[] shortArray28 = new short[] { (byte) 0 };
        short[] shortArray30 = new short[] { (byte) 0 };
        short[] shortArray32 = new short[] { (byte) 0 };
        short[][] shortArray33 = new short[][] { shortArray24, shortArray26, shortArray28, shortArray30, shortArray32 };
        short[][][] shortArray34 = new short[][][] { shortArray11, shortArray22, shortArray33 };
        java.util.Set<short[][]> shortArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray34);
        java.util.Set<short[][]> shortArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray34);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray34);
        java.util.Set<short[][]> shortArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray34);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        commonGramsTokenFilterFactoryTests39.setUp();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests39.ruleChain;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("tests.maxfailures", indexReader44, fields45, fields46, false);
        commonGramsTokenFilterFactoryTests39.overrideTestDefaultQueryCache();
        java.lang.String str50 = commonGramsTokenFilterFactoryTests39.getTestName();
        java.lang.String str51 = commonGramsTokenFilterFactoryTests39.getTestName();
        commonGramsTokenFilterFactoryTests39.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) shortArray34, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6080");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.failfast", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader17, 3, postingsEnum19, postingsEnum20, true);
        commonGramsTokenFilterFactoryTests10.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) (-1.0d));
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum28, postingsEnum29, false);
        java.lang.String str32 = commonGramsTokenFilterFactoryTests10.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule34);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6081");
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
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray28);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray34, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray34);
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
        commonGramsTokenFilterFactoryTests42.setUp();
        commonGramsTokenFilterFactoryTests42.tearDown();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray34, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6082");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6083");
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
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum13, postingsEnum14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6084");
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
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        commonGramsTokenFilterFactoryTests20.assertTermsEquals("tests.maxfailures", indexReader48, terms49, terms50, true);
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests20.assertDocValuesEquals("", (int) (short) 1, numericDocValues55, numericDocValues56);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6085");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader6, 4, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("europarl.lines.txt.gz", 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 1.0f, (float) 5, (float) (short) 1);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6087");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) throttlingArray2, (java.lang.Object) '#');
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingArray2);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (-1.0f), (double) 3);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6089");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        commonGramsTokenFilterFactoryTests8.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        java.lang.String str15 = commonGramsTokenFilterFactoryTests8.getTestName();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("tests.slow", indexReader19, (int) ' ', postingsEnum21, postingsEnum22, true);
        java.lang.Class<?> wildcardClass25 = commonGramsTokenFilterFactoryTests8.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.setUp();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests28.ruleChain;
        commonGramsTokenFilterFactoryTests28.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClass25, (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsSkippingEquals("<unknown>", indexReader39, 0, postingsEnum41, postingsEnum42, true);
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.setUp();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        commonGramsTokenFilterFactoryTests36.assertFieldsEquals("enwiki.random.lines.txt", indexReader48, fields49, fields50, false);
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests36.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass25, (java.lang.Object) commonGramsTokenFilterFactoryTests36);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (-1.0d));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6091");
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
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray89, (double) 100L);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 10.0d, (double) 4, (double) 100.0f);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6093");
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
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale57, locale59, locale61, locale63, locale65, locale67 };
        java.util.Set<java.util.Locale> localeSet69 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray68);
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) annotatedElementArray41, (java.lang.Object[]) localeArray68);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 6, 0.0d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6095");
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
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.nightly", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader26, 100, postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("tests.monster", 6, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6096");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader27, (int) (byte) 0, postingsEnum29, postingsEnum30);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6097");
        short[] shortArray0 = null;
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
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray39);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray27, shortArray52);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        java.lang.Object obj63 = null;
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArray61, obj63);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray61);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray10);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6098");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests8.setUp();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) strSet14);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(4);
        org.elasticsearch.common.settings.Settings.Builder builder20 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) builder23);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6099");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder4 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.maxfailures");
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6100");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("<unknown>", indexReader11, fields12, fields13, false);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("tests.monster", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests24.ruleChain;
        commonGramsTokenFilterFactoryTests24.setUp();
        commonGramsTokenFilterFactoryTests24.tearDown();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, false);
        commonGramsTokenFilterFactoryTests24.tearDown();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests37.setUp();
        commonGramsTokenFilterFactoryTests37.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests41.assertDocsEnumEquals("hi!", postingsEnum44, postingsEnum45, false);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader49, (int) (byte) 100, postingsEnum51, postingsEnum52);
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests41.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests41, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests41.assertPositionsSkippingEquals("<unknown>", indexReader58, 6, postingsEnum60, postingsEnum61);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        commonGramsTokenFilterFactoryTests41.setUp();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) testRule36, (java.lang.Object) commonGramsTokenFilterFactoryTests41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 10, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6101");
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray0 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray0);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray0);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray9, (java.lang.Object) 1.0d);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray0, (java.lang.Object[]) strArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) luceneTestCaseArray0);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), 0L);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6104");
        long[] longArray0 = null;
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray16);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        org.junit.Assert.assertArrayEquals("hi!", longArray16, longArray21);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals(longArray25, longArray28);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        org.junit.Assert.assertArrayEquals("hi!", longArray28, longArray33);
        org.junit.Assert.assertArrayEquals(longArray21, longArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray8, longArray21);
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray8, longArray38);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        org.junit.Assert.assertArrayEquals(longArray45, longArray48);
        org.junit.Assert.assertArrayEquals("", longArray42, longArray45);
        org.junit.Assert.assertArrayEquals("", longArray38, longArray42);
        long[] longArray53 = new long[] {};
        long[] longArray54 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray53, longArray54);
        org.junit.Assert.assertArrayEquals(longArray38, longArray53);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests58.ruleChain;
        commonGramsTokenFilterFactoryTests58.setUp();
        commonGramsTokenFilterFactoryTests58.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder62 = commonGramsTokenFilterFactoryTests58.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests58);
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        java.lang.String str65 = commonGramsTokenFilterFactoryTests58.getTestName();
        commonGramsTokenFilterFactoryTests58.setUp();
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests58.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder68 = commonGramsTokenFilterFactoryTests58.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) longArray38, (java.lang.Object) builder68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray38);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6105");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) testRule4);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) testRule4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) testRule4);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1L), (long) (byte) 10);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6107");
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
        java.lang.String str15 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader17, (int) (byte) 0, postingsEnum19, postingsEnum20);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6108");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (short) 1);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6110");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(10);
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        float[] floatArray41 = new float[] { (short) 1 };
        float[] floatArray43 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray37, floatArray41, (float) 100);
        float[] floatArray49 = new float[] { (short) 1 };
        float[] floatArray51 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray51, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray37, floatArray51, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray37, (float) (short) 1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests58.ruleChain;
        commonGramsTokenFilterFactoryTests58.setUp();
        commonGramsTokenFilterFactoryTests58.tearDown();
        commonGramsTokenFilterFactoryTests58.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests58.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests58.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests66 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule67 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.setUp();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests66.ruleChain;
        commonGramsTokenFilterFactoryTests66.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests66.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        commonGramsTokenFilterFactoryTests66.assertTermsEquals("", indexReader73, terms74, terms75, true);
        org.elasticsearch.common.settings.Settings.Builder builder78 = commonGramsTokenFilterFactoryTests66.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) builder78);
        java.lang.Class<?> wildcardClass80 = builder78.getClass();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) floatArray21, (java.lang.Object) wildcardClass80);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) wildcardClass80);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("", postingsEnum84, postingsEnum85);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6111");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6112");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader7, (int) (byte) 100, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.common.settings.Settings.Builder builder13 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        java.lang.String str17 = commonGramsTokenFilterFactoryTests14.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests14.assertTermsEquals("<unknown>", indexReader19, terms20, terms21, false);
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.setUp();
        commonGramsTokenFilterFactoryTests14.tearDown();
        commonGramsTokenFilterFactoryTests14.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0, 1.0d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6114");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader7, 3, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str23 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", 3, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) ' ', (double) (byte) 10);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) '4');
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 10, (double) 'a', (double) ' ');
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 10L, (float) 1);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6119");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) strArray19);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray37);
        java.lang.Object[] objArray56 = new java.lang.Object[] {};
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray2, objArray56);
        java.lang.Object[] objArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray56, objArray58);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (short) 0, (double) 100, (double) 100L);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6121");
        java.lang.Object obj0 = null;
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray5, intArray25);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals(intArray38, intArray41);
        org.junit.Assert.assertArrayEquals("random", intArray36, intArray38);
        org.junit.Assert.assertArrayEquals(intArray25, intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) intArray38);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6122");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
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
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray5, byteArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray5);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6123");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("hi!", postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) (byte) 100, postingsEnum20, postingsEnum21);
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests10.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests10.assertPositionsSkippingEquals("<unknown>", indexReader27, 6, postingsEnum29, postingsEnum30);
        java.lang.String str32 = commonGramsTokenFilterFactoryTests10.getTestName();
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.setIndexWriterMaxDocs(3);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        commonGramsTokenFilterFactoryTests10.assertTermsEquals("tests.failfast", indexReader37, terms38, terms39, false);
        commonGramsTokenFilterFactoryTests10.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.monster", postingsEnum45, postingsEnum46, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) postingsEnum45);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6124");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 1);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6125");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader7, 3, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader15, (int) (short) 100, postingsEnum17, postingsEnum18, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("hi!", indexReader24, 2, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", (int) (byte) 0, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) 2, (float) (short) -1);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) -1, (long) ' ');
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6128");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 1.0f);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6129");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) 1, (double) 'a');
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (long) 100, 100L);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) (byte) 100, (float) 0L);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6132");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray15 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray15, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray8, (double) '#');
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 5, (long) 10);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6134");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.monster", indexReader11, 2, postingsEnum13, postingsEnum14, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", 6, numericDocValues20, numericDocValues21);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6135");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray21, intArray28);
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
        org.junit.Assert.assertArrayEquals(intArray36, intArray40);
        org.junit.Assert.assertArrayEquals(intArray21, intArray36);
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
        org.junit.Assert.assertArrayEquals(intArray21, intArray50);
        org.junit.Assert.assertArrayEquals(intArray9, intArray50);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals(intArray68, intArray71);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray76);
        int[] intArray78 = new int[] {};
        int[] intArray79 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray78, intArray79);
        org.junit.Assert.assertArrayEquals(intArray75, intArray78);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray68, intArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray50, intArray68);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6137");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader15, terms16, terms17, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6138");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 2, (-1.0f), (float) 0L);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0L, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6140");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests18.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        commonGramsTokenFilterFactoryTests18.assertTermsEquals("", indexReader25, terms26, terms27, true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str33 = commonGramsTokenFilterFactoryTests32.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader12, (java.lang.Object) commonGramsTokenFilterFactoryTests32);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6141");
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray23, doubleArray59, 10.0d);
        double[] doubleArray93 = new double[] { 0.0f, 0L, 0, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray93, (double) 'a');
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 10, (double) (byte) 100, (double) 5);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6143");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.awaitsfix", indexReader17, terms18, terms19, false);
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.monster", indexReader24, fields25, fields26, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests31 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests31.ruleChain;
        commonGramsTokenFilterFactoryTests31.setUp();
        commonGramsTokenFilterFactoryTests31.tearDown();
        commonGramsTokenFilterFactoryTests31.setUp();
        java.lang.String str36 = commonGramsTokenFilterFactoryTests31.getTestName();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        commonGramsTokenFilterFactoryTests31.assertTermsEquals("tests.badapples", indexReader38, terms39, terms40, true);
        commonGramsTokenFilterFactoryTests31.tearDown();
        commonGramsTokenFilterFactoryTests31.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests31.ruleChain;
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests31);
        commonGramsTokenFilterFactoryTests31.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests31);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6144");
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
        org.junit.Assert.assertArrayEquals("random", intArray2, intArray17);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals(intArray32, intArray35);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray39, intArray42);
        org.junit.Assert.assertArrayEquals(intArray35, intArray39);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray39, intArray47);
        org.junit.Assert.assertArrayEquals(intArray2, intArray39);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals(intArray57, intArray60);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        org.junit.Assert.assertArrayEquals(intArray64, intArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray57, intArray64);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        org.junit.Assert.assertArrayEquals(intArray73, intArray76);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray80, intArray81);
        int[] intArray83 = new int[] {};
        int[] intArray84 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray83, intArray84);
        org.junit.Assert.assertArrayEquals(intArray80, intArray83);
        org.junit.Assert.assertArrayEquals(intArray76, intArray80);
        int[] intArray88 = new int[] {};
        int[] intArray89 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray88, intArray89);
        int[] intArray91 = new int[] {};
        int[] intArray92 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray91, intArray92);
        org.junit.Assert.assertArrayEquals(intArray88, intArray91);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray80, intArray88);
        org.junit.Assert.assertArrayEquals(intArray64, intArray80);
        org.junit.Assert.assertArrayEquals("", intArray39, intArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArray39);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6145");
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
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        commonGramsTokenFilterFactoryTests23.setUp();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests23.assertFieldsEquals("tests.maxfailures", indexReader28, fields29, fields30, false);
        commonGramsTokenFilterFactoryTests23.overrideTestDefaultQueryCache();
        java.lang.String str34 = commonGramsTokenFilterFactoryTests23.getTestName();
        java.lang.String str35 = commonGramsTokenFilterFactoryTests23.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder36 = commonGramsTokenFilterFactoryTests23.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests23);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6146");
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray11 = new java.io.Serializable[][] { serializableArray4, serializableArray6, serializableArray8, serializableArray10 };
        java.util.Set<java.io.Serializable[]> serializableArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.util.Set<java.io.Serializable[]> serializableArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray11);
        java.io.Serializable[] serializableArray17 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray24 = new java.io.Serializable[][] { serializableArray17, serializableArray19, serializableArray21, serializableArray23 };
        java.util.Set<java.io.Serializable[]> serializableArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray24);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) serializableArray11, (java.lang.Object[]) serializableArray24);
        java.util.Set<java.lang.Object[]> objArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][]) serializableArray24);
        java.util.Set<java.io.Serializable[]> serializableArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.junit.Assert.assertNotNull("", (java.lang.Object) serializableArray24);
        short[] shortArray33 = new short[] { (byte) 0 };
        short[] shortArray35 = new short[] { (byte) 0 };
        short[] shortArray37 = new short[] { (byte) 0 };
        short[] shortArray39 = new short[] { (byte) 0 };
        short[] shortArray41 = new short[] { (byte) 0 };
        short[][] shortArray42 = new short[][] { shortArray33, shortArray35, shortArray37, shortArray39, shortArray41 };
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
        short[][][] shortArray65 = new short[][][] { shortArray42, shortArray53, shortArray64 };
        java.util.Set<short[][]> shortArraySet66 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray65);
        java.util.Set<short[][]> shortArraySet67 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray65);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) shortArray65);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 10);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6148");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader5, terms6, terms7, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((-1));
        commonGramsTokenFilterFactoryTests1.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests15.setUp();
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests24.assertDocsEnumEquals("hi!", postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        commonGramsTokenFilterFactoryTests24.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader32, (int) (byte) 100, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        commonGramsTokenFilterFactoryTests24.assertFieldsEquals("tests.nightly", indexReader38, fields39, fields40, true);
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests24.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests24);
        commonGramsTokenFilterFactoryTests24.setIndexWriterMaxDocs(10);
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests24.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) testRule48);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6149");
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
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum13, postingsEnum14, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader19, fields20, fields21, true);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6150");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures44 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures44);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures46);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures48);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray50 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures45, testRuleIgnoreAfterMaxFailures46, testRuleIgnoreAfterMaxFailures49 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet51 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray50);
        java.util.Set<org.junit.rules.TestRule> testRuleSet52 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray50);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet53 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray3, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray50);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6151");
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
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals(intArray52, intArray55);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals(intArray59, intArray62);
        org.junit.Assert.assertArrayEquals(intArray55, intArray59);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertArrayEquals(intArray67, intArray70);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray59, intArray67);
        org.junit.Assert.assertArrayEquals(intArray9, intArray59);
        java.lang.Class<?> wildcardClass76 = intArray59.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests77 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule78 = commonGramsTokenFilterFactoryTests77.ruleChain;
        commonGramsTokenFilterFactoryTests77.setUp();
        org.junit.rules.TestRule testRule80 = commonGramsTokenFilterFactoryTests77.ruleChain;
        commonGramsTokenFilterFactoryTests77.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests77.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests77.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Fields fields86 = null;
        org.apache.lucene.index.Fields fields87 = null;
        commonGramsTokenFilterFactoryTests77.assertFieldsEquals("hi!", indexReader85, fields86, fields87, true);
        org.junit.rules.TestRule testRule90 = commonGramsTokenFilterFactoryTests77.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) wildcardClass76, (java.lang.Object) commonGramsTokenFilterFactoryTests77);
        org.apache.lucene.index.NumericDocValues numericDocValues94 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues95 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests77.assertDocValuesEquals("tests.weekly", (int) (short) 10, numericDocValues94, numericDocValues95);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6152");
        float[] floatArray0 = null;
        float[] floatArray6 = new float[] { (short) 1 };
        float[] floatArray8 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) '#');
        float[] floatArray12 = new float[] { (short) 1 };
        float[] floatArray14 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray14, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray8, floatArray12, (float) 100);
        float[] floatArray21 = new float[] { (short) 1 };
        float[] floatArray23 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray23, (float) '#');
        float[] floatArray27 = new float[] { (short) 1 };
        float[] floatArray29 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray29, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray23, floatArray27, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray12, floatArray23, (float) (short) 10);
        float[] floatArray37 = new float[] { (short) 1 };
        float[] floatArray39 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray39, (float) '#');
        float[] floatArray43 = new float[] { (short) 1 };
        float[] floatArray45 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray45, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray23, floatArray37, (float) (short) 1);
        float[] floatArray54 = new float[] { (short) 1 };
        float[] floatArray56 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray56, (float) '#');
        float[] floatArray60 = new float[] { (short) 1 };
        float[] floatArray62 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray62, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray56, floatArray60, (float) 100);
        float[] floatArray70 = new float[] { (short) 1 };
        float[] floatArray72 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray72, (float) '#');
        float[] floatArray76 = new float[] { (short) 1 };
        float[] floatArray78 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray78, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray72, floatArray76, (float) 100);
        float[] floatArray84 = new float[] { (short) 1 };
        float[] floatArray86 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray84, floatArray86, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray72, floatArray86, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray72, (float) (short) 1);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray23, floatArray56, (float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray23, (float) 0L);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6153");
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
        byte[] byteArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray4, byteArray33);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6154");
        org.elasticsearch.common.settings.Settings.Builder[] builderArray1 = new org.elasticsearch.common.settings.Settings.Builder[] {};
        org.elasticsearch.common.settings.Settings.Builder[][] builderArray2 = new org.elasticsearch.common.settings.Settings.Builder[][] { builderArray1 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder[]> builderArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray2);
        java.lang.Object obj4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) builderArray2, obj4);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) (byte) 1, (double) 6);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6156");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("<unknown>", postingsEnum8, postingsEnum9, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.nightly", indexReader14, (int) (byte) 1, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6157");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("<unknown>", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        java.lang.Object obj10 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests1, obj10);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("<unknown>", indexReader13, (int) (short) -1, postingsEnum15, postingsEnum16, false);
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) "<unknown>", obj19);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6158");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.Class<?> wildcardClass13 = commonGramsTokenFilterFactoryTests0.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) wildcardClass13);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6159");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", obj1);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, 0.0f, (float) (-1));
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0L, (double) 2, (double) (-1L));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6162");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.slow", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11, true);
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("", indexReader16, fields17, fields18, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsEnumEquals("hi!", postingsEnum24, postingsEnum25, false);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests21.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader16, (java.lang.Object) testRule28);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6163");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) 10, (float) 100L, (float) 1L);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6164");
        long[] longArray1 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray1, longArray6);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6165");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests3.assertFieldsEquals("<unknown>", indexReader10, fields11, fields12, false);
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests3.assertDocsEnumEquals("tests.monster", postingsEnum19, postingsEnum20, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) true);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6166");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
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
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray27, (float) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray1, floatArray3, (float) 100L);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6167");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("<unknown>", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        java.lang.String str21 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader23, fields24, fields25, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", (java.lang.Object) fields24);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6168");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader15, terms16, terms17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (short) 0);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 1, (long) ' ');
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6171");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.awaitsfix", indexReader9, 1, postingsEnum11, postingsEnum12);
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.tearDown();
        float[] floatArray17 = new float[] { (short) 1 };
        float[] floatArray19 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray19, (float) '#');
        float[] floatArray23 = new float[] { (short) 1 };
        float[] floatArray25 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray25, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray23, (float) '4');
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling30 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling30 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet32 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray17, (java.lang.Object) throttlingArray31);
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) throttlingArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling35, (java.lang.Object) 100L);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) throttlingArray31, (java.lang.Object) 100L);
        java.lang.Object[] objArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) throttlingArray31, objArray39);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1.0f, (double) 1);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6174");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 6, (double) (-1.0f), (double) 5);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 0, (long) '#');
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (-1), (-1L));
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 0, (double) 1.0f);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6179");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 3, 0L);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) -1, (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6181");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray8, (float) '4');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        java.lang.String str18 = commonGramsTokenFilterFactoryTests15.getTestName();
        commonGramsTokenFilterFactoryTests15.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests15.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests15.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("", indexReader23, 0, postingsEnum25, postingsEnum26);
        commonGramsTokenFilterFactoryTests15.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("tests.nightly", indexReader30, (int) (short) 0, postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("tests.badapples", indexReader37, 4, postingsEnum39, postingsEnum40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("random", indexReader44, (int) (short) 1, postingsEnum46, postingsEnum47);
        org.junit.Assert.assertNotEquals((java.lang.Object) floatArray2, (java.lang.Object) "random");
        float[] floatArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray2, floatArray50, (float) '4');
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6182");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("<unknown>", indexReader6, terms7, terms8, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.slow", indexReader16, terms17, terms18, true);
        float[] floatArray26 = new float[] { (short) 1 };
        float[] floatArray28 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray28, (float) '#');
        float[] floatArray32 = new float[] { (short) 1 };
        float[] floatArray34 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray32, floatArray34, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray28, floatArray32, (float) 100);
        float[] floatArray40 = new float[] { (short) 1 };
        float[] floatArray42 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray42, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray28, floatArray42, (float) 3);
        float[] floatArray48 = new float[] { (short) 1 };
        float[] floatArray50 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray50, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray42, floatArray50, 100.0f);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests55.ruleChain;
        commonGramsTokenFilterFactoryTests55.setUp();
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests55.ruleChain;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests55.assertFieldsEquals("tests.maxfailures", indexReader60, fields61, fields62, false);
        java.lang.Class<?> wildcardClass65 = commonGramsTokenFilterFactoryTests55.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests67.ruleChain;
        commonGramsTokenFilterFactoryTests67.setUp();
        commonGramsTokenFilterFactoryTests67.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder71 = commonGramsTokenFilterFactoryTests67.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests67);
        java.lang.Class<?> wildcardClass73 = commonGramsTokenFilterFactoryTests67.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests74 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule75 = commonGramsTokenFilterFactoryTests74.ruleChain;
        commonGramsTokenFilterFactoryTests74.setUp();
        org.junit.rules.TestRule testRule77 = commonGramsTokenFilterFactoryTests74.ruleChain;
        commonGramsTokenFilterFactoryTests74.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests74.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        commonGramsTokenFilterFactoryTests74.assertDocsEnumEquals("hi!", postingsEnum81, postingsEnum82, true);
        java.lang.Class<?> wildcardClass85 = commonGramsTokenFilterFactoryTests74.getClass();
        java.lang.reflect.Type[] typeArray86 = new java.lang.reflect.Type[] { wildcardClass65, wildcardClass73, wildcardClass85 };
        java.util.Set<java.lang.reflect.Type> typeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray86);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "", (java.lang.Object) typeSet87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) terms17, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 4, 10.0d, (double) 100L);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10, (double) '#');
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6185");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str2 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.maxfailures", indexReader7, terms8, terms9, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader14, (int) (byte) -1, postingsEnum16, postingsEnum17, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.Object obj21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, obj21);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6186");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        org.junit.Assert.assertArrayEquals("", shortArray10, shortArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray10);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray23);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray23);
        short[] shortArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray34);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6187");
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
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader28, (int) (byte) 0, postingsEnum30, postingsEnum31);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d, 0.0d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 10, (double) 4, (double) (-1.0f));
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6190");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader6, terms7, terms8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("<unknown>", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6191");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader15, terms16, terms17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6192");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet2 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray1);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet3 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) commonGramsTokenFilterFactoryTestsArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray1, (java.lang.Object[]) strArray4);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet9 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) commonGramsTokenFilterFactoryTestsArray1);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray16);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray16, charArray21);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("", charArray25, charArray28);
        org.junit.Assert.assertArrayEquals(charArray21, charArray28);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("", charArray36, charArray39);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray43, charArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray39, charArray44);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("", charArray48, charArray51);
        org.junit.Assert.assertArrayEquals(charArray44, charArray51);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("", charArray57, charArray60);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals(charArray60, charArray64);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals("", charArray69, charArray72);
        org.junit.Assert.assertArrayEquals(charArray60, charArray72);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray51, charArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray21, charArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTestsArray1, (java.lang.Object) charArray60);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6193");
        double[] doubleArray5 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[] doubleArray11 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray11 };
        java.util.Set<double[]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.Iterable[] iterableArray24 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray25 = (java.lang.Iterable<java.lang.String>[]) iterableArray24;
        strIterableArray25[0] = strSet18;
        strIterableArray25[1] = strSet20;
        strIterableArray25[2] = strSet22;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray25);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray25);
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
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray44);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strIterableArray25, (java.lang.Object[]) strIterableArray44);
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray12, (java.lang.Object) strIterableSet54);
        java.util.Set<double[]> doubleArraySet56 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests57 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule58 = commonGramsTokenFilterFactoryTests57.ruleChain;
        commonGramsTokenFilterFactoryTests57.setUp();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests57.ruleChain;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        commonGramsTokenFilterFactoryTests57.assertFieldsEquals("tests.maxfailures", indexReader62, fields63, fields64, false);
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        commonGramsTokenFilterFactoryTests57.assertDocsEnumEquals("tests.slow", postingsEnum68, postingsEnum69, false);
        commonGramsTokenFilterFactoryTests57.tearDown();
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests57.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule73;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) doubleArraySet56, (java.lang.Object) testRule73);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6194");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray16, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray16, byteArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray12, byteArray23);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray32, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray32);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray12, byteArray29);
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
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.lang.Iterable[] iterableArray63 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray64 = (java.lang.Iterable<java.lang.String>[]) iterableArray63;
        strIterableArray64[0] = strSet57;
        strIterableArray64[1] = strSet59;
        strIterableArray64[2] = strSet61;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray64);
        org.junit.Assert.assertNotSame((java.lang.Object) byteArray52, (java.lang.Object) strIterableArray64);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray12);
        byte[] byteArray75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray75);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6195");
        char[] charArray1 = null;
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("", charArray5, charArray8);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("", charArray14, charArray17);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray17, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray8, charArray22);
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
        org.junit.Assert.assertArrayEquals(charArray32, charArray36);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        commonGramsTokenFilterFactoryTests40.setUp();
        commonGramsTokenFilterFactoryTests40.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("tests.badapples", postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        commonGramsTokenFilterFactoryTests40.assertFieldsEquals("tests.awaitsfix", indexReader50, fields51, fields52, true);
        commonGramsTokenFilterFactoryTests40.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests40.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum57, postingsEnum58, true);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) charArray36, (java.lang.Object) "europarl.lines.txt.gz");
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray67, charArray68);
        org.junit.Assert.assertArrayEquals("", charArray64, charArray67);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray67, charArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray36, charArray67);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray8, charArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray8);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6196");
        java.lang.Object obj1 = null;
        byte[][][] byteArray2 = new byte[][][] {};
        byte[][][] byteArray3 = new byte[][][] {};
        byte[][][] byteArray4 = new byte[][][] {};
        byte[][][] byteArray5 = new byte[][][] {};
        byte[][][][] byteArray6 = new byte[][][][] { byteArray2, byteArray3, byteArray4, byteArray5 };
        java.util.Set<byte[][][]> byteArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray6);
        org.junit.Assert.assertNotSame("tests.weekly", obj1, (java.lang.Object) byteArray6);
        java.util.Set<byte[][][]> byteArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(byteArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests11.ruleChain;
        commonGramsTokenFilterFactoryTests11.setUp();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests11.ruleChain;
        commonGramsTokenFilterFactoryTests11.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests11.assertPositionsSkippingEquals("tests.badapples", indexReader18, (int) (byte) -1, postingsEnum20, postingsEnum21);
        org.elasticsearch.common.settings.Settings.Builder builder23 = commonGramsTokenFilterFactoryTests11.newAnalysisSettingsBuilder();
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
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) builder23, (java.lang.Object) strArray53);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray64);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray67);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray75);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray72);
        java.lang.String[] strArray81 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray81);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray81);
        java.lang.String[] strArray86 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray86);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray86);
        java.lang.String[] strArray89 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet90 = org.apache.lucene.util.LuceneTestCase.asSet(strArray89);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray86, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray81, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray67);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) byteArray6, (java.lang.Object[]) strArray67);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), (double) 100);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6198");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader6, terms7, terms8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader12, (int) 'a', postingsEnum14, postingsEnum15);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) (byte) 1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 'a');
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6200");
        int[] intArray1 = null;
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
        org.junit.Assert.assertArrayEquals(intArray21, intArray25);
        org.junit.Assert.assertArrayEquals(intArray6, intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray21);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6201");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.util.Set<java.io.Serializable> serializableSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray4);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray16);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        java.util.Set<java.io.Serializable> serializableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray13);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray23 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray23);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray23);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray31);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray37);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray37);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray55);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray55, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray23, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) luceneTestCaseArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", objArray1, (java.lang.Object[]) luceneTestCaseArray23);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6202");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray7);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray7, (java.lang.Object) 1.0d);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures17);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray23 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures17, testRuleIgnoreAfterMaxFailures19, testRuleIgnoreAfterMaxFailures22 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures24);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures26);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray30 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures24, testRuleIgnoreAfterMaxFailures26, testRuleIgnoreAfterMaxFailures29 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures36 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures35);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray37 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures31, testRuleIgnoreAfterMaxFailures33, testRuleIgnoreAfterMaxFailures36 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures38 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures39 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures38);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures40 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures41 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures40);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures42 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures43 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures42);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray44 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures38, testRuleIgnoreAfterMaxFailures40, testRuleIgnoreAfterMaxFailures43 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures45);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures47);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures49);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray51 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures45, testRuleIgnoreAfterMaxFailures47, testRuleIgnoreAfterMaxFailures50 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray52 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray23, testRuleIgnoreAfterMaxFailuresArray30, testRuleIgnoreAfterMaxFailuresArray37, testRuleIgnoreAfterMaxFailuresArray44, testRuleIgnoreAfterMaxFailuresArray51 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray52);
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet54 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray13, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray52);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) -1, (double) '4', (double) 4);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) ' ');
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (-1), (double) 0L, 0.0d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.nightly", (long) 2, (long) 2);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 10, 0.0d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (short) 10, (float) 0L, (float) 6);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) 6, (double) 2, (double) (byte) 10);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (float) (short) 10, 0.0f, (float) (byte) 1);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 6);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6212");
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
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.badapples", indexReader24, terms25, terms26, true);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.failfast", indexReader31, fields32, fields33, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6213");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 5, (double) 5);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (-1L), 10.0d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6215");
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
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("", charArray24, charArray27);
        org.junit.Assert.assertArrayEquals(charArray5, charArray27);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("", charArray33, charArray36);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray36, charArray40);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("", charArray45, charArray48);
        org.junit.Assert.assertArrayEquals(charArray36, charArray48);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray57);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray61);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals(charArray61, charArray66);
        org.junit.Assert.assertArrayEquals(charArray36, charArray61);
        char[] charArray70 = new char[] {};
        char[] charArray71 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray70, charArray71);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray36, charArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray70);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests75 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests75.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests75);
        org.elasticsearch.common.settings.Settings.Builder builder78 = commonGramsTokenFilterFactoryTests75.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests75.setUp();
        commonGramsTokenFilterFactoryTests75.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests75);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 100, (long) (short) 0);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 5, (double) (byte) -1);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6218");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        org.junit.Assert.assertArrayEquals("", shortArray13, shortArray17);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray26);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray36);
        org.junit.Assert.assertArrayEquals("", shortArray29, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray29);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray43);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray50);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray53);
        org.junit.Assert.assertArrayEquals("", shortArray46, shortArray50);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray59);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray62);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray66);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray69);
        org.junit.Assert.assertArrayEquals("", shortArray62, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray29);
        short[] shortArray76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray76);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6219");
        java.lang.Object obj1 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy4 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy5 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray6 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy2, queryCachingPolicy3, queryCachingPolicy4, queryCachingPolicy5 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet7 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet9 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet10 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", obj1, (java.lang.Object) queryCachingPolicySet10);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 1.0f, (double) 10.0f);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6221");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray6);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.setUp();
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
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests14, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests14.assertPositionsSkippingEquals("<unknown>", indexReader31, 6, postingsEnum33, postingsEnum34);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests10, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.elasticsearch.common.settings.Settings.Builder builder37 = commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) charArray6, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("", charArray41, charArray44);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray44, charArray48);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray57);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray57, charArray62);
        char[] charArray66 = new char[] {};
        char[] charArray67 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray66, charArray67);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        org.junit.Assert.assertArrayEquals("", charArray66, charArray69);
        org.junit.Assert.assertArrayEquals(charArray62, charArray69);
        org.junit.Assert.assertArrayEquals(charArray44, charArray62);
        org.junit.Assert.assertArrayEquals("hi!", charArray6, charArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) (byte) -1, 0.0f);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6223");
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
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray64);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray67);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray71);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray74);
        org.junit.Assert.assertArrayEquals("", shortArray67, shortArray71);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) shortArray71);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray71);
        java.lang.Object obj81 = null;
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray83);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray85, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray86);
        org.junit.Assert.assertNotEquals("tests.monster", obj81, (java.lang.Object) shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray83);
        org.apache.lucene.search.QueryCachingPolicy[][][] queryCachingPolicyArray91 = new org.apache.lucene.search.QueryCachingPolicy[][][] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[][]> queryCachingPolicyArraySet92 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray91);
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[][]> queryCachingPolicyArraySet93 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) shortArray83, (java.lang.Object) queryCachingPolicyArray91);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, (float) 1L, 0.0f);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6225");
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
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.Iterable[] iterableArray29 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray30 = (java.lang.Iterable<java.lang.String>[]) iterableArray29;
        strIterableArray30[0] = strSet23;
        strIterableArray30[1] = strSet25;
        strIterableArray30[2] = strSet27;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray30);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray30);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strIterableArray11, (java.lang.Object[]) strIterableArray30);
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray11);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray42 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray42);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray42);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray50);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray56);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray61);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray61);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray61, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.lang.String[] strArray74 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray74, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray64, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) luceneTestCaseArray42, (java.lang.Object[]) strArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strIterableArray11, (java.lang.Object[]) strArray64);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) ' ');
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest12.test6227");
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
        java.lang.String str13 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setIndexWriterMaxDocs(0);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests14.assertDocsAndPositionsEnumEquals("hi!", postingsEnum24, postingsEnum25);
    }
}

