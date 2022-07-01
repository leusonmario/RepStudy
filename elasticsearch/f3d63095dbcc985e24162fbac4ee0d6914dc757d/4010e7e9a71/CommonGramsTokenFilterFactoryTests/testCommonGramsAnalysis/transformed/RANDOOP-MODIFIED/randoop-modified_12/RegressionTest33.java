import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
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
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("<unknown>", postingsEnum47, postingsEnum48, false);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("random", indexReader52, terms53, terms54, false);
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(testRule21);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader8, 10, postingsEnum10, postingsEnum11, true);
        org.elasticsearch.common.settings.Settings.Builder builder14 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.assertDeletedDocsEquals("tests.nightly", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
// flaky:         org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
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
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray8);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
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
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray29);
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
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray49);
        org.junit.Assert.assertArrayEquals("", shortArray42, shortArray46);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray14, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray2, shortArray14);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
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
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray68, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray60, shortArray68);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray81);
        short[] shortArray83 = new short[] {};
        short[] shortArray84 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray83, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray84);
        short[] shortArray87 = new short[] {};
        short[] shortArray88 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray88);
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray68);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[]");
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[]");
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[]");
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[]");
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[]");
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray83), "[]");
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray84), "[]");
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[]");
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray88), "[]");
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.util.Random random0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.maxfailures", indexReader7, fields8, fields9, false);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.document.FieldType fieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field15 = org.apache.lucene.util.LuceneTestCase.newField(random0, "tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, fieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule5);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
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
        org.elasticsearch.common.settings.Settings.Builder builder25 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.assertDeletedDocsEquals("tests.weekly", indexReader27, indexReader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<unknown>" + "'", str24, "<unknown>");
// flaky:         org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotEquals(obj1, (java.lang.Object) testRule3);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule3;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule3;
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("", byteArray9, byteArray11);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray18, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray18, byteArray25);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals("", byteArray31, byteArray33);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray43, longArray44);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        org.junit.Assert.assertArrayEquals(longArray37, longArray43);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray43, (java.lang.Object) byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray48);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray58);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray61);
        org.junit.Assert.assertArrayEquals("", byteArray58, byteArray60);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray64, longArray65);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray67, longArray68);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray67, longArray70);
        org.junit.Assert.assertArrayEquals(longArray64, longArray70);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray70, (java.lang.Object) byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray25, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray48);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) testRule3, (java.lang.Object) byteArray11);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
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
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("hi!", indexReader20, (int) (short) -1, postingsEnum22, postingsEnum23, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests28 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests28.setUp();
        commonGramsTokenFilterFactoryTests28.setUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("tests.weekly", indexReader32, fields33, fields34, true);
        java.lang.String str37 = commonGramsTokenFilterFactoryTests28.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        commonGramsTokenFilterFactoryTests28.assertFieldsEquals("tests.failfast", indexReader39, fields40, fields41, true);
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests28.ruleChain;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests28);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.badapples");
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(100);
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.assertReaderStatisticsEquals("tests.awaitsfix", indexReader52, indexReader53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<unknown>" + "'", str37, "<unknown>");
        org.junit.Assert.assertNotNull(testRule44);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("<unknown>", indexReader3, 0, postingsEnum5, postingsEnum6, true);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder11 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder13 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader21, (int) '4', postingsEnum23, postingsEnum24);
        org.junit.Assert.assertNotNull(testRule9);
// flaky:         org.junit.Assert.assertNotNull(builder11);
// flaky:         org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (long) 100, (long) (byte) 10);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        long[] longArray1 = new long[] {};
        long[] longArray2 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
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
        commonGramsTokenFilterFactoryTests8.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.Assert.assertNotSame("", (java.lang.Object) longArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests8);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests8.ruleChain;
        java.lang.String str33 = commonGramsTokenFilterFactoryTests8.getTestName();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(testRule9);
        org.junit.Assert.assertNotNull(testRule28);
        org.junit.Assert.assertNotNull(testRule32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<unknown>" + "'", str33, "<unknown>");
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder5 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.String str6 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11, false);
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
// flaky:         org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] commonGramsTokenFilterFactoryTestsArray2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests[] {};
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet3 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray2);
        java.util.Set<org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests> commonGramsTokenFilterFactoryTestsSet4 = org.apache.lucene.util.LuceneTestCase.asSet(commonGramsTokenFilterFactoryTestsArray2);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray11);
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray8);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) strArray8, (java.lang.Object) "tests.monster");
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray2, (java.lang.Object[]) strArray32);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray49);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray44);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.util.Set<java.lang.String> strSet62 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray64);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray60, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray64, (java.lang.Object) 1.0d);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet74 = org.apache.lucene.util.LuceneTestCase.asSet(strArray73);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray73);
        java.lang.String[] strArray76 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strArray76);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray73, (java.lang.Object[]) strArray76);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray76, (java.lang.Object[]) strArray79);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray64, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) commonGramsTokenFilterFactoryTestsArray2, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertNotNull(commonGramsTokenFilterFactoryTestsArray2);
        org.junit.Assert.assertNotNull(commonGramsTokenFilterFactoryTestsSet3);
        org.junit.Assert.assertNotNull(commonGramsTokenFilterFactoryTestsSet4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(strSet81);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
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
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray49);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray49);
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray77);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray77, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray80);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet86 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        java.util.Set<java.lang.String> strSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strArray85);
        java.lang.String[] strArray90 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet91 = org.apache.lucene.util.LuceneTestCase.asSet(strArray90);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray90);
        java.lang.String[] strArray93 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet94 = org.apache.lucene.util.LuceneTestCase.asSet(strArray93);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray90, (java.lang.Object[]) strArray93);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray85, (java.lang.Object[]) strArray93);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray80, (java.lang.Object[]) strArray93);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strSet94);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests2.getTestName();
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) str10);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        java.util.Random random0 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.document.FieldType fieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field11 = org.apache.lucene.util.LuceneTestCase.newField(random0, "", (java.lang.Object) commonGramsTokenFilterFactoryTests2, fieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
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
        org.elasticsearch.common.settings.Settings.Builder builder16 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertReaderEquals("<unknown>", indexReader18, indexReader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
// flaky:         org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.nightly", "tests.failfast", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
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
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.awaitsfix", indexReader23, fields24, fields25, true);
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.slow");
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(testRule28);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        java.util.Random random0 = null;
        org.apache.lucene.analysis.Analyzer analyzer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.checkRandomData(random0, analyzer1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader8, fields9, fields10, true);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        float[] floatArray16 = new float[] { (short) 1 };
        float[] floatArray18 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) '#');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("tests.maxfailures", indexReader26, fields27, fields28, false);
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) floatArray18, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        float[] floatArray34 = new float[] { (short) 1 };
        float[] floatArray36 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray36, (float) '#');
        float[] floatArray40 = new float[] { (short) 1 };
        float[] floatArray42 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray42, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray40, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray34, (float) 1L);
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        float[] floatArray59 = new float[] { (short) 1 };
        float[] floatArray61 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray61, (float) '#');
        float[] floatArray65 = new float[] { (short) 1 };
        float[] floatArray67 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray67, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray61, floatArray65, (float) 100);
        float[] floatArray73 = new float[] { (short) 1 };
        float[] floatArray75 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray75, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray61, floatArray75, (float) 3);
        float[] floatArray81 = new float[] { (short) 1 };
        float[] floatArray83 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray81, floatArray83, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray75, floatArray83, 100.0f);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray83, (float) 10L);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray83, (float) (-1L));
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) floatArray83);
        org.apache.lucene.index.IndexReader indexReader94 = null;
        org.apache.lucene.index.IndexReader indexReader95 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.assertReaderEquals("tests.slow", indexReader94, indexReader95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule4);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0]");
        org.junit.Assert.assertNotNull(testRule22);
        org.junit.Assert.assertNotNull(testRule24);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[0.0]");
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.common.settings.Settings.Builder builder11 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.awaitsfix", indexReader15, terms16, terms17, false);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
// flaky:         org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.setUp();
        commonGramsTokenFilterFactoryTests16.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder20 = null; // flaky: commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) str14, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("hi!", indexReader26, terms27, terms28, true);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("", postingsEnum32, postingsEnum33, true);
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<unknown>" + "'", str14, "<unknown>");
        org.junit.Assert.assertNotNull(testRule17);
// flaky:         org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][][][] { annotatedElementArray0, annotatedElementArray1 };
        java.util.Set<java.lang.reflect.AnnotatedElement[][][]> annotatedElementArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArraySet3);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("tests.maxfailures", indexReader23, fields24, fields25, false);
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        java.lang.String str30 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermsStatisticsEquals("tests.weekly", terms32, terms33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<unknown>" + "'", str30, "<unknown>");
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermsStatisticsEquals("tests.awaitsfix", terms11, terms12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests2.tearDown();
        java.lang.String str12 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader14, (int) 'a', postingsEnum16, postingsEnum17, true);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
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
        org.elasticsearch.common.settings.Settings.Builder builder20 = null; // flaky: commonGramsTokenFilterFactoryTests8.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder20);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule9);
        org.junit.Assert.assertNotNull(testRule11);
// flaky:         org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(testRule25);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) strSet8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("enwiki.random.lines.txt", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.nightly", indexReader23, 2, postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader30, 0, postingsEnum32, postingsEnum33, false);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.util.Random random0 = null;
        org.apache.lucene.analysis.Analyzer analyzer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.checkRandomData(random0, analyzer1, (int) (short) -1, (int) '4', false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder5 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder6 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum8, postingsEnum9, false);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
// flaky:         org.junit.Assert.assertNotNull(builder5);
// flaky:         org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(testRule12);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.junit.Assert.assertNotEquals("", (long) 'a', (long) (byte) 100);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
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
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("hi!", indexReader21, fields22, fields23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.weekly", indexReader27, (int) ' ', postingsEnum29, postingsEnum30);
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader34, fields35, fields36, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests40 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests46.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests46.setUp();
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests46, (java.lang.Object) strSet52);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests40, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests40.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        commonGramsTokenFilterFactoryTests40.assertTermsEquals("europarl.lines.txt.gz", indexReader57, terms58, terms59, false);
        org.junit.rules.TestRule testRule62 = commonGramsTokenFilterFactoryTests40.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) fields35, (java.lang.Object) commonGramsTokenFilterFactoryTests40);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.TermsEnum termsEnum66 = null;
        org.apache.lucene.index.TermsEnum termsEnum67 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests40.assertTermsEnumEquals("hi!", indexReader65, termsEnum66, termsEnum67, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule32);
        org.junit.Assert.assertNotNull(testRule41);
        org.junit.Assert.assertNotNull(testRule47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(testRule62);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str1 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertFieldInfosEquals("random", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
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
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.IndexableField indexableField79 = null;
        org.apache.lucene.index.IndexableField indexableField80 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests2.assertStoredFieldEquals("tests.maxfailures", indexableField79, indexableField80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 52.0, 100.0, 97.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, 1.0, 1.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 52.0, 100.0, 97.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 1.0, 1.0, 1.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 52.0, 100.0, 97.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 1.0, 1.0, 1.0, 100.0, 35.0]");
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.junit.Assert.assertEquals(0.0f, (float) (byte) 0, (float) 1);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17, true);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testCommonGramsAnalysis();
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to load settings from [/org/elasticsearch/index/analysis/commongrams/commongrams.json]");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
// flaky:         org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(testRule9);
        org.junit.Assert.assertNotNull(testRule11);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
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
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14, false);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.testQueryModeSettings();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder6 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader8, 0, postingsEnum10, postingsEnum11);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder14 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.maxfailures", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.monster", postingsEnum23, postingsEnum24, false);
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
// flaky:         org.junit.Assert.assertNotNull(builder6);
// flaky:         org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(testRule27);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader17, (int) '#', postingsEnum19, postingsEnum20, true);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
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
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader13, (int) (byte) -1, postingsEnum15, postingsEnum16, true);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("", indexReader21, (int) ' ', postingsEnum23, postingsEnum24);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermVectorsEquals("tests.monster", indexReader28, indexReader29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("hi!", indexReader12, 10, postingsEnum14, postingsEnum15);
        java.lang.String str17 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests23.setUp();
        commonGramsTokenFilterFactoryTests23.setUp();
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
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) commonGramsTokenFilterFactoryTests27);
        org.elasticsearch.common.settings.Settings.Builder builder50 = null; // flaky: commonGramsTokenFilterFactoryTests27.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests51.ruleChain;
        commonGramsTokenFilterFactoryTests51.setUp();
        java.lang.String str54 = commonGramsTokenFilterFactoryTests51.getTestName();
        commonGramsTokenFilterFactoryTests51.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests51.tearDown();
        org.junit.rules.TestRule testRule57 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) commonGramsTokenFilterFactoryTests51);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests51.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader60, (int) (short) 100, postingsEnum62, postingsEnum63, false);
        commonGramsTokenFilterFactoryTests51.setIndexWriterMaxDocs((int) '#');
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests69 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule70 = commonGramsTokenFilterFactoryTests69.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests69.assertDocsEnumEquals("hi!", postingsEnum72, postingsEnum73, false);
        org.junit.rules.TestRule testRule76 = commonGramsTokenFilterFactoryTests69.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests51, (java.lang.Object) commonGramsTokenFilterFactoryTests69);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests51);
        commonGramsTokenFilterFactoryTests51.tearDown();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNotNull(testRule28);
        org.junit.Assert.assertNotNull(testRule40);
// flaky:         org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(testRule52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<unknown>" + "'", str54, "<unknown>");
        org.junit.Assert.assertNotNull(testRule57);
        org.junit.Assert.assertNotNull(testRule70);
        org.junit.Assert.assertNotNull(testRule76);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        long[] longArray9 = new long[] {};
        long[] longArray10 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray9, longArray10);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray16);
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray13, longArray21);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray2, longArray21);
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
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        long[] longArray52 = new long[] {};
        long[] longArray53 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray52, longArray53);
        org.junit.Assert.assertArrayEquals(longArray49, longArray52);
        org.junit.Assert.assertArrayEquals(longArray46, longArray52);
        long[] longArray57 = new long[] {};
        long[] longArray58 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray57, longArray58);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray60, longArray61);
        org.junit.Assert.assertArrayEquals(longArray57, longArray60);
        org.junit.Assert.assertArrayEquals(longArray46, longArray57);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray41, longArray46);
        org.junit.Assert.assertArrayEquals("random", longArray21, longArray46);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests67 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule68 = commonGramsTokenFilterFactoryTests67.ruleChain;
        commonGramsTokenFilterFactoryTests67.setUp();
        commonGramsTokenFilterFactoryTests67.tearDown();
        commonGramsTokenFilterFactoryTests67.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests67.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        commonGramsTokenFilterFactoryTests67.assertDocsEnumEquals("hi!", postingsEnum74, postingsEnum75, false);
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        commonGramsTokenFilterFactoryTests67.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum79, postingsEnum80, true);
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        commonGramsTokenFilterFactoryTests67.assertTermsEquals("tests.weekly", indexReader84, terms85, terms86, true);
        org.junit.Assert.assertNotSame((java.lang.Object) longArray21, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertNotNull(testRule68);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(testRule32);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strSet56);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str9 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.lang.String str10 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests12.setUp();
        commonGramsTokenFilterFactoryTests12.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) (byte) 100, postingsEnum26, postingsEnum27);
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests16.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests16, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        commonGramsTokenFilterFactoryTests16.assertPositionsSkippingEquals("<unknown>", indexReader33, 6, postingsEnum35, postingsEnum36);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        org.elasticsearch.common.settings.Settings.Builder builder39 = null; // flaky: commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder40 = null; // flaky: commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.badapples", (java.lang.Object) builder40);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
        org.junit.Assert.assertNotNull(testRule17);
        org.junit.Assert.assertNotNull(testRule29);
// flaky:         org.junit.Assert.assertNotNull(builder39);
// flaky:         org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] { locale3, "<unknown>", "tests.maxfailures" };
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.lang.Class<?> wildcardClass8 = serializableArray6.getClass();
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
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals(intArray52, intArray55);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals(intArray60, intArray63);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray70, intArray71);
        org.junit.Assert.assertArrayEquals(intArray67, intArray70);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray63, intArray70);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray52, intArray63);
        org.junit.Assert.assertArrayEquals(intArray10, intArray52);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) wildcardClass8, (java.lang.Object) intArray10);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray79, intArray86);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray10, intArray79);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "tests.slow");
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
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
        org.elasticsearch.common.settings.Settings.Builder builder14 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader20, fields21, fields22, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexableField indexableField27 = null;
        org.apache.lucene.index.IndexableField indexableField28 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertStoredFieldEquals("tests.awaitsfix", indexableField27, indexableField28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule13);
// flaky:         org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.junit.Assert.assertNotEquals((long) '#', (long) 2);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
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
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader47, fields48, fields49, false);
        java.lang.String str52 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum54, postingsEnum55, true);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("random", indexReader59, indexReader60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<unknown>" + "'", str52, "<unknown>");
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
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
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.slow", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermVectorsEquals("tests.slow", indexReader21, indexReader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
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
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(testRule22);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
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
        float[] floatArray26 = new float[] { (short) 1 };
        float[] floatArray28 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray28, (float) '#');
        org.junit.Assert.assertArrayEquals("", floatArray20, floatArray28, 100.0f);
        float[] floatArray37 = new float[] { (short) 1 };
        float[] floatArray39 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray39, (float) '#');
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests42.ruleChain;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Fields fields48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        commonGramsTokenFilterFactoryTests42.assertFieldsEquals("tests.maxfailures", indexReader47, fields48, fields49, false);
        commonGramsTokenFilterFactoryTests42.tearDown();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) floatArray39, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
        float[] floatArray55 = new float[] { (short) 1 };
        float[] floatArray57 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray57, (float) '#');
        float[] floatArray61 = new float[] { (short) 1 };
        float[] floatArray63 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray61, floatArray63, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray61, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray55, (float) 1L);
        float[] floatArray71 = new float[] { (short) 1 };
        float[] floatArray73 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray73, (float) '#');
        float[] floatArray77 = new float[] { (short) 1 };
        float[] floatArray79 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray79, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray77, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray77, (float) (byte) 0);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) floatArray55);
        float[] floatArray89 = new float[] { (short) 1 };
        float[] floatArray91 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray89, floatArray91, (float) '#');
        java.lang.Object obj94 = null;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) floatArray89, obj94);
        org.junit.Assert.assertArrayEquals("random", floatArray55, floatArray89, (float) (short) -1);
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray55, (float) 10L);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[0.0]");
        org.junit.Assert.assertNotNull(testRule43);
        org.junit.Assert.assertNotNull(testRule45);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray71), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray89), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray91), "[0.0]");
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
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
        org.elasticsearch.common.settings.Settings.Builder builder15 = null; // flaky: commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.badapples", indexReader18, 6, postingsEnum20, postingsEnum21, false);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests2.assertTermVectorsEquals("tests.badapples", indexReader26, indexReader27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
// flaky:         org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder4 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass5 = commonGramsTokenFilterFactoryTests0.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[] { wildcardClass5 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        commonGramsTokenFilterFactoryTests7.setUp();
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder11 = null; // flaky: commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests7.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[] { wildcardClass12 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        commonGramsTokenFilterFactoryTests14.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder18 = null; // flaky: commonGramsTokenFilterFactoryTests14.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests14.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray20 = new java.lang.reflect.AnnotatedElement[] { wildcardClass19 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        commonGramsTokenFilterFactoryTests21.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder25 = null; // flaky: commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass26 = commonGramsTokenFilterFactoryTests21.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray27 = new java.lang.reflect.AnnotatedElement[] { wildcardClass26 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray28 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray6, annotatedElementArray13, annotatedElementArray20, annotatedElementArray27 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet29 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray28);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.setUp();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests30.ruleChain;
        commonGramsTokenFilterFactoryTests30.tearDown();
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsEnumEquals("tests.failfast", postingsEnum39, postingsEnum40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        commonGramsTokenFilterFactoryTests37.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader44, 3, postingsEnum46, postingsEnum47, true);
        commonGramsTokenFilterFactoryTests37.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests37);
        commonGramsTokenFilterFactoryTests37.setIndexWriterMaxDocs((int) (short) 10);
        commonGramsTokenFilterFactoryTests37.setUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) commonGramsTokenFilterFactoryTests37);
        org.junit.Assert.assertNotSame((java.lang.Object) annotatedElementArray28, (java.lang.Object) commonGramsTokenFilterFactoryTests30);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("tests.awaitsfix", indexReader58, 1, postingsEnum60, postingsEnum61);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        commonGramsTokenFilterFactoryTests30.assertFieldsEquals("hi!", indexReader64, fields65, fields66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("hi!", indexReader70, (int) (short) 100, postingsEnum72, postingsEnum73);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsSkippingEquals("tests.nightly", indexReader76, 100, postingsEnum78, postingsEnum79, false);
        org.junit.Assert.assertNotNull(testRule1);
// flaky:         org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        org.junit.Assert.assertNotNull(testRule8);
// flaky:         org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(annotatedElementArray13);
        org.junit.Assert.assertNotNull(testRule15);
// flaky:         org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(annotatedElementArray20);
        org.junit.Assert.assertNotNull(testRule22);
// flaky:         org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(annotatedElementArray27);
        org.junit.Assert.assertNotNull(annotatedElementArray28);
        org.junit.Assert.assertNotNull(annotatedElementArraySet29);
        org.junit.Assert.assertNotNull(testRule31);
        org.junit.Assert.assertNotNull(testRule33);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "tests.slow");
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        java.util.Random random0 = null;
        org.apache.lucene.analysis.Analyzer analyzer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.checkRandomData(random0, analyzer1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "tests.failfast", "tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("tests.monster", indexReader16, (-1), postingsEnum18, postingsEnum19, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertReaderEquals("", indexReader24, indexReader25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader6, 0, postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, true);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testWithoutCommonWordsMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader15, terms16, terms17, true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.testDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule5);
// flaky:         org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        java.lang.String str8 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.assertFieldStatisticsEquals("tests.maxfailures", fields14, fields15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
// flaky:         org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
        org.junit.Assert.assertNotNull(testRule10);
// flaky:         org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader11, terms12, terms13, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertFieldStatisticsEquals("tests.failfast", fields18, fields19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.slow", "tests.failfast", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
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
        org.elasticsearch.common.settings.Settings.Builder builder78 = null; // flaky: commonGramsTokenFilterFactoryTests66.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) builder78);
        java.lang.Class<?> wildcardClass80 = null; // flaky: builder78.getClass();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) floatArray21, (java.lang.Object) wildcardClass80);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) wildcardClass80);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testQueryModeSettings();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[0.0]");
        org.junit.Assert.assertNotNull(testRule59);
        org.junit.Assert.assertNotNull(testRule67);
        org.junit.Assert.assertNotNull(testRule69);
// flaky:         org.junit.Assert.assertNotNull(builder78);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder5 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.setUp();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests8.ruleChain;
        commonGramsTokenFilterFactoryTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests8.assertDocsSkippingEquals("", indexReader14, (int) (byte) 0, postingsEnum16, postingsEnum17, true);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testQueryModeCommonGramsAnalysis();
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to load settings from [/org/elasticsearch/index/analysis/commongrams/commongrams_query_mode.json]");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
// flaky:         org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(testRule9);
        org.junit.Assert.assertNotNull(testRule11);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        char[] charArray2 = new char[] { '#' };
        char[][] charArray3 = new char[][] { charArray2 };
        java.util.Set<char[]> charArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(charArray3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests6 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests6.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests6, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests6.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests6.assertPositionsSkippingEquals("", indexReader12, (int) (byte) 1, postingsEnum14, postingsEnum15);
        java.lang.Class<?> wildcardClass17 = commonGramsTokenFilterFactoryTests6.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("tests.maxfailures", indexReader23, fields24, fields25, false);
        java.lang.Class<?> wildcardClass28 = commonGramsTokenFilterFactoryTests18.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests30.setUp();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests30.assertPositionsSkippingEquals("", indexReader36, (int) (byte) 1, postingsEnum38, postingsEnum39);
        java.lang.Class<?> wildcardClass41 = commonGramsTokenFilterFactoryTests30.getClass();
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        java.lang.Class<?> wildcardClass50 = strArray44.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray51 = new java.lang.reflect.GenericDeclaration[] { wildcardClass17, wildcardClass28, wildcardClass41, wildcardClass50 };
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet52 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray51);
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
        org.junit.Assert.assertNotEquals((java.lang.Object) genericDeclarationSet52, (java.lang.Object) commonGramsTokenFilterFactoryTests53);
        commonGramsTokenFilterFactoryTests53.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder69 = null; // flaky: commonGramsTokenFilterFactoryTests53.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals("tests.failfast", (java.lang.Object) charArraySet4, (java.lang.Object) builder69);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArraySet4);
        org.junit.Assert.assertNotNull(testRule7);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(testRule31);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(genericDeclarationArray51);
        org.junit.Assert.assertNotNull(genericDeclarationSet52);
        org.junit.Assert.assertNotNull(testRule54);
        org.junit.Assert.assertNotNull(testRule66);
// flaky:         org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("hi!", indexReader19, (int) (short) -1, postingsEnum21, postingsEnum22, false);
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertReaderStatisticsEquals("tests.badapples", indexReader29, indexReader30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(testRule26);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        java.util.Random random0 = null;
        java.lang.Object obj2 = null;
        org.apache.lucene.document.FieldType fieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newField(random0, "enwiki.random.lines.txt", obj2, fieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.junit.Assert.assertEquals("", (float) (byte) -1, 0.0f, 10.0f);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.lang.Object obj0 = null;
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
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.testQueryModeCommonGramsAnalysis();
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to load settings from [/org/elasticsearch/index/analysis/commongrams/commongrams_query_mode.json]");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
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
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals(intArray49, intArray52);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        org.junit.Assert.assertArrayEquals(intArray56, intArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray49, intArray56);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        org.junit.Assert.assertArrayEquals(intArray65, intArray68);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray76, intArray83);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray65, intArray76);
        org.junit.Assert.assertArrayEquals(intArray49, intArray65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray29, intArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[]");
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("random", indexReader17, 1, postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.TermsEnum termsEnum24 = null;
        org.apache.lucene.index.TermsEnum termsEnum25 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermStatsEquals("enwiki.random.lines.txt", termsEnum24, termsEnum25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
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
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertFieldInfosEquals("tests.slow", indexReader18, indexReader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule10);
        org.junit.Assert.assertNotNull(testRule16);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader25, terms26, terms27, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule20);
        org.junit.Assert.assertNotNull(testRule22);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
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
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
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
        org.junit.Assert.assertArrayEquals(intArray22, intArray26);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray35, intArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray22, intArray42);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        org.junit.Assert.assertArrayEquals(intArray55, intArray58);
        org.junit.Assert.assertArrayEquals("random", intArray53, intArray55);
        org.junit.Assert.assertArrayEquals(intArray42, intArray55);
        org.junit.Assert.assertArrayEquals("tests.monster", intArray16, intArray55);
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
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray55, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[]");
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        java.lang.String str27 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "tests.slow");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<unknown>" + "'", str27, "<unknown>");
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
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
        org.elasticsearch.common.settings.Settings.Builder builder15 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertReaderStatisticsEquals("europarl.lines.txt.gz", indexReader17, indexReader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<unknown>" + "'", str14, "<unknown>");
// flaky:         org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
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
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.badapples", indexReader14, (int) (short) -1, postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.awaitsfix", indexReader20, terms21, terms22, true);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule25);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
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
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule23;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests25 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.setUp();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests25.ruleChain;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests25.assertFieldsEquals("tests.maxfailures", indexReader30, fields31, fields32, false);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) testRule23, (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests25.assertDocsEnumEquals("tests.maxfailures", postingsEnum39, postingsEnum40, false);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests25.ruleChain;
        commonGramsTokenFilterFactoryTests25.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests46 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule47 = commonGramsTokenFilterFactoryTests46.ruleChain;
        commonGramsTokenFilterFactoryTests46.setUp();
        java.lang.String str49 = commonGramsTokenFilterFactoryTests46.getTestName();
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests46);
        commonGramsTokenFilterFactoryTests46.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        commonGramsTokenFilterFactoryTests46.assertPositionsSkippingEquals("tests.nightly", indexReader54, (int) (byte) 0, postingsEnum56, postingsEnum57);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests25, (java.lang.Object) "tests.nightly");
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests25.testCommonGramsAnalysis();
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.common.settings.SettingsException; message: Failed to load settings from [/org/elasticsearch/index/analysis/commongrams/commongrams.json]");
        } catch (org.elasticsearch.common.settings.SettingsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(testRule23);
        org.junit.Assert.assertNotNull(testRule26);
        org.junit.Assert.assertNotNull(testRule28);
        org.junit.Assert.assertNotNull(testRule35);
        org.junit.Assert.assertNotNull(testRule43);
        org.junit.Assert.assertNotNull(testRule47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<unknown>" + "'", str49, "<unknown>");
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<unknown>" + "'", str14, "<unknown>");
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.apache.lucene.analysis.Analyzer analyzer0 = null;
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
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray33 = new org.apache.lucene.util.LuceneTestCase[][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray33);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) luceneTestCaseArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray14);
        java.lang.String[] strArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertAnalyzesTo(analyzer0, "tests.weekly", strArray14, strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(luceneTestCaseArray33);
        org.junit.Assert.assertNotNull(luceneTestCaseArraySet34);
        org.junit.Assert.assertNotNull(luceneTestCaseArraySet35);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader12, terms13, terms14, true);
        org.elasticsearch.common.settings.Settings.Builder builder17 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
// flaky:         org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
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
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.failfast", indexReader14, terms15, terms16, true);
        java.lang.String str19 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.nightly", indexReader21, terms22, terms23, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        org.elasticsearch.common.settings.Settings.Builder builder27 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<unknown>" + "'", str19, "<unknown>");
// flaky:         org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
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
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests26 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule27 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests26.assertDocsEnumEquals("hi!", postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader34, (int) (byte) 100, postingsEnum36, postingsEnum37);
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests26.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests26, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        commonGramsTokenFilterFactoryTests26.assertPositionsSkippingEquals("<unknown>", indexReader43, 6, postingsEnum45, postingsEnum46);
        java.lang.String str48 = commonGramsTokenFilterFactoryTests26.getTestName();
        commonGramsTokenFilterFactoryTests26.setUp();
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs(3);
        commonGramsTokenFilterFactoryTests26.tearDown();
        commonGramsTokenFilterFactoryTests26.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests26.setIndexWriterMaxDocs(5);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        commonGramsTokenFilterFactoryTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader57, fields58, fields59, true);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "europarl.lines.txt.gz");
        java.lang.String str63 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.junit.Assert.assertNotNull(testRule16);
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(testRule27);
        org.junit.Assert.assertNotNull(testRule39);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<unknown>" + "'", str48, "<unknown>");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<unknown>" + "'", str63, "<unknown>");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.awaitsfix", indexReader21, terms22, terms23, true);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule5);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
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
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(3);
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.TermsEnum termsEnum19 = null;
        org.apache.lucene.index.TermsEnum termsEnum20 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermStatsEquals("europarl.lines.txt.gz", termsEnum19, termsEnum20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertNotNull(testRule15);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        java.util.Random random0 = null;
        org.apache.lucene.analysis.Analyzer analyzer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.checkRandomData(random0, analyzer1, (int) ' ', 0, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
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
        org.elasticsearch.common.settings.Settings.Builder builder16 = null; // flaky: commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests2.testWithoutCommonWordsMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strSet10);
// flaky:         org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, false);
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        java.lang.String str11 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertFieldStatisticsEquals("<unknown>", fields13, fields14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        java.util.Random random0 = null;
        org.apache.lucene.analysis.Analyzer analyzer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.checkRandomData(random0, analyzer1, 0, 6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        org.apache.lucene.util.LuceneTestCase[][][][] luceneTestCaseArray2 = new org.apache.lucene.util.LuceneTestCase[][][][] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase[][][]> luceneTestCaseArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray2);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray11);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray11, (java.lang.Object) 1.0d);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray11);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray24);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray24, (java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) luceneTestCaseArray2, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray24);
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
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        java.lang.String[] strArray63 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet64 = org.apache.lucene.util.LuceneTestCase.asSet(strArray63);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray63);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray59, (java.lang.Object[]) strArray63);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray63, (java.lang.Object) 1.0d);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray63);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet71 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray70);
        java.util.Set<java.lang.CharSequence> charSequenceSet73 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray70);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray63, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(luceneTestCaseArray2);
        org.junit.Assert.assertNotNull(luceneTestCaseArraySet3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strComparableSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strComparableSet69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(charSequenceSet73);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.junit.Assert.assertNotEquals("<unknown>", (double) 'a', (double) ' ', 0.0d);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.badapples", postingsEnum7, postingsEnum8, false);
        java.lang.String str11 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("", indexReader18, 0, postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests13.assertPositionsSkippingEquals("tests.failfast", indexReader25, (int) (short) 10, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        commonGramsTokenFilterFactoryTests13.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader31, (int) (byte) 100, postingsEnum33, postingsEnum34, false);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "enwiki.random.lines.txt");
        org.elasticsearch.common.settings.Settings.Builder builder38 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests39 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule40 = commonGramsTokenFilterFactoryTests39.ruleChain;
        commonGramsTokenFilterFactoryTests39.setUp();
        commonGramsTokenFilterFactoryTests39.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsEnumEquals("tests.badapples", postingsEnum44, postingsEnum45, true);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests39.assertDocsSkippingEquals("hi!", indexReader49, 1, postingsEnum51, postingsEnum52, false);
        java.lang.String str55 = commonGramsTokenFilterFactoryTests39.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests39, (java.lang.Object) ' ');
        commonGramsTokenFilterFactoryTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests39.assertFieldsEquals("tests.awaitsfix", indexReader60, fields61, fields62, true);
        commonGramsTokenFilterFactoryTests39.setUp();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests39);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(testRule14);
// flaky:         org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(testRule40);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<unknown>" + "'", str55, "<unknown>");
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.apache.lucene.analysis.Analyzer analyzer0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray9, (java.lang.Object) 1.0d);
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray9);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        java.util.Set<java.lang.CharSequence> charSequenceSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray16);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.analysis.BaseTokenStreamTestCase.assertAnalyzesTo(analyzer0, "tests.failfast", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strComparableSet15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(charSequenceSet19);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertNormsEquals("tests.slow", indexReader8, indexReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
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
        org.elasticsearch.common.settings.Settings.Builder builder14 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 100);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.slow", indexReader20, fields21, fields22, true);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.nightly", postingsEnum26, postingsEnum27, true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule13);
// flaky:         org.junit.Assert.assertNotNull(builder14);
// flaky:         org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
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
        org.elasticsearch.common.settings.Settings.Builder builder16 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (int) '#', postingsEnum21, postingsEnum22);
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermsStatisticsEquals("tests.slow", terms25, terms26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
// flaky:         org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
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
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("", indexReader19, 2, postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexableField indexableField26 = null;
        org.apache.lucene.index.IndexableField indexableField27 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests1.assertStoredFieldEquals("tests.slow", indexableField26, indexableField27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("random", indexReader8, terms9, terms10, true);
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermsStatisticsEquals("tests.monster", terms14, terms15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader21, terms22, terms23, false);
        org.junit.rules.TestRule testRule26 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder27 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Fields fields31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader30, fields31, fields32, true);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("", postingsEnum36, postingsEnum37, false);
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule18);
        org.junit.Assert.assertNotNull(testRule26);
// flaky:         org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
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
        org.elasticsearch.common.settings.Settings.Builder builder15 = null; // flaky: commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.tearDown();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader20, (int) ' ', postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader26, fields27, fields28, true);
        commonGramsTokenFilterFactoryTests2.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests2.assertFieldInfosEquals("hi!", indexReader34, indexReader35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
// flaky:         org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray2);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray13);
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray10);
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
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray23);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray43, (java.lang.Object) 1.0d);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray52);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray55, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) strArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(strSet60);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsEnumEquals("hi!", postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader29, (int) (byte) 100, postingsEnum31, postingsEnum32);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests21.assertFieldsEquals("tests.nightly", indexReader35, fields36, fields37, true);
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests21.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        commonGramsTokenFilterFactoryTests21.setIndexWriterMaxDocs(10);
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("<unknown>", postingsEnum48, postingsEnum49, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.weekly", indexReader55, terms56, terms57, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsEnumEquals("tests.failfast", postingsEnum62, postingsEnum63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader67, 3, postingsEnum69, postingsEnum70, true);
        commonGramsTokenFilterFactoryTests60.tearDown();
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader75, (int) (short) 100, postingsEnum77, postingsEnum78, false);
        java.lang.String str81 = commonGramsTokenFilterFactoryTests60.getTestName();
        commonGramsTokenFilterFactoryTests60.setUp();
        commonGramsTokenFilterFactoryTests60.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) terms57, (java.lang.Object) commonGramsTokenFilterFactoryTests60);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
        org.junit.Assert.assertNotNull(testRule22);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<unknown>" + "'", str81, "<unknown>");
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.badapples", indexReader21, terms22, terms23, false);
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.TermsEnum termsEnum29 = null;
        org.apache.lucene.index.TermsEnum termsEnum30 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests0.assertTermsEnumEquals("<unknown>", indexReader28, termsEnum29, termsEnum30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.junit.Assert.assertNotEquals("tests.nightly", (long) (byte) 10, (long) 100);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
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
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray58);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray55, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests63.ruleChain;
        commonGramsTokenFilterFactoryTests63.setUp();
        commonGramsTokenFilterFactoryTests63.tearDown();
        commonGramsTokenFilterFactoryTests63.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests63.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsEnumEquals("hi!", postingsEnum70, postingsEnum71, false);
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        commonGramsTokenFilterFactoryTests63.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum75, postingsEnum76, true);
        org.elasticsearch.common.settings.Settings.Builder builder79 = null; // flaky: commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests63);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) strArray49, (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        commonGramsTokenFilterFactoryTests63.tearDown();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(testRule64);
// flaky:         org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
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
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests19.assertDocsEnumEquals("hi!", postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader27, (int) (byte) 100, postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        commonGramsTokenFilterFactoryTests19.assertFieldsEquals("tests.nightly", indexReader33, fields34, fields35, true);
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.rules.TestRule testRule39 = commonGramsTokenFilterFactoryTests19.ruleChain;
        commonGramsTokenFilterFactoryTests19.tearDown();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotSame((java.lang.Object) luceneTestCaseArraySet18, (java.lang.Object) commonGramsTokenFilterFactoryTests19);
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        commonGramsTokenFilterFactoryTests19.assertTermsEquals("random", indexReader45, terms46, terms47, false);
        commonGramsTokenFilterFactoryTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(luceneTestCaseArray14);
        org.junit.Assert.assertNotNull(luceneTestCaseArraySet15);
        org.junit.Assert.assertNotNull(luceneTestCaseArraySet16);
        org.junit.Assert.assertNotNull(luceneTestCaseArraySet18);
        org.junit.Assert.assertNotNull(testRule20);
        org.junit.Assert.assertNotNull(testRule39);
        org.junit.Assert.assertNotNull(testRule41);
        org.junit.Assert.assertNotNull(testRule43);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
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
        org.elasticsearch.common.settings.Settings.Builder builder27 = null; // flaky: commonGramsTokenFilterFactoryTests4.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests4.tearDown();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.TermsEnum termsEnum32 = null;
        org.apache.lucene.index.TermsEnum termsEnum33 = null;
        // The following exception was thrown during execution in test generation
        try {
            commonGramsTokenFilterFactoryTests4.assertTermsEnumEquals("tests.failfast", indexReader31, termsEnum32, termsEnum33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule5);
        org.junit.Assert.assertNotNull(testRule17);
// flaky:         org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder18 = null; // flaky: commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        float[] floatArray23 = new float[] { (short) 1 };
        float[] floatArray25 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray25, (float) '#');
        float[] floatArray29 = new float[] { (short) 1 };
        float[] floatArray31 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray31, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray29, (float) 100);
        float[] floatArray37 = new float[] { (short) 1 };
        float[] floatArray39 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray39, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray25, floatArray39, (float) 3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests44 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests44.ruleChain;
        commonGramsTokenFilterFactoryTests44.setUp();
        commonGramsTokenFilterFactoryTests44.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder48 = null; // flaky: commonGramsTokenFilterFactoryTests44.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests44);
        commonGramsTokenFilterFactoryTests44.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests44.setUp();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) 3, (java.lang.Object) commonGramsTokenFilterFactoryTests44);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        commonGramsTokenFilterFactoryTests44.assertTermsEquals("", indexReader54, terms55, terms56, false);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        commonGramsTokenFilterFactoryTests44.assertFieldsEquals("tests.awaitsfix", indexReader60, fields61, fields62, true);
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsEnumEquals("<unknown>", postingsEnum66, postingsEnum67, false);
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests44.assertDocsEnumEquals("tests.badapples", postingsEnum71, postingsEnum72, false);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) postingsEnum71);
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule3);
// flaky:         org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[0.0]");
        org.junit.Assert.assertNotNull(testRule45);
// flaky:         org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
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
        org.elasticsearch.common.settings.Settings.Builder builder13 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str16 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) throttlingArray28);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule4);
// flaky:         org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(testRule19);
        org.junit.Assert.assertTrue("'" + throttling27 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling27.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray28);
        org.junit.Assert.assertNotNull(throttlingEnumSet29);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
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
        org.elasticsearch.common.settings.Settings.Builder builder13 = null; // flaky: commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str16 = commonGramsTokenFilterFactoryTests15.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        commonGramsTokenFilterFactoryTests18.setUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        commonGramsTokenFilterFactoryTests18.assertFieldsEquals("enwiki.random.lines.txt", indexReader28, fields29, fields30, true);
        org.junit.Assert.assertNotNull(testRule2);
        org.junit.Assert.assertNotNull(testRule4);
// flaky:         org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(testRule19);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("hi!", indexReader4, terms5, terms6, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull(testRule1);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("random", indexReader22, fields23, fields24, true);
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str29 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests0.ruleChain;
        java.lang.Class<?> wildcardClass31 = commonGramsTokenFilterFactoryTests0.getClass();
        org.junit.Assert.assertNotNull(testRule1);
        org.junit.Assert.assertNotNull(testRule20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<unknown>" + "'", str29, "<unknown>");
        org.junit.Assert.assertNotNull(testRule30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}
