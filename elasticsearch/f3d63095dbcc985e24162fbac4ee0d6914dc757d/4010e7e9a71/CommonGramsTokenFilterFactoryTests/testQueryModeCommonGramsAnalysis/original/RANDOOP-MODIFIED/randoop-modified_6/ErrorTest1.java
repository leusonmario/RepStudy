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
        org.junit.Assert.assertNotEquals(1.0d, 1.0d, (double) 5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        java.lang.Class<?> wildcardClass11 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        commonGramsTokenFilterFactoryTests13.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests13.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.setUp();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("hi!", postingsEnum27, postingsEnum28, true);
        java.lang.Class<?> wildcardClass31 = commonGramsTokenFilterFactoryTests20.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass19, wildcardClass31 };
        java.util.Set<java.lang.reflect.Type> typeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray32);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray40, (java.lang.Object) 1.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) typeArray32, (java.lang.Object[]) strArray40);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) -1, (float) (byte) 100, (float) (byte) 10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        double[] doubleArray7 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray14 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray14, (double) 100.0f);
        double[] doubleArray23 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray30 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray30, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray23, (double) 4);
        double[] doubleArray39 = new double[] { (byte) 10, 3, 3, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray7, doubleArray39, (double) 10.0f);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray23, doubleArray41, 1.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) throttlingArray2, (java.lang.Object) '#');
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray26);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray26, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) strArray26);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        double[] doubleArray7 = new double[] { 10.0f, (-1.0f), (short) 0, 10.0f, (byte) 1, 6 };
        double[] doubleArray14 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray21 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray21, (double) 100.0f);
        double[] doubleArray30 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray37 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray37, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray30, (double) 4);
        double[] doubleArray48 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray55 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray55, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray48, (double) (byte) 0);
        double[] doubleArray66 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray73 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray73, (double) 100.0f);
        double[] doubleArray82 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray89 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray89, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray82, (double) 4);
        org.junit.Assert.assertArrayEquals(doubleArray48, doubleArray82, (double) 0);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray82, (double) 4);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) '#');
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) (-1L), 0.0f, (float) (byte) -1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) ' ');
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 0.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        char[] charArray6 = new char[] { '#', '#', ' ', '4', '4' };
        char[] charArray10 = new char[] { 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray10);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray24, doubleArray42, 1.0d);
        double[] doubleArray60 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray67 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray67, (double) 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray42, doubleArray67, (double) 1.0f);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, false);
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("", indexReader17, 0, postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("tests.failfast", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule10, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
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
        java.lang.String str18 = commonGramsTokenFilterFactoryTests1.getTestName();
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str18, (java.lang.Object) locale20);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) '#', (float) (short) 1, (float) (byte) -1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
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
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray22);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(2);
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) 10, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests24 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests24, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests24.setUp();
        commonGramsTokenFilterFactoryTests24.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests24.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling22, (java.lang.Object) testRule30);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) strArray16, (java.lang.Object) throttling22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) throttling22);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        java.lang.String str8 = commonGramsTokenFilterFactoryTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) 0, (java.lang.Object) str8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray3);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 100, 100L);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray11);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        int[] intArray3 = new int[] { 6, '4' };
        int[] intArray9 = new int[] { (byte) 100, (byte) 100, 2, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray9);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) (short) -1, (float) (byte) -1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        float[] floatArray1 = new float[] { (short) 1 };
        float[] floatArray3 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray3);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, 0.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        char[] charArray4 = new char[] { '4', '#', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray5);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray10 = new java.io.Serializable[][] { serializableArray3, serializableArray5, serializableArray7, serializableArray9 };
        java.util.Set<java.io.Serializable[]> serializableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray10);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray10, (java.lang.Object[]) strArray24);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
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
        short[] shortArray35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray27, shortArray35);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        float[] floatArray15 = new float[] { (short) 1 };
        float[] floatArray17 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray17, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray11, floatArray15, (float) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray4, floatArray15, (float) 0L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        java.lang.Iterable[] iterableArray62 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray63 = (java.lang.Iterable<java.lang.String>[]) iterableArray62;
        strIterableArray63[0] = strSet56;
        strIterableArray63[1] = strSet58;
        strIterableArray63[2] = strSet60;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray63);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) (-1.0d), (java.lang.Object) strIterableArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strIterableArray63);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) strArray8);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1, (double) 10L, (double) (short) -1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray4, floatArray8, (float) 100);
        float[] floatArray15 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray15, (float) (short) 10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 1, (long) 3);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (long) (byte) 0, (long) (byte) 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("tests.failfast", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader17, 3, postingsEnum19, postingsEnum20, true);
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) testRule9, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
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
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 1.0f);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("<unknown>", (int) (short) 100, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) testRule2);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        commonGramsTokenFilterFactoryTests4.setUp();
        commonGramsTokenFilterFactoryTests4.tearDown();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        commonGramsTokenFilterFactoryTests4.assertFieldsEquals("europarl.lines.txt.gz", indexReader10, fields11, fields12, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) fields11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        char[] charArray5 = new char[] { ' ', '#', ' ', '#', '4' };
        char[] charArray12 = new char[] { '#', '4', 'a', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, 0.0f);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray5, byteArray8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        char[] charArray6 = new char[] { '#', '4', '#', ' ', '4' };
        char[] charArray12 = new char[] { 'a', '4', 'a', ' ', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray6, charArray12);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, 0.0d, (double) (short) 1);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
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
        java.lang.String str22 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("", indexReader24, fields25, fields26, true);
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
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        commonGramsTokenFilterFactoryTests29.assertTermsEquals("tests.failfast", indexReader43, terms44, terms45, true);
        java.lang.Object obj48 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests49 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule50 = commonGramsTokenFilterFactoryTests49.ruleChain;
        commonGramsTokenFilterFactoryTests49.setUp();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests49.ruleChain;
        commonGramsTokenFilterFactoryTests49.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests49.ruleChain;
        org.junit.Assert.assertNotSame(obj48, (java.lang.Object) testRule54);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule54;
        org.junit.Assert.assertNotEquals((java.lang.Object) terms44, (java.lang.Object) testRule54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) "", (java.lang.Object) terms44);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests23 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests23, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests23.setUp();
        commonGramsTokenFilterFactoryTests23.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule29 = commonGramsTokenFilterFactoryTests23.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling21, (java.lang.Object) testRule29);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) strArray15, (java.lang.Object) throttling21);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests37.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests37.setUp();
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) strSet43);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule51 = commonGramsTokenFilterFactoryTests50.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests50, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests50.setUp();
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests50, (java.lang.Object) strSet56);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests62.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests62, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests62.setUp();
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests62, (java.lang.Object) strSet68);
        java.util.Set[] setArray71 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray72 = (java.util.Set<java.lang.String>[]) setArray71;
        strSetArray72[0] = strSet34;
        strSetArray72[1] = strSet43;
        strSetArray72[2] = strSet47;
        strSetArray72[3] = strSet56;
        strSetArray72[4] = strSet59;
        strSetArray72[5] = strSet68;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet85 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray72);
        java.lang.Object obj86 = null;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strSetArray72, obj86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strSetArray72);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 0.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        int[] intArray6 = new int[] { '4', (byte) 10, 4, (short) 1, (byte) 100 };
        int[] intArray10 = new int[] { 10, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray6, intArray10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        int[] intArray4 = new int[] { 1, 6, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray4, intArray5);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray10 = new java.io.Serializable[][] { serializableArray3, serializableArray5, serializableArray7, serializableArray9 };
        java.util.Set<java.io.Serializable[]> serializableArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray10);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) "hi!", (java.lang.Object) serializableArray10);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray10, (java.lang.Object[]) strArray19);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        double[] doubleArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray42, 10.0d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.Class<?> wildcardClass4 = strSet3.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", obj1, (java.lang.Object) strSet3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray26);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests35 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule36 = commonGramsTokenFilterFactoryTests35.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests35, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests35.setUp();
        commonGramsTokenFilterFactoryTests35.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule41 = commonGramsTokenFilterFactoryTests35.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.maxfailures", (java.lang.Object) testRule41);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) (short) 10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray4);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (byte) -1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        char[] charArray3 = new char[] { '#', '#' };
        char[] charArray5 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray3, charArray5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray7 = new int[] { 2, 4, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray7 = new int[] { ' ', (byte) 1, (byte) -1, (-1), 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray7);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 100, (double) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 0, (double) (byte) 10, (double) 'a');
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "random");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10.0f, (-1.0d));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader7, (-1), postingsEnum9, postingsEnum10, false);
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("tests.monster", indexReader15, terms16, terms17, false);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) (-1L));
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests27 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule28 = commonGramsTokenFilterFactoryTests27.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests27.setUp();
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests27, (java.lang.Object) strSet33);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) "enwiki.random.lines.txt");
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) terms17, (java.lang.Object) commonGramsTokenFilterFactoryTests21);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests21.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests4 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests4, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests4.setUp();
        commonGramsTokenFilterFactoryTests4.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = commonGramsTokenFilterFactoryTests4.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling2, (java.lang.Object) testRule10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) throttling2);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) 10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        commonGramsTokenFilterFactoryTests12.setUp();
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests12.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests12);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        commonGramsTokenFilterFactoryTests12.assertTermsEquals("<unknown>", indexReader19, terms20, terms21, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1L), (double) 3);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) '#');
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule7 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame(obj1, (java.lang.Object) testRule7);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule7;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests11 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests11.ruleChain;
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) testRule12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) testRule7, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        char[] charArray6 = new char[] { 'a', ' ', '#', '4', 'a', 'a' };
        char[] charArray13 = new char[] { '4', 'a', ' ', ' ', '#', '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray23, doubleArray41, 1.0d);
        double[] doubleArray56 = new double[] { (byte) 1, 1L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray56, (double) (byte) 1);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10L, (long) 4);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray7);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray17);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests30 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule31 = commonGramsTokenFilterFactoryTests30.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests30.setUp();
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests30, (java.lang.Object) strSet36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests30.assertDocsEnumEquals("hi!", postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) postingsEnum40);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests2.ruleChain;
        double[] doubleArray14 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[] doubleArray20 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[][] doubleArray21 = new double[][] { doubleArray14, doubleArray20 };
        java.util.Set<double[]> doubleArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) testRule8, (java.lang.Object) doubleArraySet22);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        int[] intArray6 = new int[] { 100, (byte) 10, 'a', (short) 1, 'a', (short) 10 };
        int[] intArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        java.lang.String str24 = commonGramsTokenFilterFactoryTests21.getTestName();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("<unknown>", indexReader26, terms27, terms28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("tests.failfast", indexReader32, terms33, terms34, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
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
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 10, (long) ' ');
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
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
        short[] shortArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray78);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { 3, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0, (double) 100, (double) '#');
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (short) 1, 0.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        int[] intArray2 = new int[] { 4 };
        int[] intArray5 = new int[] { (byte) 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) '#', (float) 3, 0.0f);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        java.lang.Object obj0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] { 0, 2, 100 };
        int[] intArray12 = new int[] { 100, (-1), (short) 10, (byte) 10, 2, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray12, (java.lang.Integer) 10);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        char[] charArray0 = null;
        char[] charArray5 = new char[] { ' ', 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("tests.awaitsfix", obj1, (java.lang.Object) testRule9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.awaitsfix", (java.lang.Object) byteArray12);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        java.lang.Class<?> wildcardClass19 = strArray13.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests21, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests21.setUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests21.assertPositionsSkippingEquals("", indexReader27, (int) (byte) 1, postingsEnum29, postingsEnum30);
        java.lang.Class<?> wildcardClass32 = commonGramsTokenFilterFactoryTests21.getClass();
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        java.lang.Class<?> wildcardClass41 = strArray35.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray42 = new java.lang.reflect.AnnotatedElement[] { wildcardClass10, wildcardClass19, wildcardClass32, wildcardClass41 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet43 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray42);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests45 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule46 = commonGramsTokenFilterFactoryTests45.ruleChain;
        commonGramsTokenFilterFactoryTests45.setUp();
        commonGramsTokenFilterFactoryTests45.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder49 = commonGramsTokenFilterFactoryTests45.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests45);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        commonGramsTokenFilterFactoryTests45.assertDocsEnumEquals("<unknown>", postingsEnum52, postingsEnum53, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray42, (java.lang.Object) postingsEnum52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) annotatedElementArray42);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) 4, (double) ' ');
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        char[] charArray6 = new char[] { ' ', '#', 'a', ' ', 'a', 'a' };
        char[] charArray11 = new char[] { '#', '4', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray11);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray2);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (-1), 0.0d, 1.0d);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray9, (float) 100);
        float[] floatArray17 = new float[] { (short) 1 };
        float[] floatArray19 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray19, (float) '#');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray9, floatArray19, (float) (-1L));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("", 4, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 6);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { locale2, "<unknown>", "tests.maxfailures" };
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray5);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray49);
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray52);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray16, (java.lang.Object[]) strArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) serializableArray5, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) strArray8, (java.lang.Object) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) -1);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100.0f, (double) ' ', (double) 1.0f);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (long) 5, (long) 5);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 1.0f, (double) 1);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 10L, (long) 4);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (short) 10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray26);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray40);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray47);
        org.junit.Assert.assertArrayEquals("", shortArray40, shortArray44);
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
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray56);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray69);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray44, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray69);
        java.lang.String[] strArray79 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray79);
        java.lang.String[] strArray83 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet84 = org.apache.lucene.util.LuceneTestCase.asSet(strArray83);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray83);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray79, (java.lang.Object[]) strArray83);
        java.lang.String[] strArray89 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet90 = org.apache.lucene.util.LuceneTestCase.asSet(strArray89);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray89);
        java.lang.String[] strArray92 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet93 = org.apache.lucene.util.LuceneTestCase.asSet(strArray92);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray89, (java.lang.Object[]) strArray92);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray83, (java.lang.Object[]) strArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray6, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        int[] intArray3 = new int[] { 0, 0 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray3, intArray5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { (short) -1, 100, (byte) 10, (-1) };
        int[] intArray13 = new int[] { 100, (-1), (byte) -1, (-1), (short) 0, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray13, (java.lang.Integer) 6);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray9, (float) 100);
        float[] floatArray18 = new float[] { (short) 1 };
        float[] floatArray20 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray20, (float) '#');
        float[] floatArray24 = new float[] { (short) 1 };
        float[] floatArray26 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray26, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray20, floatArray24, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray9, floatArray20, (float) (short) 10);
        float[] floatArray36 = new float[] { (short) 1 };
        float[] floatArray38 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray38, (float) '#');
        float[] floatArray42 = new float[] { (short) 1 };
        float[] floatArray44 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray44, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray38, floatArray42, (float) 100);
        float[] floatArray50 = new float[] { (short) 1 };
        float[] floatArray52 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray38, floatArray52, (float) 3);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray52, (float) 0L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, true);
        java.lang.Class<?> wildcardClass12 = commonGramsTokenFilterFactoryTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) wildcardClass12);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
        commonGramsTokenFilterFactoryTests1.setUp();
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
        commonGramsTokenFilterFactoryTests14.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests14.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) commonGramsTokenFilterFactoryTests14);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
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
        double[] doubleArray18 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[] doubleArray24 = new double[] { 0L, 0.0d, (short) 0, 4, (short) -1 };
        double[][] doubleArray25 = new double[][] { doubleArray18, doubleArray24 };
        java.util.Set<double[]> doubleArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) doubleArray25);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray7 = new int[] { 10, 3, 2, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray7, (java.lang.Integer) 5);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.junit.rules.TestRule testRule1 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1L), (java.lang.Object) testRule1);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.monster", (java.lang.Object) throttlingArray9);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        int[] intArray7 = new int[] { 100, '4', (byte) 100, '4', 3, 'a' };
        int[] intArray10 = new int[] { 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray7, intArray10);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray9, (float) 100);
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        float[] floatArray33 = new float[] { (short) 1 };
        float[] floatArray35 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray35, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray21, floatArray35, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray21, (float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (-1.0f));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
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
        float[] floatArray51 = new float[] { (short) 1 };
        float[] floatArray53 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray53, (float) '#');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray51, (float) (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
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
        commonGramsTokenFilterFactoryTests15.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests15);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (short) 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
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
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray7, (java.lang.Object) byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray12, byteArray18);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        char[] charArray4 = new char[] { 'a', 'a', '4', '4' };
        char[] charArray8 = new char[] { '#', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) -1);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) ' ', (float) 2, (float) (byte) 10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
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
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray30);
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray26, shortArray46);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals("", shortArray63, shortArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray55, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) shortArray26);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { (byte) 10, ' ' };
        int[] intArray10 = new int[] { 10, 10, (short) 0, 100, ' ' };
        int[] intArray15 = new int[] { 0, (-1), (short) 100, (-1) };
        int[] intArray17 = new int[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray10, intArray15, intArray17, (java.lang.Integer) 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { 0, 0 };
        int[] intArray8 = new int[] { (byte) 0, 3, 3 };
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray14);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray49);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray62);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray58, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet68 = org.apache.lucene.util.LuceneTestCase.asSet(strArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray62, (java.lang.Object[]) strArray67);
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray72);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet78 = org.apache.lucene.util.LuceneTestCase.asSet(strArray77);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray77);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray77, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray67, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray27);
        int[] intArray88 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray8, strArray14, intArray88);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
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
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray33);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray33, (java.lang.Object) 1.0d);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        java.util.Set<java.lang.String> strSet50 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) testRule11, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", 0L, (long) (short) 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0.0f, (double) 'a');
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        java.lang.Object obj0 = null;
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("", indexReader15, terms16, terms17, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 4);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray6);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray9);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) shortArray5);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        byte[] byteArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray20);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
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
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (-1L));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10L, (double) 'a', (double) '4');
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (short) 1);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        double[] doubleArray4 = new double[] { (-1.0d), (-1), (byte) 100, (byte) 1 };
        double[] doubleArray11 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray18 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray18, (double) 100.0f);
        double[] doubleArray27 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray34 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray34, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray27, (double) 4);
        double[] doubleArray46 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray53 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray53, (double) 100.0f);
        double[] doubleArray62 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray69 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray69, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray62, (double) 4);
        double[] doubleArray80 = new double[] { (short) 100, '4', 100, 'a', (short) 10, 'a' };
        double[] doubleArray87 = new double[] { 100, 1.0d, (short) 1, (byte) 1, 100.0d, '#' };
        org.junit.Assert.assertArrayEquals(doubleArray80, doubleArray87, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray62, doubleArray80, 1.0d);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray80, (double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray27, (double) 100.0f);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray2 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        int[] intArray6 = new int[] { 1, (byte) 10, (byte) 10, (short) 0, 3, '#' };
        int[] intArray13 = new int[] { 6, (byte) 0, ' ', (byte) 10, 100, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        org.junit.Assert.assertArrayEquals(longArray29, longArray32);
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
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray32, longArray45);
        long[] longArray62 = new long[] {};
        long[] longArray63 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray62, longArray63);
        org.junit.Assert.assertArrayEquals(longArray32, longArray63);
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
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray32, longArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray20, (java.lang.Object) longArray70);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        java.lang.String str6 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("enwiki.random.lines.txt", indexReader8, fields9, fields10, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
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
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("", (int) (short) 10, numericDocValues30, numericDocValues31);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 'a', 0L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray13);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray16);
        org.junit.Assert.assertArrayEquals("", shortArray9, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray9);
        short[] shortArray22 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray22);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1L, (double) 10L, (double) (byte) 10);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        int[] intArray2 = new int[] { 6, 6 };
        int[] intArray9 = new int[] { 6, 4, (short) 0, (byte) 0, 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray42);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray42, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) strArray9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 'a', (-1L));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
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
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray14);
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray14, obj19);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests3);
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
        commonGramsTokenFilterFactoryTests10.tearDown();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.tearDown();
        org.junit.rules.TestRule testRule32 = commonGramsTokenFilterFactoryTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        int[] intArray0 = new int[] {};
        int[] intArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (short) 1, (float) 100L, (float) (short) 1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, true);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) 'a', numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray40);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 2, (double) 0.0f, (double) 1.0f);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '#', (double) 100L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
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
        org.junit.Assert.assertSame("hi!", (java.lang.Object) longArray5, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 'a');
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        char[] charArray1 = new char[] { '4' };
        char[] charArray3 = new char[] { ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        float[] floatArray2 = new float[] { 'a' };
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, (float) '4');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray2, floatArray4, 0.0f);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        char[] charArray3 = new char[] { 'a', 'a' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray4);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 3, (long) 100);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder6 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        java.lang.Class<?> wildcardClass8 = commonGramsTokenFilterFactoryTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) wildcardClass8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) 1, (double) 1, (double) 5);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        char[] charArray4 = new char[] { '#', '#', '#' };
        char[] charArray6 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray4, charArray6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        int[] intArray4 = new int[] { 0, 3, (byte) 0, (byte) 10 };
        int[] intArray9 = new int[] { 6, (short) -1, 2, 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        char[] charArray3 = new char[] { '#', '#', '4' };
        char[] charArray9 = new char[] { ' ', '#', ' ', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
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
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(5);
        float[] floatArray23 = new float[] { (short) 1 };
        float[] floatArray25 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray25, (float) '#');
        float[] floatArray29 = new float[] { (short) 1 };
        float[] floatArray31 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray31, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray25, floatArray29, (float) 100);
        float[] floatArray39 = new float[] { (short) 1 };
        float[] floatArray41 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray41, (float) '#');
        float[] floatArray45 = new float[] { (short) 1 };
        float[] floatArray47 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray47, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray41, floatArray45, (float) 100);
        float[] floatArray53 = new float[] { (short) 1 };
        float[] floatArray55 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray55, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray41, floatArray55, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray41, (float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) floatArray41);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray9 = new char[] { '4', '#', '4', ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray2, charArray9);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d, (double) (short) -1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
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
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.slow", 4, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
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
        java.lang.Class<?> wildcardClass21 = commonGramsTokenFilterFactoryTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) wildcardClass21);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests51.ruleChain;
        commonGramsTokenFilterFactoryTests51.setUp();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests51.ruleChain;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        org.apache.lucene.index.Fields fields58 = null;
        commonGramsTokenFilterFactoryTests51.assertFieldsEquals("tests.maxfailures", indexReader56, fields57, fields58, false);
        java.lang.Class<?> wildcardClass61 = commonGramsTokenFilterFactoryTests51.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests63 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule64 = commonGramsTokenFilterFactoryTests63.ruleChain;
        commonGramsTokenFilterFactoryTests63.setUp();
        commonGramsTokenFilterFactoryTests63.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder67 = commonGramsTokenFilterFactoryTests63.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests63);
        java.lang.Class<?> wildcardClass69 = commonGramsTokenFilterFactoryTests63.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests70 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule71 = commonGramsTokenFilterFactoryTests70.ruleChain;
        commonGramsTokenFilterFactoryTests70.setUp();
        org.junit.rules.TestRule testRule73 = commonGramsTokenFilterFactoryTests70.ruleChain;
        commonGramsTokenFilterFactoryTests70.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests70.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        commonGramsTokenFilterFactoryTests70.assertDocsEnumEquals("hi!", postingsEnum77, postingsEnum78, true);
        java.lang.Class<?> wildcardClass81 = commonGramsTokenFilterFactoryTests70.getClass();
        java.lang.reflect.Type[] typeArray82 = new java.lang.reflect.Type[] { wildcardClass61, wildcardClass69, wildcardClass81 };
        java.util.Set<java.lang.reflect.Type> typeSet83 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray82);
        org.junit.Assert.assertNotNull((java.lang.Object) typeArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) typeArray82);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', (long) (byte) 1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 1, (double) 6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        long[] longArray0 = new long[] {};
        long[] longArray1 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals(longArray7, longArray10);
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
        long[] longArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray15);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        char[] charArray0 = new char[] {};
        char[] charArray4 = new char[] { ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
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
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strSetArray40, obj54);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray56 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet57 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strSetArray40, (java.lang.Object) genericDeclarationArray56);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        int[] intArray7 = new int[] { (byte) 1, 100, (short) 100, '4', (byte) 0, 3 };
        int[] intArray13 = new int[] { (byte) 1, (byte) 1, '4', (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        int[] intArray7 = new int[] { (short) 1, '4', 3, 1, 'a', 1 };
        int[] intArray14 = new int[] { 1, (byte) 100, (-1), 'a', (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray7, intArray14);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
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
        float[] floatArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray67, (float) 10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 10, (long) (short) 1);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 10, (long) (byte) 100);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) 10L, 0.0f);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (byte) 0, (float) (byte) 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        float[] floatArray54 = new float[] { (short) 1 };
        float[] floatArray56 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray56, (float) '#');
        float[] floatArray60 = new float[] { (short) 1 };
        float[] floatArray62 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray62, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray56, floatArray60, (float) 100);
        float[] floatArray69 = new float[] { (short) 1 };
        float[] floatArray71 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray71, (float) '#');
        float[] floatArray75 = new float[] { (short) 1 };
        float[] floatArray77 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray77, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray71, floatArray75, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray60, floatArray71, (float) (short) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray36, floatArray71, (-1.0f));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        char[] charArray4 = new char[] { '4', '#', ' ', ' ' };
        char[] charArray9 = new char[] { ' ', '#', '4', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray9);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
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
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (short) 100, 0.0f, 0.0f);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) 2, (float) ' ', (float) 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests41 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule42 = commonGramsTokenFilterFactoryTests41.ruleChain;
        commonGramsTokenFilterFactoryTests41.setUp();
        commonGramsTokenFilterFactoryTests41.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests41.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass46 = commonGramsTokenFilterFactoryTests41.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray47 = new java.lang.reflect.AnnotatedElement[] { wildcardClass46 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests48 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule49 = commonGramsTokenFilterFactoryTests48.ruleChain;
        commonGramsTokenFilterFactoryTests48.setUp();
        commonGramsTokenFilterFactoryTests48.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder52 = commonGramsTokenFilterFactoryTests48.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass53 = commonGramsTokenFilterFactoryTests48.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray54 = new java.lang.reflect.AnnotatedElement[] { wildcardClass53 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests55 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests55.ruleChain;
        commonGramsTokenFilterFactoryTests55.setUp();
        commonGramsTokenFilterFactoryTests55.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder59 = commonGramsTokenFilterFactoryTests55.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass60 = commonGramsTokenFilterFactoryTests55.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray61 = new java.lang.reflect.AnnotatedElement[] { wildcardClass60 };
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests62 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests62.ruleChain;
        commonGramsTokenFilterFactoryTests62.setUp();
        commonGramsTokenFilterFactoryTests62.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder66 = commonGramsTokenFilterFactoryTests62.newAnalysisSettingsBuilder();
        java.lang.Class<?> wildcardClass67 = commonGramsTokenFilterFactoryTests62.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray68 = new java.lang.reflect.AnnotatedElement[] { wildcardClass67 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray69 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray47, annotatedElementArray54, annotatedElementArray61, annotatedElementArray68 };
        java.util.Set<java.lang.reflect.AnnotatedElement[]> annotatedElementArraySet70 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) annotatedElementArray69);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader6, 4, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.elasticsearch.common.settings.Settings.Builder builder12 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        char[] charArray5 = new char[] { 'a', ' ', '#', ' ' };
        char[] charArray9 = new char[] { '#', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray5, charArray9);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100, (double) '#');
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        java.lang.Class<?> wildcardClass47 = strArray41.getClass();
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        java.lang.Class<?> wildcardClass56 = strArray50.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests58 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule59 = commonGramsTokenFilterFactoryTests58.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests58, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests58.setUp();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        commonGramsTokenFilterFactoryTests58.assertPositionsSkippingEquals("", indexReader64, (int) (byte) 1, postingsEnum66, postingsEnum67);
        java.lang.Class<?> wildcardClass69 = commonGramsTokenFilterFactoryTests58.getClass();
        java.lang.String[] strArray72 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet73 = org.apache.lucene.util.LuceneTestCase.asSet(strArray72);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray75);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray72, (java.lang.Object[]) strArray75);
        java.lang.Class<?> wildcardClass78 = strArray72.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray79 = new java.lang.reflect.AnnotatedElement[] { wildcardClass47, wildcardClass56, wildcardClass69, wildcardClass78 };
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet80 = org.apache.lucene.util.LuceneTestCase.asSet(annotatedElementArray79);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests82 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule83 = commonGramsTokenFilterFactoryTests82.ruleChain;
        commonGramsTokenFilterFactoryTests82.setUp();
        commonGramsTokenFilterFactoryTests82.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder86 = commonGramsTokenFilterFactoryTests82.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests82);
        org.apache.lucene.index.PostingsEnum postingsEnum89 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum90 = null;
        commonGramsTokenFilterFactoryTests82.assertDocsEnumEquals("<unknown>", postingsEnum89, postingsEnum90, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) annotatedElementArray79, (java.lang.Object) postingsEnum89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray26, (java.lang.Object[]) annotatedElementArray79);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { ' ', 2, (short) -1, '#' };
        int[] intArray12 = new int[] { 5, 0, 10, 100, (byte) -1 };
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
        int[] intArray51 = new int[] { 5, (byte) 1 };
        int[] intArray54 = new int[] { (byte) -1, (short) -1 };
        boolean[] booleanArray61 = new boolean[] { false, false, false, true, false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray12, strArray21, intArray51, intArray54, (java.lang.Integer) 4, booleanArray61, true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 1, (double) 'a', (double) ' ');
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (byte) -1, (long) (short) 100);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
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
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray28, (java.lang.Object[]) strArray31);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        char[] charArray4 = new char[] { '#', '4', ' ' };
        char[] charArray7 = new char[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray3 = new int[] { 100 };
        int[] intArray4 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray3, intArray4, intArray7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 0, (double) 100, 1.0d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10L, (double) 1L, (double) 10.0f);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        double[] doubleArray2 = new double[] { '#', 2 };
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
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray25, (double) (-1));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
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
        java.util.Set<java.lang.CharSequence> charSequenceSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray51);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests60 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule61 = commonGramsTokenFilterFactoryTests60.ruleChain;
        commonGramsTokenFilterFactoryTests60.setUp();
        commonGramsTokenFilterFactoryTests60.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsEnumEquals("tests.badapples", postingsEnum65, postingsEnum66, true);
        org.apache.lucene.index.IndexReader indexReader70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        commonGramsTokenFilterFactoryTests60.assertDocsSkippingEquals("hi!", indexReader70, 1, postingsEnum72, postingsEnum73, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray51, (java.lang.Object) "hi!");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        java.lang.Object obj1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) throttling3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", obj1, (java.lang.Object) throttling3);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 3, (double) (byte) 1, (double) 10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotEquals((java.lang.Object) throttling0, (java.lang.Object) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttling0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        int[] intArray3 = new int[] { 6, (byte) 1 };
        int[] intArray7 = new int[] { 1, (short) 0, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray3, intArray7);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 100, (double) 1L, 1.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) 4);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray29, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray19);
        org.elasticsearch.common.settings.Settings.Builder[] builderArray37 = new org.elasticsearch.common.settings.Settings.Builder[] {};
        org.elasticsearch.common.settings.Settings.Builder[][] builderArray38 = new org.elasticsearch.common.settings.Settings.Builder[][] { builderArray37 };
        java.util.Set<org.elasticsearch.common.settings.Settings.Builder[]> builderArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(builderArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray19, (java.lang.Object[]) builderArray38);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 0.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray5 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray8 = new java.io.Serializable[][] { serializableArray1, serializableArray3, serializableArray5, serializableArray7 };
        java.util.Set<java.io.Serializable[]> serializableArraySet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests10 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests10.ruleChain;
        commonGramsTokenFilterFactoryTests10.setUp();
        commonGramsTokenFilterFactoryTests10.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder14 = commonGramsTokenFilterFactoryTests10.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests10);
        commonGramsTokenFilterFactoryTests10.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests10.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests10.assertDocsEnumEquals("", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests10.assertFieldsEquals("tests.monster", indexReader24, fields25, fields26, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) serializableArraySet9, (java.lang.Object) commonGramsTokenFilterFactoryTests10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) '4', 0.0f, 0.0f);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        int[] intArray5 = new int[] { 0, 0, 6, 6, 1 };
        int[] intArray8 = new int[] { (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        int[] intArray2 = new int[] { 4, (short) 1 };
        int[] intArray6 = new int[] { (short) -1, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
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
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("europarl.lines.txt.gz", 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        int[] intArray2 = new int[] { (short) -1, 3 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        int[] intArray6 = new int[] { 1, 3, 'a', '4', 5, (short) -1 };
        int[] intArray13 = new int[] { (byte) 1, 4, (byte) 10, 4, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
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
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests21 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule22 = commonGramsTokenFilterFactoryTests21.ruleChain;
        commonGramsTokenFilterFactoryTests21.setUp();
        commonGramsTokenFilterFactoryTests21.tearDown();
        commonGramsTokenFilterFactoryTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        commonGramsTokenFilterFactoryTests21.assertDocsSkippingEquals("tests.badapples", indexReader27, (-1), postingsEnum29, postingsEnum30, false);
        commonGramsTokenFilterFactoryTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        commonGramsTokenFilterFactoryTests21.assertTermsEquals("tests.monster", indexReader35, terms36, terms37, false);
        org.elasticsearch.common.settings.Settings.Builder builder40 = commonGramsTokenFilterFactoryTests21.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) builder40);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader7, 0, postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader14, fields15, fields16, true);
        commonGramsTokenFilterFactoryTests2.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) -1, 2, '4', ' ', (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        int[] intArray2 = new int[] { (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray3);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
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
        float[] floatArray21 = new float[] { (short) 1 };
        float[] floatArray23 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray23, (float) '#');
        float[] floatArray27 = new float[] { (short) 1 };
        float[] floatArray29 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray29, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) '4');
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray21, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) floatArray21);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 100, 0.0d, (double) 'a');
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray9, (float) 100);
        float[] floatArray19 = new float[] { (short) 1 };
        float[] floatArray21 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) '#');
        float[] floatArray25 = new float[] { (short) 1 };
        float[] floatArray27 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray21, floatArray25, (float) 100);
        float[] floatArray33 = new float[] { (short) 1 };
        float[] floatArray35 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray35, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray21, floatArray35, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray21, (float) (short) 1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.setUp();
        java.lang.String str45 = commonGramsTokenFilterFactoryTests42.getTestName();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        commonGramsTokenFilterFactoryTests42.assertTermsEquals("<unknown>", indexReader47, terms48, terms49, false);
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests42.setUp();
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) floatArray21, (java.lang.Object) commonGramsTokenFilterFactoryTests42);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        int[] intArray2 = new int[] { 3, (byte) -1 };
        int[] intArray9 = new int[] { ' ', (short) 1, (byte) 10, 3, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        char[] charArray3 = new char[] { ' ', '4', '#' };
        char[] charArray7 = new char[] { 'a', '#', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
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
        byte[] byteArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray24);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
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
        commonGramsTokenFilterFactoryTests17.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests17.assertDocValuesEquals("tests.slow", (int) (byte) 100, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.setUp();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests3.ruleChain;
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ' ', (java.lang.Object) commonGramsTokenFilterFactoryTests3);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet15 = org.apache.lucene.util.LuceneTestCase.asSet(strArray14);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray14);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray14);
        java.util.Set<java.io.Serializable> serializableSet18 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) "hi!", (java.lang.Object) strArray11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
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
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet20 = org.apache.lucene.util.LuceneTestCase.asSet(strArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet41 = org.apache.lucene.util.LuceneTestCase.asSet(strArray40);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray40);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray40);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray45);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertNotEquals((java.lang.Object) postingsEnum14, (java.lang.Object) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule0, (java.lang.Object) strArray19);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray6, floatArray10, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray10, (float) '#');
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        int[] intArray4 = new int[] { (byte) 0, (short) -1, (byte) -1 };
        int[] intArray7 = new int[] { 100, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray4, intArray7);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { (short) 100, (short) 1 };
        int[] intArray11 = new int[] { '4', (short) -1, 100, 10, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray11);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) ' ', (long) (-1));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        char[] charArray5 = new char[] { ' ', ' ', 'a', '#', ' ' };
        char[] charArray10 = new char[] { 'a', '#', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 0, (double) (short) -1);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray10);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray10, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet29 = org.apache.lucene.util.LuceneTestCase.asSet(strArray28);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray28);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray28, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray18);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests36 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule37 = commonGramsTokenFilterFactoryTests36.ruleChain;
        commonGramsTokenFilterFactoryTests36.setUp();
        commonGramsTokenFilterFactoryTests36.tearDown();
        commonGramsTokenFilterFactoryTests36.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests36.assertDocsEnumEquals("hi!", postingsEnum43, postingsEnum44, false);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests36.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests36.setIndexWriterMaxDocs(4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray18, (java.lang.Object) 4);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 1, (float) (short) 100, (float) (short) 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
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
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) shortArray20, (java.lang.Object[]) strArray48);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests3 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests3, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests3.ruleChain;
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) throttling1, (java.lang.Object) testRule9);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("tests.failfast", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader19, 3, postingsEnum21, postingsEnum22, true);
        commonGramsTokenFilterFactoryTests12.tearDown();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        java.lang.Class<?> wildcardClass27 = commonGramsTokenFilterFactoryTests12.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule9, (java.lang.Object) wildcardClass27);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray5 = new int[] { (byte) 0, '#', 2 };
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray12);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray21);
        int[] intArray31 = new int[] { 4, 5, (byte) 10, '4', '4' };
        int[] intArray38 = new int[] { 6, (byte) 0, (byte) 0, (byte) 1, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray5, intArray6, strArray21, intArray31, intArray38, (java.lang.Integer) 100);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("hi!", postingsEnum3, postingsEnum4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        char[] charArray5 = new char[] { 'a', '4', 'a', ' ' };
        char[] charArray10 = new char[] { '#', '4', '#', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray5, charArray10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 1, (double) 2);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
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
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10, (double) 10L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        int[] intArray2 = new int[] { 'a' };
        int[] intArray7 = new int[] { 10, (short) 0, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray7);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        char[] charArray2 = new char[] { '4' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray2, charArray3);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 4, (float) 1, (float) 0L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        long[] longArray0 = new long[] {};
        long[] longArray1 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray4);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray4);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray14);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray21);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        org.junit.Assert.assertArrayEquals("", shortArray17, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray9, shortArray17);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) shortArray30);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        float[] floatArray3 = new float[] { (short) 1 };
        float[] floatArray5 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray9, (float) 100);
        float[] floatArray18 = new float[] { (short) 1 };
        float[] floatArray20 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray20, (float) '#');
        float[] floatArray24 = new float[] { (short) 1 };
        float[] floatArray26 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray26, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray20, floatArray24, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray9, floatArray20, (float) (short) 10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests33 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule34 = commonGramsTokenFilterFactoryTests33.ruleChain;
        commonGramsTokenFilterFactoryTests33.setUp();
        commonGramsTokenFilterFactoryTests33.tearDown();
        commonGramsTokenFilterFactoryTests33.setUp();
        commonGramsTokenFilterFactoryTests33.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray9, (java.lang.Object) commonGramsTokenFilterFactoryTests33);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 100.0f, (-1.0f));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, 1.0d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) -1, (float) (byte) 10, 0.0f);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) objArray56);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
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
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray30 = new java.io.Serializable[][] { serializableArray23, serializableArray25, serializableArray27, serializableArray29 };
        java.util.Set<java.io.Serializable[]> serializableArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 6, (java.lang.Object) serializableArraySet31);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 4, (float) (byte) 10, (float) (byte) 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 6, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray5);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
        float[] floatArray33 = new float[] { (short) 1 };
        float[] floatArray35 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray35, (float) '#');
        float[] floatArray39 = new float[] { (short) 1 };
        float[] floatArray41 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray41, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray35, floatArray39, (float) 100);
        float[] floatArray47 = new float[] { (short) 1 };
        float[] floatArray49 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray49, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray35, floatArray49, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray35, (float) (short) 1);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray2, floatArray35, (float) (short) -1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 0.0d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        char[] charArray3 = new char[] { ' ', ' ', '#' };
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray10);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray5 = new int[] { '#', 6 };
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray12);
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
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray36);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray36, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) strArray26);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.util.Set<java.lang.String> strSet49 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray51);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet58 = org.apache.lucene.util.LuceneTestCase.asSet(strArray57);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray57);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet61 = org.apache.lucene.util.LuceneTestCase.asSet(strArray60);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray57, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray57);
        int[] intArray71 = new int[] { (byte) 100, '#', ' ', 1, (short) -1, 3 };
        int[] intArray74 = new int[] { 10, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray2, intArray5, strArray26, intArray71, intArray74, (java.lang.Integer) 10);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 0, 100L);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling56 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling56 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet59 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray2, (java.lang.Object[]) throttlingArray57);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests53 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests53.ruleChain;
        commonGramsTokenFilterFactoryTests53.setUp();
        org.junit.rules.TestRule testRule56 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Fields fields59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        commonGramsTokenFilterFactoryTests53.assertFieldsEquals("tests.maxfailures", indexReader58, fields59, fields60, false);
        org.junit.rules.TestRule testRule63 = commonGramsTokenFilterFactoryTests53.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        commonGramsTokenFilterFactoryTests53.assertDocsEnumEquals("", postingsEnum65, postingsEnum66, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) eSTokenStreamTestCaseSet52, (java.lang.Object) true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (byte) 1);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet8 = org.apache.lucene.util.LuceneTestCase.asSet(strArray7);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray12);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray22);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray22);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray25);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray33);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray30);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray25);
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests52.ruleChain;
        commonGramsTokenFilterFactoryTests52.setUp();
        java.lang.String[] strArray56 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet57 = org.apache.lucene.util.LuceneTestCase.asSet(strArray56);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray59);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests52, (java.lang.Object) strArray56);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet67 = org.apache.lucene.util.LuceneTestCase.asSet(strArray66);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray66);
        java.lang.String[] strArray71 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet72 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray71);
        java.lang.String[] strArray74 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strArray74);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray71, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray66, (java.lang.Object[]) strArray74);
        java.lang.String[] strArray80 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        java.util.Set<java.lang.String> strSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strArray80);
        java.lang.String[] strArray84 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet85 = org.apache.lucene.util.LuceneTestCase.asSet(strArray84);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray84);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray80, (java.lang.Object[]) strArray84);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray84, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray74, (java.lang.Object[]) strArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray74);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((-1.0d), 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0, (double) 'a', (double) (short) 10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        char[] charArray3 = new char[] { '#', '#', 'a' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 4, (long) (byte) 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        char[] charArray7 = new char[] { ' ', '#', 'a', ' ', ' ', '#' };
        char[] charArray14 = new char[] { '#', '4', ' ', ' ', 'a', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray7, charArray14);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests18.setUp();
        commonGramsTokenFilterFactoryTests18.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        commonGramsTokenFilterFactoryTests22.assertDocsEnumEquals("hi!", postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) 100, postingsEnum32, postingsEnum33);
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests22.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests22, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        commonGramsTokenFilterFactoryTests22.assertPositionsSkippingEquals("<unknown>", indexReader39, 6, postingsEnum41, postingsEnum42);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) commonGramsTokenFilterFactoryTests22);
        org.elasticsearch.common.settings.Settings.Builder builder45 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        org.elasticsearch.common.settings.Settings.Builder builder46 = commonGramsTokenFilterFactoryTests22.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) builder46);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray4 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { 100, (byte) 1, (byte) 1 };
        int[] intArray10 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray4, intArray8, intArray10, (java.lang.Integer) 3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 100L, (double) 5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
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
        org.junit.Assert.assertArrayEquals("random", floatArray37, floatArray56, 1.0f);
        float[] floatArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray37, floatArray69, (float) 1);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
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
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
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
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet48 = org.apache.lucene.util.LuceneTestCase.asSet(strArray47);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray24);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { ' ', ' ', (short) 100, (byte) 100, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray26);
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
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) 10.0d, (java.lang.Object) strArray39);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) strArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray26, (java.lang.Object) strArray39);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        int[] intArray2 = new int[] { 3, 4 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray60, (double) 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100L, (double) 10L, (double) (-1));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) 100, (float) 6);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (byte) 10, (float) 4);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) 2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray8 = new int[] { 3, (byte) -1, '#', ' ', 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray8);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 'a', (float) (byte) 1, (float) 6);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) 6, (float) (byte) 1, (float) (short) 0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray30);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.util.Set<java.lang.String> strSet37 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray39);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray39);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray44);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) throttlingArray2, (java.lang.Object[]) strArray44);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) shortArray3, obj5);
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
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray28);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray45);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        org.junit.Assert.assertArrayEquals("", shortArray45, shortArray49);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray68);
        org.junit.Assert.assertArrayEquals("", shortArray61, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (-1), (java.lang.Object) shortArray61);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) strArray9, (java.lang.Object) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) strArray9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 100);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 5, 0.0f, (float) (short) 1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { (short) 10, 3, (byte) 100, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("", indexReader6, 4, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        java.lang.Object obj12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, obj12);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        int[] intArray4 = new int[] { (-1), 1, (short) 100, 0 };
        int[] intArray9 = new int[] { (byte) 1, 'a', 'a', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests2.assertPositionsSkippingEquals("", indexReader7, 4, postingsEnum9, postingsEnum10);
        org.junit.rules.TestRule testRule12 = commonGramsTokenFilterFactoryTests2.ruleChain;
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        org.junit.Assert.assertArrayEquals(longArray14, longArray17);
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
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray35, longArray36);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray35, longArray38);
        long[] longArray42 = new long[] {};
        long[] longArray43 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray42, longArray43);
        org.junit.Assert.assertArrayEquals("hi!", longArray38, longArray43);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        org.junit.Assert.assertArrayEquals(longArray47, longArray50);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        org.junit.Assert.assertArrayEquals("hi!", longArray50, longArray55);
        org.junit.Assert.assertArrayEquals(longArray43, longArray55);
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
        org.junit.Assert.assertArrayEquals("hi!", longArray63, longArray68);
        org.junit.Assert.assertArrayEquals("", longArray43, longArray63);
        org.junit.Assert.assertArrayEquals(longArray25, longArray63);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray17, longArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) testRule12, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 3, 'a', (byte) -1, '4', 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, (double) ' ', (double) 6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 0, (double) 5, (double) 'a');
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 1L, (double) (short) -1, (double) 100.0f);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (-1.0d));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        char[] charArray5 = new char[] { '#', '#', 'a', ' ' };
        char[] charArray7 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray5, charArray7);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) '4', (long) 4);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        int[] intArray2 = new int[] { 0, (short) -1 };
        int[] intArray8 = new int[] { 4, 2, (byte) 1, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray8);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray34, longArray35);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        org.junit.Assert.assertArrayEquals(longArray34, longArray37);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        org.junit.Assert.assertArrayEquals("hi!", longArray37, longArray42);
        org.junit.Assert.assertArrayEquals(longArray30, longArray42);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray47, longArray48);
        long[] longArray50 = new long[] {};
        long[] longArray51 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray50, longArray51);
        org.junit.Assert.assertArrayEquals(longArray47, longArray50);
        long[] longArray54 = new long[] {};
        long[] longArray55 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray54, longArray55);
        org.junit.Assert.assertArrayEquals("hi!", longArray50, longArray55);
        org.junit.Assert.assertArrayEquals("", longArray30, longArray50);
        org.junit.Assert.assertArrayEquals(longArray12, longArray50);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) longArray50, (java.lang.Object) '4');
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, false);
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests1.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
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
        java.lang.String[] strArray29 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet30 = org.apache.lucene.util.LuceneTestCase.asSet(strArray29);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray32);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests37 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule38 = commonGramsTokenFilterFactoryTests37.ruleChain;
        commonGramsTokenFilterFactoryTests37.setUp();
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray44);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests37, (java.lang.Object) strArray41);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1.0d), (java.lang.Object) strArray32);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.badapples", indexReader25, 1, postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        short[] shortArray9 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray15 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[] shortArray21 = new short[] { (byte) 10, (short) 10, (short) 10, (byte) 100, (short) -1 };
        short[][] shortArray22 = new short[][] { shortArray9, shortArray15, shortArray21 };
        java.util.Set<short[]> shortArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray1, (java.lang.Object[]) shortArray22);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        int[] intArray4 = new int[] { (short) 0, (byte) 10, 10 };
        int[] intArray7 = new int[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray7);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests2.setUp();
        commonGramsTokenFilterFactoryTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests2.assertFieldsEquals("tests.weekly", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("tests.badapples", indexReader12, (int) '#', postingsEnum14, postingsEnum15, false);
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
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray27);
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
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) postingsEnum15, (java.lang.Object) strArray27);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests80 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule81 = commonGramsTokenFilterFactoryTests80.ruleChain;
        commonGramsTokenFilterFactoryTests80.setUp();
        java.lang.String str83 = commonGramsTokenFilterFactoryTests80.getTestName();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        commonGramsTokenFilterFactoryTests80.assertTermsEquals("<unknown>", indexReader85, terms86, terms87, false);
        commonGramsTokenFilterFactoryTests80.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) postingsEnum15, (java.lang.Object) commonGramsTokenFilterFactoryTests80);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100L, (long) 1);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray6, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray17, longArray18);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        org.junit.Assert.assertArrayEquals(longArray17, longArray20);
        org.junit.Assert.assertArrayEquals(longArray14, longArray20);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray20, (java.lang.Object) byteArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) locale2, (java.lang.Object) strArray10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
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
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        char[] charArray4 = new char[] { '4', ' ', 'a', '4' };
        char[] charArray11 = new char[] { '4', '#', '4', ' ', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 1, 0L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        char[] charArray6 = new char[] { '4', 'a', 'a', ' ', '#', '4' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet2 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        char[] charArray1 = new char[] { '4' };
        char[] charArray3 = new char[] { 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
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
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray43);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray43);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray43, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray39, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray46, (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.common.settings.Settings.Builder builder3 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests0.setIndexWriterMaxDocs((int) (short) 10);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("<unknown>", indexReader7, terms8, terms9, true);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) '4', 0.0d, 0.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet7 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.lang.Iterable[] iterableArray9 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray10 = (java.lang.Iterable<java.lang.String>[]) iterableArray9;
        strIterableArray10[0] = strSet3;
        strIterableArray10[1] = strSet5;
        strIterableArray10[2] = strSet7;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray10);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests19 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule20 = commonGramsTokenFilterFactoryTests19.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests19, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests19.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests19.assertPositionsSkippingEquals("", indexReader25, (int) (byte) 1, postingsEnum27, postingsEnum28);
        java.lang.Class<?> wildcardClass30 = commonGramsTokenFilterFactoryTests19.getClass();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) strIterableArray10, (java.lang.Object) wildcardClass30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests34.setUp();
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) strSet40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsEnumEquals("", postingsEnum43, postingsEnum44, false);
        org.elasticsearch.common.settings.Settings.Builder builder47 = commonGramsTokenFilterFactoryTests34.newAnalysisSettingsBuilder();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        commonGramsTokenFilterFactoryTests34.assertPositionsSkippingEquals("tests.nightly", indexReader49, (int) (byte) 100, postingsEnum51, postingsEnum52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests34.assertDocsSkippingEquals("tests.maxfailures", indexReader55, (int) (byte) 10, postingsEnum57, postingsEnum58, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) strIterableArray10, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 5, 0L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray9);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray9, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray27);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray35);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet39 = org.apache.lucene.util.LuceneTestCase.asSet(strArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) strArray12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests1.assertPositionsSkippingEquals("hi!", indexReader13, 10, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.failfast", indexReader19, 2, postingsEnum21, postingsEnum22, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) 2);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, 6, (byte) 100, 6, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray26);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray36);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray35, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray43);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray58);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray65);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray68);
        org.junit.Assert.assertArrayEquals("", shortArray61, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray61);
        short[] shortArray73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray73);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
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
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        org.junit.rules.TestRule testRule4 = commonGramsTokenFilterFactoryTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        commonGramsTokenFilterFactoryTests1.assertFieldsEquals("tests.maxfailures", indexReader6, fields7, fields8, false);
        java.lang.Class<?> wildcardClass11 = commonGramsTokenFilterFactoryTests1.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        commonGramsTokenFilterFactoryTests13.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder17 = commonGramsTokenFilterFactoryTests13.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests13);
        java.lang.Class<?> wildcardClass19 = commonGramsTokenFilterFactoryTests13.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests20 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule21 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.setUp();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests20.ruleChain;
        commonGramsTokenFilterFactoryTests20.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests20.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        commonGramsTokenFilterFactoryTests20.assertDocsEnumEquals("hi!", postingsEnum27, postingsEnum28, true);
        java.lang.Class<?> wildcardClass31 = commonGramsTokenFilterFactoryTests20.getClass();
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass19, wildcardClass31 };
        java.util.Set<java.lang.reflect.Type> typeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray32);
        java.lang.Object[] objArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) typeArray32, objArray34);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, 10.0d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotEquals((java.lang.Object) 100, (java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("tests.monster", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests18, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests18.setUp();
        commonGramsTokenFilterFactoryTests18.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule24 = commonGramsTokenFilterFactoryTests18.ruleChain;
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
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray44);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray51);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray54);
        org.junit.Assert.assertArrayEquals("", shortArray47, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray47);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray59);
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
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray70);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray59, shortArray64);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule24, (java.lang.Object) shortArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) shortArray59);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
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
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray35, (float) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 10L);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        char[] charArray3 = new char[] { ' ', '#' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray5);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests14 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule15 = commonGramsTokenFilterFactoryTests14.ruleChain;
        commonGramsTokenFilterFactoryTests14.setUp();
        commonGramsTokenFilterFactoryTests14.tearDown();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        commonGramsTokenFilterFactoryTests14.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        commonGramsTokenFilterFactoryTests14.assertFieldsEquals("tests.awaitsfix", indexReader24, fields25, fields26, true);
        org.junit.Assert.assertNotEquals((java.lang.Object) strArray2, (java.lang.Object) indexReader24);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests34 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests34.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests34.setUp();
        java.lang.String[] strArray39 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests34, (java.lang.Object) strSet40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        java.util.Set<java.lang.String> strSet44 = org.apache.lucene.util.LuceneTestCase.asSet(strArray42);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests47.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests47, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests47.setUp();
        java.lang.String[] strArray52 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests47, (java.lang.Object) strSet53);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests59 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule60 = commonGramsTokenFilterFactoryTests59.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) (-1L));
        commonGramsTokenFilterFactoryTests59.setUp();
        java.lang.String[] strArray64 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet65 = org.apache.lucene.util.LuceneTestCase.asSet(strArray64);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) commonGramsTokenFilterFactoryTests59, (java.lang.Object) strSet65);
        java.util.Set[] setArray68 = new java.util.Set[6];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray69 = (java.util.Set<java.lang.String>[]) setArray68;
        strSetArray69[0] = strSet31;
        strSetArray69[1] = strSet40;
        strSetArray69[2] = strSet44;
        strSetArray69[3] = strSet53;
        strSetArray69[4] = strSet56;
        strSetArray69[5] = strSet65;
        java.util.Set<java.util.Set<java.lang.String>> strSetSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strSetArray69);
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Iterable<java.lang.String>[]) strSetArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strSetArray69);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        int[] intArray6 = new int[] { 6, 4, (byte) 10, (short) 0, '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray7);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) (-1L), (java.lang.Object) (-1L));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { (byte) 1, 6, '4', 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 3, (double) 1L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        char[] charArray5 = new char[] { 'a', 'a', ' ', ' ', ' ' };
        char[] charArray9 = new char[] { '#', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray9);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        int[] intArray5 = new int[] { (byte) 0, 'a', (-1), 100, 0 };
        int[] intArray12 = new int[] { (byte) 100, (byte) 100, 5, 6, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 4);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        char[] charArray6 = new char[] { 'a', 'a', '4', '4', '4' };
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray7, charArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray6, charArray8);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 3);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 5, (long) '#');
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) '4', (long) 'a');
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        java.lang.String str4 = commonGramsTokenFilterFactoryTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        commonGramsTokenFilterFactoryTests1.assertTermsEquals("<unknown>", indexReader6, terms7, terms8, false);
        org.junit.rules.TestRule testRule11 = commonGramsTokenFilterFactoryTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) commonGramsTokenFilterFactoryTests1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) -1, (double) 1.0f, (double) (-1.0f));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.setUp();
        org.junit.rules.TestRule testRule5 = commonGramsTokenFilterFactoryTests2.ruleChain;
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        java.lang.String str15 = commonGramsTokenFilterFactoryTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        commonGramsTokenFilterFactoryTests2.assertTermsEquals("", indexReader17, terms18, terms19, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests22 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule23 = commonGramsTokenFilterFactoryTests22.ruleChain;
        commonGramsTokenFilterFactoryTests22.setUp();
        commonGramsTokenFilterFactoryTests22.tearDown();
        commonGramsTokenFilterFactoryTests22.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) "", (java.lang.Object) commonGramsTokenFilterFactoryTests22);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests29 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule30 = commonGramsTokenFilterFactoryTests29.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests29, (java.lang.Object) (-1L));
        java.lang.String str33 = commonGramsTokenFilterFactoryTests29.getTestName();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        commonGramsTokenFilterFactoryTests29.assertFieldsEquals("enwiki.random.lines.txt", indexReader35, fields36, fields37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        commonGramsTokenFilterFactoryTests29.assertPositionsSkippingEquals("tests.monster", indexReader41, (int) (short) 100, postingsEnum43, postingsEnum44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.slow", (java.lang.Object) (short) 100);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
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
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocValuesEquals("<unknown>", (int) (short) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
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
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray29 = new java.io.Serializable[][] { serializableArray22, serializableArray24, serializableArray26, serializableArray28 };
        java.util.Set<java.io.Serializable[]> serializableArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.util.Set<java.io.Serializable[]> serializableArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) shortArray19, (java.lang.Object) serializableArray29);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        int[] intArray5 = new int[] { (-1), (short) 100, 'a', 6 };
        int[] intArray12 = new int[] { (short) 10, (short) 0, (short) -1, 4, '#', 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray5, intArray12);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (float) (short) 0, (-1.0f), (float) 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 2, (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray7 = new int[] { 1, 6, 2, 0, 1 };
        int[] intArray11 = new int[] { (byte) 10, 10, (byte) -1 };
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
        org.junit.Assert.assertNotEquals("tests.monster", (java.lang.Object) strArray20, (java.lang.Object) (short) -1);
        int[] intArray46 = new int[] { ' ', (-1), 100, 5 };
        int[] intArray53 = new int[] { '4', 4, (short) -1, 10, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray7, intArray11, strArray20, intArray46, intArray53, (java.lang.Integer) 0, true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        int[] intArray6 = new int[] { 1, 2, (byte) 10, (byte) 0, ' ' };
        int[] intArray8 = new int[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray6, intArray8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
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
        commonGramsTokenFilterFactoryTests25.setUp();
        commonGramsTokenFilterFactoryTests25.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder29 = commonGramsTokenFilterFactoryTests25.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests25);
        java.lang.Class<?> wildcardClass31 = commonGramsTokenFilterFactoryTests25.getClass();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests32 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule33 = commonGramsTokenFilterFactoryTests32.ruleChain;
        commonGramsTokenFilterFactoryTests32.setUp();
        org.junit.rules.TestRule testRule35 = commonGramsTokenFilterFactoryTests32.ruleChain;
        commonGramsTokenFilterFactoryTests32.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests32.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        commonGramsTokenFilterFactoryTests32.assertDocsEnumEquals("hi!", postingsEnum39, postingsEnum40, true);
        java.lang.Class<?> wildcardClass43 = commonGramsTokenFilterFactoryTests32.getClass();
        java.lang.reflect.Type[] typeArray44 = new java.lang.reflect.Type[] { wildcardClass23, wildcardClass31, wildcardClass43 };
        java.util.Set<java.lang.reflect.Type> typeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray44);
        org.junit.Assert.assertNotNull((java.lang.Object) typeArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) typeArray44);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 100L);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { 100, 3, 1, (byte) 10 };
        int[] intArray9 = new int[] { (short) 100, (short) -1 };
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet12 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray15);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray11, (java.lang.Object[]) strArray15);
        int[] intArray21 = new int[] { (byte) 100, 1 };
        int[] intArray27 = new int[] { (short) 0, (byte) 100, 100, (-1), (-1) };
        boolean[] booleanArray32 = new boolean[] { false, true };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray9, strArray11, intArray21, intArray27, (java.lang.Integer) 0, (java.lang.Integer) 1, booleanArray32, false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1L), (long) ' ');
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray16);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { 4, 1, (short) 100, (byte) 100, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray1, intArray8);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (short) 100);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (byte) -1, (double) 0.0f, 0.0d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests50 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule51 = commonGramsTokenFilterFactoryTests50.ruleChain;
        org.junit.Assert.assertNotSame("", (java.lang.Object) commonGramsTokenFilterFactoryTests50, (java.lang.Object) (-1L));
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        commonGramsTokenFilterFactoryTests50.assertDocsSkippingEquals("", indexReader55, 0, postingsEnum57, postingsEnum58, true);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        commonGramsTokenFilterFactoryTests50.assertPositionsSkippingEquals("tests.failfast", indexReader62, (int) (short) 10, postingsEnum64, postingsEnum65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("", (java.lang.Object) postingsEnum46, (java.lang.Object) postingsEnum65);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        char[] charArray3 = new char[] { '#', 'a' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray3, charArray5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray1, intArray8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
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
        java.lang.String str25 = commonGramsTokenFilterFactoryTests3.getTestName();
        commonGramsTokenFilterFactoryTests3.setUp();
        commonGramsTokenFilterFactoryTests3.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) (short) 0, (java.lang.Object) 3);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) (byte) 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 1.0d, (double) (byte) 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str3 = commonGramsTokenFilterFactoryTests0.getTestName();
        commonGramsTokenFilterFactoryTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests5 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule6 = commonGramsTokenFilterFactoryTests5.ruleChain;
        commonGramsTokenFilterFactoryTests5.setUp();
        commonGramsTokenFilterFactoryTests5.tearDown();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        commonGramsTokenFilterFactoryTests5.assertDocsSkippingEquals("tests.badapples", indexReader11, (-1), postingsEnum13, postingsEnum14, false);
        commonGramsTokenFilterFactoryTests5.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests5.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) commonGramsTokenFilterFactoryTests5);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests5.assertDocsAndPositionsEnumEquals("", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray2);
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (java.lang.Object) throttlingArray2, (java.lang.Object) '#');
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray10 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] { "tests.badapples" };
        java.io.Serializable[][] serializableArray15 = new java.io.Serializable[][] { serializableArray8, serializableArray10, serializableArray12, serializableArray14 };
        java.util.Set<java.io.Serializable[]> serializableArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        java.util.Set<java.io.Serializable[]> serializableArraySet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray15);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests18 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests18.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        commonGramsTokenFilterFactoryTests18.assertDocsEnumEquals("hi!", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests18.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader26, (int) (byte) 100, postingsEnum28, postingsEnum29);
        commonGramsTokenFilterFactoryTests18.setIndexWriterMaxDocs(6);
        org.elasticsearch.common.settings.Settings.Builder builder33 = commonGramsTokenFilterFactoryTests18.newAnalysisSettingsBuilder();
        commonGramsTokenFilterFactoryTests18.tearDown();
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) serializableArray15, (java.lang.Object) commonGramsTokenFilterFactoryTests18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) serializableArray15);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 0L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1L), (double) 1L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, 0L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 10.0d, (double) 10L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
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
        commonGramsTokenFilterFactoryTests2.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, 'a', (byte) 1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.apache.lucene.analysis.TokenStream tokenStream0 = null;
        java.lang.String[] strArray1 = null;
        int[] intArray6 = new int[] { 5, '4', 0, (short) 0 };
        int[] intArray12 = new int[] { ' ', 2, 'a', (short) 10, 2 };
        int[] intArray17 = new int[] { (byte) 10, (short) 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.analysis.BaseTokenStreamTestCase.assertTokenStreamContents(tokenStream0, strArray1, intArray6, intArray12, intArray17);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (byte) 1, (float) (-1), 0.0f);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 10, (double) (short) 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        int[] intArray5 = new int[] { '#', (short) 1, 6, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (-1), 1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray5, intArray11);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) -1, (double) 4);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
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
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray46);
        byte[] byteArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray53);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
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
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("", (int) ' ', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (-1.0d), (double) 5);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray8 = new float[] { (short) 1 };
        float[] floatArray10 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray4, floatArray8, (float) 100);
        float[] floatArray20 = new float[] { (short) 1 };
        float[] floatArray22 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray22, (float) '#');
        float[] floatArray26 = new float[] { (short) 1 };
        float[] floatArray28 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray28, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray22, floatArray26, (float) 100);
        float[] floatArray35 = new float[] { (short) 1 };
        float[] floatArray37 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) '#');
        float[] floatArray41 = new float[] { (short) 1 };
        float[] floatArray43 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray37, floatArray41, (float) 100);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray26, floatArray37, (float) (short) 10);
        float[] floatArray51 = new float[] { (short) 1 };
        float[] floatArray53 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray53, (float) '#');
        float[] floatArray57 = new float[] { (short) 1 };
        float[] floatArray59 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray59, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray57, (float) '4');
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray37, floatArray51, (float) (short) 1);
        float[] floatArray68 = new float[] { (short) 1 };
        float[] floatArray70 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray70, (float) '#');
        float[] floatArray74 = new float[] { (short) 1 };
        float[] floatArray76 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray76, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray70, floatArray74, (float) 100);
        org.junit.Assert.assertArrayEquals("random", floatArray51, floatArray70, 1.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray70, (float) (short) 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
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
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests15 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule16 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.setUp();
        org.junit.rules.TestRule testRule18 = commonGramsTokenFilterFactoryTests15.ruleChain;
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("", indexReader21, (int) (byte) 0, postingsEnum23, postingsEnum24, true);
        commonGramsTokenFilterFactoryTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests15.assertPositionsSkippingEquals("tests.monster", indexReader29, (int) '#', postingsEnum31, postingsEnum32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) '#');
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 10, (long) 10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6, false);
        org.junit.rules.TestRule testRule9 = commonGramsTokenFilterFactoryTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) 1.0d, (java.lang.Object) testRule9);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) floatArray30);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) (short) -1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (byte) -1);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray2, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("", byteArray13, byteArray15);
        long[] longArray19 = new long[] {};
        long[] longArray20 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray19, longArray20);
        long[] longArray22 = new long[] {};
        long[] longArray23 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray22, longArray23);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray22, longArray25);
        org.junit.Assert.assertArrayEquals(longArray19, longArray25);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray25, (java.lang.Object) byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray10, byteArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray10);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray40);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
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
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet16 = org.apache.lucene.util.LuceneTestCase.asSet(strArray15);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray18);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray18);
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
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray46);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet52 = org.apache.lucene.util.LuceneTestCase.asSet(strArray51);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray51);
        java.lang.String[] strArray54 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet55 = org.apache.lucene.util.LuceneTestCase.asSet(strArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray41);
        java.lang.Object[] objArray61 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray1, objArray61);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.weekly", indexReader4, fields5, fields6, true);
        java.lang.String str9 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        commonGramsTokenFilterFactoryTests0.assertFieldsEquals("tests.failfast", indexReader11, fields12, fields13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests52 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule53 = commonGramsTokenFilterFactoryTests52.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        commonGramsTokenFilterFactoryTests52.assertDocsEnumEquals("tests.failfast", postingsEnum55, postingsEnum56, false);
        commonGramsTokenFilterFactoryTests52.setUp();
        commonGramsTokenFilterFactoryTests52.setIndexWriterMaxDocs(0);
        commonGramsTokenFilterFactoryTests52.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 0, (java.lang.Object) commonGramsTokenFilterFactoryTests52);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 4, (double) (short) 10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule2 = commonGramsTokenFilterFactoryTests1.ruleChain;
        commonGramsTokenFilterFactoryTests1.setUp();
        commonGramsTokenFilterFactoryTests1.tearDown();
        commonGramsTokenFilterFactoryTests1.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.common.settings.Settings.Builder builder7 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests8 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests8.setUp();
        commonGramsTokenFilterFactoryTests8.setUp();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests12 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule13 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        commonGramsTokenFilterFactoryTests12.assertDocsEnumEquals("hi!", postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader20, (int) (byte) 100, postingsEnum22, postingsEnum23);
        org.junit.rules.TestRule testRule25 = commonGramsTokenFilterFactoryTests12.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests12, (java.lang.Object) 100L);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        commonGramsTokenFilterFactoryTests12.assertPositionsSkippingEquals("<unknown>", indexReader29, 6, postingsEnum31, postingsEnum32);
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests8, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
        commonGramsTokenFilterFactoryTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) builder7, (java.lang.Object) commonGramsTokenFilterFactoryTests12);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) '4', (-1L));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
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
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) '#', (double) 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        int[] intArray3 = new int[] { (byte) 1, (-1), 3 };
        int[] intArray9 = new int[] { 3, 100, 0, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray9);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        int[] intArray4 = new int[] { (byte) 0, (byte) 10, ' ' };
        int[] intArray11 = new int[] { 2, 3, ' ', 1, (short) 0, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray11);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
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
        commonGramsTokenFilterFactoryTests3.assertPositionsSkippingEquals("tests.weekly", indexReader19, 4, postingsEnum21, postingsEnum22);
        org.elasticsearch.common.settings.Settings.Builder builder24 = commonGramsTokenFilterFactoryTests3.newAnalysisSettingsBuilder();
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray29, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) builder24, (java.lang.Object) byteArray26);
        byte[] byteArray38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray26, byteArray38);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        org.junit.rules.TestRule testRule3 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings.Builder builder5 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        short[] shortArray1 = new short[] { (short) -1 };
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
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray8, shortArray28);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray45);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray52);
        org.junit.Assert.assertArrayEquals("", shortArray45, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray37, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray8);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
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
        org.elasticsearch.common.settings.Settings.Builder builder19 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests1.assertDocValuesEquals("tests.maxfailures", (int) (short) 0, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsEnumEquals("tests.failfast", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        commonGramsTokenFilterFactoryTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader7, 3, postingsEnum9, postingsEnum10, true);
        commonGramsTokenFilterFactoryTests0.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests0);
        org.elasticsearch.common.settings.Settings.Builder builder15 = commonGramsTokenFilterFactoryTests0.newAnalysisSettingsBuilder();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.setUp();
        commonGramsTokenFilterFactoryTests16.tearDown();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        commonGramsTokenFilterFactoryTests16.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum28, postingsEnum29, true);
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        commonGramsTokenFilterFactoryTests16.assertTermsEquals("tests.maxfailures", indexReader34, terms35, terms36, true);
        org.elasticsearch.common.settings.Settings.Builder builder39 = commonGramsTokenFilterFactoryTests16.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) builder15, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 5, (long) (short) 100);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        int[] intArray3 = new int[] { '4', 100, (short) 10 };
        int[] intArray6 = new int[] { 3, 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray6);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray41);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet45 = org.apache.lucene.util.LuceneTestCase.asSet(strArray44);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray50 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet54 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray53);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet59 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.lang.String[] strArray62 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray62);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray62);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray58, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray8, (java.lang.Object[]) strArray62);
        java.lang.Object[] objArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray62, objArray68);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 100);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) '#', (long) 'a');
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("", byteArray9, byteArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray18, longArray21);
        org.junit.Assert.assertArrayEquals(longArray15, longArray21);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray21, (java.lang.Object) byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray26);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray33, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray37);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) ' ', (double) (-1), (double) '#');
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (-1), (long) 1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        long[] longArray0 = null;
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
        org.junit.Assert.assertArrayEquals(longArray66, longArray81);
        org.junit.Assert.assertArrayEquals("hi!", longArray19, longArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray19);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
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
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("hi!", (int) (byte) 100, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) '4', (double) (short) 10);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (byte) 1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 1);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
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
        byte[] byteArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
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
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        java.lang.String str48 = commonGramsTokenFilterFactoryTests47.getTestName();
        commonGramsTokenFilterFactoryTests47.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray2, (java.lang.Object) commonGramsTokenFilterFactoryTests47);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray2, charArray4);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray13);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray13);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet17 = org.apache.lucene.util.LuceneTestCase.asSet(strArray16);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray23);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray23);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet32 = org.apache.lucene.util.LuceneTestCase.asSet(strArray31);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray31);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet35 = org.apache.lucene.util.LuceneTestCase.asSet(strArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray31, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) strArray26);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.lang.String> strSet6 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray8);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray8);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests13 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests13.ruleChain;
        commonGramsTokenFilterFactoryTests13.setUp();
        java.lang.String[] strArray17 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet18 = org.apache.lucene.util.LuceneTestCase.asSet(strArray17);
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet21 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray20);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests13, (java.lang.Object) strArray17);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet28 = org.apache.lucene.util.LuceneTestCase.asSet(strArray27);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet33 = org.apache.lucene.util.LuceneTestCase.asSet(strArray32);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet36 = org.apache.lucene.util.LuceneTestCase.asSet(strArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray32, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet42 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.util.Set<java.lang.String> strSet43 = org.apache.lucene.util.LuceneTestCase.asSet(strArray41);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        java.util.Set<java.lang.String> strSet46 = org.apache.lucene.util.LuceneTestCase.asSet(strArray45);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) strArray45);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray41, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) strArray45, (java.lang.Object) 1.0d);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray8, (java.lang.Object[]) strArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", objArray1, (java.lang.Object[]) strArray8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        commonGramsTokenFilterFactoryTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        commonGramsTokenFilterFactoryTests0.assertTermsEquals("tests.weekly", indexReader3, terms4, terms5, true);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests0.assertDocValuesEquals("tests.badapples", (int) (byte) -1, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
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
        org.elasticsearch.common.settings.Settings.Builder builder21 = commonGramsTokenFilterFactoryTests2.newAnalysisSettingsBuilder();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) commonGramsTokenFilterFactoryTests2);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
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
        long[][] longArray14 = new long[][] {};
        java.util.Set<long[]> longArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(longArray14);
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
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.failfast", (java.lang.Object) strArray24);
        org.junit.Assert.assertNotNull((java.lang.Object) strArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) longArray14, (java.lang.Object[]) strArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) strArray24);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        float[] floatArray4 = new float[] { (short) 1 };
        float[] floatArray6 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) '#');
        float[] floatArray10 = new float[] { (short) 1 };
        float[] floatArray12 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray10, floatArray12, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray6, floatArray10, (float) 100);
        float[] floatArray20 = new float[] { (short) 1 };
        float[] floatArray22 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray22, (float) '#');
        float[] floatArray26 = new float[] { (short) 1 };
        float[] floatArray28 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray28, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray22, floatArray26, (float) 100);
        float[] floatArray34 = new float[] { (short) 1 };
        float[] floatArray36 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray36, (float) '#');
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray22, floatArray36, (float) 3);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray22, (float) (short) 1);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests43 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule44 = commonGramsTokenFilterFactoryTests43.ruleChain;
        commonGramsTokenFilterFactoryTests43.setUp();
        commonGramsTokenFilterFactoryTests43.tearDown();
        commonGramsTokenFilterFactoryTests43.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests43.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests43.setIndexWriterMaxDocs(3);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests51 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule52 = commonGramsTokenFilterFactoryTests51.ruleChain;
        commonGramsTokenFilterFactoryTests51.setUp();
        org.junit.rules.TestRule testRule54 = commonGramsTokenFilterFactoryTests51.ruleChain;
        commonGramsTokenFilterFactoryTests51.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests51.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        commonGramsTokenFilterFactoryTests51.assertTermsEquals("", indexReader58, terms59, terms60, true);
        org.elasticsearch.common.settings.Settings.Builder builder63 = commonGramsTokenFilterFactoryTests51.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotEquals((java.lang.Object) commonGramsTokenFilterFactoryTests43, (java.lang.Object) builder63);
        java.lang.Class<?> wildcardClass65 = builder63.getClass();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) floatArray6, (java.lang.Object) wildcardClass65);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests68 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule69 = commonGramsTokenFilterFactoryTests68.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsEnumEquals("hi!", postingsEnum71, postingsEnum72, false);
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        commonGramsTokenFilterFactoryTests68.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader76, (int) (byte) 100, postingsEnum78, postingsEnum79);
        org.junit.rules.TestRule testRule81 = commonGramsTokenFilterFactoryTests68.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) commonGramsTokenFilterFactoryTests68, (java.lang.Object) 100L);
        commonGramsTokenFilterFactoryTests68.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule85 = commonGramsTokenFilterFactoryTests68.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        commonGramsTokenFilterFactoryTests68.assertDocsEnumEquals("", postingsEnum87, postingsEnum88, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) "tests.slow", (java.lang.Object) commonGramsTokenFilterFactoryTests68);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        int[] intArray4 = new int[] { (short) 1, (short) 1, (short) 0, 100 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10, 'a', 6 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests1 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        commonGramsTokenFilterFactoryTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader8, 3, postingsEnum10, postingsEnum11, true);
        commonGramsTokenFilterFactoryTests1.tearDown();
        org.junit.Assert.assertNotNull((java.lang.Object) commonGramsTokenFilterFactoryTests1);
        org.elasticsearch.common.settings.Settings.Builder builder16 = commonGramsTokenFilterFactoryTests1.newAnalysisSettingsBuilder();
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) commonGramsTokenFilterFactoryTests1, (java.lang.Object) "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        char[] charArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray1, charArray29);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) '#');
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests0 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule1 = commonGramsTokenFilterFactoryTests0.ruleChain;
        commonGramsTokenFilterFactoryTests0.setUp();
        commonGramsTokenFilterFactoryTests0.tearDown();
        commonGramsTokenFilterFactoryTests0.setUp();
        java.lang.String str5 = commonGramsTokenFilterFactoryTests0.getTestName();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests7 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule8 = commonGramsTokenFilterFactoryTests7.ruleChain;
        commonGramsTokenFilterFactoryTests7.setUp();
        commonGramsTokenFilterFactoryTests7.tearDown();
        org.elasticsearch.common.settings.Settings.Builder builder11 = commonGramsTokenFilterFactoryTests7.newAnalysisSettingsBuilder();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) commonGramsTokenFilterFactoryTests7);
        commonGramsTokenFilterFactoryTests7.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule14 = commonGramsTokenFilterFactoryTests7.ruleChain;
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
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        commonGramsTokenFilterFactoryTests15.assertDocsSkippingEquals("random", indexReader36, (int) (short) 100, postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests42 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule43 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.setUp();
        org.junit.rules.TestRule testRule45 = commonGramsTokenFilterFactoryTests42.ruleChain;
        commonGramsTokenFilterFactoryTests42.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests47 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule48 = commonGramsTokenFilterFactoryTests47.ruleChain;
        commonGramsTokenFilterFactoryTests47.setUp();
        java.lang.String str50 = commonGramsTokenFilterFactoryTests47.getTestName();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        commonGramsTokenFilterFactoryTests47.assertTermsEquals("<unknown>", indexReader52, terms53, terms54, false);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray57 = new org.apache.lucene.util.LuceneTestCase[] { commonGramsTokenFilterFactoryTests15, commonGramsTokenFilterFactoryTests42, commonGramsTokenFilterFactoryTests47 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet58 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests7, (java.lang.Object) luceneTestCaseSet58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) commonGramsTokenFilterFactoryTests0, (java.lang.Object) luceneTestCaseSet58);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 3, 100.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        float[] floatArray2 = new float[] { (short) 1 };
        float[] floatArray4 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) '#');
        float[] floatArray9 = new float[] { (short) 1 };
        float[] floatArray11 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) '#');
        float[] floatArray15 = new float[] { (short) 1 };
        float[] floatArray17 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray17, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray15, (float) '4');
        float[] floatArray23 = new float[] { (short) 1 };
        float[] floatArray25 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray25, (float) '#');
        float[] floatArray29 = new float[] { (short) 1 };
        float[] floatArray31 = new float[] { 0L };
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray31, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray29, (float) '4');
        org.junit.Assert.assertArrayEquals("hi!", floatArray15, floatArray29, 1.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray15, (float) (short) -1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests2 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        commonGramsTokenFilterFactoryTests2.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 3, postingsEnum11, postingsEnum12, true);
        commonGramsTokenFilterFactoryTests2.tearDown();
        org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests commonGramsTokenFilterFactoryTests16 = new org.elasticsearch.index.analysis.commongrams.CommonGramsTokenFilterFactoryTests();
        org.junit.rules.TestRule testRule17 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.setUp();
        org.junit.rules.TestRule testRule19 = commonGramsTokenFilterFactoryTests16.ruleChain;
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        commonGramsTokenFilterFactoryTests16.overrideTestDefaultQueryCache();
        commonGramsTokenFilterFactoryTests16.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) commonGramsTokenFilterFactoryTests2, (java.lang.Object) commonGramsTokenFilterFactoryTests16);
        commonGramsTokenFilterFactoryTests2.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("hi!", obj1, (java.lang.Object) commonGramsTokenFilterFactoryTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        commonGramsTokenFilterFactoryTests2.assertDocsAndPositionsEnumEquals("random", postingsEnum27, postingsEnum28);
    }
}

