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
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) "");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L, "", (byte) 100, 0.0d, '4' };
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100, (-1), (-1L), (short) -1, (-1) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals(objArray5, objArray11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 1L);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        char[] charArray3 = new char[] { ' ', ' ', 'a' };
        char[] charArray6 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        float[] floatArray6 = new float[] { 1L, 100.0f, ' ', (short) -1, (short) -1, 'a' };
        float[] floatArray7 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (byte) -1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        double[] doubleArray6 = new double[] { 'a', (short) 0, '4', 0L, 1L, 0L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 100, (java.lang.Object) 1L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttling0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '#', (java.lang.Object) 'a');
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) 100);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = ruleChain1.around((org.junit.rules.TestRule) ruleChain2);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain3, (java.lang.Object) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) '#', (java.lang.Object) 100.0f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 0, (long) (byte) 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 0, (java.lang.Object) throttling1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) 1.0f, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        float[] floatArray0 = new float[] {};
        float[] floatArray6 = new float[] { (-1), 10.0f, 10L, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray6, (float) 100L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        float[] floatArray1 = new float[] { 100 };
        float[] floatArray6 = new float[] { (short) 100, '#', 100.0f, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray6, (float) 'a');
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (byte) 1, (java.lang.Object) 100);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) 10L, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        char[] charArray6 = new char[] { ' ', '#', '#', 'a', '#', ' ' };
        char[] charArray9 = new char[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = ruleChain1.around((org.junit.rules.TestRule) ruleChain2);
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain1.around((org.junit.rules.TestRule) ruleChain4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) ruleChain4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) 100, (double) 0.0f);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, (short) 100, (short) 0, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        char[] charArray2 = new char[] { '#' };
        char[] charArray7 = new char[] { '4', 'a', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) testRule2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain5.around((org.junit.rules.TestRule) ruleChain6);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain5;
        java.lang.Class<?> wildcardClass9 = kuromojiAnalysisTests2.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.ensureCleanedUp();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d), wildcardClass9, obj10, 10.0d, kuromojiAnalysisTests12 };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.lang.String str17 = kuromojiAnalysisTests16.getTestName();
        java.lang.Object[] objArray21 = new java.lang.Object[] { false, str17, "tests.weekly", 1L, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.badapples", objArray14, objArray21);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        double[] doubleArray6 = new double[] { 1L, ' ', 100.0f, (-1.0f), 0.0d };
        double[] doubleArray9 = new double[] { (-1L), 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        short[] shortArray4 = new short[] { (byte) 1, (short) 100, (short) -1 };
        short[] shortArray10 = new short[] { (byte) 0, (byte) -1, (short) 1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray4, shortArray10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) throttling1, (java.lang.Object) ' ');
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = ruleChain2.around((org.junit.rules.TestRule) ruleChain3);
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain2.around((org.junit.rules.TestRule) ruleChain5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (byte) 100, (java.lang.Object) ruleChain2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        int[] intArray3 = new int[] { 'a', (byte) 1 };
        int[] intArray6 = new int[] { (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", intArray3, intArray6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        int[] intArray4 = new int[] { (byte) 0, (short) -1, 'a' };
        int[] intArray9 = new int[] { (short) 1, 'a', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray4, intArray9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1, 0.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        float[] floatArray1 = null;
        float[] floatArray3 = new float[] { (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray3, (float) (byte) 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 'a');
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 1, 1L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 1, (double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (short) 10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) ' ', 0.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = ruleChain2.around((org.junit.rules.TestRule) ruleChain3);
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain2.around((org.junit.rules.TestRule) ruleChain5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] objArray9 = new java.lang.Object[] { testRule0, true, ruleChain6, 100.0d, obj8 };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests11.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.nightly", indexReader15, (-1), postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsEnumEquals("tests.awaitsfix", postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("<unknown>", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30);
        kuromojiAnalysisTests11.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain35 = ruleChain33.around((org.junit.rules.TestRule) ruleChain34);
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain37 = ruleChain33.around((org.junit.rules.TestRule) ruleChain36);
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain39 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain40 = ruleChain38.around((org.junit.rules.TestRule) ruleChain39);
        java.lang.Object[] objArray41 = new java.lang.Object[] { "tests.weekly", kuromojiAnalysisTests11, ruleChain33, ruleChain38 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray9, objArray41);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray5, byteArray12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (byte) 10, (float) 'a', 0.0f);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", obj1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 0.0f, (float) (short) 10, (float) 0L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.ensureCleanedUp();
        kuromojiAnalysisTests9.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = ruleChain12.around((org.junit.rules.TestRule) ruleChain13);
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain12;
        kuromojiAnalysisTests9.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader18, (int) 'a', postingsEnum20, postingsEnum21);
        java.lang.Object[] objArray23 = new java.lang.Object[] { kuromojiAnalysisTests0, 1.0f, 'a' };
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray23, objArray24);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (-1), (java.lang.Object) false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        short[] shortArray5 = new short[] { (short) 10, (short) 0, (byte) -1, (byte) 100, (byte) 100 };
        short[] shortArray9 = new short[] { (short) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray2 = new byte[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader9, terms10, terms11, false);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", (int) (short) 0, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 100, (double) 10L);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100L, (float) (short) 0, (float) 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        double[] doubleArray5 = new double[] { (short) 10, '#', (-1), 0L, (short) 100 };
        double[] doubleArray12 = new double[] { (short) -1, 1.0f, (-1.0f), (byte) 1, (-1L), 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray12, (-1.0d));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        char[] charArray3 = new char[] { '4', 'a', ' ' };
        char[] charArray10 = new char[] { 'a', ' ', '#', 'a', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 'a', 10.0f, (float) (-1L));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        double[] doubleArray2 = new double[] { (short) 10 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray2, doubleArray3, (-1.0d));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        short[] shortArray4 = new short[] { (short) -1, (short) 100, (byte) 1 };
        short[] shortArray10 = new short[] { (short) -1, (byte) 1, (short) 0, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (short) 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests3.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8);
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) -1, throttling2, kuromojiAnalysisTests3 };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("tests.slow", indexReader14, (int) (short) 100, postingsEnum16, postingsEnum17);
        kuromojiAnalysisTests12.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain22 = ruleChain20.around((org.junit.rules.TestRule) ruleChain21);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy23 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        java.lang.Object[] objArray24 = new java.lang.Object[] { kuromojiAnalysisTests12, ruleChain22, queryCachingPolicy23 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.monster", objArray11, objArray24);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        java.lang.Object[] objArray2 = new java.lang.Object[] { ruleChain0, ruleChain1 };
        float[] floatArray4 = new float[] { 10L };
        float[] floatArray6 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) (byte) 10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests9.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests9.assertDocsSkippingEquals("tests.nightly", indexReader13, (-1), postingsEnum15, postingsEnum16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests9.assertDocsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21, true);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("<unknown>", indexReader25, (int) (short) 10, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests9.ensureCheckIndexPassed();
        kuromojiAnalysisTests9.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests9.setUp();
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain37 = ruleChain35.around((org.junit.rules.TestRule) ruleChain36);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain37, (java.lang.Object) '#');
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain37;
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = ruleChain41.around((org.junit.rules.TestRule) ruleChain42);
        org.junit.rules.RuleChain ruleChain44 = ruleChain37.around((org.junit.rules.TestRule) ruleChain43);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests45 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests45.ensureCleanedUp();
        org.junit.rules.TestRule testRule47 = kuromojiAnalysisTests45.ruleChain;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests45.assertDocsSkippingEquals("tests.nightly", indexReader49, (-1), postingsEnum51, postingsEnum52, false);
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        kuromojiAnalysisTests45.assertDocsEnumEquals("tests.awaitsfix", postingsEnum56, postingsEnum57, true);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests45.assertPositionsSkippingEquals("<unknown>", indexReader61, (int) (short) 10, postingsEnum63, postingsEnum64);
        kuromojiAnalysisTests45.ensureCheckIndexPassed();
        kuromojiAnalysisTests45.assertPathHasBeenCleared("hi!");
        java.lang.Object[] objArray69 = new java.lang.Object[] { (byte) 10, ruleChain37, kuromojiAnalysisTests45 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray2, objArray69);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        java.lang.Object[] objArray3 = new java.lang.Object[] { "tests.badapples", "europarl.lines.txt.gz" };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.ensureCleanedUp();
        org.junit.rules.TestRule testRule6 = kuromojiAnalysisTests4.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain9 = ruleChain7.around((org.junit.rules.TestRule) ruleChain8);
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = ruleChain7.around((org.junit.rules.TestRule) ruleChain10);
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain11;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.ensureCleanedUp();
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests13.ruleChain;
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain18 = ruleChain16.around((org.junit.rules.TestRule) ruleChain17);
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain20 = ruleChain16.around((org.junit.rules.TestRule) ruleChain19);
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain20;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests22.ensureCheckIndexPassed();
        java.lang.Object[] objArray27 = new java.lang.Object[] { ruleChain11, ruleChain20, kuromojiAnalysisTests22 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", objArray3, objArray27);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        long[] longArray6 = new long[] { (short) 1, 1, (-1L), (byte) -1, ' ' };
        long[] longArray13 = new long[] { (byte) 1, (-1), (byte) 0, 10L, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', 100L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.slow", postingsEnum9, postingsEnum10, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        double[] doubleArray3 = new double[] { (short) 10, (byte) 100, (byte) -1 };
        double[] doubleArray8 = new double[] { (byte) 10, (byte) 0, 100L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        short[] shortArray0 = new short[] {};
        short[] shortArray4 = new short[] { (byte) 10, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] { (byte) 0, (short) -1, (byte) 10, (byte) 100, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain5.around((org.junit.rules.TestRule) ruleChain6);
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain9 = ruleChain5.around((org.junit.rules.TestRule) ruleChain8);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain9;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) "hi!", (java.lang.Object) ruleChain9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        long[] longArray3 = new long[] { (byte) 10, ' ' };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray3, longArray4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 100.0f, (double) 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = ruleChain1.around((org.junit.rules.TestRule) ruleChain2);
        org.junit.runners.model.Statement statement4 = null;
        org.junit.runner.Description description5 = null;
        org.junit.runners.model.Statement statement6 = ruleChain1.apply(statement4, description5);
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 10, (double) 0L, 1.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = ruleChain26.around((org.junit.rules.TestRule) ruleChain27);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain28, (java.lang.Object) '#');
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        int[] intArray4 = new int[] { (byte) 10, 10, 1, (short) 1 };
        int[] intArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", 10.0d, (double) (byte) 1, (double) 10L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        short[] shortArray3 = new short[] { (short) 100, (short) -1, (byte) 100 };
        short[] shortArray10 = new short[] { (short) 0, (short) 10, (short) 0, (short) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, 0L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        float[] floatArray2 = new float[] { 10L };
        float[] floatArray4 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (float) (byte) 10);
        float[] floatArray8 = new float[] { 10L };
        float[] floatArray10 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray10, (float) 100);
        float[] floatArray16 = new float[] { 10L };
        float[] floatArray18 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray18, (float) (byte) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray2, floatArray18, (float) (-1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        float[] floatArray1 = new float[] { 10L };
        float[] floatArray3 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) (byte) 10);
        float[] floatArray6 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray6, (float) (short) 100);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) 'a');
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        char[] charArray6 = new char[] { 'a', 'a', '#', '4', '4' };
        char[] charArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray6, charArray7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray6 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests4 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray6);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) luceneTestCaseArray6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader6, (-1), postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests2.assertTermsEquals("hi!", indexReader18, terms19, terms20, true);
        java.lang.Object[] objArray23 = new java.lang.Object[] { kuromojiAnalysisTests0, indexReader18 };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests25.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray27 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests25 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList28 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray23, (java.lang.Object[]) luceneTestCaseArray27);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        long[] longArray1 = null;
        long[] longArray3 = new long[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        short[] shortArray2 = new short[] { (short) 1, (byte) 10 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        float[] floatArray3 = new float[] { 100L, (byte) 1 };
        float[] floatArray5 = new float[] { 10L };
        float[] floatArray7 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray7, (float) (byte) 10);
        float[] floatArray11 = new float[] { 10L };
        float[] floatArray13 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray13, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray13, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray3, floatArray13, (float) (byte) -1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) '#');
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) '#', 1.0f, (float) (-1));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) 'a');
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, 10.0f, (float) (-1L));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        short[] shortArray6 = new short[] { (short) 0, (short) 0, (short) 10, (short) 100, (short) 0 };
        short[] shortArray8 = new short[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        float[] floatArray1 = new float[] { 10L };
        float[] floatArray3 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) (byte) 10);
        float[] floatArray7 = new float[] { 10L };
        float[] floatArray9 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray9, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray9, (float) 100);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray17 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests15 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList18 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray1, (java.lang.Object) luceneTestCaseList18);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader5, (-1), postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests1.setUp();
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain29 = ruleChain27.around((org.junit.rules.TestRule) ruleChain28);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain29, (java.lang.Object) '#');
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) ruleChain29, (java.lang.Object) 10.0d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray3 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests1 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests6 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests6.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray8 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests6 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray8);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) luceneTestCaseArray3, (java.lang.Object[]) luceneTestCaseArray8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        long[] longArray6 = new long[] { '#', (-1L), (byte) 100, (byte) 1, 0, ' ' };
        long[] longArray8 = new long[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) -1, (long) (byte) 100);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader16, terms17, terms18, true);
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", 1, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        long[] longArray5 = new long[] { 100L, 1L, 10L, (byte) 100 };
        long[] longArray12 = new long[] { (short) 100, (short) -1, (byte) 1, (-1), 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray5, longArray12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        float[] floatArray4 = new float[] { 'a', (byte) -1, 100L, (byte) 0 };
        float[] floatArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) 1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        char[] charArray1 = new char[] {};
        char[] charArray8 = new char[] { '#', '4', 'a', '#', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray1, charArray8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader6, (-1), postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain20 = ruleChain18.around((org.junit.rules.TestRule) ruleChain19);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) ruleChain18);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) '#', postingsEnum25, postingsEnum26);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests28.ensureCleanedUp();
        org.junit.rules.TestRule testRule30 = kuromojiAnalysisTests28.ruleChain;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests28.assertDocsSkippingEquals("tests.nightly", indexReader32, (-1), postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests28.assertDocsEnumEquals("tests.awaitsfix", postingsEnum39, postingsEnum40, true);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests28.assertPositionsSkippingEquals("<unknown>", indexReader44, (int) (short) 10, postingsEnum46, postingsEnum47);
        kuromojiAnalysisTests28.ensureCheckIndexPassed();
        kuromojiAnalysisTests28.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests28.setUp();
        org.junit.rules.RuleChain ruleChain54 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain55 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain56 = ruleChain54.around((org.junit.rules.TestRule) ruleChain55);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain56, (java.lang.Object) '#');
        kuromojiAnalysisTests28.failureAndSuccessEvents = ruleChain56;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain56;
        java.lang.Object[] objArray61 = new java.lang.Object[] { kuromojiAnalysisTests0, kuromojiAnalysisTests2, ruleChain56 };
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests63 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests63.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray65 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests63 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList66 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray61, (java.lang.Object[]) luceneTestCaseArray65);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        double[] doubleArray7 = new double[] { (short) 1, 0.0f, 'a', 10.0f, 1, 1 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray7, doubleArray8, (double) ' ');
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader9, (int) (byte) 1, postingsEnum11, postingsEnum12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray3 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests1 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray3);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        java.util.Set<java.lang.Class<?>> wildcardClassSet8 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) luceneTestCaseArray3, (java.lang.Object[]) wildcardClassArray7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) throttling1, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 10, (-1L));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        short[] shortArray4 = new short[] { (short) -1, (byte) -1, (byte) 100, (short) -1 };
        short[] shortArray6 = new short[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests9.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = ruleChain12.around((org.junit.rules.TestRule) ruleChain13);
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = ruleChain12.around((org.junit.rules.TestRule) ruleChain15);
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain16;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain16, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.ensureCleanedUp();
        kuromojiAnalysisTests21.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain25 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain26 = ruleChain24.around((org.junit.rules.TestRule) ruleChain25);
        kuromojiAnalysisTests21.failureAndSuccessEvents = ruleChain24;
        kuromojiAnalysisTests21.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        kuromojiAnalysisTests21.assertDocsEnumEquals("tests.slow", postingsEnum30, postingsEnum31, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) ruleChain16, (java.lang.Object) true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        char[] charArray0 = new char[] {};
        char[] charArray4 = new char[] { '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        short[] shortArray11 = new short[] { (short) -1, (short) 0, (short) -1, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray5, shortArray11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray5, byteArray9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = ruleChain0.around((org.junit.rules.TestRule) ruleChain1);
        org.junit.runners.model.Statement statement3 = null;
        org.junit.runner.Description description4 = null;
        org.junit.runners.model.Statement statement5 = ruleChain0.apply(statement3, description4);
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.ensureCleanedUp();
        kuromojiAnalysisTests7.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = ruleChain10.around((org.junit.rules.TestRule) ruleChain11);
        kuromojiAnalysisTests7.failureAndSuccessEvents = ruleChain10;
        kuromojiAnalysisTests7.resetCheckIndexStatus();
        kuromojiAnalysisTests7.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain0, (java.lang.Object) kuromojiAnalysisTests7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.setUp();
        kuromojiAnalysisTests5.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        kuromojiAnalysisTests8.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = ruleChain11.around((org.junit.rules.TestRule) ruleChain12);
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain11;
        kuromojiAnalysisTests8.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests8.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader17, (int) 'a', postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain25 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain26 = ruleChain24.around((org.junit.rules.TestRule) ruleChain25);
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = ruleChain24.around((org.junit.rules.TestRule) ruleChain27);
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0.0d, kuromojiAnalysisTests5, kuromojiAnalysisTests8, throttling23, ruleChain27 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, objArray29);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.junit.rules.TestRule testRule10 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum6, (java.lang.Object) testRule10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray2 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet3 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, (java.lang.Object[]) eSTestCaseArray2);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, (short) -1, (short) -1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) '#', (long) 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { (short) 1, 100L, 100, 'a', 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray1, longArray3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { 10, 1.0d, 10.0d, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray1, doubleArray6, (double) 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 'a', 10.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        double[] doubleArray7 = new double[] { (short) 0, 0.0f, (-1.0f), (-1.0f), 1, 100.0f };
        double[] doubleArray14 = new double[] { 10.0d, 0L, 100.0f, 100.0d, (byte) 100, 100L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray7, doubleArray14, (double) 0.0f);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        int[] intArray3 = new int[] { (byte) 10, (byte) 0 };
        int[] intArray7 = new int[] { (byte) 10, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = ruleChain1.around((org.junit.rules.TestRule) ruleChain2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain0, (java.lang.Object) ruleChain1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { 100, (short) -1, (short) 1, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        char[] charArray5 = new char[] { 'a', 'a', ' ', '#' };
        char[] charArray8 = new char[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray5, charArray8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        int[] intArray2 = new int[] { '4', (-1) };
        int[] intArray6 = new int[] { '#', (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 'a');
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.ensureCleanedUp();
        kuromojiAnalysisTests3.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = ruleChain6.around((org.junit.rules.TestRule) ruleChain7);
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain6;
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) 'a', postingsEnum14, postingsEnum15);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) "tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests18);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str3 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 10 };
        short[] shortArray8 = new short[] { (short) 100, (byte) -1, (short) 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader6, (-1), postingsEnum8, postingsEnum9, false);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) 0, (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues4 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", (int) '4', numericDocValues4, numericDocValues5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        char[] charArray2 = new char[] { '4', ' ' };
        char[] charArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { 'a', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        int[] intArray7 = new int[] { '#', 'a', (short) 10, 1, 0, 0 };
        int[] intArray10 = new int[] { (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray7, intArray10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (byte) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("hi!", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0f, (float) 100L, (float) (byte) 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.slow", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", obj1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) '#', (float) 'a', (float) (-1));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 0, (double) (short) -1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests0.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.ensureCleanedUp();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests12.ruleChain;
        org.junit.rules.TestRule testRule15 = kuromojiAnalysisTests12.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (byte) -1 };
        int[] intArray7 = new int[] { '4', (short) 100, 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        char[] charArray5 = new char[] { 'a', 'a', '4', 'a', '4' };
        char[] charArray10 = new char[] { '#', ' ', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 1, (float) (-1), (float) (short) 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (short) 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1L), (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 1.0d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttling2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.ensureCleanedUp();
        kuromojiAnalysisTests4.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain9 = ruleChain7.around((org.junit.rules.TestRule) ruleChain8);
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain7;
        kuromojiAnalysisTests4.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.ensureCleanedUp();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests12.ruleChain;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain17 = ruleChain15.around((org.junit.rules.TestRule) ruleChain16);
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = ruleChain15.around((org.junit.rules.TestRule) ruleChain18);
        kuromojiAnalysisTests12.failureAndSuccessEvents = ruleChain19;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain19, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain19;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) throttling2, (java.lang.Object) ruleChain19);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        char[] charArray3 = new char[] { ' ', ' ', ' ' };
        char[] charArray6 = new char[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain3.around((org.junit.rules.TestRule) ruleChain6);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain7;
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.weekly");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests11.ruleChain;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests11.assertDocsSkippingEquals("tests.nightly", indexReader15, (-1), postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests11.assertDocsEnumEquals("tests.awaitsfix", postingsEnum22, postingsEnum23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("<unknown>", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30);
        kuromojiAnalysisTests11.ensureCheckIndexPassed();
        kuromojiAnalysisTests11.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests11.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        short[] shortArray1 = new short[] {};
        short[] shortArray5 = new short[] { (short) -1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 100L, obj2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.maxfailures");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.util.Set<java.lang.Class<?>> wildcardClassSet3 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) wildcardClassArray2, (java.lang.Object[]) executorServiceArray6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 100L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        char[] charArray1 = new char[] {};
        char[] charArray3 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray1, charArray3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray12 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet13 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) eSTestCaseArray12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (float) (short) -1, (float) '#', (float) (short) -1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        int[] intArray4 = new int[] { (-1), 100, (short) 0 };
        int[] intArray7 = new int[] { (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] { (short) 0, (byte) 0, (short) 0, (short) 10, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        long[] longArray6 = new long[] { (byte) 10, (short) 1, (byte) 10, (-1), 100L };
        long[] longArray13 = new long[] { (-1), '#', 1L, 10L, 5, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        double[] doubleArray3 = new double[] { 100L, (byte) 100, '#' };
        double[] doubleArray7 = new double[] { 1.0f, 100.0f, 10.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) 3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = ruleChain11.around((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = ruleChain11.around((org.junit.rules.TestRule) ruleChain14);
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain15;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain15, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.maxfailures", indexReader21, fields22, fields23, true);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader9, (int) (byte) 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", (int) (byte) 1, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests9.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = ruleChain12.around((org.junit.rules.TestRule) ruleChain13);
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = ruleChain12.around((org.junit.rules.TestRule) ruleChain15);
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain16;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain16;
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "random");
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("enwiki.random.lines.txt", 10, numericDocValues23, numericDocValues24);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain3 = ruleChain1.around((org.junit.rules.TestRule) ruleChain2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests4 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests4.ensureCleanedUp();
        org.junit.rules.TestRule testRule6 = kuromojiAnalysisTests4.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests4.assertDocsSkippingEquals("tests.nightly", indexReader8, (-1), postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests4.assertDocsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests4.assertPositionsSkippingEquals("<unknown>", indexReader20, (int) (short) 10, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests4.ensureCheckIndexPassed();
        kuromojiAnalysisTests4.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests4.setUp();
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain32 = ruleChain30.around((org.junit.rules.TestRule) ruleChain31);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain32, (java.lang.Object) '#');
        kuromojiAnalysisTests4.failureAndSuccessEvents = ruleChain32;
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain38 = ruleChain36.around((org.junit.rules.TestRule) ruleChain37);
        org.junit.rules.RuleChain ruleChain39 = ruleChain32.around((org.junit.rules.TestRule) ruleChain38);
        org.junit.rules.RuleChain ruleChain40 = ruleChain3.around((org.junit.rules.TestRule) ruleChain39);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) ruleChain40, (java.lang.Object) throttling41);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 100, (long) (byte) 100);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        double[] doubleArray4 = new double[] { '#', 0, 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray4, doubleArray5, 10.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain5.around((org.junit.rules.TestRule) ruleChain6);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) (byte) 100, (java.lang.Object) ruleChain5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        char[] charArray6 = new char[] { ' ', '4', '4', '#', ' ', ' ' };
        char[] charArray8 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        int[] intArray6 = new int[] { (short) 10, (byte) -1, 3, (byte) 1, 6, ' ' };
        int[] intArray13 = new int[] { 100, (byte) 100, (-1), (-1), 10, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        long[] longArray3 = new long[] { '#', 'a', 4 };
        long[] longArray6 = new long[] { '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 6, (long) 1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { ' ', ' ', ' ', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', 1L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        short[] shortArray0 = new short[] {};
        short[] shortArray2 = new short[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain5.around((org.junit.rules.TestRule) ruleChain6);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain5;
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader11, (int) 'a', postingsEnum13, postingsEnum14);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.ensureCleanedUp();
        kuromojiAnalysisTests17.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain22 = ruleChain20.around((org.junit.rules.TestRule) ruleChain21);
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain20;
        kuromojiAnalysisTests17.resetCheckIndexStatus();
        kuromojiAnalysisTests17.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.ensureCleanedUp();
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests26.ruleChain;
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain31 = ruleChain29.around((org.junit.rules.TestRule) ruleChain30);
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain33 = ruleChain29.around((org.junit.rules.TestRule) ruleChain32);
        kuromojiAnalysisTests26.failureAndSuccessEvents = ruleChain33;
        kuromojiAnalysisTests17.failureAndSuccessEvents = ruleChain33;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain33;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.setUp();
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        kuromojiAnalysisTests38.tearDown();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests38, (java.lang.Object) (byte) 0);
        kuromojiAnalysisTests38.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain33, (java.lang.Object) kuromojiAnalysisTests38);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        int[] intArray4 = new int[] { 6, (short) 1, (-1), '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) 5, (float) 0L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '4');
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 100.0d, (double) (byte) 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        float[] floatArray1 = new float[] { 10L };
        float[] floatArray3 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) (byte) 10);
        float[] floatArray8 = new float[] { 10L };
        float[] floatArray10 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray10, (float) (byte) 10);
        float[] floatArray14 = new float[] { 10L };
        float[] floatArray16 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray16, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray16, (float) 100);
        float[] floatArray22 = new float[] { 10L };
        float[] floatArray24 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray24, (float) (byte) 10);
        float[] floatArray28 = new float[] { 10L };
        float[] floatArray30 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray30, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray30, (float) 100);
        float[] floatArray36 = new float[] { 10L };
        float[] floatArray38 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray38, (float) (byte) 10);
        float[] floatArray42 = new float[] { 10L };
        float[] floatArray44 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray44, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray44, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray44, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray16, floatArray30, 100.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray30, (float) 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 6, (float) (short) 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (long) (short) 1, (long) 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '#', '4', ' ' };
        char[] charArray8 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray7, charArray8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        float[] floatArray1 = new float[] { 10L };
        float[] floatArray3 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, (float) (byte) 10);
        float[] floatArray7 = new float[] { 10L };
        float[] floatArray9 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray9, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray9, (float) 100);
        float[] floatArray15 = new float[] { 10L };
        float[] floatArray17 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray17, (float) (byte) 10);
        float[] floatArray21 = new float[] { 10L };
        float[] floatArray23 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray23, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray23, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray23, (float) (byte) 1);
        float[] floatArray31 = new float[] { 10L };
        float[] floatArray33 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray33, (float) (byte) 10);
        float[] floatArray37 = new float[] { 10L };
        float[] floatArray39 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray39, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray39, (float) 100);
        float[] floatArray45 = new float[] { 10L };
        float[] floatArray47 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray47, (float) (byte) 10);
        float[] floatArray51 = new float[] { 10L };
        float[] floatArray53 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray53, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray53, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray53, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray53, (-1.0f));
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling62 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray53, (java.lang.Object) throttling62);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        short[] shortArray2 = new short[] { (short) -1, (short) -1 };
        short[] shortArray9 = new short[] { (byte) -1, (short) 0, (short) -1, (short) 10, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray6 = new double[] { 100L, 0, 6, 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) 'a');
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (-1L));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        char[] charArray5 = new char[] { ' ', '4', '4', 'a', '4' };
        char[] charArray11 = new char[] { 'a', '#', ' ', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 0.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) (-1), (double) (byte) -1, (double) 100L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        long[] longArray2 = new long[] { (byte) 0, 1 };
        long[] longArray8 = new long[] { '4', (byte) -1, 2, 10L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) 0.0f);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader5, (-1), postingsEnum7, postingsEnum8, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.ensureCleanedUp();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests15.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.nightly", indexReader19, (-1), postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests15.assertDocsEnumEquals("tests.awaitsfix", postingsEnum26, postingsEnum27, true);
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        int[] intArray6 = new int[] { 10, 3, (byte) 1, 'a', ' ' };
        int[] intArray12 = new int[] { (byte) 0, 100, ' ', (short) 10, '4' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray6, intArray12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain3.around((org.junit.rules.TestRule) ruleChain6);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain7;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) 100.0d);
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (short) 10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader4, terms5, terms6, true);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        java.lang.Object obj11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule10, obj11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        char[] charArray5 = new char[] { '#', '#', 'a', ' ' };
        char[] charArray6 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray5, charArray6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        long[] longArray5 = new long[] { 1L, (byte) 0, 10, 1L, '4' };
        long[] longArray12 = new long[] { (short) 100, 0L, (byte) -1, '#', (-1), 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("hi!", 6, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { 5 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.weekly", (int) 'a', numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        char[] charArray1 = new char[] { ' ' };
        char[] charArray5 = new char[] { '#', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1.0d, (double) (short) 100);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 10, (float) 100, (float) 0L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = ruleChain11.around((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = ruleChain11.around((org.junit.rules.TestRule) ruleChain14);
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain15;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain15, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        long[] longArray2 = new long[] { '#', (byte) 100 };
        long[] longArray6 = new long[] { 'a', (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        short[] shortArray5 = new short[] { (byte) 1, (short) 1, (short) -1, (short) -1 };
        short[] shortArray12 = new short[] { (short) 10, (short) 0, (short) 100, (short) 1, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray5, shortArray12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", 0.0d, (double) 2, (double) 10L);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, 0, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 1, (double) (-1.0f));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (float) 100L, (float) ' ', (float) (byte) 10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1L), 0.0f, (float) (byte) 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.slow", indexReader3, (int) (short) 100, postingsEnum5, postingsEnum6);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.badapples", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("<unknown>", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.ensureCleanedUp();
        kuromojiAnalysisTests27.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain32 = ruleChain30.around((org.junit.rules.TestRule) ruleChain31);
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain30;
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        kuromojiAnalysisTests27.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.ensureCleanedUp();
        org.junit.rules.TestRule testRule38 = kuromojiAnalysisTests36.ruleChain;
        org.junit.rules.RuleChain ruleChain39 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain40 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain41 = ruleChain39.around((org.junit.rules.TestRule) ruleChain40);
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = ruleChain39.around((org.junit.rules.TestRule) ruleChain42);
        kuromojiAnalysisTests36.failureAndSuccessEvents = ruleChain43;
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain43);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0.0f, 100.0f, (-1.0f));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        short[] shortArray1 = new short[] { (byte) -1 };
        short[] shortArray6 = new short[] { (byte) 100, (short) 1, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 'a', 10L);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("random", false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) '#', (long) (short) 0);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        int[] intArray5 = new int[] { 100, 2, (byte) -1, (short) 1, (short) 1 };
        int[] intArray10 = new int[] { (short) 100, (short) 10, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests11.ensureCleanedUp();
        org.junit.rules.TestRule testRule13 = kuromojiAnalysisTests11.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = ruleChain14.around((org.junit.rules.TestRule) ruleChain15);
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain18 = ruleChain14.around((org.junit.rules.TestRule) ruleChain17);
        kuromojiAnalysisTests11.failureAndSuccessEvents = ruleChain18;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray3 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests1 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray38);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) luceneTestCaseArray3, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) '#', (double) 4, 1.0d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray2);
        char[] charArray10 = new char[] { 'a', '4', 'a', '#', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (short) 100, (double) 2, (double) 2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        double[] doubleArray3 = new double[] { (short) 10, 100, (-1L) };
        double[] doubleArray7 = new double[] { '4', ' ', 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray7, (double) 5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("random", 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.tearDown();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = ruleChain5.around((org.junit.rules.TestRule) ruleChain6);
        org.junit.runners.model.Statement statement8 = null;
        org.junit.runner.Description description9 = null;
        org.junit.runners.model.Statement statement10 = ruleChain5.apply(statement8, description9);
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", (int) (short) 1, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        long[] longArray4 = new long[] { (short) -1, 10L, (-1L) };
        long[] longArray8 = new long[] { 3, 2, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 'a', (long) (short) 10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests23 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests23.ensureCleanedUp();
        org.junit.rules.TestRule testRule25 = kuromojiAnalysisTests23.ruleChain;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests23.assertDocsSkippingEquals("tests.nightly", indexReader27, (-1), postingsEnum29, postingsEnum30, false);
        kuromojiAnalysisTests23.ensureAllSearchContextsReleased();
        java.lang.String str34 = kuromojiAnalysisTests23.getTestName();
        kuromojiAnalysisTests23.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests23.restoreIndexWriterMaxDocs();
        java.lang.Object[] objArray38 = new java.lang.Object[] { fields18, (byte) 0, kuromojiAnalysisTests23 };
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray39 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet40 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray38, (java.lang.Object[]) eSTestCaseArray39);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        kuromojiAnalysisTests18.assertTermsEquals("tests.maxfailures", indexReader21, terms22, terms23, true);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests18.assertFieldsEquals("tests.slow", indexReader27, fields28, fields29, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) executorServiceArray11, (java.lang.Object) false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 3, (double) 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests9.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = ruleChain12.around((org.junit.rules.TestRule) ruleChain13);
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = ruleChain12.around((org.junit.rules.TestRule) ruleChain15);
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain16;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.slow", postingsEnum20, postingsEnum21, true);
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain25 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain26 = ruleChain24.around((org.junit.rules.TestRule) ruleChain25);
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain25);
        org.junit.rules.TestRule testRule28 = null;
        org.junit.rules.RuleChain ruleChain29 = ruleChain25.around(testRule28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum21, (java.lang.Object) ruleChain25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        short[] shortArray4 = new short[] { (byte) 100, (short) -1, (byte) 100, (byte) 10 };
        short[] shortArray8 = new short[] { (byte) 10, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        double[] doubleArray7 = new double[] { (byte) 10, 100L, 1.0d, (byte) 0, (-1.0d), (-1.0d) };
        double[] doubleArray9 = new double[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray7, doubleArray9, (double) 10L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        float[] floatArray3 = new float[] { (-1L), 6 };
        float[] floatArray5 = new float[] { 10L };
        float[] floatArray7 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray7, (float) (byte) 10);
        float[] floatArray11 = new float[] { 10L };
        float[] floatArray13 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray13, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray13, (float) 100);
        float[] floatArray19 = new float[] { 10L };
        float[] floatArray21 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) (byte) 10);
        float[] floatArray25 = new float[] { 10L };
        float[] floatArray27 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray27, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray27, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray27, (float) (byte) 1);
        float[] floatArray35 = new float[] { 10L };
        float[] floatArray37 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray37, (float) (byte) 10);
        float[] floatArray41 = new float[] { 10L };
        float[] floatArray43 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray43, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray43, (float) 100);
        float[] floatArray49 = new float[] { 10L };
        float[] floatArray51 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray51, (float) (byte) 10);
        float[] floatArray55 = new float[] { 10L };
        float[] floatArray57 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray57, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray57, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray57, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray57, (-1.0f));
        float[] floatArray67 = new float[] { 10L };
        float[] floatArray69 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray69, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray69, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray3, floatArray69, (float) (byte) 10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        float[] floatArray13 = new float[] { 10L };
        float[] floatArray15 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray15, (float) (byte) 10);
        float[] floatArray19 = new float[] { 10L };
        float[] floatArray21 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray21, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray21, (float) 100);
        float[] floatArray27 = new float[] { 10L };
        float[] floatArray29 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray29, (float) (byte) 10);
        float[] floatArray33 = new float[] { 10L };
        float[] floatArray35 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray35, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray35, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray35, (float) (byte) 1);
        float[] floatArray43 = new float[] { 10L };
        float[] floatArray45 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray45, (float) (byte) 10);
        float[] floatArray49 = new float[] { 10L };
        float[] floatArray51 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray51, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray51, (float) 100);
        float[] floatArray57 = new float[] { 10L };
        float[] floatArray59 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray59, (float) (byte) 10);
        float[] floatArray63 = new float[] { 10L };
        float[] floatArray65 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray65, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray65, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray65, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray65, (-1.0f));
        float[] floatArray75 = new float[] { 10L };
        float[] floatArray77 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray77, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray77, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (short) 100);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        double[] doubleArray4 = new double[] { 100L, (-1.0f), 4, 10L };
        double[] doubleArray11 = new double[] { 100.0d, '#', (byte) 100, (byte) 100, 4, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray11, (double) (short) 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, 1.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", obj1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, (float) 4, (float) 2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0.0d, (double) 1.0f);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        char[] charArray1 = new char[] { '4' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.ensureCleanedUp();
        kuromojiAnalysisTests5.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain10 = ruleChain8.around((org.junit.rules.TestRule) ruleChain9);
        kuromojiAnalysisTests5.failureAndSuccessEvents = ruleChain8;
        kuromojiAnalysisTests5.resetCheckIndexStatus();
        kuromojiAnalysisTests5.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests5.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        kuromojiAnalysisTests5.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) charArray2, (java.lang.Object) kuromojiAnalysisTests5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (byte) 0);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (short) 10, (double) '#', (double) 1L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        int[] intArray3 = new int[] { (byte) 100, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray3, intArray4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 4, (long) 1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        float[] floatArray6 = new float[] { 10L };
        float[] floatArray8 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) floatArray8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = ruleChain26.around((org.junit.rules.TestRule) ruleChain27);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain28, (java.lang.Object) '#');
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain34 = ruleChain32.around((org.junit.rules.TestRule) ruleChain33);
        org.junit.rules.RuleChain ruleChain35 = ruleChain28.around((org.junit.rules.TestRule) ruleChain34);
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain28);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray0 = new org.elasticsearch.test.ESTestCase[] {};
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet1 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray0);
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTestCaseArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray14 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests12 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray19 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests17 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray24 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests22 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray29 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests27 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray34 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests32 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList35 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests37.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray39 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests37 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray39);
        java.lang.Iterable[] iterableArray42 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[] luceneTestCaseIterableArray43 = (java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[]) iterableArray42;
        luceneTestCaseIterableArray43[0] = luceneTestCaseList15;
        luceneTestCaseIterableArray43[1] = luceneTestCaseList20;
        luceneTestCaseIterableArray43[2] = luceneTestCaseList25;
        luceneTestCaseIterableArray43[3] = luceneTestCaseList30;
        luceneTestCaseIterableArray43[4] = luceneTestCaseList35;
        luceneTestCaseIterableArray43[5] = luceneTestCaseList40;
        java.util.Set<java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>> luceneTestCaseIterableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseIterableArray43);
        org.junit.Assert.assertNotEquals((java.lang.Object) byteArray7, (java.lang.Object) luceneTestCaseIterableSet56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) executorServiceArray16);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = ruleChain11.around((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = ruleChain11.around((org.junit.rules.TestRule) ruleChain14);
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain15;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain15, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain15;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (byte) 10, (-1.0f), (float) (-1));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) (-1L), (float) (short) 1, (float) 1L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        long[] longArray4 = new long[] { 4, 'a', 'a', 6 };
        long[] longArray7 = new long[] { (short) 1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (-1.0d), (double) (-1L));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        long[] longArray3 = new long[] { 100L, 1 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray4);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader9, (int) 'a', postingsEnum11, postingsEnum12);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.junit.rules.TestRule testRule16 = kuromojiAnalysisTests14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.nightly", indexReader18, (-1), postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("<unknown>", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33);
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        kuromojiAnalysisTests14.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests14.setUp();
        org.junit.rules.RuleChain ruleChain40 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain42 = ruleChain40.around((org.junit.rules.TestRule) ruleChain41);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain42, (java.lang.Object) '#');
        kuromojiAnalysisTests14.failureAndSuccessEvents = ruleChain42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum12, (java.lang.Object) ruleChain42);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) 10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = ruleChain12.around((org.junit.rules.TestRule) ruleChain13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain14, (java.lang.Object) '#');
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray21 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests19 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList22 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain14, (java.lang.Object) luceneTestCaseArray21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        long[] longArray0 = new long[] {};
        long[] longArray2 = new long[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        double[] doubleArray7 = new double[] { 4, 6, 1.0f, (byte) 10, 5, 0L };
        double[] doubleArray11 = new double[] { (-1), 0, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray7, doubleArray11, (double) 3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1L), 100L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        char[] charArray2 = new char[] { 'a', ' ' };
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray7 = new short[] { (byte) 100, (byte) -1, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray2, shortArray7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray18);
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.lang.Object[] objArray27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, objArray27);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray36);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray36, (java.lang.Object) locale46);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (short) -1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 1, (long) '#');
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.ensureCleanedUp();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests10.ruleChain;
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = ruleChain13.around((org.junit.rules.TestRule) ruleChain14);
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain17 = ruleChain13.around((org.junit.rules.TestRule) ruleChain16);
        kuromojiAnalysisTests10.failureAndSuccessEvents = ruleChain17;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain21 = ruleChain17.around((org.junit.rules.TestRule) ruleChain20);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.lang.String str23 = kuromojiAnalysisTests22.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) ruleChain20, (java.lang.Object) str23);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (int) (byte) 0, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) '4', numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 0L, (double) (byte) 100);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        short[] shortArray2 = new short[] { (short) 1, (short) -1 };
        short[] shortArray4 = new short[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.ensureCleanedUp();
        kuromojiAnalysisTests15.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain20 = ruleChain18.around((org.junit.rules.TestRule) ruleChain19);
        kuromojiAnalysisTests15.failureAndSuccessEvents = ruleChain18;
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, (int) 'a', postingsEnum26, postingsEnum27);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests15);
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) testRule12, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        short[] shortArray4 = new short[] { (byte) 100, (short) 10, (byte) 100, (byte) 0 };
        short[] shortArray6 = new short[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.slow", indexReader17, fields18, fields19, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100L, 0L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = ruleChain26.around((org.junit.rules.TestRule) ruleChain27);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain28, (java.lang.Object) '#');
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray35 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests33 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray35);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray40 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests38 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList41 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests43 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests43.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray45 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests43 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList46 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray45);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray50 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests48 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray50);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests53.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray55 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests53 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList56 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests58.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray60 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests58 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray60);
        java.lang.Iterable[] iterableArray63 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[] luceneTestCaseIterableArray64 = (java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[]) iterableArray63;
        luceneTestCaseIterableArray64[0] = luceneTestCaseList36;
        luceneTestCaseIterableArray64[1] = luceneTestCaseList41;
        luceneTestCaseIterableArray64[2] = luceneTestCaseList46;
        luceneTestCaseIterableArray64[3] = luceneTestCaseList51;
        luceneTestCaseIterableArray64[4] = luceneTestCaseList56;
        luceneTestCaseIterableArray64[5] = luceneTestCaseList61;
        java.util.Set<java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>> luceneTestCaseIterableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseIterableArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) luceneTestCaseIterableArray64);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", 3, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0L, 10.0d, (double) 2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        short[] shortArray7 = new short[] { (byte) 100, (byte) 10, (short) 0, (short) -1, (byte) -1, (short) -1 };
        short[] shortArray10 = new short[] { (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray7, shortArray10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.slow", indexReader2, (int) (short) 100, postingsEnum4, postingsEnum5);
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.store.MockDirectoryWrapper.Throttling.SOMETIMES;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) throttling1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (short) 0, 0.0d, (double) 1L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) 0, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) '4');
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.ensureCleanedUp();
        kuromojiAnalysisTests7.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = ruleChain10.around((org.junit.rules.TestRule) ruleChain11);
        kuromojiAnalysisTests7.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        kuromojiAnalysisTests7.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (int) '#', postingsEnum17, postingsEnum18);
        org.junit.rules.TestRule testRule20 = kuromojiAnalysisTests7.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (byte) 100);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        long[] longArray6 = new long[] { '4', 'a', 1L, (-1), (byte) 0 };
        long[] longArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests9.ensureCleanedUp();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests9.ruleChain;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = ruleChain12.around((org.junit.rules.TestRule) ruleChain13);
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = ruleChain12.around((org.junit.rules.TestRule) ruleChain15);
        kuromojiAnalysisTests9.failureAndSuccessEvents = ruleChain16;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain16;
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain20 = ruleChain16.around((org.junit.rules.TestRule) ruleChain19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.ensureCleanedUp();
        org.junit.rules.TestRule testRule23 = kuromojiAnalysisTests21.ruleChain;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests21.assertDocsSkippingEquals("tests.nightly", indexReader25, (-1), postingsEnum27, postingsEnum28, false);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests21.assertDocsEnumEquals("tests.awaitsfix", postingsEnum32, postingsEnum33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        kuromojiAnalysisTests21.assertPositionsSkippingEquals("<unknown>", indexReader37, (int) (short) 10, postingsEnum39, postingsEnum40);
        kuromojiAnalysisTests21.ensureCheckIndexPassed();
        kuromojiAnalysisTests21.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests21.setUp();
        org.junit.rules.RuleChain ruleChain47 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain48 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain49 = ruleChain47.around((org.junit.rules.TestRule) ruleChain48);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain49, (java.lang.Object) '#');
        kuromojiAnalysisTests21.failureAndSuccessEvents = ruleChain49;
        org.junit.rules.RuleChain ruleChain53 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain54 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain55 = ruleChain53.around((org.junit.rules.TestRule) ruleChain54);
        org.junit.rules.RuleChain ruleChain56 = ruleChain49.around((org.junit.rules.TestRule) ruleChain55);
        org.junit.rules.RuleChain ruleChain57 = ruleChain20.around((org.junit.rules.TestRule) ruleChain56);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests58 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests58.ensureCleanedUp();
        org.junit.rules.TestRule testRule60 = kuromojiAnalysisTests58.ruleChain;
        org.junit.rules.RuleChain ruleChain61 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain62 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain63 = ruleChain61.around((org.junit.rules.TestRule) ruleChain62);
        org.junit.rules.RuleChain ruleChain64 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain65 = ruleChain61.around((org.junit.rules.TestRule) ruleChain64);
        kuromojiAnalysisTests58.failureAndSuccessEvents = ruleChain65;
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests58.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain56, (java.lang.Object) kuromojiAnalysisTests58);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 0, (float) 2, (float) (byte) 1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (short) -1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.lang.String str1 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8, true);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.ensureCleanedUp();
        kuromojiAnalysisTests12.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain17 = ruleChain15.around((org.junit.rules.TestRule) ruleChain16);
        kuromojiAnalysisTests12.failureAndSuccessEvents = ruleChain15;
        kuromojiAnalysisTests12.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.ensureCleanedUp();
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests20.ruleChain;
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain25 = ruleChain23.around((org.junit.rules.TestRule) ruleChain24);
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain27 = ruleChain23.around((org.junit.rules.TestRule) ruleChain26);
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain27;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain27, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests12.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("tests.maxfailures", indexReader33, fields34, fields35, true);
        kuromojiAnalysisTests12.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) objSet11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, 0.0d, (double) 2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.ensureCleanedUp();
        kuromojiAnalysisTests3.ensureCleanedUp();
        kuromojiAnalysisTests3.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests3.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) testRuleIgnoreAfterMaxFailures2, (java.lang.Object) kuromojiAnalysisTests3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray16 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests14 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList17 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray16);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests19 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests19.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray21 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests19 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList22 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray26 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests24 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray26);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray31 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests29 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList32 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray31);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests34 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests34.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray36 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests34 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList37 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray36);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray41 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests39 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray41);
        java.lang.Iterable[] iterableArray44 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[] luceneTestCaseIterableArray45 = (java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[]) iterableArray44;
        luceneTestCaseIterableArray45[0] = luceneTestCaseList17;
        luceneTestCaseIterableArray45[1] = luceneTestCaseList22;
        luceneTestCaseIterableArray45[2] = luceneTestCaseList27;
        luceneTestCaseIterableArray45[3] = luceneTestCaseList32;
        luceneTestCaseIterableArray45[4] = luceneTestCaseList37;
        luceneTestCaseIterableArray45[5] = luceneTestCaseList42;
        java.util.Set<java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>> luceneTestCaseIterableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseIterableArray45);
        org.junit.Assert.assertNotEquals((java.lang.Object) byteArray9, (java.lang.Object) luceneTestCaseIterableSet58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray5, byteArray9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '4');
        float[] floatArray6 = new float[] { 10L };
        float[] floatArray8 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (byte) 10);
        float[] floatArray12 = new float[] { 10L };
        float[] floatArray14 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray14, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray14, (float) 100);
        float[] floatArray20 = new float[] { 10L };
        float[] floatArray22 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray22, (float) (byte) 10);
        float[] floatArray26 = new float[] { 10L };
        float[] floatArray28 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray28, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray28, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray28, (float) (byte) 1);
        float[] floatArray36 = new float[] { 10L };
        float[] floatArray38 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray38, (float) (byte) 10);
        float[] floatArray42 = new float[] { 10L };
        float[] floatArray44 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray44, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray44, (float) 100);
        float[] floatArray50 = new float[] { 10L };
        float[] floatArray52 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) (byte) 10);
        float[] floatArray56 = new float[] { 10L };
        float[] floatArray58 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray58, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray58, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray58, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray58, (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '4', (java.lang.Object) floatArray58);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        long[] longArray6 = new long[] { 'a', (byte) 10, 0L, 10, (short) 10 };
        long[] longArray8 = new long[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray6, longArray8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        int[] intArray2 = new int[] { 'a', 10 };
        int[] intArray8 = new int[] { (short) 0, 1, 6, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        long[] longArray1 = null;
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray36);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures45);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures47);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray49 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures45, testRuleIgnoreAfterMaxFailures48 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet50 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray49);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 100, (long) (byte) -1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        double[] doubleArray5 = new double[] { 5, 100.0f, (byte) 100, (byte) 1 };
        double[] doubleArray7 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray5, doubleArray7, (double) 100L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        java.lang.Class<?> wildcardClass2 = ruleChain1.getClass();
        float[] floatArray4 = new float[] { 10L };
        float[] floatArray6 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) (byte) 10);
        java.lang.Class<?> wildcardClass9 = floatArray4.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray10 = new java.lang.reflect.AnnotatedElement[] { wildcardClass2, wildcardClass9 };
        java.util.List<java.lang.reflect.AnnotatedElement> annotatedElementList11 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, annotatedElementArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray10, (java.lang.Object[]) executorServiceArray32);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures9, testRuleIgnoreAfterMaxFailures12 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet14 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        long[] longArray0 = new long[] {};
        long[] longArray6 = new long[] { 3, 10L, (byte) -1, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (short) 0, (double) 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.lang.String str1 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("<unknown>", (int) (byte) 100, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        int[] intArray3 = new int[] { (byte) 0, 4, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, (short) 100, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.nightly", indexReader12, (-1), postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests8.assertDocsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests8.assertPositionsSkippingEquals("<unknown>", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        kuromojiAnalysisTests8.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests8.setUp();
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain36 = ruleChain34.around((org.junit.rules.TestRule) ruleChain35);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain36, (java.lang.Object) '#');
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain36;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.lang.String str2 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("", indexReader6, (int) (byte) 100, postingsEnum8, postingsEnum9, true);
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = ruleChain13.around((org.junit.rules.TestRule) ruleChain14);
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain14);
        org.junit.rules.TestRule testRule17 = null;
        org.junit.rules.RuleChain ruleChain18 = ruleChain14.around(testRule17);
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain14);
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain22 = ruleChain20.around((org.junit.rules.TestRule) ruleChain21);
        org.junit.rules.RuleChain ruleChain23 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) ruleChain14, (java.lang.Object) ruleChain20);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        double[] doubleArray8 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray15 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray15, (double) 100L);
        double[] doubleArray23 = new double[] { 6, (-1.0d), 100.0d, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray15, doubleArray23, (double) 0L);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        short[] shortArray2 = new short[] { (byte) 10 };
        short[] shortArray9 = new short[] { (byte) 100, (byte) 10, (short) 1, (short) 100, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        short[] shortArray1 = new short[] {};
        short[] shortArray8 = new short[] { (short) 0, (short) 0, (byte) 0, (byte) 0, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray1, shortArray8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray5 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray5 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray6);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.nightly", indexReader12, (-1), postingsEnum14, postingsEnum15, false);
        kuromojiAnalysisTests8.ensureAllSearchContextsReleased();
        java.lang.String str19 = kuromojiAnalysisTests8.getTestName();
        kuromojiAnalysisTests8.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests8.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) testRuleIgnoreAfterMaxFailuresArray6, (java.lang.Object) kuromojiAnalysisTests8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100L, (double) 4, (double) 2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, 0, postingsEnum5, postingsEnum6);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray4 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests2 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList5 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray4);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests7.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray9 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests7 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList10 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray14 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests12 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray19 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests17 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests22.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray24 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests22 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray24);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray29 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests27 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray29);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[] luceneTestCaseIterableArray33 = (java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>[]) iterableArray32;
        luceneTestCaseIterableArray33[0] = luceneTestCaseList5;
        luceneTestCaseIterableArray33[1] = luceneTestCaseList10;
        luceneTestCaseIterableArray33[2] = luceneTestCaseList15;
        luceneTestCaseIterableArray33[3] = luceneTestCaseList20;
        luceneTestCaseIterableArray33[4] = luceneTestCaseList25;
        luceneTestCaseIterableArray33[5] = luceneTestCaseList30;
        java.util.Set<java.lang.Iterable<org.apache.lucene.util.LuceneTestCase>> luceneTestCaseIterableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseIterableArray33);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests48 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests48.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray50 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests48 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList51 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) luceneTestCaseIterableArray33, (java.lang.Object[]) luceneTestCaseArray50);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        int[] intArray2 = new int[] { 4 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray2, intArray4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, false);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "tests.badapples", "europarl.lines.txt.gz", "tests.weekly", "random" };
        java.util.List<java.lang.CharSequence> charSequenceList6 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, charSequenceArray5);
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) charSequenceArray5, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("europarl.lines.txt.gz");
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.ensureCleanedUp();
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests15.ruleChain;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests15.assertDocsSkippingEquals("tests.nightly", indexReader19, (-1), postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests15.assertDocsEnumEquals("tests.awaitsfix", postingsEnum26, postingsEnum27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("<unknown>", indexReader31, (int) (short) 10, postingsEnum33, postingsEnum34);
        kuromojiAnalysisTests15.ensureCheckIndexPassed();
        kuromojiAnalysisTests15.assertPathHasBeenCleared("hi!");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.ensureCleanedUp();
        kuromojiAnalysisTests39.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain44 = ruleChain42.around((org.junit.rules.TestRule) ruleChain43);
        kuromojiAnalysisTests39.failureAndSuccessEvents = ruleChain42;
        kuromojiAnalysisTests39.resetCheckIndexStatus();
        kuromojiAnalysisTests39.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests39.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain49 = kuromojiAnalysisTests39.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain52 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain53 = ruleChain51.around((org.junit.rules.TestRule) ruleChain52);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain53, (java.lang.Object) '#');
        kuromojiAnalysisTests39.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        kuromojiAnalysisTests39.assertPositionsSkippingEquals("tests.nightly", indexReader58, (int) (byte) 100, postingsEnum60, postingsEnum61);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests63 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests63.tearDown();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        kuromojiAnalysisTests63.assertTermsEquals("europarl.lines.txt.gz", indexReader66, terms67, terms68, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests71 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests71.ensureCleanedUp();
        kuromojiAnalysisTests71.ensureCleanedUp();
        kuromojiAnalysisTests71.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests71.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests76 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests76.setUp();
        kuromojiAnalysisTests76.setUp();
        org.junit.rules.TestRule testRule79 = kuromojiAnalysisTests76.ruleChain;
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray80 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests0, kuromojiAnalysisTests15, kuromojiAnalysisTests39, kuromojiAnalysisTests63, kuromojiAnalysisTests71, kuromojiAnalysisTests76 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet81 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray80);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray87);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray87);
        java.util.concurrent.ExecutorService executorService91 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray92 = new java.util.concurrent.ExecutorService[] { executorService91 };
        boolean boolean93 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray92);
        java.util.concurrent.ExecutorService executorService94 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray95 = new java.util.concurrent.ExecutorService[] { executorService94 };
        boolean boolean96 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray95);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray92, (java.lang.Object[]) executorServiceArray95);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray84, (java.lang.Object[]) executorServiceArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) luceneTestCaseArray80, (java.lang.Object[]) executorServiceArray84);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) 2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures3 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, (java.lang.Object[]) executorServiceArray8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        short[] shortArray4 = new short[] { (byte) 0, (short) 0, (short) 1, (short) 100 };
        short[] shortArray10 = new short[] { (byte) 100, (short) -1, (short) 0, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) '#');
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        short[] shortArray0 = new short[] {};
        short[] shortArray7 = new short[] { (byte) 1, (byte) 0, (byte) 1, (short) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        char[] charArray1 = null;
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray4, charArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray7, byteArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        short[] shortArray1 = new short[] {};
        short[] shortArray6 = new short[] { (byte) -1, (short) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        int[] intArray7 = new int[] { (byte) 0, (byte) -1, '4', (-1), (-1), 'a' };
        int[] intArray9 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray7, intArray9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        double[] doubleArray4 = new double[] { (short) 10, 5, (short) -1 };
        double[] doubleArray12 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray19 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray12, doubleArray19, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray4, doubleArray19, 0.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { (byte) 100, 1, (short) 1, 10, 0L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.slow", indexReader4, (int) (short) 100, postingsEnum6, postingsEnum7);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, false);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = ruleChain17.around((org.junit.rules.TestRule) ruleChain18);
        org.junit.rules.RuleChain ruleChain20 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain21 = ruleChain17.around((org.junit.rules.TestRule) ruleChain20);
        org.junit.rules.RuleChain ruleChain22 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain17);
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain17;
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) ruleChain1, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 10, (long) 1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 1, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        long[] longArray0 = new long[] {};
        long[] longArray3 = new long[] { 1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        double[] doubleArray8 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray15 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray15, (double) 100L);
        double[] doubleArray25 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray32 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray8, doubleArray25, (double) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, 10L);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        double[] doubleArray0 = null;
        double[] doubleArray8 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray15 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray15, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray8, 100.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (long) 100, (long) (short) 100);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain6 = ruleChain4.around((org.junit.rules.TestRule) ruleChain5);
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain4;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) 'a', postingsEnum12, postingsEnum13);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        java.lang.Object obj16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, obj16);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (byte) 100);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        long[] longArray5 = new long[] { 100L, (byte) -1, '#', (byte) -1, 0 };
        long[] longArray11 = new long[] { '4', (byte) 1, 4, 100L, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.badapples", "europarl.lines.txt.gz", "tests.weekly", "random" };
        java.util.List<java.lang.CharSequence> charSequenceList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, charSequenceArray14);
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) charSequenceArray14);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        long[] longArray6 = new long[] { (short) -1, 1, 100, '#', 10L };
        long[] longArray11 = new long[] { (byte) 10, 10, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        int[] intArray4 = new int[] { (short) 10, (short) 10, (short) 100 };
        int[] intArray11 = new int[] { 10, 3, (byte) 0, 10, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray4, intArray11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", 0, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader5, (-1), postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum12, postingsEnum13, true);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain19 = ruleChain17.around((org.junit.rules.TestRule) ruleChain18);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain17);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.ensureCleanedUp();
        kuromojiAnalysisTests21.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.badapples", indexReader25, terms26, terms27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests21.assertTermsEquals("enwiki.random.lines.txt", indexReader31, terms32, terms33, false);
        kuromojiAnalysisTests21.ensureCheckIndexPassed();
        kuromojiAnalysisTests21.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) ruleChain17, (java.lang.Object) kuromojiAnalysisTests21);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (byte) 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        long[] longArray6 = new long[] { 'a', 0L, (byte) 10, 100, 100L };
        long[] longArray10 = new long[] { ' ', '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray33);
        java.lang.Class[] classArray55 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        java.util.Set<java.lang.Class<?>> wildcardClassSet57 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray19, (java.lang.Object) wildcardClassArray56);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1L));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        short[] shortArray2 = new short[] { (short) 0 };
        short[] shortArray4 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray2, shortArray4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        float[] floatArray3 = new float[] { 10L };
        float[] floatArray5 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray5, (float) (byte) 10);
        float[] floatArray9 = new float[] { 10L };
        float[] floatArray11 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray9, floatArray11, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray11, (float) 100);
        float[] floatArray17 = new float[] { 10L };
        float[] floatArray19 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray19, (float) (byte) 10);
        float[] floatArray23 = new float[] { 10L };
        float[] floatArray25 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray25, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray25, (float) 100);
        float[] floatArray31 = new float[] { 10L };
        float[] floatArray33 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray33, (float) (byte) 10);
        float[] floatArray37 = new float[] { 10L };
        float[] floatArray39 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray39, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray39, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray39, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray11, floatArray25, 100.0f);
        float[] floatArray50 = new float[] { 10L };
        float[] floatArray52 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray52, (float) (byte) 10);
        float[] floatArray56 = new float[] { 10L };
        float[] floatArray58 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray58, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray58, (float) 100);
        float[] floatArray64 = new float[] { 10L };
        float[] floatArray66 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray66, (float) (byte) 10);
        float[] floatArray70 = new float[] { 10L };
        float[] floatArray72 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray72, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray64, floatArray72, (float) 100);
        float[] floatArray78 = new float[] { 10L };
        float[] floatArray80 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray80, (float) (byte) 10);
        float[] floatArray84 = new float[] { 10L };
        float[] floatArray86 = new float[] { 1L };
        org.junit.Assert.assertArrayEquals(floatArray84, floatArray86, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals(floatArray78, floatArray86, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray86, (float) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray58, floatArray72, 100.0f);
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray72, (float) 100);
        float[] floatArray97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray25, floatArray97, (float) (byte) -1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, 0.0d, 0.0d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.setUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) locale5);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests7 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests7.assertPositionsSkippingEquals("tests.slow", indexReader9, (int) (short) 100, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests7.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests7.assertTermsEquals("tests.badapples", indexReader16, terms17, terms18, false);
        kuromojiAnalysisTests7.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        kuromojiAnalysisTests7.assertFieldsEquals("<unknown>", indexReader23, fields24, fields25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        kuromojiAnalysisTests7.assertDocsEnumEquals("random", postingsEnum29, postingsEnum30, true);
        org.junit.rules.RuleChain ruleChain33 = kuromojiAnalysisTests7.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain33);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        double[] doubleArray8 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray15 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray15, (double) 100L);
        double[] doubleArray25 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray32 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray25, doubleArray32, (double) 100L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray8, doubleArray25, (double) 100);
        double[] doubleArray37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray37, (double) (short) 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setUp();
        org.junit.rules.RuleChain ruleChain26 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain28 = ruleChain26.around((org.junit.rules.TestRule) ruleChain27);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain28, (java.lang.Object) '#');
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain34 = ruleChain32.around((org.junit.rules.TestRule) ruleChain33);
        org.junit.rules.RuleChain ruleChain35 = ruleChain28.around((org.junit.rules.TestRule) ruleChain34);
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain28);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain36, (java.lang.Object) byteArray37);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        long[] longArray4 = new long[] { 100, ' ', ' ' };
        long[] longArray10 = new long[] { (short) 0, (byte) 0, 0, 5, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray4, longArray10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) '#', postingsEnum10, postingsEnum11);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests13.ensureCleanedUp();
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain17 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain18 = ruleChain16.around((org.junit.rules.TestRule) ruleChain17);
        kuromojiAnalysisTests13.failureAndSuccessEvents = ruleChain16;
        kuromojiAnalysisTests13.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests13.assertDocsEnumEquals("tests.slow", postingsEnum22, postingsEnum23, true);
        kuromojiAnalysisTests13.assertPathHasBeenCleared("tests.badapples");
        kuromojiAnalysisTests13.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests13);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.Set<java.lang.Object> objSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) executorServiceArray63);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (byte) 1, (float) 3, (-1.0f));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray4);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray8, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray12, charArray13);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray8, charArray12);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray19, charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray23);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray4, charArray23);
        char[] charArray28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray23, charArray28);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        double[] doubleArray0 = null;
        double[] doubleArray8 = new double[] { 1L, 1L, 2, ' ', 100L, (short) 10 };
        double[] doubleArray15 = new double[] { 2, 3, (byte) 1, 1, 6, '#' };
        org.junit.Assert.assertArrayEquals("", doubleArray8, doubleArray15, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray15, (double) (-1.0f));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1.0f, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        int[] intArray6 = new int[] { 100, 1, 4, 1, 4 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (-1), (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (short) 100, (long) '4');
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.slow", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.awaitsfix", indexReader17, terms18, terms19, false);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) ruleChain22, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (short) 10, (double) 10, (double) '4');
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) (short) 100, (float) 0L, (float) (byte) 10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray1, charArray2);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray6, charArray10);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1L), (long) 5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("<unknown>", indexReader16, (int) (short) 10, postingsEnum18, postingsEnum19);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) (short) -1, (double) 0, (double) '4');
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        long[] longArray2 = new long[] { 2 };
        long[] longArray7 = new long[] { 1, 2, 2, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray2, longArray7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (-1), (float) (short) 1, (float) (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.failfast", (int) (short) 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        short[] shortArray3 = new short[] { (short) -1, (short) 100 };
        short[] shortArray10 = new short[] { (short) 10, (short) 100, (byte) 1, (byte) 0, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader5, (-1), postingsEnum7, postingsEnum8, false);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader17, (int) (short) 10, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests1.setUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests29.ensureCleanedUp();
        kuromojiAnalysisTests29.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain34 = ruleChain32.around((org.junit.rules.TestRule) ruleChain33);
        kuromojiAnalysisTests29.failureAndSuccessEvents = ruleChain32;
        kuromojiAnalysisTests29.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        kuromojiAnalysisTests29.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader38, (int) 'a', postingsEnum40, postingsEnum41);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests29);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests44.ensureCleanedUp();
        kuromojiAnalysisTests44.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain47 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain48 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain49 = ruleChain47.around((org.junit.rules.TestRule) ruleChain48);
        kuromojiAnalysisTests44.failureAndSuccessEvents = ruleChain47;
        kuromojiAnalysisTests44.resetCheckIndexStatus();
        kuromojiAnalysisTests44.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests53.ensureCleanedUp();
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests53.ruleChain;
        org.junit.rules.RuleChain ruleChain56 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain57 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain58 = ruleChain56.around((org.junit.rules.TestRule) ruleChain57);
        org.junit.rules.RuleChain ruleChain59 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain60 = ruleChain56.around((org.junit.rules.TestRule) ruleChain59);
        kuromojiAnalysisTests53.failureAndSuccessEvents = ruleChain60;
        kuromojiAnalysisTests44.failureAndSuccessEvents = ruleChain60;
        kuromojiAnalysisTests29.failureAndSuccessEvents = ruleChain60;
        org.junit.rules.RuleChain ruleChain64 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain60);
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) ruleChain64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        short[] shortArray3 = new short[] { (byte) -1, (byte) -1 };
        short[] shortArray8 = new short[] { (short) 0, (byte) -1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) 3, 100.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.badapples", "europarl.lines.txt.gz", "tests.weekly", "random" };
        java.util.List<java.lang.CharSequence> charSequenceList7 = org.elasticsearch.test.ESTestCase.randomSubsetOf(4, charSequenceArray6);
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray14, (java.lang.Object) byteArray21);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests25.ensureCleanedUp();
        kuromojiAnalysisTests25.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests25.assertTermsEquals("tests.badapples", indexReader29, terms30, terms31, false);
        kuromojiAnalysisTests25.assertPathHasBeenCleared("tests.badapples");
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests25.assertDocsEnumEquals("tests.awaitsfix", postingsEnum37, postingsEnum38, false);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.nightly", indexReader5, (-1), postingsEnum7, postingsEnum8, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) ' ', (double) 100.0f, 0.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.nightly", indexReader4, (-1), postingsEnum6, postingsEnum7, false);
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) "hi!");
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        short[] shortArray4 = new short[] { (short) 100, (byte) 0, (short) 10, (byte) -1 };
        short[] shortArray11 = new short[] { (short) -1, (byte) 1, (short) 1, (short) 1, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests3 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests3.ensureCleanedUp();
        kuromojiAnalysisTests3.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain6 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain8 = ruleChain6.around((org.junit.rules.TestRule) ruleChain7);
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain6;
        kuromojiAnalysisTests3.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader12, (int) 'a', postingsEnum14, postingsEnum15);
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) 1, (java.lang.Object) kuromojiAnalysisTests3);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests18.ensureCleanedUp();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain22 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain23 = ruleChain21.around((org.junit.rules.TestRule) ruleChain22);
        kuromojiAnalysisTests18.failureAndSuccessEvents = ruleChain21;
        kuromojiAnalysisTests18.resetCheckIndexStatus();
        kuromojiAnalysisTests18.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.ensureCleanedUp();
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests27.ruleChain;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain32 = ruleChain30.around((org.junit.rules.TestRule) ruleChain31);
        org.junit.rules.RuleChain ruleChain33 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain34 = ruleChain30.around((org.junit.rules.TestRule) ruleChain33);
        kuromojiAnalysisTests27.failureAndSuccessEvents = ruleChain34;
        kuromojiAnalysisTests18.failureAndSuccessEvents = ruleChain34;
        kuromojiAnalysisTests3.failureAndSuccessEvents = ruleChain34;
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests39.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests39.assertTermsEquals("tests.maxfailures", indexReader42, terms43, terms44, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) ruleChain38, (java.lang.Object) terms44);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader9, (int) (byte) 10, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", 4, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (-1L));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain3 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain5 = ruleChain3.around((org.junit.rules.TestRule) ruleChain4);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain3;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain13 = ruleChain11.around((org.junit.rules.TestRule) ruleChain12);
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain15 = ruleChain11.around((org.junit.rules.TestRule) ruleChain14);
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain15;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain15, (java.lang.Object) (byte) 10);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum21, postingsEnum22, false);
        org.junit.rules.RuleChain ruleChain25 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.tearDown();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray29 = new org.apache.lucene.util.LuceneTestCase[] { kuromojiAnalysisTests27 };
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList30 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, luceneTestCaseArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests2);
        java.lang.Class<?> wildcardClass6 = kuromojiAnalysisTests2.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (float) (byte) 0, 0.0f);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray18);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests27 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests27.ensureCleanedUp();
        org.junit.rules.TestRule testRule29 = kuromojiAnalysisTests27.ruleChain;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests27.assertDocsSkippingEquals("tests.nightly", indexReader31, (-1), postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests27.assertDocsEnumEquals("tests.awaitsfix", postingsEnum38, postingsEnum39, true);
        kuromojiAnalysisTests27.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain44 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain45 = ruleChain43.around((org.junit.rules.TestRule) ruleChain44);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests27, (java.lang.Object) ruleChain43);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests27.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader48, (int) '#', postingsEnum50, postingsEnum51);
        kuromojiAnalysisTests27.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests55 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests55.ensureCleanedUp();
        kuromojiAnalysisTests55.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain58 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain59 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain60 = ruleChain58.around((org.junit.rules.TestRule) ruleChain59);
        kuromojiAnalysisTests55.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        kuromojiAnalysisTests55.assertPositionsSkippingEquals("tests.maxfailures", indexReader63, (int) '#', postingsEnum65, postingsEnum66);
        org.junit.rules.TestRule testRule68 = kuromojiAnalysisTests55.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests69.ensureCleanedUp();
        org.junit.rules.TestRule testRule71 = kuromojiAnalysisTests69.ruleChain;
        org.junit.rules.RuleChain ruleChain72 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain73 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain74 = ruleChain72.around((org.junit.rules.TestRule) ruleChain73);
        org.junit.rules.RuleChain ruleChain75 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain76 = ruleChain72.around((org.junit.rules.TestRule) ruleChain75);
        kuromojiAnalysisTests69.failureAndSuccessEvents = ruleChain76;
        kuromojiAnalysisTests69.assertPathHasBeenCleared("random");
        kuromojiAnalysisTests69.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests82 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests82.tearDown();
        kuromojiAnalysisTests82.tearDown();
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        kuromojiAnalysisTests82.assertTermsEquals("tests.slow", indexReader86, terms87, terms88, true);
        kuromojiAnalysisTests82.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests82.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray93 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests26, kuromojiAnalysisTests27, kuromojiAnalysisTests55, kuromojiAnalysisTests69, kuromojiAnalysisTests82 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet94 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray93);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTestsArray93);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet96 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) kuromojiAnalysisTestsArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) kuromojiAnalysisTestsArray93);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray8);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests13 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.junit.rules.TestRule testRule16 = kuromojiAnalysisTests14.ruleChain;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("tests.nightly", indexReader18, (-1), postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests14.assertDocsEnumEquals("tests.awaitsfix", postingsEnum25, postingsEnum26, true);
        kuromojiAnalysisTests14.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain31 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain32 = ruleChain30.around((org.junit.rules.TestRule) ruleChain31);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests14, (java.lang.Object) ruleChain30);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests14.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader35, (int) '#', postingsEnum37, postingsEnum38);
        kuromojiAnalysisTests14.assertPathHasBeenCleared("<unknown>");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.ensureCleanedUp();
        kuromojiAnalysisTests42.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain45 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain47 = ruleChain45.around((org.junit.rules.TestRule) ruleChain46);
        kuromojiAnalysisTests42.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        kuromojiAnalysisTests42.assertPositionsSkippingEquals("tests.maxfailures", indexReader50, (int) '#', postingsEnum52, postingsEnum53);
        org.junit.rules.TestRule testRule55 = kuromojiAnalysisTests42.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests56 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests56.ensureCleanedUp();
        org.junit.rules.TestRule testRule58 = kuromojiAnalysisTests56.ruleChain;
        org.junit.rules.RuleChain ruleChain59 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain60 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain61 = ruleChain59.around((org.junit.rules.TestRule) ruleChain60);
        org.junit.rules.RuleChain ruleChain62 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain63 = ruleChain59.around((org.junit.rules.TestRule) ruleChain62);
        kuromojiAnalysisTests56.failureAndSuccessEvents = ruleChain63;
        kuromojiAnalysisTests56.assertPathHasBeenCleared("random");
        kuromojiAnalysisTests56.setIndexWriterMaxDocs((int) (short) 10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests69 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests69.tearDown();
        kuromojiAnalysisTests69.tearDown();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        kuromojiAnalysisTests69.assertTermsEquals("tests.slow", indexReader73, terms74, terms75, true);
        kuromojiAnalysisTests69.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests69.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests[] kuromojiAnalysisTestsArray80 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests[] { kuromojiAnalysisTests13, kuromojiAnalysisTests14, kuromojiAnalysisTests42, kuromojiAnalysisTests56, kuromojiAnalysisTests69 };
        java.util.Set<org.elasticsearch.index.analysis.KuromojiAnalysisTests> kuromojiAnalysisTestsSet81 = org.apache.lucene.util.LuceneTestCase.asSet(kuromojiAnalysisTestsArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) kuromojiAnalysisTestsArray80);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader6, (-1), postingsEnum8, postingsEnum9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("<unknown>", indexReader18, (int) (short) 10, postingsEnum20, postingsEnum21);
        kuromojiAnalysisTests2.ensureCheckIndexPassed();
        kuromojiAnalysisTests2.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests2.setUp();
        org.junit.rules.RuleChain ruleChain28 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain29 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain30 = ruleChain28.around((org.junit.rules.TestRule) ruleChain29);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain30, (java.lang.Object) '#');
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain30;
        kuromojiAnalysisTests2.setIndexWriterMaxDocs(10);
        org.junit.Assert.assertNotSame("tests.nightly", obj1, (java.lang.Object) kuromojiAnalysisTests2);
        org.junit.rules.RuleChain ruleChain37 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests38 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests38.ensureCleanedUp();
        kuromojiAnalysisTests38.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain41 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = ruleChain41.around((org.junit.rules.TestRule) ruleChain42);
        kuromojiAnalysisTests38.failureAndSuccessEvents = ruleChain41;
        kuromojiAnalysisTests38.resetCheckIndexStatus();
        kuromojiAnalysisTests38.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain47 = kuromojiAnalysisTests38.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) ruleChain47);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        int[] intArray5 = new int[] { (byte) -1, 5, 2, 100 };
        int[] intArray7 = new int[] { 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray5, intArray7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule4 = kuromojiAnalysisTests2.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests2.assertDocsSkippingEquals("tests.nightly", indexReader6, (-1), postingsEnum8, postingsEnum9, false);
        kuromojiAnalysisTests2.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) 0, (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests2.assertDocValuesEquals("", 0, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, 0.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (byte) 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, (float) '4', 0.0f);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.junit.rules.RuleChain ruleChain0 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain1 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain2 = ruleChain0.around((org.junit.rules.TestRule) ruleChain1);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray40);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain2, (java.lang.Object) executorServiceArray51);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (short) -1, (double) 100L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        short[] shortArray2 = new short[] { (short) 1, (byte) 0 };
        short[] shortArray5 = new short[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        java.lang.String str1 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("hi!", indexReader3, fields4, fields5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        int[] intArray6 = new int[] { (byte) -1, 0, 10, (short) 1, (short) 10, 100 };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain5 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.setUp();
        java.lang.Class<?> wildcardClass7 = kuromojiAnalysisTests0.getClass();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests8 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests8.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests8.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        kuromojiAnalysisTests8.assertDocsSkippingEquals("tests.nightly", indexReader12, (-1), postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests8.assertDocsEnumEquals("tests.awaitsfix", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests8.assertPositionsSkippingEquals("<unknown>", indexReader24, (int) (short) 10, postingsEnum26, postingsEnum27);
        kuromojiAnalysisTests8.ensureCheckIndexPassed();
        kuromojiAnalysisTests8.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests8.setUp();
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain36 = ruleChain34.around((org.junit.rules.TestRule) ruleChain35);
        org.junit.Assert.assertNotSame("", (java.lang.Object) ruleChain36, (java.lang.Object) '#');
        kuromojiAnalysisTests8.failureAndSuccessEvents = ruleChain36;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) ruleChain36);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray48);
        java.lang.Object[] objArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray48, objArray64);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) 1L, (float) 6);
    }
}

