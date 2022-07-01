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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (short) 0, 1, (short) -1, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, 1);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray38, (java.lang.Object[]) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10, (java.lang.Object) strArray38);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 3);
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("DummyQuery", (int) (byte) 10, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 100L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 'a');
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        double[] doubleArray8 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray14 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray14, (double) 100L);
        double[] doubleArray23 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray29 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray23, doubleArray29, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray23, (double) 1.0f);
        double[] doubleArray40 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray46 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray40, doubleArray46, (double) 100L);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray61 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray55, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray55, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray23, doubleArray55, (double) 10L);
        double[] doubleArray68 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray23, doubleArray68, 0.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', (long) (-1));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) '4', (double) (-1L), (double) (short) -1);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        long[] longArray4 = new long[] { (short) -1, (byte) 0, '4', '4' };
        long[] longArray10 = new long[] { 1, (-1L), 0, 1, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) (short) 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) '#', (double) 1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields31, fields39);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (-1), numericDocValues45, numericDocValues46);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("{\n  \"dummy\" : { }\n}");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        char[] charArray5 = new char[] { ' ', 'a', '4', 'a', '4' };
        char[] charArray8 = new char[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray3, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray13);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum4, postingsEnum5, true);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.failfast");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "<unknown>");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields16, fields37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean40 = dummyQuery39.getisFilter();
        dummyQuery39.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) fields37, (java.lang.Object) false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        dummyQuery0.setBoost((float) (-1L));
        float float6 = dummyQuery0.getBoost();
        boolean boolean7 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests10);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) boolean7, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        int[] intArray3 = new int[] { 10, 'a' };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", intArray3, intArray5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str13 = dummyQuery10.toString("tests.slow");
        java.lang.String str15 = dummyQuery10.toString("random");
        boolean boolean16 = dummyQuery10.isFilter;
        dummyQuery10.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) indexQueryParserService8, (java.lang.Object) false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        float[] floatArray6 = new float[] { '#', 0, ' ', 4, ' ' };
        float[] floatArray13 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray19 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray19, (float) 100L);
        float[] floatArray27 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray33 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray33, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray13, floatArray27, (float) 0L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray6, floatArray27, (float) 1L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "europarl.lines.txt.gz");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "europarl.lines.txt.gz");
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray19);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean6 = dummyQuery5.getisFilter();
        java.lang.String str8 = dummyQuery5.toString("tests.slow");
        java.lang.String str10 = dummyQuery5.toString("random");
        boolean boolean11 = dummyQuery5.getisFilter();
        dummyQuery5.setBoost((float) 2);
        dummyQuery5.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests5.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.maxfailures");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.awaitsfix");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields14, fields24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("DummyQuery", (int) (byte) -1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        long[] longArray4 = new long[] { 1L, 4, (byte) -1, 0 };
        long[] longArray6 = new long[] { 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        long[] longArray2 = new long[] { (byte) -1, (short) 10 };
        long[] longArray6 = new long[] { (-1), (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) "random");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader22, 5, postingsEnum24, postingsEnum25);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues31 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 5, numericDocValues31, numericDocValues32);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader33, 10, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum39, postingsEnum40);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray9);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery2.clone();
        boolean boolean5 = dummyQuery2.isFilter;
        java.lang.String str6 = dummyQuery2.toString();
        boolean boolean7 = dummyQuery0.equals((java.lang.Object) str6);
        java.lang.String str9 = dummyQuery0.toString("europarl.lines.txt.gz");
        dummyQuery0.isFilter = false;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("random", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("hi!", indexReader36, terms37, terms38, true);
        boolean boolean41 = dummyQuery0.equals((java.lang.Object) terms37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests42);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.maxfailures");
        simpleIndexQueryParserTests42.assertFieldStatisticsEquals("random", fields50, fields58);
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        simpleIndexQueryParserTests42.assertDocsEnumEquals("hi!", postingsEnum61, postingsEnum62, true);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.maxfailures");
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests42.assertFieldStatisticsEquals("", fields73, fields81);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = null;
        simpleIndexQueryParserTests42.setqueryParser(indexQueryParserService83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean41, (java.lang.Object) simpleIndexQueryParserTests42);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("DummyQuery", postingsEnum8, postingsEnum9, false);
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain14;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.maxfailures");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("random", fields25, fields33);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("hi!", postingsEnum36, postingsEnum37, true);
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) simpleIndexQueryParserTests17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) (short) -1, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray21, (float) 0L);
        float[] floatArray37 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray43 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray7, floatArray43, (float) (-1L));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray59);
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray59);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray59);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "europarl.lines.txt.gz");
        java.lang.String[] strArray79 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray71, (java.lang.Object[]) strArray79);
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.failfast");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray59, (java.lang.Object[]) strArray71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus88 = simpleIndexQueryParserTests0.ensureGreen(strArray59);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testDisMaxBuilder();
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        char[] charArray4 = new char[] { ' ', ' ', '#', '4' };
        char[] charArray10 = new char[] { '4', '4', ' ', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray10);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        long[] longArray5 = new long[] { 1, (short) 10, 10L, (short) 100 };
        long[] longArray12 = new long[] { (byte) 10, (byte) 0, (-1), 0L, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray12);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) (byte) 1, (java.lang.Object) '4');
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 0, (java.lang.Object) query3);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str29 = dummyQueryBuilder28.toString();
        java.lang.String str30 = dummyQueryBuilder28.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder23, dummyQueryBuilder24, dummyQueryBuilder25, dummyQueryBuilder26, dummyQueryBuilder27, dummyQueryBuilder28 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, dummyQueryBuilderArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) dummyQueryBuilderArray31);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        int[] intArray2 = new int[] { 0 };
        int[] intArray8 = new int[] { (byte) 10, 'a', (-1), 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray2, intArray8);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray19);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "DummyQuery");
        java.lang.Object[] objArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, objArray26);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean9 = dummyQuery8.getisFilter();
        java.lang.String str11 = dummyQuery8.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.getisFilter();
        java.lang.String str14 = dummyQuery12.toString();
        boolean boolean16 = dummyQuery12.equals((java.lang.Object) 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] dummyQueryArray17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] { dummyQuery1, dummyQuery8, dummyQuery12 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery> dummyQuerySet18 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) dummyQuerySet18);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11, true);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests15.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests15.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray27, (float) (byte) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests32.indexedValueForSearch((long) (short) -1);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) floatArray7, (java.lang.Object) (short) -1);
        float[] floatArray42 = new float[] { '#', '#', 100, (short) 100, 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray42, (float) 0L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        org.apache.lucene.search.Query query6 = query5.clone();
        float float7 = query5.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (short) 0, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        int[] intArray6 = new int[] { 0, (-1), 0, (byte) 10, ' ' };
        int[] intArray9 = new int[] { 2, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests22);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.maxfailures");
        simpleIndexQueryParserTests22.assertFieldStatisticsEquals("random", fields30, fields38);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("random", postingsEnum41, postingsEnum42, false);
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests22 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet47 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTestsSet47);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 1L);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 10, 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 10, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testSpanNearQueryBuilder();
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 10, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, true);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests3.queryParser;
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests3.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests3.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) dummyQuery0, (java.lang.Object) testRule11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '#');
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        char[] charArray6 = new char[] { ' ', '4', 'a', '#', 'a', 'a' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests30);
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests30.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests30.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests30.getqueryParser();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain38;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean42 = dummyQuery41.getisFilter();
        java.lang.String str43 = dummyQuery41.toString();
        org.apache.lucene.search.Query query44 = dummyQuery41.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests45);
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests45.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef51 = simpleIndexQueryParserTests45.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = simpleIndexQueryParserTests45.getqueryParser();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        boolean boolean54 = dummyQuery41.equals((java.lang.Object) simpleIndexQueryParserTests45);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.monster");
        boolean boolean61 = dummyQuery41.equals((java.lang.Object) strArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain38, (java.lang.Object) strArray58);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService12);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.nightly");
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray58 = (java.lang.Iterable<java.lang.String>[]) iterableArray57;
        strIterableArray58[0] = fields9;
        strIterableArray58[1] = fields24;
        strIterableArray58[2] = fields30;
        strIterableArray58[3] = fields47;
        strIterableArray58[4] = fields55;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray58);
        java.util.Collection[] collectionArray71 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Iterable<java.lang.String>>[] strIterableCollectionArray72 = (java.util.Collection<java.lang.Iterable<java.lang.String>>[]) collectionArray71;
        strIterableCollectionArray72[0] = strIterableSet69;
        java.util.Set<java.util.Collection<java.lang.Iterable<java.lang.String>>> strIterableCollectionSet75 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableCollectionArray72);
        org.junit.Assert.assertNotNull((java.lang.Object) strIterableCollectionArray72);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray78);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strIterableCollectionArray72, (java.lang.Object[]) executorServiceArray78);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray6, floatArray20, (float) 0L);
        float[] floatArray36 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray42 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray36, (float) (short) 100);
        float[] floatArray54 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray60 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray60, (float) 100L);
        float[] floatArray68 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray74 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray74, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray54, floatArray68, (float) 0L);
        float[] floatArray84 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray90 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray84, floatArray90, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray68, floatArray90, (float) (short) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray90, 1.0f);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        long[] longArray6 = new long[] { (short) -1, 100, 5, ' ', 3, 5 };
        long[] longArray12 = new long[] { 4, 10L, (byte) 0, 'a', 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray12);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        long[] longArray2 = new long[] { (short) -1, (byte) 10 };
        long[] longArray6 = new long[] { (-1), (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain15;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests10.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule8, (java.lang.Object) indexQueryParserService17);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        dummyQuery0.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        long[] longArray3 = new long[] { (short) 10, (short) -1, 0 };
        long[] longArray5 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (byte) 100, (double) '4');
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.isFilter;
        java.lang.String str5 = dummyQuery1.toString();
        org.apache.lucene.search.Query query6 = dummyQuery1.clone();
        dummyQuery1.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        java.lang.String str11 = dummyQuery9.toString();
        boolean boolean13 = dummyQuery9.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query14 = dummyQuery9.clone();
        org.apache.lucene.search.Query query15 = query14.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) true, (java.lang.Object) query14);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("DummyQuery", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain32;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests24.queryParser = indexQueryParserService35;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests24);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests23.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests0.indexedValueForSearch((-1L));
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 3, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        char[] charArray3 = new char[] { '#', '4', 'a' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        int[] intArray7 = new int[] { 5, (-1), 1, 5, (byte) 0, 'a' };
        int[] intArray13 = new int[] { '#', '4', '#', 5, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray7, intArray13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests41);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.maxfailures");
        simpleIndexQueryParserTests41.assertFieldStatisticsEquals("random", fields49, fields57);
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests41.assertDocsEnumEquals("random", postingsEnum60, postingsEnum61, false);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        simpleIndexQueryParserTests41.assertTermsEquals("hi!", indexReader65, terms66, terms67, true);
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        simpleIndexQueryParserTests41.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) strArray19, (java.lang.Object) simpleIndexQueryParserTests41);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray9);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 1, (double) (short) 1);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 'a', 10.0d, (double) 0L);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray3);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        double[] doubleArray3 = new double[] { (short) 10, 4, 1L };
        double[] doubleArray10 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray16 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray10, doubleArray16, (double) 100L);
        double[] doubleArray25 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray31 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray25, doubleArray31, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray10, doubleArray25, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray10, (double) (short) 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (-1), (double) 1.0f, (-1.0d));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests27);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.maxfailures");
        simpleIndexQueryParserTests27.assertFieldStatisticsEquals("random", fields35, fields43);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("hi!", postingsEnum46, postingsEnum47, true);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.maxfailures");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests27.assertFieldStatisticsEquals("", fields58, fields66);
        simpleIndexQueryParserTests27.setUp();
        org.junit.rules.TestRule testRule69 = simpleIndexQueryParserTests27.ruleChain;
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "tests.monster");
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "tests.maxfailures");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "<unknown>");
        java.lang.String[] strArray86 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.monster");
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.maxfailures");
        simpleIndexQueryParserTests27.assertFieldStatisticsEquals("tests.awaitsfix", fields82, fields90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (short) 1, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", objArray1, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) testRule10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray21, (float) 0L);
        float[] floatArray37 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray43 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray21, floatArray43, (float) (short) 100);
        float[] floatArray53 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray59 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray59, (float) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray59, (float) 10L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.getisFilter();
        dummyQuery1.setBoost((float) 2);
        dummyQuery1.isFilter = false;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests12.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) false, (java.lang.Object) ruleChain15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        org.apache.lucene.search.Query query4 = dummyQuery1.clone();
        dummyQuery1.setBoost((float) (-1L));
        float float7 = dummyQuery1.getBoost();
        boolean boolean8 = dummyQuery1.getisFilter();
        boolean boolean9 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests10.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests10.setqueryParser(indexQueryParserService17);
        java.lang.String str19 = simpleIndexQueryParserTests10.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) boolean9, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        char[] charArray4 = new char[] { 'a', '4', '4', ' ' };
        char[] charArray11 = new char[] { ' ', '4', '4', '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray11);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        long[] longArray2 = new long[] { (byte) 100, 100 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("hi!", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests1.queryParser();
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray30, shortArray34);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray40);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService27, (java.lang.Object) shortArray40);
        short[] shortArray50 = new short[] { (byte) -1, (byte) -1, (short) 1, (short) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray50);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.Object[] objArray16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray12, objArray16);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        org.elasticsearch.common.bytes.BytesReference bytesReference1 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference1.equals(null)", !bytesReference1.equals(null));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, '#', 5, 100, 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests2.indexedValueForSearch(10L);
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests2.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str12 = dummyQuery10.toString();
        boolean boolean14 = dummyQuery10.equals((java.lang.Object) 0.0f);
        boolean boolean15 = dummyQuery10.getisFilter();
        java.lang.String str16 = dummyQuery10.toString();
        dummyQuery10.setisFilter(false);
        dummyQuery10.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) dummyQuery10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) -1, 0.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 0);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.awaitsfix");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("tests.monster", fields17, fields27);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "europarl.lines.txt.gz");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray40);
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.failfast");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "<unknown>");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields27, fields49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray4, shortArray8);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray14, shortArray18);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray4, shortArray14);
        short[] shortArray24 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray4, shortArray24);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) ' ');
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("DummyQuery", postingsEnum8, postingsEnum9, false);
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        boolean boolean13 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.maxfailures");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("random", fields22, fields30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests14.setqueryParser(indexQueryParserService32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests14.queryParser();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.awaitsfix", indexReader36, 5, postingsEnum38, postingsEnum39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) dummyQuery0, (java.lang.Object) postingsEnum38);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) mockMoreLikeThisFetchService1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "europarl.lines.txt.gz");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray24);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        java.util.concurrent.ExecutorService[][] executorServiceArray43 = new java.util.concurrent.ExecutorService[][] { executorServiceArray38, executorServiceArray40, executorServiceArray42 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray43);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray43);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "europarl.lines.txt.gz");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "europarl.lines.txt.gz");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray61);
        java.lang.String[] strArray68 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "europarl.lines.txt.gz");
        java.lang.String[] strArray76 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray68, (java.lang.Object[]) strArray76);
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray46);
        java.lang.Class<?> wildcardClass85 = strArray46.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery86 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean87 = dummyQuery86.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean89 = dummyQuery88.isFilter;
        org.apache.lucene.search.Query query90 = dummyQuery88.clone();
        boolean boolean91 = dummyQuery88.isFilter;
        java.lang.String str92 = dummyQuery88.toString();
        boolean boolean93 = dummyQuery86.equals((java.lang.Object) str92);
        boolean boolean94 = dummyQuery86.isFilter;
        boolean boolean95 = dummyQuery86.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) wildcardClass85, (java.lang.Object) boolean95);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "europarl.lines.txt.gz");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray52);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean62 = dummyQuery61.getisFilter();
        java.lang.String str64 = dummyQuery61.toString("tests.slow");
        java.lang.String str66 = dummyQuery61.toString("random");
        boolean boolean67 = dummyQuery61.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean69 = dummyQuery68.getisFilter();
        java.lang.String str71 = dummyQuery68.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean73 = dummyQuery72.getisFilter();
        java.lang.String str74 = dummyQuery72.toString();
        boolean boolean76 = dummyQuery72.equals((java.lang.Object) 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] dummyQueryArray77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] { dummyQuery61, dummyQuery68, dummyQuery72 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery> dummyQuerySet78 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryArray77);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray52, (java.lang.Object[]) dummyQueryArray77);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray26, (float) (byte) 100);
        float[] floatArray36 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray42 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray42, (float) 100L);
        float[] floatArray50 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray56 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray56, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray56, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", floatArray6, floatArray56, (float) '4');
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        java.lang.String str13 = dummyQuery1.toString("europarl.lines.txt.gz");
        boolean boolean14 = dummyQuery1.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) boolean14);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) '4', (double) (short) 1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 3, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "europarl.lines.txt.gz");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "europarl.lines.txt.gz");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
        java.util.Locale[] localeArray40 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) localeArray40);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.awaitsfix");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("tests.monster", fields17, fields27);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "europarl.lines.txt.gz");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray40);
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.failfast");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "<unknown>");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields27, fields49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("DummyQuery", true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) '4', 0.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100, (double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { 'a', '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", charArray1, charArray6);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "europarl.lines.txt.gz");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields31, fields39);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum44, postingsEnum45);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 1, (long) 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        char[] charArray1 = null;
        char[] charArray7 = new char[] { '#', 'a', '#', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", charArray1, charArray7);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 10L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        long[] longArray4 = new long[] { (short) 0, 0L, (short) 1, (short) 0 };
        long[] longArray7 = new long[] { (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray3, shortArray7);
        short[] shortArray15 = new short[] { (byte) 1, (byte) 0, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray15);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        short[] shortArray4 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray24 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[][] shortArray30 = new short[][] { shortArray4, shortArray9, shortArray14, shortArray19, shortArray24, shortArray29 };
        java.util.Set<short[]> shortArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests32.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray30, (java.lang.Object) simpleIndexQueryParserTests32);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        char[] charArray7 = new char[] { '4', '#', '4', ' ', ' ', 'a' };
        char[] charArray9 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray7, charArray9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests33);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.maxfailures");
        simpleIndexQueryParserTests33.assertFieldStatisticsEquals("random", fields41, fields49);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = null;
        simpleIndexQueryParserTests33.setqueryParser(indexQueryParserService51);
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests33.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests56.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests60.failureAndSuccessEvents;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain61;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain61;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "node_s_0", (java.lang.Object) ruleChain61);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '#', 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests35.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests38);
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests38.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests38.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests38.overrideTestDefaultQueryCache();
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.maxfailures");
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.awaitsfix");
        simpleIndexQueryParserTests38.assertFieldStatisticsEquals("tests.monster", fields52, fields62);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "europarl.lines.txt.gz");
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray67, (java.lang.Object[]) strArray75);
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.failfast");
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "<unknown>");
        simpleIndexQueryParserTests35.assertFieldStatisticsEquals("tests.awaitsfix", fields62, fields84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '#', (java.lang.Object) fields84);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum3, postingsEnum4, true);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests8.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain7, (java.lang.Object) testRule12);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("hi!", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests2.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests2.queryParser();
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray31, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray41);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService28, (java.lang.Object) shortArray41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean46 = dummyQuery45.getisFilter();
        java.lang.String str47 = dummyQuery45.toString();
        org.apache.lucene.search.Query query48 = dummyQuery45.clone();
        dummyQuery45.setBoost((float) (-1L));
        float float51 = dummyQuery45.getBoost();
        boolean boolean52 = dummyQuery45.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) boolean52);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        char[] charArray3 = new char[] { ' ', '#' };
        char[] charArray10 = new char[] { '#', 'a', '4', ' ', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        long[] longArray6 = new long[] { '#', 10L, (byte) 10, (-1L), 'a', 1 };
        long[] longArray8 = new long[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray26, (float) (byte) 100);
        float[] floatArray36 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray42 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray36, (float) 100);
        float[] floatArray47 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray36, floatArray47, (-1.0f));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray13 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray13, (double) 100L);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray28 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 100L);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray43 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray37, doubleArray43, (double) 100L);
        double[] doubleArray52 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray58 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray52, doubleArray58, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray52, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray37, 100.0d);
        double[] doubleArray71 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray77 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray71, doubleArray77, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray71, (double) 10.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray13, doubleArray71, (double) 0L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        boolean boolean4 = dummyQuery0.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100.0f, (double) 4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray1, byteArray4);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        float[] floatArray35 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray41 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray41, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray21, floatArray35, (float) 0L);
        org.junit.Assert.assertArrayEquals("random", floatArray6, floatArray35, (float) (short) 10);
        float[] floatArray53 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray59 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray59, (float) 100L);
        float[] floatArray67 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray73 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray73, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray73, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray53, (float) (-1L));
        float[] floatArray80 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray80, (float) 4);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (-1), (long) (byte) 100);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str2 = dummyQuery0.toString("tests.slow");
        java.lang.Object obj3 = null;
        boolean boolean4 = dummyQuery0.equals(obj3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) -1, (long) (byte) 1);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10L, (double) '4', (double) 1);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        long[] longArray2 = new long[] { (short) 10, (byte) 0 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        char[] charArray4 = new char[] { ' ', '#', 'a' };
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray8);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, 100L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.Locale[] localeArray5 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet6 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray5);
        java.util.Set<java.util.Locale> localeSet7 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) localeArray5);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 5, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        long[] longArray7 = new long[] { (byte) 100, (byte) 1, 4, (short) 100, (short) 0, (byte) 1 };
        long[] longArray9 = new long[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean4 = dummyQuery3.isFilter;
        org.apache.lucene.search.Query query5 = dummyQuery3.clone();
        boolean boolean6 = dummyQuery3.isFilter;
        java.lang.String str7 = dummyQuery3.toString();
        boolean boolean8 = dummyQuery1.equals((java.lang.Object) str7);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("DummyQuery", (java.lang.Object) str7, (java.lang.Object) locale10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("hi!", postingsEnum20, postingsEnum21, true);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.maxfailures");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("", fields32, fields40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests42);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.maxfailures");
        simpleIndexQueryParserTests42.assertFieldStatisticsEquals("random", fields50, fields58);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = null;
        simpleIndexQueryParserTests42.setqueryParser(indexQueryParserService60);
        org.apache.lucene.util.BytesRef bytesRef64 = simpleIndexQueryParserTests42.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests65.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef68 = simpleIndexQueryParserTests65.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain70 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        simpleIndexQueryParserTests65.failureAndSuccessEvents = ruleChain70;
        simpleIndexQueryParserTests42.failureAndSuccessEvents = ruleChain70;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService73 = simpleIndexQueryParserTests42.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService73);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.maxfailures");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "europarl.lines.txt.gz");
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray43, (java.lang.Object[]) strArray51);
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray51);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests60);
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.monster");
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.maxfailures");
        simpleIndexQueryParserTests60.assertFieldStatisticsEquals("random", fields68, fields76);
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests60.assertDocsEnumEquals("hi!", postingsEnum79, postingsEnum80, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = simpleIndexQueryParserTests60.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService84 = simpleIndexQueryParserTests60.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray4, (java.lang.Object) indexQueryParserService84);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.monster", indexReader23, (int) (short) 0, postingsEnum25, postingsEnum26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", (java.lang.Object) postingsEnum26);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray8);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str27 = dummyQuery25.toString("tests.slow");
        java.lang.Object obj28 = null;
        boolean boolean29 = dummyQuery25.equals(obj28);
        boolean boolean30 = dummyQuery25.isFilter;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexQueryParserService23, (java.lang.Object) dummyQuery25);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        long[] longArray5 = new long[] { ' ', (short) 1, (short) 0, (byte) 0, (short) -1 };
        long[] longArray12 = new long[] { (short) 1, (short) 0, 5, 2, (short) 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        char[] charArray5 = new char[] { '4', ' ', 'a', '4' };
        char[] charArray12 = new char[] { 'a', '#', 'a', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", charArray5, charArray12);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray20);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "DummyQuery");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) strArray4);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (byte) 100, 10, 2, '#', (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100.0f, (double) (short) 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus40 = simpleIndexQueryParserTests0.ensureGreen(strArray21);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "europarl.lines.txt.gz");
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "europarl.lines.txt.gz");
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray77, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray47);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures92 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures93 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures92);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures94 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures95 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures94);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray96 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures93, testRuleIgnoreAfterMaxFailures95 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet97 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray5, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray96);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray3, shortArray7);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray17, shortArray18);
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) shortArray3);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 10, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        boolean boolean5 = dummyQuery1.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) dummyQuery1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 10, (double) (byte) 1);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        float float7 = dummyQuery0.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        java.lang.String str11 = dummyQuery9.toString();
        org.apache.lucene.search.Query query12 = dummyQuery9.clone();
        dummyQuery9.setBoost((float) (-1L));
        float float15 = dummyQuery9.getBoost();
        boolean boolean16 = dummyQuery9.getisFilter();
        boolean boolean17 = dummyQuery9.getisFilter();
        dummyQuery9.setisFilter(true);
        java.lang.Class<?> wildcardClass20 = dummyQuery9.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) executorServiceArray2, (java.lang.Object) dummyQuery9);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        java.lang.String str12 = dummyQuery0.toString("europarl.lines.txt.gz");
        boolean boolean13 = dummyQuery0.getisFilter();
        dummyQuery0.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) 10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.maxfailures");
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus52 = simpleIndexQueryParserTests2.ensureGreen(strArray46);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray9);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests24.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests33.assertDocsEnumEquals("DummyQuery", postingsEnum35, postingsEnum36, false);
        simpleIndexQueryParserTests33.setUp();
        simpleIndexQueryParserTests33.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests33.ruleChain;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests33.assertTermsEquals("tests.slow", indexReader44, terms45, terms46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests33.assertTermsEquals("hi!", indexReader50, terms51, terms52, true);
        simpleIndexQueryParserTests33.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain56 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests33);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", (java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray3, byteArray9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("DummyQuery");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray29);
        java.util.Locale[] localeArray51 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray13, (java.lang.Object[]) localeArray51);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        java.lang.Class<?> wildcardClass12 = simpleIndexQueryParserTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) wildcardClass12);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.nightly");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) fields17, (java.lang.Object) strArray21);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 1.0f, (double) 10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("hi!", obj1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        long[] longArray5 = new long[] { (byte) 0, 100, (byte) 100, (byte) 100 };
        long[] longArray10 = new long[] { (byte) 10, 100, 1L, 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", longArray5, longArray10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        int[] intArray2 = new int[] { 4 };
        int[] intArray4 = new int[] { 3 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray2, intArray4);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        int[] intArray3 = new int[] { '#', '4' };
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray4);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests4.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader16, terms17, terms18, false);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain21);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "europarl.lines.txt.gz");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray15, (java.lang.Object[]) strArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) localeArray1, (java.lang.Object[]) strArray15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        float float4 = dummyQuery0.getBoost();
        java.lang.String str5 = dummyQuery0.toString();
        dummyQuery0.setBoost(100.0f);
        dummyQuery0.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "europarl.lines.txt.gz");
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "europarl.lines.txt.gz");
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray77, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) strArray47);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 1);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 100, 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        long[] longArray2 = new long[] { '4', 10L };
        long[] longArray6 = new long[] { 2, 3, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray44);
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray70);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        java.util.concurrent.ExecutorService[][] executorServiceArray81 = new java.util.concurrent.ExecutorService[][] { executorServiceArray76, executorServiceArray78, executorServiceArray80 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray81);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray81);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.Object obj7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) 0, 1, '#', (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        java.lang.Object obj4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, obj4);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 100.0d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.String str6 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11, true);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("DummyQuery");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("DummyQuery", (java.lang.Object) (short) 10, (java.lang.Object) locale15);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        java.util.concurrent.ExecutorService[][] executorServiceArray22 = new java.util.concurrent.ExecutorService[][] { executorServiceArray17, executorServiceArray19, executorServiceArray21 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray22);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray12, (java.lang.Object[]) executorServiceArray22);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        short[] shortArray3 = new short[] { (byte) 100, (short) -1 };
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray6, shortArray10);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray3, shortArray16);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        long[] longArray7 = new long[] { (-1L), (short) 100, (byte) -1, ' ', (short) -1, 100 };
        long[] longArray13 = new long[] { 0L, (short) 100, (-1), (short) 10, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray7, longArray13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean21 = dummyQuery20.isFilter;
        org.apache.lucene.search.Query query22 = dummyQuery20.clone();
        boolean boolean23 = dummyQuery20.isFilter;
        java.lang.String str24 = dummyQuery20.toString();
        org.apache.lucene.search.Query query25 = dummyQuery20.clone();
        float float26 = query25.getBoost();
        float float27 = query25.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) strArray4, (java.lang.Object) float27);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        char[] charArray2 = new char[] { '#', ' ' };
        char[] charArray8 = new char[] { 'a', '4', '#', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests5.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        boolean boolean6 = dummyQuery0.getisFilter();
        boolean boolean7 = dummyQuery0.getisFilter();
        boolean boolean8 = dummyQuery0.isFilter;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean9 = dummyQuery8.getisFilter();
        java.lang.String str11 = dummyQuery8.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.getisFilter();
        java.lang.String str14 = dummyQuery12.toString();
        boolean boolean16 = dummyQuery12.equals((java.lang.Object) 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] dummyQueryArray17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] { dummyQuery1, dummyQuery8, dummyQuery12 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery> dummyQuerySet18 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryArray17);
        java.util.Set<org.apache.lucene.search.Query> querySet19 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.search.Query[]) dummyQueryArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests20);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.maxfailures");
        simpleIndexQueryParserTests20.assertFieldStatisticsEquals("random", fields28, fields36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests20.setqueryParser(indexQueryParserService38);
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests20.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests43.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef53 = simpleIndexQueryParserTests20.indexedValueForSearch((-1L));
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) querySet19, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests5.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        long[] longArray2 = new long[] { 1L, (short) 0 };
        long[] longArray9 = new long[] { (short) 0, ' ', (-1L), (-1), 10, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray13 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray13, (double) 100L);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray28 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray22, (double) 1.0f);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray45 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray39, doubleArray45, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray45, (double) (byte) 1);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        long[] longArray6 = new long[] { 10, (byte) 0, 100, (short) 100, (short) -1 };
        long[] longArray10 = new long[] { (byte) 1, (-1L), 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (short) 10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields31, fields39);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService42);
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (int) (short) 1, numericDocValues46, numericDocValues47);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        float[] floatArray1 = null;
        float[] floatArray9 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray15 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray15, (float) 100L);
        float[] floatArray23 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray29 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray9, floatArray23, (float) 0L);
        float[] floatArray39 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray45 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray45, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray23, floatArray45, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray1, floatArray45, (float) 100);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str4 = mockMoreLikeThisFetchService3.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService3.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray8 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService3, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService7 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray8);
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "europarl.lines.txt.gz");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray38);
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) abstractComponentArray8, (java.lang.Object[]) strArray38);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader22, 5, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.search.Query query30 = dummyQuery28.rewrite(indexReader29);
        boolean boolean31 = dummyQuery28.isFilter;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) dummyQuery28);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum24, (java.lang.Object) dummyQuery28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery28);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        long[] longArray3 = new long[] { 10L, (short) 0 };
        long[] longArray8 = new long[] { 3, 4, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        int[] intArray5 = new int[] { (short) -1, 'a', 0, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray6);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testBoostingQueryBuilder();
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "europarl.lines.txt.gz");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.maxfailures");
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "europarl.lines.txt.gz");
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray43, (java.lang.Object[]) strArray51);
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.monster");
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "europarl.lines.txt.gz");
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray58, (java.lang.Object[]) strArray66);
        java.lang.String[] strArray73 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.monster");
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "europarl.lines.txt.gz");
        java.lang.String[] strArray81 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray73, (java.lang.Object[]) strArray81);
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray66, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray81);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        org.apache.lucene.index.Fields fields92 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "{\n  \"dummy\" : { }\n}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus93 = simpleIndexQueryParserTests0.ensureGreen(strArray26);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        char[] charArray4 = new char[] { ' ', '#', '#', '4' };
        char[] charArray7 = new char[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (short) 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) (short) -1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.util.Locale[] localeArray16 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray4, (java.lang.Object[]) localeArray16);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        boolean boolean7 = dummyQuery0.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader17, terms18, terms19, true);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 2, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray5, byteArray10);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 1, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        long[] longArray6 = new long[] { (short) 1, 0L, (short) 100, 1L, (-1) };
        long[] longArray12 = new long[] { (short) 10, (short) 10, 1, 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray12);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) -1, (double) 100);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        long[] longArray3 = new long[] { (short) 1, 100L, (short) -1 };
        long[] longArray9 = new long[] { (short) 100, 4, (byte) 10, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, 1L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray44);
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray70);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray76);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        int[] intArray4 = new int[] { 10, 1, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", intArray4, intArray5);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 4, (double) 0, (double) (byte) 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService11);
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", 4, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testBooleanParsesFilter();
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields31, fields39);
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService42;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues46, numericDocValues47);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, 0.0d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        int[] intArray4 = new int[] { (byte) 0, (-1), (byte) -1, 10 };
        int[] intArray9 = new int[] { (byte) 0, 5, (short) -1, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService20);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests24);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("random", fields32, fields40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("random", postingsEnum43, postingsEnum44, false);
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests24 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet49 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray48);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray48);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "europarl.lines.txt.gz");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray62, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray70);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests75);
        org.apache.lucene.util.BytesRef bytesRef78 = simpleIndexQueryParserTests75.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef81 = simpleIndexQueryParserTests75.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService82 = simpleIndexQueryParserTests75.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = simpleIndexQueryParserTests75.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService84 = null;
        simpleIndexQueryParserTests75.queryParser = indexQueryParserService84;
        java.lang.String str86 = simpleIndexQueryParserTests75.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray70, (java.lang.Object) str86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) simpleIndexQueryParserTestsArray48, (java.lang.Object[]) strArray70);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        int[] intArray6 = new int[] { ' ', (byte) 10, (-1), (byte) 1, 4 };
        int[] intArray12 = new int[] { 0, (byte) -1, 2, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray12);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.awaitsfix");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.maxfailures");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader32, fields42, fields54, true);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        simpleIndexQueryParserTests9.assertFieldStatisticsEquals("random", fields17, fields25);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "europarl.lines.txt.gz");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.nightly");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray65 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray66 = (java.lang.Iterable<java.lang.String>[]) iterableArray65;
        strIterableArray66[0] = fields17;
        strIterableArray66[1] = fields32;
        strIterableArray66[2] = fields38;
        strIterableArray66[3] = fields55;
        strIterableArray66[4] = fields63;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray66);
        java.util.List<java.lang.Iterable<java.lang.String>> strIterableList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, strIterableArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strIterableArray66);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        long[] longArray6 = new long[] { 100L, 2, (short) 1, (byte) 100, (byte) 1 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray6, longArray7);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0L, (long) (short) 10);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { 10, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray5);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser;
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests2.indexedValueForSearch((long) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { '#', ' ', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray15 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray9, doubleArray15, (double) 100L);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray30 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray24, doubleArray30, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray24, (double) 1.0f);
        double[] doubleArray41 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray47 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray41, doubleArray47, (double) 100L);
        double[] doubleArray56 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray62 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray56, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray41, doubleArray56, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray24, doubleArray56, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray1, doubleArray56, (double) 100L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) 100);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        boolean boolean5 = dummyQuery0.getisFilter();
        java.lang.String str6 = dummyQuery0.toString();
        dummyQuery0.setisFilter(false);
        dummyQuery0.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        float[] floatArray7 = new float[] { (byte) 100, 2, (byte) -1, 100, 2, 0.0f };
        float[] floatArray14 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray20 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray20, (float) 100L);
        float[] floatArray29 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray35 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray35, (float) 100L);
        float[] floatArray43 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray49 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray49, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray29, floatArray43, (float) 0L);
        org.junit.Assert.assertArrayEquals("random", floatArray14, floatArray43, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", floatArray7, floatArray43, (-1.0f));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        float float7 = dummyQuery0.getBoost();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query10 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        dummyQuery0.setBoost((float) 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.getisFilter();
        dummyQuery1.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 10, (double) 100L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.nightly");
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray58 = (java.lang.Iterable<java.lang.String>[]) iterableArray57;
        strIterableArray58[0] = fields9;
        strIterableArray58[1] = fields24;
        strIterableArray58[2] = fields30;
        strIterableArray58[3] = fields47;
        strIterableArray58[4] = fields55;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray58);
        java.lang.String[] strArray73 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) strIterableSet69, (java.lang.Object) fields75);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery2.clone();
        boolean boolean5 = dummyQuery2.isFilter;
        java.lang.String str6 = dummyQuery2.toString();
        boolean boolean7 = dummyQuery0.equals((java.lang.Object) str6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 100.0f);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        char[] charArray2 = new char[] { ' ' };
        char[] charArray7 = new char[] { '4', '#', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray2, charArray7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        double[] doubleArray5 = new double[] { (short) 100, 100, 0.0d, 100L };
        double[] doubleArray12 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray18 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray12, doubleArray18, (double) 100L);
        double[] doubleArray27 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray33 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray27, doubleArray33, (double) 100L);
        double[] doubleArray42 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray48 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray42, doubleArray48, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray42, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray27, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray5, doubleArray12, (double) ' ');
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        long[] longArray1 = new long[] { 0 };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testDisMaxBuilder();
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        long[] longArray3 = new long[] { (byte) 100, 0L, (byte) 100 };
        long[] longArray8 = new long[] { 10, (short) 1, '#', 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService6);
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("DummyQuery", (int) (short) -1, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 1.0d, (double) (short) 10);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        dummyQuery1.isFilter = false;
        org.apache.lucene.search.Query query5 = dummyQuery1.clone();
        boolean boolean6 = dummyQuery1.isFilter;
        dummyQuery1.isFilter = true;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        simpleIndexQueryParserTests9.assertFieldStatisticsEquals("random", fields17, fields25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("random", postingsEnum28, postingsEnum29, false);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("hi!", indexReader33, terms34, terms35, true);
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) dummyQuery1, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("random", postingsEnum21, postingsEnum22, true);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.maxfailures");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.failfast");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "<unknown>");
        simpleIndexQueryParserTests18.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields33, fields54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms14, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "europarl.lines.txt.gz");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray46);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "europarl.lines.txt.gz");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray61);
        java.lang.String[] strArray68 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "europarl.lines.txt.gz");
        java.lang.String[] strArray76 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray68, (java.lang.Object[]) strArray76);
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray76);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray46);
        java.lang.Object[] objArray85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, objArray85);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests25.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests25.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests25.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests25.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService34;
        java.lang.String str36 = simpleIndexQueryParserTests25.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray20, (java.lang.Object) str36);
        java.util.Set<java.lang.String> strSet38 = org.apache.lucene.util.LuceneTestCase.asSet(strArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = simpleIndexQueryParserTests39.queryParser();
        simpleIndexQueryParserTests39.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests42);
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests42.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests42.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests42.getqueryParser();
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests39, (java.lang.Object) simpleIndexQueryParserTests42);
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests39.longToPrefixCoded((long) 1, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) strSet38, (java.lang.Object) bytesRef55);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, 0.0d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray5 = new long[] { (-1), 1L, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum5, postingsEnum6, true);
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str13 = dummyQuery10.toString("tests.slow");
        java.lang.String str15 = dummyQuery10.toString("random");
        float float16 = dummyQuery10.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.maxfailures");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("random", fields25, fields33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests17.setqueryParser(indexQueryParserService35);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests17.queryParser();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("", indexReader39, 5, postingsEnum41, postingsEnum42);
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests54);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.monster");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.maxfailures");
        simpleIndexQueryParserTests54.assertFieldStatisticsEquals("random", fields62, fields70);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests54.assertDocsEnumEquals("hi!", postingsEnum73, postingsEnum74, true);
        java.lang.String[] strArray81 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.monster");
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.maxfailures");
        java.lang.String[] strArray89 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields91 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray89, "tests.monster");
        org.apache.lucene.index.Fields fields93 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray89, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests54.assertFieldStatisticsEquals("", fields85, fields93);
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields53, fields93);
        boolean boolean96 = dummyQuery10.equals((java.lang.Object) fields93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) str9, (java.lang.Object) dummyQuery10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 0, (long) (short) 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        long[] longArray1 = new long[] { (byte) 10 };
        long[] longArray8 = new long[] { (byte) 1, (short) 10, ' ', (-1), 100L, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 1, 1);
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1, (double) 35.0f);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 1L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests1.queryParser();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader23, 5, postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "europarl.lines.txt.gz");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests38);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.maxfailures");
        simpleIndexQueryParserTests38.assertFieldStatisticsEquals("random", fields46, fields54);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests38.assertDocsEnumEquals("hi!", postingsEnum57, postingsEnum58, true);
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.maxfailures");
        java.lang.String[] strArray73 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.monster");
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests38.assertFieldStatisticsEquals("", fields69, fields77);
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields37, fields77);
        java.lang.Object obj80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, obj80);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (short) 10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.isFilter;
        org.apache.lucene.search.Query query12 = dummyQuery10.clone();
        boolean boolean13 = dummyQuery10.isFilter;
        java.lang.String str14 = dummyQuery10.toString();
        org.apache.lucene.search.Query query15 = dummyQuery10.clone();
        dummyQuery10.setisFilter(true);
        org.junit.Assert.assertNotSame((java.lang.Object) testRule8, (java.lang.Object) dummyQuery10);
        float[] floatArray25 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray31 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray31, (float) 100L);
        float[] floatArray39 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray45 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray45, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray25, floatArray39, (float) 0L);
        float[] floatArray55 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray61 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray61, (float) 100L);
        float[] floatArray69 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray75 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray75, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray55, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) dummyQuery10, (java.lang.Object) 100);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        org.apache.lucene.search.Query query4 = dummyQuery1.clone();
        dummyQuery1.setBoost((float) (-1L));
        float float7 = dummyQuery1.getBoost();
        boolean boolean8 = dummyQuery1.getisFilter();
        boolean boolean9 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.isFilter;
        org.apache.lucene.search.Query query14 = dummyQuery12.clone();
        boolean boolean15 = dummyQuery12.isFilter;
        java.lang.String str16 = dummyQuery12.toString();
        boolean boolean17 = dummyQuery10.equals((java.lang.Object) str16);
        boolean boolean18 = dummyQuery10.isFilter;
        boolean boolean19 = dummyQuery10.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) dummyQuery1, (java.lang.Object) boolean19);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        double[] doubleArray6 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray12 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray6, doubleArray12, (double) 100L);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray28 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 100L);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray43 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray37, doubleArray43, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray37, (double) 1.0f);
        double[] doubleArray54 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray60 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray54, doubleArray60, (double) 100L);
        double[] doubleArray69 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray75 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray69, doubleArray75, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray69, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray37, doubleArray69, (double) 10L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray69, (double) 1);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        dummyQuery0.isFilter = false;
        java.lang.String str11 = dummyQuery0.toString("");
        boolean boolean12 = dummyQuery0.isFilter;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.search.Query query14 = dummyQuery0.rewrite(indexReader13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query14);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService20);
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests2.longToPrefixCoded((long) (byte) 1, 1);
        java.lang.String str25 = simpleIndexQueryParserTests2.getTestName();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("DummyQuery", indexReader25, 1, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) '4', numericDocValues32, numericDocValues33);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 35.0f);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray2, charArray3);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        char[] charArray7 = new char[] { '4', ' ', 'a', 'a', '4', 'a' };
        char[] charArray10 = new char[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", byteArray4, byteArray7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, 0.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests4.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests16.queryParser();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests19.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests19.getqueryParser();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests16, (java.lang.Object) simpleIndexQueryParserTests19);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.monster", indexReader31, terms32, terms33, false);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) testRule15, (java.lang.Object) simpleIndexQueryParserTests16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.badapples", (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        long[] longArray4 = new long[] { (short) 100, 5, 2 };
        long[] longArray11 = new long[] { (byte) 100, (byte) 1, 0, 0, 0L, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", longArray4, longArray11);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 100, (long) 5);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.search.Query query6 = query4.rewrite(indexReader5);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.search.Query query8 = query4.rewrite(indexReader7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query8);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        int[] intArray3 = new int[] { '#', 100 };
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray3, intArray4);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (byte) -1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        char[] charArray5 = new char[] { 'a', 'a', ' ', 'a', ' ' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 'a', (int) (short) 0);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }
}

