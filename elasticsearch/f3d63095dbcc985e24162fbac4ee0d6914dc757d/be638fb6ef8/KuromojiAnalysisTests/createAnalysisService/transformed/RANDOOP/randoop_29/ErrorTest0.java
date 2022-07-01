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
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (byte) -1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 10, (long) 'a');
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        char[] charArray4 = new char[] { 'a', '#', ' ', ' ' };
        char[] charArray7 = new char[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail();
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) 0.0d);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) -1, (long) 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 10, (-1.0f), "europarl.lines.txt.gz", 10.0d, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, objArray7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) (short) 10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        long[] longArray7 = new long[] { 10L, (byte) 0, (byte) 100, 1, '#', (-1) };
        long[] longArray11 = new long[] { (short) 100, (-1), 100L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0, (-1), (byte) 0, true, (-1.0f), true };
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", objArray7, objArray12);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) 100.0f, (java.lang.Object) (-1L));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) 1L, 10.0d, (double) 100.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100.0f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        long[] longArray6 = new long[] { 10L, (short) -1, '#', '#', (byte) -1 };
        long[] longArray8 = new long[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray6, longArray8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        int[] intArray2 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { 10, (short) 100, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray2, intArray7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0.0d, (java.lang.Object) "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) "", (java.lang.Object) 0L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        double[] doubleArray3 = new double[] { (short) 0, 100L, 100L };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) '#');
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '4', (double) (byte) 10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        int[] intArray2 = new int[] { 1, 100 };
        int[] intArray6 = new int[] { (short) -1, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) localeArray12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.junit.rules.TestRule testRule0 = org.apache.lucene.util.LuceneTestCase.classRules;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 10L, (double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) 1, (java.lang.Object) 100);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) 1.0f);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) 100, (double) 10.0f);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) (short) 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) false, (java.lang.Object) 10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        short[] shortArray1 = new short[] { (byte) 10 };
        short[] shortArray4 = new short[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet20 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray19);
        java.lang.Object[] objArray21 = new java.lang.Object[] { strComparableSet20 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) localeArray11, objArray21);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 0, 100L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) (byte) 0, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (byte) 1, (float) (-1), (float) (byte) -1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray1, byteArray4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        int[] intArray4 = new int[] { 0, 0, 100, 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 'a');
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray6, byteArray13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 1.0d, (double) 100.0f, (double) '#');
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        double[] doubleArray6 = new double[] { (short) 0, 10.0f, (short) 0, 0.0d, 0.0d };
        double[] doubleArray10 = new double[] { 100.0d, 10.0f, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray6, doubleArray10, (double) 10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, (-1), "", "tests.maxfailures", (-1L), (-1L) };
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray14);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "tests.weekly", strArray14, "random" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray6, objArray17);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { "tests.monster" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, objArray9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (-1L), 0.0d, (double) (short) -1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray2 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        short[] shortArray6 = new short[] { (short) 1, (byte) 0, (byte) 10, (short) 100, (short) 0, (short) 0 };
        short[] shortArray8 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) (short) 10, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale1, locale3, locale5, locale7, locale9 };
        java.util.Set<java.util.Locale> localeSet11 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray10);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) strArray18);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 1L, (long) (short) 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        float[] floatArray1 = new float[] { 100.0f };
        float[] floatArray3 = new float[] { 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray3, 10.0f);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) (byte) 10, obj2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 0, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray7, objArray10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, 0L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        short[] shortArray2 = new short[] { (byte) -1 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum2, postingsEnum3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        float[] floatArray7 = new float[] { (short) 10, 10, (byte) 0, 10.0f, 1, 0L };
        float[] floatArray10 = new float[] { ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray10, (float) '4');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale9, locale11, locale13, locale15, locale17 };
        java.util.Set<java.util.Locale> localeSet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) localeArray18);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        char[] charArray4 = new char[] { 'a', ' ', '#' };
        char[] charArray9 = new char[] { '4', '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray4, charArray9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        char[] charArray1 = null;
        char[] charArray3 = new char[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray1, charArray3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse(true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        float[] floatArray5 = new float[] { (short) -1, 100L, (short) -1, (-1) };
        float[] floatArray7 = new float[] { (-1.0f) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray5, floatArray7, (float) 0L);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        double[] doubleArray4 = new double[] { 100.0f, (byte) 1, 'a', 0.0d };
        double[] doubleArray10 = new double[] { 100.0d, 10.0d, (byte) 0, 100.0d, 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) ' ');
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 10, (double) (short) 10, (double) (-1L));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.lang.Object[] objArray13 = new java.lang.Object[] { '#', false, "tests.weekly", (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray7, objArray13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) (short) 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        int[] intArray2 = new int[] { 'a' };
        int[] intArray8 = new int[] { 100, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (short) 10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        int[] intArray6 = new int[] { 100, 100, (short) 100, (byte) 100, 'a', (short) 1 };
        int[] intArray13 = new int[] { (byte) 0, (byte) 100, 100, 'a', 10, (-1) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray12);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray22);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, false);
        java.lang.Object[] objArray35 = new java.lang.Object[] { strArray22, false, "tests.monster", "europarl.lines.txt.gz", (-1.0d), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray12, (java.lang.Object[]) strArray22);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        float[] floatArray5 = new float[] { (-1.0f), 100, (short) 10, ' ', (-1) };
        float[] floatArray12 = new float[] { (short) 1, 100, (-1), (-1), (short) 0, 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray12, 0.0f);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        float[] floatArray1 = new float[] { 0L };
        float[] floatArray4 = new float[] { 100L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray4, (-1.0f));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        char[] charArray6 = new char[] { '4', 'a', 'a', '4', '4' };
        char[] charArray10 = new char[] { '#', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.slow");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        float[] floatArray1 = new float[] { 10L };
        float[] floatArray5 = new float[] { (short) 10, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray5, 10.0f);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 1.0f, (double) ' ');
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 10.0f, (double) (byte) 10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.weekly");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        long[] longArray3 = new long[] { 100L, '#', (short) 10 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        char[] charArray5 = new char[] { ' ', 'a', ' ', 'a' };
        char[] charArray12 = new char[] { '4', '#', 'a', 'a', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) localeArray42);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        float[] floatArray4 = new float[] { (short) 100, 1, 1.0f };
        float[] floatArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray5, (float) (byte) -1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) localeArray11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray1, byteArray6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) localeArray12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] { (byte) -1, (short) 1, (short) 0, (short) 100, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray1, shortArray8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
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
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, objArray19);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        java.lang.Object obj2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) (byte) 100, obj2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 10, (double) (byte) 1, 1.0d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue(false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        int[] intArray4 = new int[] { (byte) 10, '4', (short) 100, 100 };
        int[] intArray11 = new int[] { 1, (byte) 0, '4', (-1), 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        char[] charArray0 = new char[] {};
        char[] charArray6 = new char[] { '4', 'a', '4', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        short[] shortArray7 = new short[] { (byte) 100, (byte) -1, (short) 1, (short) 0, (short) 10, (short) 100 };
        short[] shortArray12 = new short[] { (byte) 0, (short) -1, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray7, shortArray12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        float[] floatArray5 = new float[] { (short) 100, 0.0f, (-1L), (byte) 100, 'a' };
        float[] floatArray12 = new float[] { 1L, 'a', '#', (-1), (-1L), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray12, (float) (short) 1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (byte) -1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 'a', (double) 1L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        long[] longArray2 = new long[] { 1L };
        long[] longArray8 = new long[] { (byte) 0, (byte) 100, (byte) 0, 10L, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 1, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) 'a', numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 0, (double) (byte) 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray1, floatArray2, (float) (byte) 1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 100.0f, 1.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (short) 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        char[] charArray5 = new char[] { '4', '4', '4', ' ' };
        char[] charArray10 = new char[] { '4', ' ', '4', 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) 1.0d, (java.lang.Object) wildcardClass29);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray0, (java.lang.Object) boolean4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) 10, (byte) 0, ' ', (byte) 100, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        double[] doubleArray5 = new double[] { (byte) 10, (-1), 'a', (byte) -1 };
        double[] doubleArray9 = new double[] { (-1.0f), ' ', 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray5, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 10, (long) 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (byte) 0, (-1.0d));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRuleIgnoreAfterMaxFailures1, (java.lang.Object) localeArray12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        int[] intArray6 = new int[] { ' ', 'a', (short) -1, '4', (short) 1 };
        int[] intArray11 = new int[] { 10, 1, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        double[] doubleArray2 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { (byte) 1, (byte) 10, (-1.0d), (-1L), 100.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray2, doubleArray8, (double) 0L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) strArray18);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        long[] longArray4 = new long[] { ' ', ' ', 0L, 10 };
        long[] longArray9 = new long[] { 1L, (-1), 10, 100L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (float) 1L, (float) (-1L));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 1, (long) (byte) 100);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.monster", true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        char[] charArray2 = new char[] { 'a', '4' };
        char[] charArray3 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        char[] charArray7 = new char[] { '#', '#', ' ', '#', ' ', 'a' };
        char[] charArray9 = new char[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray7, charArray9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 100, (long) (byte) -1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { (short) -1, (short) 0, '#', '4', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10.0f);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        char[] charArray5 = new char[] { 'a', '#', '4', '#', '4' };
        char[] charArray11 = new char[] { '4', '#', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray11);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", byteArray6, byteArray10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        char[] charArray0 = new char[] {};
        char[] charArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        long[] longArray6 = new long[] { (byte) 10, (byte) 0, (short) 0, '#', '#' };
        long[] longArray8 = new long[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, 1.0d, 0.0d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        long[] longArray2 = new long[] { (-1), (byte) -1 };
        long[] longArray6 = new long[] { '#', ' ', 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "random");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        java.util.List[] listArray1 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray2 = (java.util.List<java.io.Serializable>[]) listArray1;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableListSet3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet1 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) genericDeclarationSet1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 10, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray3, (double) 1.0f);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (short) -1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '4', (java.lang.Object) (byte) 1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        short[] shortArray4 = new short[] { (short) 1, (short) 100, (byte) 0 };
        short[] shortArray7 = new short[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray4, shortArray7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) '4');
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale1, locale3, locale5, locale7, locale9 };
        java.util.Set<java.util.Locale> localeSet11 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray10, (java.lang.Object[]) executorServiceArray12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
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
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale47, locale49, locale51, locale53, locale55 };
        java.util.Set<java.util.Locale> localeSet57 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet62 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray61);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) localeSet57, (java.lang.Object) strArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) localeArray25, (java.lang.Object[]) strArray61);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1L, (float) (short) 10, 1.0f);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (byte) 0, (float) (byte) -1, 0.0f);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100L, 0.0d, 0.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0.0f, (float) (-1L), 0.0f);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray19, (java.lang.Object[]) localeArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray7, (java.lang.Object[]) localeArray19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        int[] intArray2 = new int[] { 10, (byte) 0 };
        int[] intArray5 = new int[] { 'a', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) (byte) 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        kuromojiAnalysisTests9.assertPositionsSkippingEquals("tests.failfast", indexReader17, 1, postingsEnum19, postingsEnum20);
        kuromojiAnalysisTests9.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.junit.rules.TestRule[] testRuleArray7 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray12);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) testRuleArray7, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        char[] charArray0 = new char[] {};
        char[] charArray5 = new char[] { '4', '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) 'a', (long) 'a');
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) localeArray26);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.List<java.io.Serializable> serializableList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) false, (java.lang.Object) localeArray19);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) testRuleIgnoreAfterMaxFailures2, (java.lang.Object) "random");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet4 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "hi!", (java.lang.Object) genericDeclarationArray3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        byte[] byteArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        float[] floatArray3 = new float[] { 1L, 100.0f };
        float[] floatArray4 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray3, floatArray4, (float) 'a');
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1, 1.0d, (double) 'a');
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        double[] doubleArray6 = new double[] { 0L, (short) 10, (-1.0d), (-1), ' ', '#' };
        double[] doubleArray12 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray17 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray12, doubleArray17, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray17, (double) 0.0f);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) '#');
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList4 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray3);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) throttlingList4, (java.lang.Object) annotatedElementArray20);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray3, byteArray9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (-1.0f), (double) 0.0f);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
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
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray40, (double) '#');
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1.0f, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures45 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures46 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures45);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures47 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures48 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures47);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures49 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures50 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures49);
        org.junit.rules.TestRule[] testRuleArray51 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures45, testRuleIgnoreAfterMaxFailures48, testRuleIgnoreAfterMaxFailures50 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet52 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) localeArray25, (java.lang.Object[]) testRuleArray51);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        long[] longArray2 = new long[] { (-1), '#' };
        long[] longArray6 = new long[] { (short) 10, 10L, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
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
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) '#', numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray1);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray17 = new java.util.Locale[] { locale8, locale10, locale12, locale14, locale16 };
        java.util.Set<java.util.Locale> localeSet18 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray17);
        java.util.List<java.io.Serializable> serializableList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray17);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray17);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale25, locale27, locale29, locale31, locale33 };
        java.util.Set<java.util.Locale> localeSet35 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray34);
        java.util.List<java.io.Serializable> serializableList36 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray34);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray34, (java.lang.Object) 0.0f);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray51 = new java.util.Locale[] { locale42, locale44, locale46, locale48, locale50 };
        java.util.Set<java.util.Locale> localeSet52 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray51);
        java.util.List<java.io.Serializable> serializableList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray51);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray51, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray34, (java.lang.Object[]) localeArray51);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) localeArray17, (java.lang.Object[]) localeArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) localeArray34);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (short) 10, 10.0d, (double) 10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 'a');
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        short[] shortArray2 = new short[] { (byte) -1 };
        short[] shortArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray2, shortArray3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray19, (double) 0);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray39, (double) '#');
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (float) (byte) 0, (-1.0f), (float) (byte) 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
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
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.junit.rules.TestRule[] testRuleArray6 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet7 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray6);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale11, locale13, locale15, locale17, locale19 };
        java.util.Set<java.util.Locale> localeSet21 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray20);
        java.util.List<java.io.Serializable> serializableList22 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray20);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray20);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale28, locale30, locale32, locale34, locale36 };
        java.util.Set<java.util.Locale> localeSet38 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.List<java.io.Serializable> serializableList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray37);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray37, (java.lang.Object) 0.0f);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray54 = new java.util.Locale[] { locale45, locale47, locale49, locale51, locale53 };
        java.util.Set<java.util.Locale> localeSet55 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray54);
        java.util.List<java.io.Serializable> serializableList56 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray54);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray54, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray37, (java.lang.Object[]) localeArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) localeArray20, (java.lang.Object[]) localeArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleArray6, (java.lang.Object[]) localeArray20);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests37 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        kuromojiAnalysisTests37.assertFieldsEquals("random", indexReader39, fields40, fields41, true);
        kuromojiAnalysisTests37.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) localeArray31, (java.lang.Object) kuromojiAnalysisTests37);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        char[] charArray5 = new char[] { 'a', 'a', '4', '4', 'a' };
        char[] charArray10 = new char[] { '4', 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', 1L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        int[] intArray3 = new int[] { (byte) 10, 0, '4' };
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        double[] doubleArray5 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray5, doubleArray10, (double) (byte) 100);
        double[] doubleArray18 = new double[] { (byte) 0, 1L, 10L, 100.0f, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray18, (double) (-1.0f));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 0, (short) 0 };
        short[] shortArray5 = new short[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        char[] charArray4 = new char[] { ' ', '4', '4', 'a' };
        char[] charArray10 = new char[] { '4', 'a', ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        kuromojiAnalysisTests22.ensureCleanedUp();
        java.lang.String str32 = kuromojiAnalysisTests22.getTestName();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests22);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        float[] floatArray1 = new float[] {};
        float[] floatArray8 = new float[] { '#', (byte) 1, (byte) 0, 1, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray8, 0.0f);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
        java.util.List[] listArray18 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray19 = (java.util.List<java.io.Serializable>[]) listArray18;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet20 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields14, (java.lang.Object) serializableListSet20);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        float[] floatArray6 = new float[] { 'a', (-1.0f), 1, '#', 1L, (byte) 10 };
        float[] floatArray11 = new float[] { (short) 0, 1.0f, 0L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) '4');
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', (byte) 10, '#', 'a', (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.badapples", (double) (byte) -1, (double) 1L, (double) 10.0f);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        short[] shortArray2 = new short[] { (short) 100, (short) 0 };
        short[] shortArray8 = new short[] { (byte) 0, (short) 10, (byte) -1, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1, (double) 100L);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (-1.0f));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        float[] floatArray2 = new float[] { 0L, (-1) };
        float[] floatArray6 = new float[] { 1, '#', 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray6, (float) (byte) 100);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        short[] shortArray5 = new short[] { (byte) 10, (short) 1, (byte) -1, (byte) 0, (short) -1 };
        short[] shortArray11 = new short[] { (byte) 0, (byte) 0, (short) -1, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray11);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 0, (double) 1.0f);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', 0.0f, (float) 1L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        byte[] byteArray1 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
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
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale16, locale18, locale20, locale22, locale24 };
        java.util.Set<java.util.Locale> localeSet26 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray25);
        java.util.List<java.io.Serializable> serializableList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) testRule13, (java.lang.Object) serializableList27);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray1, shortArray4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
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
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet51 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray39, (java.lang.Object[]) strArray50);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.failfast", indexReader9, 1, postingsEnum11, postingsEnum12);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) queryCachingPolicy0, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (byte) 10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        float[] floatArray5 = new float[] { 100L, 100L, (short) 100, (short) 0, (byte) 1 };
        float[] floatArray10 = new float[] { 100L, 100L, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (short) 100);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        short[] shortArray4 = new short[] { (short) -1, (byte) 0, (short) 1 };
        short[] shortArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray4, shortArray5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 0, 0.0d, (double) (short) -1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
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
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray59 = new java.util.Locale[] { locale50, locale52, locale54, locale56, locale58 };
        java.util.Set<java.util.Locale> localeSet60 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray59);
        java.util.List<java.io.Serializable> serializableList61 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray59);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray59, (java.lang.Object) 0.0f);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale69 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale71 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale67, locale69, locale71, locale73, locale75 };
        java.util.Set<java.util.Locale> localeSet77 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray76);
        java.util.List<java.io.Serializable> serializableList78 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray76);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray76, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray59, (java.lang.Object[]) localeArray76);
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale89 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale91 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale83, locale85, locale87, locale89, locale91 };
        java.util.Set<java.util.Locale> localeSet93 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray92);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) localeArray59, (java.lang.Object[]) localeArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "tests.slow", (java.lang.Object) localeArray59);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        double[] doubleArray20 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray20, doubleArray25, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray20, (double) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) doubleArray20);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", (-1), numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        long[] longArray5 = new long[] { (byte) 100, (-1L), (short) 100, (short) 0 };
        long[] longArray9 = new long[] { (short) 10, 100L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray5, longArray9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray7, byteArray11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, true);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        int[] intArray3 = new int[] { 'a', (byte) -1 };
        int[] intArray9 = new int[] { (byte) 100, ' ', (-1), (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray3, intArray9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        long[] longArray5 = new long[] { 10, 0L, 1L, 0L, (byte) -1 };
        long[] longArray11 = new long[] { 1, (byte) 100, (-1), (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) localeArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray12, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
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
        double[] doubleArray48 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray53 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray48, doubleArray53, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray48, 0.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray11, doubleArray48, (double) (short) -1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (-1.0f), (double) 1.0f);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) localeArray28);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        float[] floatArray0 = new float[] {};
        float[] floatArray3 = new float[] { (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray3, (float) (byte) 10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertPathHasBeenCleared("");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        float[] floatArray4 = new float[] { ' ', 10.0f, (byte) 10, 'a' };
        float[] floatArray6 = new float[] { 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) 100);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", (java.lang.Object) ruleChain10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        char[] charArray1 = new char[] { '#' };
        char[] charArray7 = new char[] { 'a', 'a', ' ', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 1, (double) (byte) 10, (double) 1.0f);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale10, locale12, locale14, locale16, locale18 };
        java.util.Set<java.util.Locale> localeSet20 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale23, locale25, locale27, locale29, locale31 };
        java.util.Set<java.util.Locale> localeSet33 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray32);
        java.util.List<java.io.Serializable> serializableList34 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray19, (java.lang.Object[]) localeArray32);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale38, locale40, locale42, locale44, locale46 };
        java.util.Set<java.util.Locale> localeSet48 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray47);
        java.util.List<java.io.Serializable> serializableList49 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray47);
        java.util.Set<java.lang.Cloneable> cloneableSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray32, (java.lang.Object[]) localeArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) localeArray47);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) 1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
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
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.maxfailures", (int) 'a', numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) ' ', (double) (-1L));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) localeArray13);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 0, (double) 1L, (double) 0L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        float[] floatArray5 = new float[] { (short) 100, 10L, (-1L), (byte) 1 };
        float[] floatArray6 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray6, (float) (-1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        java.lang.Object[] objArray1 = null;
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
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale49, locale51, locale53, locale55, locale57 };
        java.util.Set<java.util.Locale> localeSet59 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray58);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale62, locale64, locale66, locale68, locale70 };
        java.util.Set<java.util.Locale> localeSet72 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray71);
        java.util.List<java.io.Serializable> serializableList73 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray58, (java.lang.Object[]) localeArray71);
        java.util.Locale locale77 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale81 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale85 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale77, locale79, locale81, locale83, locale85 };
        java.util.Set<java.util.Locale> localeSet87 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray86);
        java.util.List<java.io.Serializable> serializableList88 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray86);
        java.util.Set<java.lang.Cloneable> cloneableSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray86);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray71, (java.lang.Object[]) localeArray86);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) localeArray41, (java.lang.Object[]) localeArray71);
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray25, (java.lang.Object[]) localeArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray1, (java.lang.Object[]) localeArray41);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 100, (float) (byte) 10, (float) 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests50 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        kuromojiAnalysisTests50.assertFieldsEquals("europarl.lines.txt.gz", indexReader52, fields53, fields54, false);
        kuromojiAnalysisTests50.ensureCleanedUp();
        kuromojiAnalysisTests50.resetCheckIndexStatus();
        kuromojiAnalysisTests50.ensureCleanedUp();
        java.lang.String str60 = kuromojiAnalysisTests50.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) eSTestCaseArray48, (java.lang.Object) kuromojiAnalysisTests50);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader22, fields23, fields24, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader22);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        long[] longArray5 = new long[] { '4', (short) 10, 1L, 100L, ' ' };
        long[] longArray7 = new long[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { 100, 10.0f, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) (-1L));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        float[] floatArray6 = new float[] { 1L, (short) -1, ' ', (byte) -1, (byte) -1, 0 };
        float[] floatArray11 = new float[] { 0, 0L, 1.0f, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray11, (float) 10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.monster");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList3 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        kuromojiAnalysisTests5.assertPositionsSkippingEquals("hi!", indexReader13, (int) (byte) 0, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests5.assertTermsEquals("random", indexReader19, terms20, terms21, true);
        kuromojiAnalysisTests5.setUp();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        kuromojiAnalysisTests5.assertFieldsEquals("", indexReader27, fields28, fields29, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        kuromojiAnalysisTests32.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields35, fields36, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests39 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        kuromojiAnalysisTests39.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, false);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests39.assertPositionsSkippingEquals("hi!", indexReader47, (int) (byte) 0, postingsEnum49, postingsEnum50);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray52 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests5, kuromojiAnalysisTests32, kuromojiAnalysisTests39 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList53 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray2, (java.lang.Object[]) eSTestCaseArray52);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) annotatedElementArray15, (java.lang.Object[]) localeArray43);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) 0, (float) ' ', 1.0f);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0f, 0.0f, (float) (byte) 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        float[] floatArray0 = new float[] {};
        float[] floatArray4 = new float[] { (-1), 100L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray4, (float) '#');
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        long[] longArray2 = new long[] { (short) 100 };
        long[] longArray6 = new long[] { 1L, 1L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray2, longArray6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        float[] floatArray3 = new float[] { 0.0f, 'a' };
        float[] floatArray8 = new float[] { (-1.0f), (byte) 1, 1.0f, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray3, floatArray8, (float) (short) 10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) (short) 100, (java.lang.Object) strArray8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests18 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        kuromojiAnalysisTests18.assertDocsEnumEquals("", postingsEnum20, postingsEnum21, false);
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests18.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) localeArray12, (java.lang.Object) testRule24);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 10, (-1.0f), (float) (byte) -1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
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
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 100, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 100, (float) (-1L), (float) 'a');
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet1 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) genericDeclarationArray0, (java.lang.Object) "tests.slow");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) 0L, (java.lang.Object) terms16);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale4, locale6, locale8, locale10, locale12 };
        java.util.Set<java.util.Locale> localeSet14 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray13);
        java.util.List<java.io.Serializable> serializableList15 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray13);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray13, (java.lang.Object) "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray13, (java.lang.Object[]) executorServiceArray18);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        char[] charArray4 = new char[] { ' ', '#', 'a' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
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
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.monster", (int) (short) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0.0f);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        int[] intArray4 = new int[] { (short) 100, (short) 10, 'a' };
        int[] intArray8 = new int[] { (byte) 100, (byte) 1, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", intArray4, intArray8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        kuromojiAnalysisTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, false);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray34);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests36.setIndexWriterMaxDocs((int) (byte) 10);
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) strComparableSet35, (java.lang.Object) kuromojiAnalysisTests36);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        kuromojiAnalysisTests36.assertDocsEnumEquals("tests.badapples", postingsEnum41, postingsEnum42, true);
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests36.ruleChain;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        kuromojiAnalysisTests36.assertDocsSkippingEquals("tests.maxfailures", indexReader47, (int) (byte) 100, postingsEnum49, postingsEnum50, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Fields fields56 = null;
        org.apache.lucene.index.Fields fields57 = null;
        kuromojiAnalysisTests53.assertFieldsEquals("europarl.lines.txt.gz", indexReader55, fields56, fields57, false);
        kuromojiAnalysisTests53.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain62 = kuromojiAnalysisTests53.failureAndSuccessEvents;
        kuromojiAnalysisTests36.failureAndSuccessEvents = ruleChain62;
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain62;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) testRule19, (java.lang.Object) ruleChain62);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests11.assertFieldsEquals("europarl.lines.txt.gz", indexReader13, fields14, fields15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests11.assertPositionsSkippingEquals("hi!", indexReader19, (int) (byte) 0, postingsEnum21, postingsEnum22);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        kuromojiAnalysisTests11.assertTermsEquals("random", indexReader25, terms26, terms27, true);
        kuromojiAnalysisTests11.setUp();
        kuromojiAnalysisTests11.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.slow", (java.lang.Object) kuromojiAnalysisTests11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray5, byteArray9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        int[] intArray5 = new int[] { (byte) -1, (-1), (byte) 1, (short) -1 };
        int[] intArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
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
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), 0.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        short[] shortArray4 = new short[] { (short) -1, (byte) 0, (byte) 1, (byte) 10 };
        short[] shortArray8 = new short[] { (byte) 1, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
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
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale47, locale49, locale51, locale53, locale55 };
        java.util.Set<java.util.Locale> localeSet57 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray56);
        java.util.List<java.io.Serializable> serializableList58 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray56);
        java.util.Set<java.lang.Cloneable> cloneableSet59 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray56);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray56, (java.lang.Object) (byte) -1);
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale64, locale66, locale68, locale70, locale72 };
        java.util.Set<java.util.Locale> localeSet74 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray73);
        java.util.List<java.io.Serializable> serializableList75 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray73);
        java.util.Set<java.lang.Cloneable> cloneableSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray73);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray73, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray56, (java.lang.Object[]) localeArray73);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests80 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader82 = null;
        org.apache.lucene.index.Fields fields83 = null;
        org.apache.lucene.index.Fields fields84 = null;
        kuromojiAnalysisTests80.assertFieldsEquals("europarl.lines.txt.gz", indexReader82, fields83, fields84, false);
        kuromojiAnalysisTests80.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain89 = kuromojiAnalysisTests80.failureAndSuccessEvents;
        kuromojiAnalysisTests80.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray56, (java.lang.Object) kuromojiAnalysisTests80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", (java.lang.Object) localeArray56);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        char[] charArray3 = new char[] { '4', '#' };
        char[] charArray4 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 1, (short) 0, (byte) 10, (short) 0, (byte) 10 };
        short[] shortArray13 = new short[] { (short) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
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
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 0L, (double) 0.0f);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) '4');
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        double[] doubleArray7 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray7, doubleArray12, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) (-1L), (java.lang.Object) doubleArray12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray5, byteArray11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        short[] shortArray5 = new short[] { (short) 0, (byte) 100, (short) 10, (byte) 1 };
        short[] shortArray6 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray5, shortArray6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
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
        java.lang.String str14 = kuromojiAnalysisTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertPathHasBeenCleared("");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) doubleArray6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) '#');
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0.0d, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        byte[] byteArray3 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray2, byteArray3);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) (-1), (double) (short) 1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1L), (double) 1.0f, 100.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        kuromojiAnalysisTests17.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields20, fields21, false);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests17.assertPositionsSkippingEquals("hi!", indexReader25, (int) (byte) 0, postingsEnum27, postingsEnum28);
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests17.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) postingsEnum15, (java.lang.Object) kuromojiAnalysisTests17);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (byte) -1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        short[] shortArray2 = new short[] { (short) 10 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray2, shortArray3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (-1), (float) 100, (float) (-1L));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        short[] shortArray4 = new short[] { (byte) 1, (byte) 100, (byte) 100 };
        short[] shortArray6 = new short[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray6 = new int[] { 100, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", (double) (byte) 0, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        long[] longArray6 = new long[] { 0, (-1L), 0L, 0L, ' ' };
        long[] longArray12 = new long[] { 0, (byte) 10, 0L, 1L, 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray6, longArray12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        short[] shortArray0 = new short[] {};
        short[] shortArray3 = new short[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray3);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        float[] floatArray1 = new float[] {};
        float[] floatArray4 = new float[] { (short) 100, 10.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray4, (float) 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        short[] shortArray3 = new short[] { (byte) 1, (short) 10, (byte) -1 };
        short[] shortArray7 = new short[] { (short) 100, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        int[] intArray3 = new int[] { (-1), (byte) 10 };
        int[] intArray6 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray3, intArray6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (byte) 0, (double) 1L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        char[] charArray4 = new char[] { ' ', ' ', ' ' };
        char[] charArray11 = new char[] { ' ', '#', 'a', ' ', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray4, charArray11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.nightly", (int) 'a', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 0, (double) (byte) 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        short[] shortArray0 = new short[] {};
        short[] shortArray4 = new short[] { (short) 1, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        long[] longArray2 = new long[] { (short) 1, (-1L) };
        long[] longArray7 = new long[] { ' ', '#', (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0L, (float) 10, (float) 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { ' ', 100, 0, '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        short[] shortArray5 = new short[] { (byte) 1, (byte) 1, (short) 0, (short) 0 };
        short[] shortArray9 = new short[] { (short) 10, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 100L);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100L, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        char[] charArray5 = new char[] { 'a', '#', '4', 'a', 'a' };
        char[] charArray8 = new char[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule9 = kuromojiAnalysisTests0.ruleChain;
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule10, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1.0f), (double) 1L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader3, fields4, fields5, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.TestRule testRule10 = kuromojiAnalysisTests1.ruleChain;
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests1.ruleChain;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests12.assertPositionsSkippingEquals("tests.failfast", indexReader20, 1, postingsEnum22, postingsEnum23);
        kuromojiAnalysisTests12.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        char[] charArray5 = new char[] { ' ', ' ', '4', '#' };
        char[] charArray7 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray5, charArray7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[][] {};
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray1);
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests40 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        kuromojiAnalysisTests40.assertFieldsEquals("europarl.lines.txt.gz", indexReader42, fields43, fields44, false);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        kuromojiAnalysisTests40.assertPositionsSkippingEquals("tests.failfast", indexReader48, 1, postingsEnum50, postingsEnum51);
        kuromojiAnalysisTests40.setIndexWriterMaxDocs(0);
        kuromojiAnalysisTests40.ensureCleanedUp();
        kuromojiAnalysisTests40.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) localeArray33, (java.lang.Object) kuromojiAnalysisTests40);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale60, locale62, locale64, locale66, locale68 };
        java.util.Set<java.util.Locale> localeSet70 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray69);
        java.util.List<java.io.Serializable> serializableList71 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray69);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) localeArray33, (java.lang.Object[]) localeArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) genericDeclarationArray1, (java.lang.Object[]) localeArray69);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests22 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields25, fields26, false);
        kuromojiAnalysisTests22.ensureCleanedUp();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        kuromojiAnalysisTests22.ensureCleanedUp();
        java.lang.String str32 = kuromojiAnalysisTests22.getTestName();
        kuromojiAnalysisTests22.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule34 = kuromojiAnalysisTests22.ruleChain;
        kuromojiAnalysisTests22.setUp();
        kuromojiAnalysisTests22.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests22);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        char[] charArray4 = new char[] { 'a', 'a', 'a', '4' };
        char[] charArray8 = new char[] { 'a', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 100.0f, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0L, (double) 10L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
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
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray66, (java.lang.Object[]) executorServiceArray70);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        kuromojiAnalysisTests24.ensureCleanedUp();
        kuromojiAnalysisTests24.resetCheckIndexStatus();
        kuromojiAnalysisTests24.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("", indexReader35, (int) (byte) 0, postingsEnum37, postingsEnum38);
        kuromojiAnalysisTests24.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests24);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (-1L), (double) (byte) 1, (double) (short) 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
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
        org.apache.lucene.index.NumericDocValues numericDocValues74 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests57.assertDocValuesEquals("hi!", (int) (short) -1, numericDocValues74, numericDocValues75);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) annotatedElementArray16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        int[] intArray1 = new int[] {};
        int[] intArray7 = new int[] { ' ', (byte) 1, '#', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", intArray1, intArray7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 10L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1.0f, (double) ' ', 0.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
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
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale74 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale66, locale68, locale70, locale72, locale74 };
        java.util.Set<java.util.Locale> localeSet76 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "europarl.lines.txt.gz", "tests.badapples", "random" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet81 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray80);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) localeSet76, (java.lang.Object) strArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray60, (java.lang.Object[]) strArray80);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 0, 10L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.junit.rules.TestRule[] testRuleArray7 = new org.junit.rules.TestRule[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6 };
        java.util.Set<org.junit.rules.TestRule> testRuleSet8 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleArray7);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests9 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        kuromojiAnalysisTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader11, fields12, fields13, false);
        kuromojiAnalysisTests9.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain18 = kuromojiAnalysisTests9.failureAndSuccessEvents;
        kuromojiAnalysisTests9.setUp();
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
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests9, (java.lang.Object) localeArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) testRuleArray7, (java.lang.Object[]) localeArray59);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.failfast", (double) 0L, (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray14 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray9, doubleArray14, (double) (byte) 100);
        double[] doubleArray23 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray28 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray28, (double) (byte) 100);
        double[] doubleArray36 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray41 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray36, doubleArray41, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray36, (double) 0);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray23, (-1.0d));
        double[] doubleArray54 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray59 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray59, (double) (byte) 100);
        double[] doubleArray67 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray72 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray67, doubleArray72, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray54, doubleArray67, (double) 0);
        org.junit.Assert.assertArrayEquals("random", doubleArray9, doubleArray67, (double) 10.0f);
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet86 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray85);
        org.junit.Assert.assertNotEquals("hi!", (java.lang.Object) doubleArray9, (java.lang.Object) strArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray1, doubleArray9, (double) 1L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (byte) 1, (float) 100L, (float) 1L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray8);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 100);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (byte) 1, (double) 1L, (double) 10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, 0L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray6, byteArray10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        float[] floatArray6 = new float[] { (-1.0f), '#', (byte) 100, 10L, 10 };
        float[] floatArray13 = new float[] { 100.0f, '4', (-1), (short) 10, 10.0f, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray6, floatArray13, (float) (short) 10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        short[] shortArray2 = new short[] { (short) 1, (short) 0 };
        short[] shortArray3 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        float[] floatArray4 = new float[] { 1, (-1.0f), 10.0f };
        float[] floatArray6 = new float[] { (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray4, floatArray6, (float) 10L);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        short[] shortArray6 = new short[] { (byte) 1, (short) 100, (short) 1, (byte) 10, (byte) -1, (byte) 1 };
        short[] shortArray9 = new short[] { (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) 10, 1.0d, 100.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) '4', 0L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
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
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 1, obj17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        long[] longArray2 = new long[] { (short) 100 };
        long[] longArray7 = new long[] { (byte) 100, 0, 10L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray2, longArray7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        long[] longArray4 = new long[] { 'a', 1, 100L };
        long[] longArray6 = new long[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray4, longArray6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { ' ', (byte) 100, 0, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        short[] shortArray4 = new short[] { (byte) 10, (short) 0, (short) 10, (byte) 0 };
        short[] shortArray7 = new short[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", 100.0d, (double) 'a', (double) (byte) 10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
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
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("", indexReader24, fields25, fields26, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests29 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Fields fields32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        kuromojiAnalysisTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields32, fields33, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests36 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests36.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields39, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests36.assertPositionsSkippingEquals("hi!", indexReader44, (int) (byte) 0, postingsEnum46, postingsEnum47);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray49 = new org.elasticsearch.test.ESTestCase[] { kuromojiAnalysisTests2, kuromojiAnalysisTests29, kuromojiAnalysisTests36 };
        java.util.List<org.elasticsearch.test.ESTestCase> eSTestCaseList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, eSTestCaseArray49);
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray63 = new java.util.Locale[] { locale54, locale56, locale58, locale60, locale62 };
        java.util.Set<java.util.Locale> localeSet64 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray63);
        java.util.List<java.io.Serializable> serializableList65 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray63);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray63, (java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) eSTestCaseArray49, (java.lang.Object[]) localeArray63);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.weekly", indexReader4, terms5, terms6, true);
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        long[] longArray4 = new long[] { (-1), '4', 100L };
        long[] longArray6 = new long[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray4, longArray6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        char[] charArray6 = new char[] { '4', '#', '#', '#', ' ', '#' };
        char[] charArray7 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray7, byteArray13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        float[] floatArray4 = new float[] { (byte) 0, (-1.0f), (byte) -1, (short) 0 };
        float[] floatArray11 = new float[] { 100L, 0, 'a', (byte) -1, 1L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray11, (float) (byte) -1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 100);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 0, (long) (-1));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray5, byteArray9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        short[] shortArray4 = new short[] { (short) 1, (byte) 100, (byte) 1, (short) 100 };
        short[] shortArray5 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray5);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
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
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale46, locale48, locale50, locale52, locale54 };
        java.util.Set<java.util.Locale> localeSet56 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray55);
        java.util.List<java.io.Serializable> serializableList57 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray55);
        java.util.Set<java.lang.Cloneable> cloneableSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray55);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray55, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray38, (java.lang.Object[]) localeArray55);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests62 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Fields fields65 = null;
        org.apache.lucene.index.Fields fields66 = null;
        kuromojiAnalysisTests62.assertFieldsEquals("europarl.lines.txt.gz", indexReader64, fields65, fields66, false);
        kuromojiAnalysisTests62.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain71 = kuromojiAnalysisTests62.failureAndSuccessEvents;
        kuromojiAnalysisTests62.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray38, (java.lang.Object) kuromojiAnalysisTests62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain22, (java.lang.Object) localeArray38);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        long[] longArray6 = new long[] { 0L, (short) 100, 10L, '4', (short) 1 };
        long[] longArray9 = new long[] { '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray6, longArray9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        char[] charArray2 = new char[] { '#', '#' };
        char[] charArray4 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
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
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
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
        java.lang.String str15 = kuromojiAnalysisTests2.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        kuromojiAnalysisTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests16.assertPositionsSkippingEquals("hi!", indexReader24, (int) (byte) 0, postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests16.assertTermsEquals("random", indexReader30, terms31, terms32, true);
        kuromojiAnalysisTests16.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        kuromojiAnalysisTests16.assertDocsEnumEquals("tests.nightly", postingsEnum37, postingsEnum38, true);
        kuromojiAnalysisTests16.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        long[] longArray3 = new long[] { ' ', (byte) 1 };
        long[] longArray6 = new long[] { 'a', (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray3, longArray6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        char[] charArray3 = new char[] { ' ', ' ', ' ' };
        char[] charArray6 = new char[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        float[] floatArray2 = new float[] { 0L, (byte) 10 };
        float[] floatArray7 = new float[] { 'a', (-1), (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) ' ');
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) '#', (long) '#');
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 100, 10 };
        float[] floatArray11 = new float[] { 10L, 10, (byte) 0, (short) 0, 1L, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray4, floatArray11, (float) (byte) 100);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (-1));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 1.0f, (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        char[] charArray4 = new char[] { ' ', '#', 'a' };
        char[] charArray11 = new char[] { '#', 'a', '4', '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100, (double) 0L, (double) 1);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        short[] shortArray7 = new short[] { (byte) 1, (short) 100, (short) 10, (short) 0, (byte) 1, (short) 0 };
        short[] shortArray14 = new short[] { (byte) 1, (byte) 1, (byte) -1, (short) 1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray7, shortArray14);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 10.0f, 10.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        char[] charArray4 = new char[] { '4', 'a', '4' };
        char[] charArray10 = new char[] { '#', '4', '4', '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray4, charArray10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 1, (double) 10L, (double) (byte) 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray6, byteArray7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        float[] floatArray0 = null;
        float[] floatArray5 = new float[] { (byte) -1, 0.0f, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        char[] charArray1 = new char[] { '#' };
        char[] charArray6 = new char[] { 'a', '4', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 'a', (float) (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        float[] floatArray2 = new float[] { 1 };
        float[] floatArray8 = new float[] { (short) 1, (byte) 0, 0.0f, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray2, floatArray8, (float) (byte) 10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
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
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray44, 0.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        int[] intArray7 = new int[] { (byte) 100, '4', 100, '4', (short) 0, (short) 10 };
        int[] intArray11 = new int[] { (byte) 10, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray7, intArray11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 0, 100.0d, 0.0d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        short[] shortArray1 = null;
        short[] shortArray8 = new short[] { (short) -1, (byte) -1, (short) -1, (short) 1, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray1, shortArray8);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        kuromojiAnalysisTests12.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, false);
        kuromojiAnalysisTests12.ensureCleanedUp();
        kuromojiAnalysisTests12.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule21 = kuromojiAnalysisTests12.ruleChain;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) testRule21);
        kuromojiAnalysisTests2.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        kuromojiAnalysisTests24.assertFieldsEquals("europarl.lines.txt.gz", indexReader26, fields27, fields28, false);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        kuromojiAnalysisTests24.assertPositionsSkippingEquals("hi!", indexReader32, (int) (byte) 0, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        kuromojiAnalysisTests24.assertTermsEquals("random", indexReader38, terms39, terms40, true);
        kuromojiAnalysisTests24.setUp();
        kuromojiAnalysisTests24.setIndexWriterMaxDocs((-1));
        kuromojiAnalysisTests24.assertPathHasBeenCleared("tests.monster");
        kuromojiAnalysisTests24.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) kuromojiAnalysisTests24);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        long[] longArray3 = new long[] { (byte) 1, '4', (byte) 100 };
        long[] longArray7 = new long[] { 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        short[] shortArray1 = new short[] {};
        short[] shortArray7 = new short[] { (byte) 10, (short) -1, (short) 1, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray1, shortArray7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("hi!", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule14 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        long[] longArray5 = new long[] { ' ', ' ', 'a', 1L, '4' };
        long[] longArray11 = new long[] { 0, (byte) 100, 10L, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        char[] charArray3 = new char[] { ' ', '4', '4' };
        char[] charArray6 = new char[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale2, locale4, locale6 };
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale9, locale11, locale13 };
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale16, locale18, locale20 };
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale23, locale25, locale27 };
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale30, locale32, locale34 };
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale37, locale39, locale41 };
        java.util.Locale[][] localeArray43 = new java.util.Locale[][] { localeArray7, localeArray14, localeArray21, localeArray28, localeArray35, localeArray42 };
        java.util.Set<java.util.Locale[]> localeArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale54 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray57 = new java.util.Locale[] { locale48, locale50, locale52, locale54, locale56 };
        java.util.Set<java.util.Locale> localeSet58 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray57);
        java.util.List<java.io.Serializable> serializableList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray57);
        java.util.Set<java.lang.Cloneable> cloneableSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray57);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray57, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) localeArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) localeArray43, (java.lang.Object[]) localeArray57);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertPathHasBeenCleared("");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (double) '#', (double) '#', (double) 1L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        float[] floatArray7 = new float[] { 10L, 100.0f, '4', 0, 100L, (short) -1 };
        float[] floatArray9 = new float[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray9, (float) (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 0.0f);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        java.lang.Object[] objArray1 = null;
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
        org.junit.Assert.assertEquals("tests.slow", objArray1, (java.lang.Object[]) localeArray32);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        float[] floatArray2 = new float[] { '4', 0 };
        float[] floatArray4 = new float[] { 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray4, (-1.0f));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        char[] charArray7 = new char[] { '4', '#', 'a', 'a', 'a', '#' };
        char[] charArray8 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray7, charArray8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { (short) 1, (short) -1, (short) 0, '#', (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 'a', 1.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) 0L, (double) 1.0f, (double) (short) 100);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
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
        org.apache.lucene.index.NumericDocValues numericDocValues52 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("hi!", 1, numericDocValues52, numericDocValues53);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) ' ');
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        float[] floatArray7 = new float[] { 0, (short) 100, 1L, '#', (-1.0f), (byte) 1 };
        float[] floatArray10 = new float[] { (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray7, floatArray10, 10.0f);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) '#', numericDocValues11, numericDocValues12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain9 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.weekly", indexReader16, terms17, terms18, true);
        kuromojiAnalysisTests12.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str11, (java.lang.Object) kuromojiAnalysisTests12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (double) (-1.0f), 0.0d, (double) ' ');
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, (double) 10.0f, (double) 100L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale3, locale5, locale7, locale9, locale11 };
        java.util.Set<java.util.Locale> localeSet13 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray12);
        java.util.List<java.io.Serializable> serializableList14 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling18 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (byte) 0, throttlingArray19);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) throttlingArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) localeArray12, (java.lang.Object[]) throttlingArray19);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.setUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale15, locale17, locale19, locale21, locale23 };
        java.util.Set<java.util.Locale> localeSet25 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale28, locale30, locale32, locale34, locale36 };
        java.util.Set<java.util.Locale> localeSet38 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.List<java.io.Serializable> serializableList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray24, (java.lang.Object[]) localeArray37);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale43, locale45, locale47, locale49, locale51 };
        java.util.Set<java.util.Locale> localeSet53 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray52);
        java.util.List<java.io.Serializable> serializableList54 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray52);
        java.util.Set<java.lang.Cloneable> cloneableSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) localeArray37, (java.lang.Object[]) localeArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) localeArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray1, (java.lang.Object[]) localeArray52);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
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
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests30 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests30.setIndexWriterMaxDocs((int) (byte) 10);
        kuromojiAnalysisTests30.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests30);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) '4');
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum2, postingsEnum3, false);
        org.junit.rules.TestRule testRule6 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        double[] doubleArray6 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray11, (double) (byte) 100);
        double[] doubleArray19 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray24 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray19, doubleArray24, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals("", doubleArray6, doubleArray19, (double) 0);
        double[] doubleArray34 = new double[] { 0, (-1), 100L, 1.0f };
        double[] doubleArray39 = new double[] { (byte) 10, 10.0d, 10.0f, (short) 100 };
        org.junit.Assert.assertArrayEquals("", doubleArray34, doubleArray39, (double) (byte) 100);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray34, 0.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) doubleArray34, (java.lang.Object) ' ');
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
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
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests65 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Fields fields68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        kuromojiAnalysisTests65.assertFieldsEquals("europarl.lines.txt.gz", indexReader67, fields68, fields69, false);
        kuromojiAnalysisTests65.assertPathHasBeenCleared("tests.slow");
        kuromojiAnalysisTests65.tearDown();
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        kuromojiAnalysisTests65.assertTermsEquals("tests.weekly", indexReader76, terms77, terms78, true);
        java.lang.Class<?> wildcardClass81 = kuromojiAnalysisTests65.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) localeArray61, (java.lang.Object) kuromojiAnalysisTests65);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10.0f, (short) -1, 1.0d, 0.0d, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) (short) 10, (double) '#');
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 100, 0.0f, 0.0f);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        kuromojiAnalysisTests2.assertFieldsEquals("europarl.lines.txt.gz", indexReader4, fields5, fields6, false);
        kuromojiAnalysisTests2.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.setIndexWriterMaxDocs((int) (byte) 10);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.weekly", indexReader18, terms19, terms20, true);
        kuromojiAnalysisTests14.setIndexWriterMaxDocs((int) '#');
        kuromojiAnalysisTests14.overrideTestDefaultQueryCache();
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) ruleChain11, (java.lang.Object) kuromojiAnalysisTests14);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale29, locale31, locale33, locale35, locale37 };
        java.util.Set<java.util.Locale> localeSet39 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "tests.weekly", (java.lang.Object) localeArray38);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        int[] intArray2 = new int[] { '#' };
        int[] intArray4 = new int[] { '#' };
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray11 = new int[] { 'a', 10, (short) 0, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
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
        java.util.List[] listArray74 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.io.Serializable>[] serializableListArray75 = (java.util.List<java.io.Serializable>[]) listArray74;
        java.util.Set<java.util.List<java.io.Serializable>> serializableListSet76 = org.apache.lucene.util.LuceneTestCase.asSet(serializableListArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) localeArray66, (java.lang.Object[]) serializableListArray75);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        float[] floatArray6 = new float[] { (byte) -1, 0L, (byte) 1, 100L, (byte) 10 };
        float[] floatArray8 = new float[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray6, floatArray8, (float) 1L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        float[] floatArray5 = new float[] { (byte) 100, 100, '4', (byte) 1, (byte) 10 };
        float[] floatArray11 = new float[] { 1.0f, 0.0f, 10.0f, ' ', 100.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) (short) 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale2, locale4, locale6, locale8, locale10 };
        java.util.Set<java.util.Locale> localeSet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.List<java.io.Serializable> serializableList13 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray11);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.awaitsfix", "europarl.lines.txt.gz", "tests.slow", "tests.maxfailures", "", "hi!" };
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray11, (java.lang.Object[]) strArray20);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray3, executorServiceArray4, executorServiceArray5, executorServiceArray6, executorServiceArray7 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList9 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, executorServiceArray8);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray23 = new java.util.Locale[] { locale14, locale16, locale18, locale20, locale22 };
        java.util.Set<java.util.Locale> localeSet24 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray23);
        java.util.List<java.io.Serializable> serializableList25 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray23);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray23, (java.lang.Object) 0.0f);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale31, locale33, locale35, locale37, locale39 };
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray40);
        java.util.List<java.io.Serializable> serializableList42 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray40);
        org.junit.Assert.assertNotSame("", (java.lang.Object) localeArray40, (java.lang.Object) 0.0f);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) localeArray23, (java.lang.Object[]) localeArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) localeArray23);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        long[] longArray7 = new long[] { (short) 10, (-1L), (-1), (short) -1, (byte) 10, ' ' };
        long[] longArray14 = new long[] { 1L, 0L, (short) 100, (byte) -1, 100L, 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        short[] shortArray7 = new short[] { (short) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        short[] shortArray8 = new short[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray7, shortArray8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 1, (float) 'a', (float) ' ');
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray39, objArray44);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader2, fields3, fields4, false);
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("");
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale13, locale15, locale17, locale19, locale21 };
        java.util.Set<java.util.Locale> localeSet23 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray22);
        java.util.List<java.io.Serializable> serializableList24 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 1, (java.io.Serializable[]) localeArray22);
        java.util.Set<java.lang.Cloneable> cloneableSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) localeArray22);
        org.junit.Assert.assertNotEquals((java.lang.Object) localeArray22, (java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) localeArray22, (java.lang.Object[]) localeArray39);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Fields fields49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        kuromojiAnalysisTests46.assertFieldsEquals("europarl.lines.txt.gz", indexReader48, fields49, fields50, false);
        kuromojiAnalysisTests46.assertPathHasBeenCleared("tests.slow");
        org.junit.rules.RuleChain ruleChain55 = kuromojiAnalysisTests46.failureAndSuccessEvents;
        kuromojiAnalysisTests46.setUp();
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) localeArray22, (java.lang.Object) kuromojiAnalysisTests46);
        kuromojiAnalysisTests46.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests46);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray7 = new char[] { 'a', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        long[] longArray0 = new long[] {};
        long[] longArray3 = new long[] { (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }
}

