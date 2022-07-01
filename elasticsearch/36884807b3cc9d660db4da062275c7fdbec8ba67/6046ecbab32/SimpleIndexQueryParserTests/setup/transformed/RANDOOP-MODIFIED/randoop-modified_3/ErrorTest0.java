import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, 0L);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        char[] charArray2 = new char[] { '4', ' ' };
        char[] charArray6 = new char[] { '4', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 1, (double) 10.0f, (double) 1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "random", "", "" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus8 = simpleIndexQueryParserTests0.ensureGreen(strArray7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 100.0d, (double) (-1), (-1.0d));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum2, postingsEnum3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        float[] floatArray2 = new float[] { (byte) -1 };
        float[] floatArray5 = new float[] { (-1L), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray2, floatArray5, (float) '#');
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        float[] floatArray4 = new float[] { 1L, 10L, (byte) -1 };
        float[] floatArray9 = new float[] { 1L, 100L, 100.0f, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray4, floatArray9, (float) 10L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { '4', ' ', 0, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        double[] doubleArray3 = new double[] { (byte) 100, 10 };
        double[] doubleArray9 = new double[] { 1, 1.0d, 1.0f, (short) 10, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray3, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        char[] charArray1 = null;
        char[] charArray8 = new char[] { '4', '4', '#', '4', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        java.lang.Object[] objArray2 = new java.lang.Object[] { "europarl.lines.txt.gz" };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "", true, "tests.monster", simpleIndexQueryParserTests6, simpleIndexQueryParserTests9, simpleIndexQueryParserTests12 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", objArray2, objArray14);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        java.lang.Object[] objArray0 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, '4', obj3, 0, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, objArray7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 100.0d, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.client.Client client0 = org.elasticsearch.test.ElasticsearchSingleNodeTest.client();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) -1, (long) 1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.apache.lucene.search.Query query0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery1 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        double[] doubleArray4 = new double[] { (byte) 1, 10L, (byte) 10, (short) 1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "europarl.lines.txt.gz" };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus6 = simpleIndexQueryParserTests0.ensureGreen(strArray5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        short[] shortArray6 = new short[] { (short) 100, (byte) 0, (short) -1, (byte) 10, (short) -1 };
        short[] shortArray8 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray6, shortArray8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        long[] longArray5 = new long[] { 10L, 'a', (byte) 0, (short) -1 };
        long[] longArray9 = new long[] { ' ', 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray5, longArray9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        long[] longArray2 = new long[] { (byte) 10, 100L };
        long[] longArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        float[] floatArray7 = new float[] { 1.0f, (-1L), '#', (byte) -1, (short) 100, (byte) 100 };
        float[] floatArray8 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray7, floatArray8, (-1.0f));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 10.0d, (double) '4');
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray5, objArray10);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray10, (java.lang.Object[]) strArray23);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        float[] floatArray4 = new float[] { (byte) -1, (-1L), (byte) 0, (-1.0f) };
        float[] floatArray8 = new float[] { (short) 1, 100L, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) '#');
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        char[] charArray6 = new char[] { '4', '4', '4', ' ', 'a' };
        char[] charArray12 = new char[] { 'a', '4', '#', '#', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", charArray6, charArray12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, objArray10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (-1), (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) '#');
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray6, byteArray11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        org.junit.Assert.assertArrayEquals(objArray3, objArray8);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray3, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.weekly", true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        double[] doubleArray1 = null;
        double[] doubleArray7 = new double[] { 1L, ' ', 100.0f, (-1.0f), 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray1, doubleArray7, (double) (-1L));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (short) 10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (byte) 0, 'a', 'a', 100, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        short[] shortArray7 = new short[] { (short) 1, (byte) 0, (short) 1, (short) 1, (byte) 10, (short) 100 };
        short[] shortArray13 = new short[] { (byte) 1, (byte) 0, (short) -1, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray7, shortArray13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests5.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "enwiki.random.lines.txt");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields22, fields29);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader4, fields22, fields33, true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) 100, (long) 5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        long[] longArray6 = new long[] { 6, 5, 'a', (byte) -1, (-1) };
        long[] longArray11 = new long[] { (short) 1, 2, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus13 = simpleIndexQueryParserTests1.ensureGreen(strArray10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1.0f, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray7, byteArray11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 0.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        short[] shortArray7 = new short[] { (short) 100, (byte) 0, (short) 1, (short) -1, (byte) 10, (short) 100 };
        short[] shortArray13 = new short[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 1L);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray1, floatArray5, 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray1, (java.lang.Object) ruleChain16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        java.lang.Object obj1 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", obj1, (java.lang.Object) floatArray3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain19;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests14.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray22 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests10, simpleIndexQueryParserTests14 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet23 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray5, (java.lang.Object[]) elasticsearchSingleNodeTestArray22);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 1, (short) 10, (byte) 1, (byte) 10, (byte) -1 };
        short[] shortArray10 = new short[] { (byte) 1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, (byte) -1, 2 };
        int[] intArray9 = new int[] { (byte) 10, 10, (byte) 1, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        long[] longArray5 = new long[] { 100, (short) 1, 0L, 0L, (short) 10 };
        long[] longArray9 = new long[] { 1L, 10L, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        long[] longArray2 = new long[] { (short) 100, (byte) 1 };
        long[] longArray9 = new long[] { 0L, 4, 10L, 2, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        long[] longArray0 = new long[] {};
        long[] longArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus4 = simpleIndexQueryParserTests0.ensureGreen(strArray1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray7 = new long[] { 3, '#', 100L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray2, longArray7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests12.assertDocValuesEquals("hi!", (int) ' ', numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.weekly");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "");
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.weekly", indexReader6, fields9, fields18, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests21.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests21.queryParser;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        java.lang.String[] strArray43 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields38, fields45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields9, fields38);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) '#', numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        char[] charArray1 = null;
        char[] charArray5 = new char[] { 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        char[] charArray0 = new char[] {};
        char[] charArray4 = new char[] { '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        java.lang.Iterable[] iterableArray36 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray37 = (java.lang.Iterable<java.lang.Object>[]) iterableArray36;
        objIterableArray37[0] = objSet9;
        objIterableArray37[1] = objSet14;
        objIterableArray37[2] = objSet19;
        objIterableArray37[3] = objSet24;
        objIterableArray37[4] = objSet29;
        objIterableArray37[5] = objSet34;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray37);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objIterableSet50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) 100.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 4, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray4, (double) '#');
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        org.junit.Assert.assertArrayEquals(objArray9, objArray14);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray4, objArray9);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        org.junit.Assert.assertArrayEquals(objArray27, objArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray22, objArray27);
        org.junit.Assert.assertEquals(objArray9, objArray22);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray22, (java.lang.Object[]) strArray41);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests4.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, true);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "enwiki.random.lines.txt");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields21, fields28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) 10, (java.lang.Object) fields28);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.slow", false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 'a', (double) 0.0f);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader2, (int) (byte) 100, postingsEnum4, postingsEnum5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.weekly");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "");
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.weekly", indexReader13, fields16, fields25, true);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields16, fields34);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 10, (java.lang.Object) '#');
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        char[] charArray5 = new char[] { '#', 'a', ' ', ' ' };
        char[] charArray12 = new char[] { ' ', '4', '4', '4', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray5, charArray12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.weekly");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "");
        simpleIndexQueryParserTests7.assertFieldsEquals("tests.weekly", indexReader11, fields14, fields23, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests26.queryParser;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("europarl.lines.txt.gz", indexReader31, terms32, terms33, true);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields43, fields50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("enwiki.random.lines.txt", fields14, fields43);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 0L, 2, 'a', '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10, (java.lang.Object) (-1L));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 10, (byte) 100, 10.0f, 1.0f, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray7, (double) 2);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 6, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet(objArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet(objArray17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        java.lang.Iterable[] iterableArray35 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray36 = (java.lang.Iterable<java.lang.Object>[]) iterableArray35;
        objIterableArray36[0] = objSet8;
        objIterableArray36[1] = objSet13;
        objIterableArray36[2] = objSet18;
        objIterableArray36[3] = objSet23;
        objIterableArray36[4] = objSet28;
        objIterableArray36[5] = objSet33;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) objIterableArray36);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 1, (double) 6, (double) 1.0f);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray4 = new char[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) "tests.nightly", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus8 = simpleIndexQueryParserTests0.ensureGreen(strArray5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { 100L, 1L, '#', 6, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringBuilder();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        short[] shortArray6 = new short[] { (short) 100, (byte) 0, (byte) 10, (short) 100, (short) 1 };
        short[] shortArray7 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray6, shortArray7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        short[] shortArray1 = new short[] { (short) 1 };
        short[] shortArray2 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray2);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        int[] intArray5 = new int[] { (byte) 0, 5, (byte) 0, (-1) };
        int[] intArray9 = new int[] { 5, 2, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray5, intArray9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests5.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests9.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray17 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests5, simpleIndexQueryParserTests9 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet18 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray3, (java.lang.Object[]) elasticsearchSingleNodeTestArray17);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "<unknown>");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService18;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet(objArray38);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet(objArray43);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet(objArray48);
        java.lang.Iterable[] iterableArray51 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray52 = (java.lang.Iterable<java.lang.Object>[]) iterableArray51;
        objIterableArray52[0] = objSet24;
        objIterableArray52[1] = objSet29;
        objIterableArray52[2] = objSet34;
        objIterableArray52[3] = objSet39;
        objIterableArray52[4] = objSet44;
        objIterableArray52[5] = objSet49;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet65 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray52);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests16, (java.lang.Object) objIterableSet65);
        simpleIndexQueryParserTests16.setUp();
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.weekly");
        java.lang.String[] strArray72 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.weekly");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("tests.awaitsfix", fields71, fields74);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray80, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.maxfailures", fields71, fields82);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        int[] intArray5 = new int[] { '4', 5, (short) 1, (byte) 1, (short) 0 };
        int[] intArray12 = new int[] { (byte) 1, 2, 5, 10, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 0, 0.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { 'a', 0, 3, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray1, doubleArray6, (double) 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests5.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray13 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests5 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet14 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        org.junit.Assert.assertArrayEquals(objArray23, objArray28);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        org.junit.Assert.assertArrayEquals(objArray40, objArray45);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray35, objArray40);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet(objArray53);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet(objArray58);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet(objArray63);
        org.junit.Assert.assertArrayEquals(objArray58, objArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray53, objArray58);
        org.junit.Assert.assertEquals(objArray40, objArray53);
        org.junit.Assert.assertEquals(objArray23, objArray40);
        org.junit.Assert.assertArrayEquals(objArray18, objArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) elasticsearchSingleNodeTestArray13, objArray18);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests3.queryParser;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "enwiki.random.lines.txt");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields20, fields27);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests29.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests39.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests39.queryParser;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests39.assertTermsEquals("europarl.lines.txt.gz", indexReader44, terms45, terms46, true);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "enwiki.random.lines.txt");
        java.lang.String[] strArray61 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests39.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields56, fields63);
        org.apache.lucene.util.BytesRef bytesRef67 = simpleIndexQueryParserTests39.longToPrefixCoded((long) 10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) bytesRef67);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        short[] shortArray2 = new short[] { (byte) 0, (short) 1 };
        short[] shortArray5 = new short[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0, 0, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) (byte) 0, obj2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        int[] intArray4 = new int[] { 6, 0, 'a', 'a' };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 3, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        short[] shortArray0 = new short[] {};
        short[] shortArray4 = new short[] { (short) 10, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray8 = new double[] { 5, (-1.0d), '4', (byte) -1, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray8, 1.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        org.junit.Assert.assertArrayEquals(objArray8, objArray13);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        org.junit.Assert.assertArrayEquals(objArray25, objArray30);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray20, objArray25);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet(objArray38);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet(objArray43);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet(objArray48);
        org.junit.Assert.assertArrayEquals(objArray43, objArray48);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray38, objArray43);
        org.junit.Assert.assertEquals(objArray25, objArray38);
        org.junit.Assert.assertEquals(objArray8, objArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray1, objArray25);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 4, 0.0d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        short[] shortArray5 = new short[] { (short) 100, (short) 0, (short) 100, (short) -1, (short) 1 };
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        char[] charArray6 = new char[] { '#', '4', '4', 'a', ' ', ' ' };
        char[] charArray13 = new char[] { '4', ' ', ' ', '#', 'a', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 6, (double) 1L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryFilter();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 4, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.weekly");
        java.lang.String[] strArray35 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "");
        simpleIndexQueryParserTests23.assertFieldsEquals("tests.weekly", indexReader27, fields30, fields39, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests43.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = simpleIndexQueryParserTests43.queryParser;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("europarl.lines.txt.gz", indexReader48, terms49, terms50, true);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "enwiki.random.lines.txt");
        java.lang.String[] strArray65 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests43.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields60, fields67);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef71 = simpleIndexQueryParserTests69.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService72 = simpleIndexQueryParserTests69.queryParser;
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        simpleIndexQueryParserTests69.assertTermsEquals("europarl.lines.txt.gz", indexReader74, terms75, terms76, true);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray84, "enwiki.random.lines.txt");
        java.lang.String[] strArray91 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields93 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray91, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests69.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields86, fields93);
        simpleIndexQueryParserTests23.assertFieldStatisticsEquals("", fields67, fields93);
        java.lang.String[] strArray96 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields98 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray96, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("hi!", fields93, fields98);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 1, (double) 'a');
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        long[] longArray0 = new long[] {};
        long[] longArray4 = new long[] { 100, 3, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader7, (int) '4', postingsEnum9, postingsEnum10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests16.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests16.queryParser;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "enwiki.random.lines.txt");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields33, fields40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests42.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.failureAndSuccessEvents = ruleChain47;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain47;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain47;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) 1.0f, (java.lang.Object) ruleChain47);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        double[] doubleArray2 = new double[] { (short) 100, '#' };
        double[] doubleArray4 = new double[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) (byte) 10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        short[] shortArray2 = new short[] { (byte) 0 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray2, shortArray3);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 1L);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray1, floatArray5, 0.0f);
        float[] floatArray12 = new float[] { (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray12, (float) (short) -1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        long[] longArray3 = new long[] { 6, 1L };
        long[] longArray8 = new long[] { (short) 100, (byte) -1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray3, longArray8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues4, numericDocValues5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object[][] objArray7 = new java.lang.Object[][] { objArray1, objArray2, objArray3, objArray4, objArray5, objArray6 };
        java.util.Set<java.lang.Object[]> objArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) objArray7, (java.lang.Object) 3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Iterable[] iterableArray31 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray32 = (java.lang.Iterable<java.lang.Object>[]) iterableArray31;
        objIterableArray32[0] = objSet4;
        objIterableArray32[1] = objSet9;
        objIterableArray32[2] = objSet14;
        objIterableArray32[3] = objSet19;
        objIterableArray32[4] = objSet24;
        objIterableArray32[5] = objSet29;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) objIterableArray32, (java.lang.Object) 0.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 100);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", obj1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1, 1.0d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus10 = simpleIndexQueryParserTests0.ensureGreen(strArray7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (int) (short) 0, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.weekly");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        long[] longArray3 = new long[] { 3, 0, 4 };
        long[] longArray9 = new long[] { 1L, 4, '#', 1L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        double[] doubleArray5 = new double[] { (short) 10, (short) 0, 0, 100 };
        double[] doubleArray9 = new double[] { (byte) 100, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray5, doubleArray9, (double) 1L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        int[] intArray2 = new int[] { '#', (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) 2, (java.lang.Object) floatArray2);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 1L);
        float[] floatArray8 = new float[] { 'a', '4', 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray1, floatArray8, (float) 10L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        int[] intArray3 = new int[] { (short) 100, 4, 3 };
        int[] intArray10 = new int[] { (short) 10, (byte) 10, (byte) 10, 5, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 10.0f, 100.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        int[] intArray2 = new int[] { 2 };
        int[] intArray6 = new int[] { 100, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray2, intArray6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.monster", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum9, postingsEnum10, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) 1L, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ' ', (java.lang.Object) bytesRef5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        long[] longArray4 = new long[] { 10, ' ', (short) 1 };
        long[] longArray9 = new long[] { 0L, 10, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields24, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus5 = simpleIndexQueryParserTests0.ensureGreen(strArray2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        char[] charArray5 = new char[] { 'a', '4', '4', ' ' };
        char[] charArray9 = new char[] { 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray5, charArray9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNotQueryBuilder();
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        double[] doubleArray2 = new double[] { (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) -1, 1.0f, 4, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray2, doubleArray7, (double) '#');
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.weekly");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet(objArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet(objArray17);
        org.junit.Assert.assertArrayEquals(objArray12, objArray17);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray7, objArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray0, objArray7);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields3Builder();
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        double[] doubleArray6 = new double[] { ' ', 1.0f, 0.0d, (short) 0, 10, '#' };
        double[] doubleArray10 = new double[] { (byte) 1, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray10, (double) '4');
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        java.lang.Object[] objArray1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        org.junit.Assert.assertArrayEquals(objArray27, objArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray22, objArray27);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet(objArray50);
        org.junit.Assert.assertArrayEquals(objArray45, objArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray40, objArray45);
        org.junit.Assert.assertEquals(objArray27, objArray40);
        org.junit.Assert.assertEquals(objArray10, objArray27);
        org.junit.Assert.assertArrayEquals(objArray5, objArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", objArray1, objArray27);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields31, fields38);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests40.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain45;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain45, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        long[] longArray3 = new long[] { '#', (-1L), 5 };
        long[] longArray8 = new long[] { (-1L), 1L, (short) 10, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        double[] doubleArray5 = new double[] { 0, 0.0f, 0L, '#' };
        double[] doubleArray12 = new double[] { (-1), (short) 10, 100L, (short) -1, 100.0f, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray5, doubleArray12, (double) 10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        short[] shortArray4 = new short[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray5, objArray10);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        org.junit.Assert.assertArrayEquals(objArray28, objArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray23, objArray28);
        org.junit.Assert.assertEquals(objArray10, objArray23);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", objArray23, (java.lang.Object[]) strArray40);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader3, terms4, terms5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) -1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        double[] doubleArray5 = new double[] { (byte) -1, ' ', (byte) -1, ' ', 'a' };
        double[] doubleArray8 = new double[] { 1.0d, 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray8, (double) (byte) 10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray5 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray2, charArray5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (-1.0f), (double) 6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        long[] longArray4 = new long[] { (short) 10, 5, 5 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        char[] charArray1 = null;
        char[] charArray3 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray1, charArray3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 100.0f, (double) (byte) 1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1.0f));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService7;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain31;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain31);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        char[] charArray4 = new char[] { 'a', '4', '#', '4' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        short[] shortArray2 = new short[] { (short) 0, (byte) 10 };
        short[] shortArray4 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) (byte) 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 1, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        double[] doubleArray3 = new double[] { (byte) -1, 0.0d };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray3, doubleArray4, (double) (-1L));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        short[] shortArray3 = new short[] { (short) 100, (byte) -1 };
        short[] shortArray6 = new short[] { (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray3, shortArray6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader28, 10, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests1.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", (java.lang.Object) indexQueryParserService33);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray1, longArray2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        java.lang.Object obj5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests4.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, true);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "enwiki.random.lines.txt");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields21, fields28);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests30.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray40, floatArray41, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) floatArray41);
        float[] floatArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray41, floatArray45, (float) (byte) 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        int[] intArray1 = null;
        int[] intArray8 = new int[] { (byte) 10, (short) 100, (short) 10, (short) 100, 10, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, (byte) 100, 5, 'a', (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, 100, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests13.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests13.queryParser;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, true);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "enwiki.random.lines.txt");
        java.lang.String[] strArray35 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields30, fields37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests39.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain44;
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests1.indexedValueForSearch((long) '4');
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) bytesRef50, (java.lang.Object) locale52);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        long[] longArray2 = new long[] { (short) 10, 10 };
        long[] longArray7 = new long[] { (short) 1, (short) 1, (byte) 0, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray5, objArray10);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray10, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        int[] intArray5 = new int[] { (-1), (short) 100, 0, (byte) -1, 1 };
        int[] intArray11 = new int[] { (byte) -1, (byte) -1, ' ', 6, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests13.queryParser = indexQueryParserService15;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        java.lang.Iterable[] iterableArray48 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray49 = (java.lang.Iterable<java.lang.Object>[]) iterableArray48;
        objIterableArray49[0] = objSet21;
        objIterableArray49[1] = objSet26;
        objIterableArray49[2] = objSet31;
        objIterableArray49[3] = objSet36;
        objIterableArray49[4] = objSet41;
        objIterableArray49[5] = objSet46;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet62 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray49);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) objIterableSet62);
        simpleIndexQueryParserTests13.setUp();
        java.lang.String[] strArray66 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.weekly");
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.weekly");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("tests.awaitsfix", fields68, fields71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader10, fields11, fields68, true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        org.junit.Assert.assertArrayEquals(objArray4, objArray9);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        org.junit.Assert.assertArrayEquals(objArray21, objArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray16, objArray21);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        org.junit.Assert.assertArrayEquals(objArray39, objArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray34, objArray39);
        org.junit.Assert.assertEquals(objArray21, objArray34);
        org.junit.Assert.assertEquals(objArray4, objArray21);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet(objArray53);
        org.junit.Assert.assertEquals(objArray21, objArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray21, (java.lang.Object[]) executorServiceArray56);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoostingQueryBuilder();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields24, fields31);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests33.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain38;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 10, (java.lang.Object) ruleChain38);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        long[] longArray4 = new long[] { (-1L), 100, 6, 1L };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '#', (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { '#', ' ', ' ', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields24, fields31);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader6, fields24, fields35, true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        short[] shortArray7 = new short[] { (short) -1, (byte) -1, (byte) 100, (byte) 1, (short) -1, (byte) 0 };
        short[] shortArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray7, shortArray8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        org.junit.Assert.assertArrayEquals(objArray27, objArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray22, objArray27);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet(objArray50);
        org.junit.Assert.assertArrayEquals(objArray45, objArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray40, objArray45);
        org.junit.Assert.assertEquals(objArray27, objArray40);
        org.junit.Assert.assertEquals(objArray10, objArray27);
        org.junit.Assert.assertArrayEquals(objArray5, objArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", objArray1, objArray27);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain13;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests15.queryParser;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "enwiki.random.lines.txt");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests15.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields32, fields39);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests41.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues55, numericDocValues56);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        long[] longArray5 = new long[] { (byte) -1, 10, 10L, (short) 100, 0 };
        long[] longArray8 = new long[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1, (double) 10L);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        int[] intArray3 = new int[] { (short) 10, 4 };
        int[] intArray6 = new int[] { (-1), ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields31, fields38);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests40.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues52 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 10, numericDocValues52, numericDocValues53);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 10, 4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) bytesRef5, (java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        short[] shortArray4 = new short[] { (byte) 100, (short) -1, (short) 10, (byte) 10 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        char[] charArray4 = new char[] { 'a', ' ', ' ', 'a' };
        char[] charArray6 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray12 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests4 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet13 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray12, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests3.queryParser;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "enwiki.random.lines.txt");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields20, fields27);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests29.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) floatArray40);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum45, postingsEnum46);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader2, (int) (byte) 100, postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (short) 1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray1, intArray6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 10, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 10, (byte) 10, (short) 100 };
        short[] shortArray10 = new short[] { (byte) 100, (short) -1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray5, shortArray10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, 0.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) 3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        org.junit.Assert.assertArrayEquals(objArray9, objArray14);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet32 = org.apache.lucene.util.LuceneTestCase.asSet(objArray31);
        org.junit.Assert.assertArrayEquals(objArray26, objArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray21, objArray26);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objArray49);
        org.junit.Assert.assertArrayEquals(objArray44, objArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray39, objArray44);
        org.junit.Assert.assertEquals(objArray26, objArray39);
        org.junit.Assert.assertEquals(objArray9, objArray26);
        org.junit.Assert.assertArrayEquals(objArray4, objArray26);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet60 = org.apache.lucene.util.LuceneTestCase.asSet(objArray59);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet(objArray64);
        org.junit.Assert.assertArrayEquals(objArray59, objArray64);
        org.junit.Assert.assertEquals(objArray26, objArray64);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray68 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray69 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray70 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray71 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray72 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray68, elasticsearchTestCaseArray69, elasticsearchTestCaseArray70, elasticsearchTestCaseArray71 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet73 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", objArray64, (java.lang.Object[]) elasticsearchTestCaseArray72);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 6, (long) (byte) 10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        char[] charArray0 = null;
        char[] charArray2 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        org.junit.Assert.assertArrayEquals(objArray13, objArray18);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        org.junit.Assert.assertArrayEquals(objArray30, objArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray25, objArray30);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet(objArray43);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet(objArray48);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet(objArray53);
        org.junit.Assert.assertArrayEquals(objArray48, objArray53);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray43, objArray48);
        org.junit.Assert.assertEquals(objArray30, objArray43);
        org.junit.Assert.assertEquals(objArray13, objArray30);
        org.junit.Assert.assertArrayEquals(objArray8, objArray30);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet(objArray63);
        java.lang.Object[] objArray68 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet69 = org.apache.lucene.util.LuceneTestCase.asSet(objArray68);
        org.junit.Assert.assertArrayEquals(objArray63, objArray68);
        org.junit.Assert.assertEquals(objArray30, objArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, objArray68);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain33;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) 100, (java.lang.Object) ruleChain33);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum3, postingsEnum4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) ' ');
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 0, 0.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("hi!", postingsEnum8, postingsEnum9, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests12.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "hi!", (java.lang.Object) 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        byte[] byteArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray5, byteArray6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain13;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests15.queryParser;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "enwiki.random.lines.txt");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests15.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields32, fields39);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests41.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain46, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray5 = new short[] { (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray2, shortArray5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet6 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 5, (java.lang.Object) testRuleIgnoreAfterMaxFailuresSet6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        long[] longArray4 = new long[] { (byte) 0, '4', 'a' };
        long[] longArray9 = new long[] { 100, 1, (-1L), 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) '4');
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) (byte) -1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        long[] longArray2 = new long[] { 4, (byte) -1 };
        long[] longArray7 = new long[] { (short) 0, 10L, 10, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        short[] shortArray4 = new short[] { (short) 10, (short) 0, (byte) 10, (byte) 0 };
        short[] shortArray10 = new short[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 0, (double) (-1L));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        char[] charArray0 = new char[] {};
        char[] charArray2 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, 0.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, (-1), postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (-1.0d), (double) (short) 100, (double) 'a');
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ' ', (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10, 0.0d, (double) 5);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (-1.0f));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryBuilder();
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        double[] doubleArray1 = null;
        double[] doubleArray3 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray1, doubleArray3, (double) 5);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        int[] intArray1 = new int[] { 5 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) indexQueryParserService3);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader28, 10, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests1.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { 100, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "");
        java.lang.Class<?> wildcardClass11 = fields10.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields29, fields36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("hi!", indexReader39, 10, postingsEnum41, postingsEnum42);
        java.lang.Class<?> wildcardClass44 = simpleIndexQueryParserTests12.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests45.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests45.queryParser;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests45.assertTermsEquals("europarl.lines.txt.gz", indexReader50, terms51, terms52, true);
        java.lang.Class<?> wildcardClass55 = simpleIndexQueryParserTests45.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef58 = simpleIndexQueryParserTests56.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests56.queryParser;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        simpleIndexQueryParserTests56.assertTermsEquals("europarl.lines.txt.gz", indexReader61, terms62, terms63, true);
        java.lang.Class<?> wildcardClass66 = simpleIndexQueryParserTests56.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef69 = simpleIndexQueryParserTests67.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService70 = simpleIndexQueryParserTests67.queryParser;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        simpleIndexQueryParserTests67.assertTermsEquals("europarl.lines.txt.gz", indexReader72, terms73, terms74, true);
        java.lang.Class<?> wildcardClass77 = simpleIndexQueryParserTests67.getClass();
        java.lang.reflect.Type[] typeArray78 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass44, wildcardClass55, wildcardClass66, wildcardClass77 };
        java.util.List<java.lang.reflect.Type> typeList79 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, typeArray78);
        java.lang.Object[] objArray83 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet84 = org.apache.lucene.util.LuceneTestCase.asSet(objArray83);
        java.lang.Object[] objArray88 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet89 = org.apache.lucene.util.LuceneTestCase.asSet(objArray88);
        org.junit.Assert.assertArrayEquals(objArray83, objArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) typeArray78, objArray88);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] {};
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) 1L);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray8, 0.0f);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray15, 0.0f);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray2, floatArray15, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) (byte) 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 10 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray3, byteArray10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        double[] doubleArray6 = new double[] { 4, '4', 5, 10.0f, 10.0f };
        double[] doubleArray9 = new double[] { (-1L), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray6, doubleArray9, 100.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests5.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray13 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests5 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet14 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        org.junit.Assert.assertArrayEquals(objArray18, objArray23);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        org.junit.Assert.assertArrayEquals(objArray35, objArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray30, objArray35);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet(objArray48);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet(objArray53);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet(objArray58);
        org.junit.Assert.assertArrayEquals(objArray53, objArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray48, objArray53);
        org.junit.Assert.assertEquals(objArray35, objArray48);
        org.junit.Assert.assertEquals(objArray18, objArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) elasticsearchSingleNodeTestArray13, objArray35);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        int[] intArray4 = new int[] { (byte) 1, 10, 4, 2 };
        int[] intArray10 = new int[] { 10, 100, (-1), 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("<unknown>", indexReader7, (int) (byte) 10, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (-1.0d), 0.0d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        short[] shortArray4 = new short[] { (short) 1, (short) 0, (byte) 1, (byte) 100 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "");
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray6 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray7 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray8 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray9 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray10 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray6, elasticsearchTestCaseArray7, elasticsearchTestCaseArray8, elasticsearchTestCaseArray9 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray3, (java.lang.Object[]) elasticsearchTestCaseArray10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        char[] charArray6 = new char[] { '4', ' ', '4', ' ', ' ', ' ' };
        char[] charArray8 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        int[] intArray5 = new int[] { (short) 0, (byte) 10, 6, 100 };
        int[] intArray8 = new int[] { 100, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray5, intArray8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.weekly");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "node_s_0");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        org.junit.Assert.assertArrayEquals(objArray4, objArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", objArray9, (java.lang.Object[]) executorServiceArray12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.junit.rules.TestRule testRule26 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), 100.0d, (double) 100.0f);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet(objArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray33 = (java.lang.Iterable<java.lang.Object>[]) iterableArray32;
        objIterableArray33[0] = objSet5;
        objIterableArray33[1] = objSet10;
        objIterableArray33[2] = objSet15;
        objIterableArray33[3] = objSet20;
        objIterableArray33[4] = objSet25;
        objIterableArray33[5] = objSet30;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray33);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.weekly");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) objIterableArray33, (java.lang.Object[]) strArray47);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray5, objArray10);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        org.junit.Assert.assertArrayEquals(objArray28, objArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray23, objArray28);
        org.junit.Assert.assertEquals(objArray10, objArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray10, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 10L, 0.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 2, (long) 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) bytesRef31, (java.lang.Object) 3);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        int[] intArray5 = new int[] { 1, (short) 100, 2, 'a', ' ' };
        int[] intArray9 = new int[] { (byte) 100, 3, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1), (double) 'a', 0.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        java.lang.Object obj4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, obj4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.slow", indexReader17, 100, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests24.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests24.queryParser;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests24.assertTermsEquals("europarl.lines.txt.gz", indexReader29, terms30, terms31, true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "enwiki.random.lines.txt");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields41, fields48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests50.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests53.failureAndSuccessEvents;
        simpleIndexQueryParserTests50.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain55;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) ruleChain55);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray2, charArray3);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        char[] charArray2 = new char[] { '#', '4' };
        char[] charArray9 = new char[] { ' ', 'a', 'a', '4', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.Class<?> wildcardClass6 = testRule5.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) testRule5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10.0f, (double) (-1L), (double) 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        char[] charArray5 = new char[] { '4', '4', ' ', ' ', '#' };
        char[] charArray12 = new char[] { 'a', ' ', '4', 'a', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        org.junit.Assert.assertArrayEquals(objArray9, objArray14);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet32 = org.apache.lucene.util.LuceneTestCase.asSet(objArray31);
        org.junit.Assert.assertArrayEquals(objArray26, objArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray21, objArray26);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objArray49);
        org.junit.Assert.assertArrayEquals(objArray44, objArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray39, objArray44);
        org.junit.Assert.assertEquals(objArray26, objArray39);
        org.junit.Assert.assertEquals(objArray9, objArray26);
        org.junit.Assert.assertArrayEquals(objArray4, objArray26);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet60 = org.apache.lucene.util.LuceneTestCase.asSet(objArray59);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet(objArray64);
        org.junit.Assert.assertArrayEquals(objArray59, objArray64);
        org.junit.Assert.assertEquals(objArray26, objArray64);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray64, (java.lang.Object[]) strArray68);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("node_s_0", false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus9 = simpleIndexQueryParserTests0.ensureGreen(strArray4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 2, (double) 10L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { 3, (short) 0, '4', (byte) 1, 100, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        org.junit.Assert.assertArrayEquals(objArray9, objArray14);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray4, objArray9);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        org.junit.Assert.assertArrayEquals(objArray27, objArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray22, objArray27);
        org.junit.Assert.assertEquals(objArray9, objArray22);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray22, (java.lang.Object[]) strArray41);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10.0d, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray3, (double) ' ');
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests5.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests5.setqueryParser(indexQueryParserService13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests17.assertDocsSkippingEquals("tests.awaitsfix", indexReader20, 5, postingsEnum22, postingsEnum23, false);
        java.lang.Object[] objArray26 = new java.lang.Object[] { objArray3, indexQueryParserService13, (-1.0f), '4', false };
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray26, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        long[] longArray7 = new long[] { 100L, 0, ' ', (-1L), (short) 100, '4' };
        long[] longArray9 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray7, longArray9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests18.queryParser;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("europarl.lines.txt.gz", indexReader23, terms24, terms25, true);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "enwiki.random.lines.txt");
        java.lang.String[] strArray40 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests18.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields35, fields42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests44.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = null;
        simpleIndexQueryParserTests16.setqueryParser(indexQueryParserService54);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader57, (int) '#', postingsEnum59, postingsEnum60);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService62;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService64 = simpleIndexQueryParserTests16.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray65 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests11, simpleIndexQueryParserTests16 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet66 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) indexQueryParserService10, (java.lang.Object) elasticsearchSingleNodeTestSet66);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 10, (double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.weekly");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "node_s_0");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) fields30);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 10 };
        byte[] byteArray4 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray4);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        short[] shortArray2 = new short[] { (short) 1, (short) -1 };
        short[] shortArray4 = new short[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        long[] longArray3 = new long[] { (short) 1, 3 };
        long[] longArray10 = new long[] { (short) 10, (short) 10, 2, 6, 10L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray3, longArray10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray12 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests4 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet13 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray12);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray14 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray15 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray16 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray17 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray18 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray14, elasticsearchTestCaseArray15, elasticsearchTestCaseArray16, elasticsearchTestCaseArray17 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray12, (java.lang.Object[]) elasticsearchTestCaseArray18);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.slow", indexReader17, 100, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests24.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests24.queryParser;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests24.assertTermsEquals("europarl.lines.txt.gz", indexReader29, terms30, terms31, true);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "enwiki.random.lines.txt");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields41, fields48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests50.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests53.failureAndSuccessEvents;
        simpleIndexQueryParserTests50.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain55;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) ruleChain55);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        double[] doubleArray7 = new double[] { (byte) 10, 10.0f, 10L, 'a', (byte) 0, 2 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray7, doubleArray8, (double) (byte) 1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        long[] longArray3 = new long[] { 1, '4' };
        long[] longArray7 = new long[] { 0L, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray3, longArray7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader37, (int) (byte) 10, postingsEnum39, postingsEnum40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objArray8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        double[] doubleArray4 = new double[] { 100, '#', 10, 6 };
        double[] doubleArray7 = new double[] { 5, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) '4');
    }
}

