import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putDouble((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        response3.executed = true;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response3.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        java.lang.String str10 = response2.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.headers();
        org.jsoup.Connection.Request request12 = response2.req;
        response2.statusCode = 0;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.limit();
        byte[] byteArray11 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.put(byteArray11);
        int int13 = byteBuffer12.position();
        java.nio.Buffer buffer14 = byteBuffer12.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.statusCode = 22;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response2.headers();
        int int4 = response2.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer10 = byteBuffer9.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer12 = byteBuffer9.limit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(longBuffer10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder7 = null;
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.order(byteOrder7);
        int int9 = byteBuffer8.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer8.putFloat((-32), (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        java.lang.String str11 = response3.charset();
        response3.statusCode = 100;
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer15.slice();
        response3.byteData = byteBuffer15;
        response3.executed = false;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean8 = response3.hasHeader("hi!");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response3.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        boolean boolean18 = byteBuffer14.isReadOnly();
        int int19 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.isReadOnly();
        java.nio.ShortBuffer shortBuffer23 = byteBuffer21.asShortBuffer();
        int int24 = byteBuffer21.position();
        java.nio.ByteOrder byteOrder25 = null;
        java.nio.ByteBuffer byteBuffer26 = byteBuffer21.order(byteOrder25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer21.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer28 = byteBuffer8.put(byteBuffer27);
        response2.byteData = byteBuffer28;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putChar(3, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        java.net.URL uRL9 = response2.url();
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.mark();
        int int9 = byteBuffer5.position();
        // The following exception was thrown during execution in test generation
        try {
            char char10 = byteBuffer5.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str7 = response3.contentType;
        java.nio.ByteBuffer byteBuffer8 = response3.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.IntBuffer intBuffer13 = byteBuffer7.asIntBuffer();
        java.nio.Buffer buffer14 = intBuffer13.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intBuffer13);
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        int int9 = byteBuffer7.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer11 = byteBuffer7.limit((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.nio.ByteBuffer byteBuffer10 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str13 = response11.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.lang.String str13 = byteBuffer12.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = byteBuffer12.getInt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str13, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        byte[] byteArray9 = byteBuffer6.array();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.put(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            short short12 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.duplicate();
        byte[] byteArray8 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray8, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        int int26 = byteBuffer23.position();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer23.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer23.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer29.slice();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.duplicate();
        int int32 = byteBuffer20.compareTo(byteBuffer29);
        java.nio.Buffer buffer33 = byteBuffer20.rewind();
        org.jsoup.helper.HttpConnection.Response response34 = null;
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response34);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response34);
        boolean boolean37 = response36.executed;
        java.lang.String str39 = response36.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = response36.headers();
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocate(0);
        boolean boolean43 = byteBuffer42.isReadOnly();
        java.nio.ShortBuffer shortBuffer44 = byteBuffer42.asShortBuffer();
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.allocate(0);
        boolean boolean47 = byteBuffer46.isReadOnly();
        int int48 = byteBuffer42.compareTo(byteBuffer46);
        java.nio.Buffer buffer49 = byteBuffer46.clear();
        java.nio.ByteBuffer byteBuffer51 = java.nio.ByteBuffer.allocate(0);
        boolean boolean52 = byteBuffer51.hasRemaining();
        java.nio.ByteBuffer byteBuffer53 = byteBuffer46.put(byteBuffer51);
        response36.byteData = byteBuffer53;
        int int55 = byteBuffer53.capacity();
        boolean boolean56 = byteBuffer53.isReadOnly();
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.compact();
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.allocate(0);
        boolean boolean60 = byteBuffer59.isReadOnly();
        java.nio.ShortBuffer shortBuffer61 = byteBuffer59.asShortBuffer();
        int int62 = byteBuffer59.position();
        int int63 = byteBuffer59.arrayOffset();
        java.nio.IntBuffer intBuffer64 = byteBuffer59.asIntBuffer();
        java.nio.ByteBuffer byteBuffer65 = byteBuffer59.duplicate();
        byte[] byteArray66 = byteBuffer65.array();
        java.nio.ByteBuffer byteBuffer67 = byteBuffer57.put(byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer70 = byteBuffer20.get(byteArray66, 13, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(buffer33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(buffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortBuffer61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(intBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteBuffer67);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer14.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer18 = byteBuffer14.asFloatBuffer();
        java.lang.String str19 = byteBuffer14.toString();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer1.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer1.put((byte) 100);
        int int24 = byteBuffer22.getInt(0);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(floatBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str19, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        org.jsoup.Connection.Request request10 = response4.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        int int6 = byteBuffer5.arrayOffset();
        byte[] byteArray7 = new byte[] {};
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray7);
        java.nio.Buffer buffer9 = byteBuffer8.flip();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder11 = byteBuffer10.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        int int18 = byteBuffer14.arrayOffset();
        java.nio.IntBuffer intBuffer19 = byteBuffer14.asIntBuffer();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.duplicate();
        byte[] byteArray21 = byteBuffer20.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer5.put(byteArray21, (int) (byte) -1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = shortBuffer3.capacity();
        int int5 = shortBuffer3.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        java.lang.String str11 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        response12.contentType = "java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]";
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.ShortBuffer shortBuffer6 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putInt(35);
        java.lang.Class<?> wildcardClass9 = byteBuffer5.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean7 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        java.lang.String str8 = response3.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        int int4 = byteBuffer3.limit();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder6 = byteBuffer3.order();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer20 = response5.byteData;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = byteBuffer20.getLong((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean8 = byteBuffer1.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble((int) (short) 100, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean7 = byteBuffer1.hasRemaining();
        byte[] byteArray8 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray8, 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response12.hasCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        response12.executed = false;
        java.nio.ByteBuffer byteBuffer17 = response12.byteData;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
        java.nio.Buffer buffer6 = byteBuffer4.mark();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = byteBuffer4.getLong((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        int int19 = byteBuffer13.compareTo(byteBuffer17);
        java.nio.DoubleBuffer doubleBuffer20 = byteBuffer17.asDoubleBuffer();
        response2.byteData = byteBuffer17;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str23 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response2.method(method25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.Connection.Request request0 = null;
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.allocate(0);
        boolean boolean3 = byteBuffer2.isReadOnly();
        java.nio.ShortBuffer shortBuffer4 = byteBuffer2.asShortBuffer();
        int int5 = byteBuffer2.position();
        boolean boolean6 = byteBuffer2.isReadOnly();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        int int13 = byteBuffer2.compareTo(byteBuffer8);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.position();
        java.nio.ByteOrder byteOrder19 = null;
        java.nio.ByteBuffer byteBuffer20 = byteBuffer15.order(byteOrder19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer2.put(byteBuffer21);
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.nio.ByteBuffer byteBuffer27 = response26.byteData;
        boolean boolean28 = byteBuffer2.equals((java.lang.Object) response26);
        org.jsoup.Connection.Response response30 = response26.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response26.headers();
        response26.charset = "";
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response35 = org.jsoup.helper.HttpConnection.Response.execute(request0, response26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        boolean boolean9 = response3.hasCookie("");
        response3.contentType = "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]";
        org.jsoup.Connection.Response response13 = response3.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putFloat(65, (float) 1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.Buffer buffer20 = byteBuffer18.reset();
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer18.asDoubleBuffer();
        boolean boolean23 = byteBuffer18.equals((java.lang.Object) 3);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        boolean boolean28 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.put(byteBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = byteBuffer25.getDouble(1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.CharBuffer charBuffer6 = byteBuffer5.asCharBuffer();
        int int7 = byteBuffer5.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        boolean boolean16 = byteBuffer14.isDirect();
        java.nio.Buffer buffer17 = byteBuffer14.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer19 = byteBuffer14.limit(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(buffer17);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = byteBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        char char11 = byteBuffer10.getChar();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        java.nio.FloatBuffer floatBuffer13 = byteBuffer12.asFloatBuffer();
        int int14 = byteBuffer12.capacity();
        java.nio.Buffer buffer16 = byteBuffer12.limit((int) (short) 10);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        int int21 = byteBuffer18.position();
        int int22 = byteBuffer18.capacity();
        byte[] byteArray23 = byteBuffer18.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer12.put(byteArray23, (int) '\u2300', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(floatBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 85 + "'", int14 == 85);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer3 = byteBuffer1.limit((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Request request13 = null;
        response12.req = request13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response12.cookies();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        org.jsoup.Connection.Response response8 = response3.header("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]", "");
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str12 = response3.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.lang.String str6 = byteBuffer1.toString();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(doubleBuffer7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.Buffer buffer20 = byteBuffer18.reset();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.isReadOnly();
        java.nio.ShortBuffer shortBuffer24 = byteBuffer22.asShortBuffer();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        boolean boolean27 = byteBuffer26.isReadOnly();
        int int28 = byteBuffer22.compareTo(byteBuffer26);
        java.nio.DoubleBuffer doubleBuffer29 = byteBuffer26.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer30 = byteBuffer26.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.wrap(byteArray36);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer32.get(byteArray36);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer26.put(byteArray36, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.wrap(byteArray36);
        byte[] byteArray43 = new byte[] {};
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.wrap(byteArray43);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer42.get(byteArray43);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer18.put(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer48 = byteBuffer18.putShort((short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer29);
        org.junit.Assert.assertNotNull(floatBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder12 = byteBuffer1.order();
        float float13 = byteBuffer1.getFloat();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(byteBuffer4);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.get(byteArray9);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer15.putLong((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.lang.String str6 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putLong(97, (long) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.nio.ByteBuffer byteBuffer10 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        boolean boolean10 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.nio.ByteBuffer byteBuffer11 = response3.byteData;
        int int12 = response3.numRedirects;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ShortBuffer shortBuffer7 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer6.putDouble((double) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.ShortBuffer shortBuffer6 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            short short9 = byteBuffer1.getShort((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        int int14 = byteBuffer11.position();
        int int15 = byteBuffer11.capacity();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer8.put(byteBuffer11);
        byte[] byteArray17 = byteBuffer16.array();
        int int18 = byteBuffer16.remaining();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            byte byte21 = byteBuffer16.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(byteBuffer4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteOrder byteOrder10 = null;
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.order(byteOrder10);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer11.asReadOnlyBuffer();
        java.nio.Buffer buffer14 = byteBuffer11.position((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer16.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        byte[] byteArray19 = byteBuffer16.array();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer11.get(byteArray19);
        int int21 = byteBuffer5.compareTo(byteBuffer11);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int24 = byteBuffer23.limit();
        byte[] byteArray25 = byteBuffer23.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = byteBuffer11.put(byteArray25, 2, (int) '\u2300');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteOrder byteOrder14 = null;
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.order(byteOrder14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer17.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        int int20 = byteBuffer17.limit();
        byte[] byteArray21 = byteBuffer17.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer11.put(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer9.get(byteArray21);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.wrap(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = byteBuffer25.putDouble((int) (short) 1, (double) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        char char11 = byteBuffer10.getChar();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        float float13 = byteBuffer10.getFloat();
        boolean boolean14 = byteBuffer10.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.put((byte) 10);
        java.nio.Buffer buffer9 = byteBuffer8.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putDouble((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.putLong((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        boolean boolean9 = doubleBuffer8.isReadOnly();
        boolean boolean10 = doubleBuffer8.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer12.compact();
        int int14 = byteBuffer13.limit();
        int int15 = byteBuffer13.position();
        java.nio.Buffer buffer17 = byteBuffer13.position((int) (byte) 0);
        byte[] byteArray18 = byteBuffer13.array();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int21 = byteBuffer20.getInt();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put((int) (byte) 0, (byte) 10);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        boolean boolean27 = byteBuffer26.isReadOnly();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        boolean boolean31 = byteBuffer30.isReadOnly();
        int int32 = byteBuffer26.compareTo(byteBuffer30);
        java.nio.DoubleBuffer doubleBuffer33 = byteBuffer30.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer34 = byteBuffer30.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.wrap(byteArray40);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer36.get(byteArray40);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer30.put(byteArray40, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.wrap(byteArray40);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer20.put(byteArray40);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer20.duplicate();
        java.lang.String str49 = byteBuffer20.toString();
        int int50 = byteBuffer13.compareTo(byteBuffer20);
        boolean boolean51 = byteBuffer13.isDirect();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer33);
        org.junit.Assert.assertNotNull(floatBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.nio.HeapByteBuffer[pos=7 lim=10 cap=10]" + "'", str49, "java.nio.HeapByteBuffer[pos=7 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-3) + "'", int50 == (-3));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        java.lang.String str9 = response3.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        org.jsoup.Connection.Method method8 = response5.method();
        java.lang.String str9 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean12 = response11.executed;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.IntBuffer intBuffer22 = byteBuffer20.asIntBuffer();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer20.slice();
        int int24 = byteBuffer23.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer26 = byteBuffer23.position(85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (85 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putShort((short) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str10, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteOrder byteOrder14 = null;
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.order(byteOrder14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer17.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        int int20 = byteBuffer17.limit();
        byte[] byteArray21 = byteBuffer17.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer11.put(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer9.get(byteArray21);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putFloat((float) 13);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        // The following exception was thrown during execution in test generation
        try {
            short short18 = byteBuffer15.getShort(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.net.URL uRL8 = response1.url();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        boolean boolean9 = response3.hasCookie("");
        response3.contentType = "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]";
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response3.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        java.lang.String str6 = byteBuffer1.toString();
        boolean boolean7 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int10 = byteBuffer9.limit();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer9.putChar(' ');
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteOrder byteOrder17 = null;
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.order(byteOrder17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        int int23 = byteBuffer20.limit();
        byte[] byteArray24 = byteBuffer20.array();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer14.put(byteArray24);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer9.put(byteArray24);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer1.get(byteArray24);
        java.nio.Buffer buffer29 = byteBuffer1.limit(3);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer31 = byteBuffer1.limit(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(buffer29);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        java.lang.String str11 = response3.contentType();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean16 = response15.executed;
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        java.lang.String str20 = response15.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response23 = response15.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer24 = response15.byteData;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(byteBuffer24);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.limit();
        byte[] byteArray11 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.put(byteArray11);
        java.nio.Buffer buffer13 = byteBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer1.putLong(13, (long) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(buffer13);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        org.jsoup.Connection.Method method8 = response5.method();
        java.lang.String str9 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response5.cookies();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        int int13 = byteBuffer7.compareTo(byteBuffer11);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer11.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer15 = byteBuffer11.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer17.get(byteArray21);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer11.put(byteArray21, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer1.put(byteArray21);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer1.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putLong((long) 35);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertNotNull(floatBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        java.lang.String str9 = response2.statusMessage();
        int int10 = response2.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.Buffer buffer3 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putInt(10, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(buffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        boolean boolean6 = longBuffer5.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer3 = byteBuffer1.limit(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.FloatBuffer floatBuffer14 = byteBuffer5.asFloatBuffer();
        java.nio.IntBuffer intBuffer15 = byteBuffer5.asIntBuffer();
        java.nio.Buffer buffer16 = intBuffer15.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(floatBuffer14);
        org.junit.Assert.assertNotNull(intBuffer15);
        org.junit.Assert.assertNotNull(buffer16);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        int int10 = byteBuffer5.position();
        java.nio.Buffer buffer11 = byteBuffer5.mark();
        java.nio.FloatBuffer floatBuffer12 = byteBuffer5.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        int int20 = byteBuffer14.compareTo(byteBuffer18);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer18.compact();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.slice();
        byte[] byteArray23 = byteBuffer18.array();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer5.put(byteArray23, 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertNotNull(floatBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        boolean boolean3 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt(9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        java.lang.String str7 = response2.charset();
        java.lang.String str9 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str10 = response2.charset;
        int int11 = response2.statusCode();
        int int12 = response2.numRedirects;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response6.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        int int13 = byteBuffer7.compareTo(byteBuffer11);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer11.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer15 = byteBuffer11.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer17.get(byteArray21);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer11.put(byteArray21, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer1.put(byteArray21);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer29.putShort((-1), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertNotNull(floatBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            short short6 = byteBuffer4.getShort(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.Connection.Response response12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response14 = response3.removeHeader("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        int int15 = response3.numRedirects;
        boolean boolean16 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response19 = response17.removeCookie("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer1.mark();
        java.nio.Buffer buffer7 = buffer6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = buffer7.position(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (7 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer10 = response9.byteData;
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) 1677787392);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer19.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        int int22 = byteBuffer13.compareTo(byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = byteBuffer13.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = 0;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response7 = response4.header("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]", "java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response16.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.charset();
        response2.numRedirects = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        long long4 = byteBuffer2.getLong(70);
        double double5 = byteBuffer2.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.nio.Buffer buffer8 = byteBuffer6.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putInt(32);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        java.net.URL uRL9 = response4.url();
        response4.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str12 = response4.contentType();
        java.lang.String str13 = response4.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.statusMessage;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        int int13 = byteBuffer7.limit();
        java.nio.CharBuffer charBuffer14 = byteBuffer7.asCharBuffer();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer16.slice();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.asReadOnlyBuffer();
        int int20 = byteBuffer7.compareTo(byteBuffer16);
        java.nio.LongBuffer longBuffer21 = byteBuffer16.asLongBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(longBuffer21);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        boolean boolean18 = byteBuffer15.hasArray();
        java.nio.Buffer buffer20 = byteBuffer15.position((int) (byte) 0);
        int int21 = byteBuffer13.compareTo(byteBuffer15);
        int int22 = byteBuffer15.remaining();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer15.duplicate();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.duplicate();
        java.nio.IntBuffer intBuffer25 = byteBuffer15.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer27 = byteBuffer15.position((int) '\u0a00');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (2560 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(intBuffer25);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(35);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(1, '\000');
        int int5 = byteBuffer4.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response12.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer14.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer18 = byteBuffer14.asFloatBuffer();
        java.lang.String str19 = byteBuffer14.toString();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer1.put(byteBuffer14);
        boolean boolean21 = byteBuffer14.hasArray();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocateDirect(70);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.wrap(byteArray29);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer25.get(byteArray29);
        java.nio.LongBuffer longBuffer32 = byteBuffer25.asLongBuffer();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer25.slice();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer36 = byteBuffer35.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer37 = byteBuffer35.asShortBuffer();
        java.nio.ByteOrder byteOrder38 = null;
        java.nio.ByteBuffer byteBuffer39 = byteBuffer35.order(byteOrder38);
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer42 = byteBuffer41.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer43 = byteBuffer41.asShortBuffer();
        int int44 = byteBuffer41.limit();
        byte[] byteArray45 = byteBuffer41.array();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer35.put(byteArray45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer33.get(byteArray45);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.wrap(byteArray45);
        java.nio.ByteBuffer byteBuffer49 = byteBuffer23.get(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer52 = byteBuffer14.get(byteArray45, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(floatBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str19, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(longBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(doubleBuffer36);
        org.junit.Assert.assertNotNull(shortBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(doubleBuffer42);
        org.junit.Assert.assertNotNull(shortBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        java.nio.Buffer buffer6 = longBuffer5.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.lang.String str10 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.executed = false;
        java.lang.String str14 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer12.compact();
        int int14 = byteBuffer13.limit();
        int int15 = byteBuffer13.position();
        java.nio.Buffer buffer17 = byteBuffer13.position((int) (byte) 0);
        int int18 = buffer17.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        java.lang.String str13 = response1.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putDouble((double) '\000');
        float float6 = byteBuffer5.getFloat();
        float float8 = byteBuffer5.getFloat((int) (short) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putFloat((float) 1);
        double double11 = byteBuffer10.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer10.put(167772160, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putFloat((int) '\000', (float) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer10.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putChar('\u2300');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(1677787392);
        int int2 = byteBuffer1.getInt();
        java.nio.DoubleBuffer doubleBuffer3 = byteBuffer1.asDoubleBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer12.compact();
        int int14 = byteBuffer13.limit();
        int int15 = byteBuffer13.position();
        java.nio.Buffer buffer17 = byteBuffer13.position((int) (byte) 0);
        byte[] byteArray18 = byteBuffer13.array();
        // The following exception was thrown during execution in test generation
        try {
            short short19 = byteBuffer13.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        response18.numRedirects = 'a';
        org.jsoup.Connection.Response response23 = response18.cookie("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]", "java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        // The following exception was thrown during execution in test generation
        try {
            response12.setupFromConnection(httpURLConnection13, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer3.position(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (70 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        response4.contentType = "";
        java.lang.String str8 = response4.statusMessage();
        org.jsoup.Connection.Request request9 = response4.req;
        java.lang.String str10 = response4.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL12 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        org.jsoup.Connection.Request request10 = response2.req;
        java.lang.String str11 = response2.charset();
        response2.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        response2.contentType = "java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]";
        java.lang.String str16 = response2.statusMessage();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str16, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.mark();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putInt((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.ShortBuffer shortBuffer6 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putInt(35);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putShort(85, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = byteBuffer5.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        int int9 = byteBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method12 = response11.method();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        response11.byteData = byteBuffer19;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str22 = response21.statusMessage;
        java.lang.String str23 = response21.statusMessage;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        int int26 = response24.numRedirects;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        boolean boolean9 = response3.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        byte[] byteArray10 = byteBuffer1.array();
        int int11 = byteBuffer1.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.executed = false;
        int int16 = response2.statusCode;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer1.putFloat(31, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        java.nio.Buffer buffer5 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer1.getFloat((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(35);
        long long3 = byteBuffer1.getLong((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar((int) (byte) 100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response5.cookies();
        boolean boolean9 = response5.executed;
        org.jsoup.Connection.Response response12 = response5.cookie("hi!", "hi!");
        java.lang.String str14 = response5.header("java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
        response5.statusMessage = "java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]";
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        boolean boolean8 = response3.hasCookie("");
        response3.charset = "hi!";
        java.lang.String str11 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteOrder byteOrder14 = null;
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.order(byteOrder14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer17.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        int int20 = byteBuffer17.limit();
        byte[] byteArray21 = byteBuffer17.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer11.put(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer6.get(byteArray21);
        int int24 = byteBuffer6.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer26 = byteBuffer6.position(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (97 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str7, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        boolean boolean4 = byteBuffer3.hasRemaining();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.compact();
        java.nio.ByteOrder byteOrder10 = byteBuffer9.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer3.order(byteOrder10);
        int int12 = byteBuffer11.position();
        java.nio.ByteBuffer byteBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.put(byteBuffer13);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response10 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response3.contentType;
        java.nio.ByteBuffer byteBuffer12 = null;
        response3.byteData = byteBuffer12;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.Buffer buffer20 = byteBuffer18.reset();
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer18.asDoubleBuffer();
        boolean boolean23 = byteBuffer18.equals((java.lang.Object) 3);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        boolean boolean28 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.put(byteBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer31 = byteBuffer25.position((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (32 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        int int4 = byteBuffer3.limit();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.asReadOnlyBuffer();
        boolean boolean6 = byteBuffer3.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putShort(0, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putLong((int) '4', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        java.lang.String str4 = response2.contentType();
        java.lang.String str5 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response6.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response10.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        java.lang.String str8 = response3.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        org.jsoup.Connection.Response response18 = response14.cookie("hi!", "");
        java.net.URL uRL19 = response14.url();
        response14.charset = "";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response26 = response22.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response22.scanHeaders("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(strEntry28);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer14.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer18 = byteBuffer14.asFloatBuffer();
        java.lang.String str19 = byteBuffer14.toString();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer1.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer1.put((byte) 100);
        java.nio.IntBuffer intBuffer23 = byteBuffer22.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer25 = byteBuffer22.limit((int) '\u2300');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(floatBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str19, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(intBuffer23);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Method method8 = response1.method();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer10.get(byteArray14);
        java.nio.Buffer buffer17 = byteBuffer10.rewind();
        int int18 = byteBuffer10.position();
        java.nio.Buffer buffer19 = byteBuffer10.rewind();
        response1.byteData = byteBuffer10;
        short short21 = byteBuffer10.getShort();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer10.slice();
        java.nio.Buffer buffer23 = byteBuffer10.mark();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(buffer23);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer5.get(byteArray9);
        java.nio.Buffer buffer12 = byteBuffer5.rewind();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer5.put(byteArray16);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer3.put(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray16, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        boolean boolean10 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.nio.ByteBuffer byteBuffer11 = response3.byteData;
        response3.statusCode = (byte) 1;
        org.jsoup.Connection.Request request14 = null;
        response3.req = request14;
        org.jsoup.Connection.Response response17 = response3.removeCookie("hi!");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        boolean boolean18 = byteBuffer15.hasArray();
        java.nio.Buffer buffer20 = byteBuffer15.position((int) (byte) 0);
        int int21 = byteBuffer13.compareTo(byteBuffer15);
        int int22 = byteBuffer15.remaining();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer15.duplicate();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.duplicate();
        boolean boolean25 = byteBuffer15.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = byteBuffer15.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer11 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response7.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        java.nio.Buffer buffer11 = byteBuffer1.flip();
        java.lang.Class<?> wildcardClass12 = buffer11.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.Buffer buffer12 = byteBuffer1.mark();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.putChar('4');
        short short16 = byteBuffer1.getShort((int) (byte) 1);
        java.nio.Buffer buffer17 = byteBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer1.putLong(100, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 13312 + "'", short16 == (short) 13312);
        org.junit.Assert.assertNotNull(buffer17);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        java.lang.String str11 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response12.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response12.headers();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer9 = byteBuffer8.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        java.nio.ByteOrder byteOrder11 = null;
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.limit();
        byte[] byteArray18 = byteBuffer14.array();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer8.put(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer5.put(byteArray18, 22, (-10));
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer14.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer18 = byteBuffer14.asFloatBuffer();
        java.lang.String str19 = byteBuffer14.toString();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer1.put(byteBuffer14);
        java.nio.LongBuffer longBuffer21 = byteBuffer20.asLongBuffer();
        int int22 = longBuffer21.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(floatBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str19, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage;
        java.lang.String str8 = response3.statusMessage();
        org.jsoup.Connection.Method method9 = response3.method();
        java.lang.String str10 = response3.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder12 = byteBuffer1.order();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.putFloat((int) (short) 0, 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer15.putFloat(10, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.Buffer buffer5 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putInt(85);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.CharBuffer charBuffer11 = byteBuffer6.asCharBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer6.asShortBuffer();
        int int13 = byteBuffer3.compareTo(byteBuffer6);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer3.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer15 = doubleBuffer14.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer14);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((int) (byte) 10, (short) 10);
        java.nio.Buffer buffer7 = byteBuffer6.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        org.jsoup.Connection.Response response12 = response3.cookie("hi!", "");
        int int13 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.IntBuffer intBuffer22 = byteBuffer20.asIntBuffer();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer20.slice();
        int int24 = byteBuffer20.position();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = byteBuffer20.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        byte[] byteArray17 = byteBuffer14.array();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer12.put(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = byteBuffer19.getDouble((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        java.nio.CharBuffer charBuffer13 = byteBuffer8.asCharBuffer();
        boolean boolean14 = byteBuffer8.hasRemaining();
        response1.byteData = byteBuffer8;
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.net.URL uRL18 = response1.url();
        java.lang.String str19 = response1.charset;
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response22.headers();
        int int24 = response22.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteOrder byteOrder14 = null;
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.order(byteOrder14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer17.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        int int20 = byteBuffer17.limit();
        byte[] byteArray21 = byteBuffer17.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer11.put(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer9.get(byteArray21);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.wrap(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putFloat((float) 4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.IntBuffer intBuffer13 = byteBuffer7.asIntBuffer();
        int int14 = byteBuffer7.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        boolean boolean7 = response2.executed;
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.lang.String str11 = response2.header("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt(0);
        int int8 = byteBuffer7.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer1.mark();
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.asReadOnlyBuffer();
        boolean boolean17 = byteBuffer16.hasRemaining();
        response12.byteData = byteBuffer16;
        java.nio.Buffer buffer19 = byteBuffer16.mark();
        java.nio.ByteOrder byteOrder20 = byteBuffer16.order();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.order(byteOrder20);
        java.nio.Buffer buffer22 = byteBuffer1.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer1.putShort((short) 13312);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(buffer22);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer5.put(byteArray15, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray15);
        byte[] byteArray22 = new byte[] {};
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.get(byteArray22);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer27 = byteBuffer26.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer26.compact();
        java.nio.ByteOrder byteOrder30 = byteBuffer29.order();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer21.order(byteOrder30);
        boolean boolean32 = byteBuffer21.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = byteBuffer21.getLong(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(doubleBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        java.nio.CharBuffer charBuffer13 = byteBuffer8.asCharBuffer();
        boolean boolean14 = byteBuffer8.hasRemaining();
        response1.byteData = byteBuffer8;
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str18 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.Connection.Method method27 = response25.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        boolean boolean30 = response28.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response28.scanHeaders("");
        java.net.URL uRL33 = response28.url();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response28);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str18, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        int int9 = response3.statusCode();
        boolean boolean10 = response3.executed;
        org.jsoup.Connection.Response response13 = response3.header("hi!", "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response3.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        int int10 = byteBuffer5.position();
        java.nio.Buffer buffer11 = byteBuffer5.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer5.putChar((-3), '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(buffer11);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        int int7 = response4.statusCode;
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.executed = false;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.Buffer buffer12 = byteBuffer1.mark();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.putChar('4');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = byteBuffer14.getInt((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        char char11 = byteBuffer10.getChar();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer13.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteOrder byteOrder16 = null;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.order(byteOrder16);
        boolean boolean18 = byteBuffer10.equals((java.lang.Object) byteBuffer13);
        boolean boolean19 = byteBuffer10.isDirect();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer10.putChar('\000');
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.wrap(byteArray27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer23.get(byteArray27);
        java.nio.Buffer buffer30 = byteBuffer23.rewind();
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.wrap(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer23.put(byteArray34);
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int39 = byteBuffer38.getInt();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer43 = byteBuffer38.asIntBuffer();
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.wrap(byteArray47);
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.wrap(byteArray47);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer38.get(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer23.get(byteArray47);
        java.nio.ByteBuffer byteBuffer52 = java.nio.ByteBuffer.wrap(byteArray47);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.wrap(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer56 = byteBuffer21.put(byteArray47, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(buffer30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(intBuffer43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.CharBuffer charBuffer4 = byteBuffer3.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer3.putInt((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(charBuffer4);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        char char16 = byteBuffer14.getChar();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        boolean boolean13 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean16 = response14.hasHeader("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.statusMessage;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        java.lang.String str7 = response2.charset();
        org.jsoup.Connection.Request request8 = response2.req;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.Buffer buffer6 = byteBuffer3.limit(9);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.duplicate();
        byte[] byteArray8 = new byte[] {};
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray8);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        int int11 = byteBuffer3.compareTo(byteBuffer9);
        boolean boolean12 = byteBuffer9.hasArray();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray11);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer7.get(byteArray11);
        java.nio.Buffer buffer14 = byteBuffer7.rewind();
        java.nio.ByteOrder byteOrder15 = byteBuffer7.order();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer4.order(byteOrder15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int19 = byteBuffer18.getInt();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.put((int) (byte) 0, (byte) 10);
        byte[] byteArray23 = byteBuffer22.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer4.get(byteArray23, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.header("");
        org.jsoup.Connection.Response response20 = response16.removeCookie("hi!");
        java.lang.String str22 = response16.cookie("");
        java.lang.String str23 = response16.statusMessage();
        int int24 = response16.statusCode();
        response16.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str28 = response27.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.IntBuffer intBuffer5 = byteBuffer3.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putLong((int) (short) 13312, (long) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(intBuffer5);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        java.lang.String str9 = response2.statusMessage();
        int int10 = response2.statusCode();
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str14 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        java.lang.String str7 = response1.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        char char4 = byteBuffer1.getChar();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putDouble((double) '#');
        java.nio.ShortBuffer shortBuffer7 = byteBuffer6.asShortBuffer();
        java.nio.LongBuffer longBuffer8 = byteBuffer6.asLongBuffer();
        java.nio.IntBuffer intBuffer9 = byteBuffer6.asIntBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(intBuffer9);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method15 = response14.method();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(22);
        byte byte2 = byteBuffer1.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str8 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response2.cookies();
        java.lang.String str10 = response2.contentType;
        response2.statusCode = 0;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response4.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.compact();
        java.nio.Buffer buffer28 = byteBuffer27.flip();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = byteBuffer27.getDouble((int) '\u2300');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(buffer28);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        int int13 = byteBuffer7.limit();
        java.nio.CharBuffer charBuffer14 = byteBuffer7.asCharBuffer();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer16.slice();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.asReadOnlyBuffer();
        int int20 = byteBuffer7.compareTo(byteBuffer16);
        java.nio.Buffer buffer21 = byteBuffer16.clear();
        java.nio.Buffer buffer22 = byteBuffer16.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertNotNull(buffer22);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        java.lang.String str11 = byteBuffer9.toString();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]" + "'", str11, "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method12 = response11.method();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        response11.byteData = byteBuffer19;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str22 = response21.statusMessage;
        boolean boolean23 = response21.executed;
        java.lang.String str24 = response21.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response21.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        // The following exception was thrown during execution in test generation
        try {
            char char13 = byteBuffer9.getChar(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteOrder byteOrder6 = byteBuffer5.order();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intBuffer6);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        java.lang.String str9 = response2.contentType;
        java.lang.String str10 = response2.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.IntBuffer intBuffer22 = byteBuffer20.asIntBuffer();
        int int23 = byteBuffer20.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer20.putLong((int) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.contentType = "hi!";
        boolean boolean10 = response4.hasCookie("");
        int int11 = response4.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.put(3, (byte) -1);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.duplicate();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.limit();
        byte[] byteArray11 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.put(byteArray11);
        java.nio.Buffer buffer13 = byteBuffer1.clear();
        java.lang.Class<?> wildcardClass14 = buffer13.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(buffer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        int int4 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer1.limit(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        response1.contentType = "";
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.lang.String str6 = byteBuffer1.toString();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.slice();
        java.nio.Buffer buffer8 = byteBuffer1.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.cookies();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL9 = response6.url();
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str14 = response11.statusMessage;
        org.jsoup.Connection.Response response17 = response11.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short4 = byteBuffer1.getShort(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response2.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response2.scanHeaders("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str9 = response8.charset;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        org.jsoup.Connection.Request request8 = response3.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response3.cookie("", "java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.Buffer buffer6 = byteBuffer3.limit(9);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.duplicate();
        byte[] byteArray8 = new byte[] {};
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray8);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        int int11 = byteBuffer3.compareTo(byteBuffer9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer13 = byteBuffer9.limit((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer9.compact();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.duplicate();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer3.put(byteBuffer9);
        java.nio.CharBuffer charBuffer15 = byteBuffer9.asCharBuffer();
        java.nio.ByteOrder byteOrder16 = byteBuffer9.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer18 = byteBuffer9.position((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (97 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.statusCode = 7;
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request15 = response14.req;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str18 = response14.cookie("");
        response14.executed = true;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str23 = response14.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str24 = response14.statusMessage;
        int int25 = response14.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Response response10 = response1.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str11 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        org.jsoup.Connection.Request request18 = response5.req;
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jsoup.Connection.Request request0 = null;
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.allocate(0);
        boolean boolean3 = byteBuffer2.isReadOnly();
        java.nio.ShortBuffer shortBuffer4 = byteBuffer2.asShortBuffer();
        int int5 = byteBuffer2.position();
        boolean boolean6 = byteBuffer2.isReadOnly();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        int int13 = byteBuffer2.compareTo(byteBuffer8);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.position();
        java.nio.ByteOrder byteOrder19 = null;
        java.nio.ByteBuffer byteBuffer20 = byteBuffer15.order(byteOrder19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer2.put(byteBuffer21);
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.nio.ByteBuffer byteBuffer27 = response26.byteData;
        boolean boolean28 = byteBuffer2.equals((java.lang.Object) response26);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response30 = org.jsoup.helper.HttpConnection.Response.execute(request0, response29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        org.jsoup.Connection.Method method8 = response5.method();
        java.lang.String str9 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response10.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        boolean boolean9 = response5.executed;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request11 = null;
        response10.req = request11;
        boolean boolean13 = response10.executed;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        int int7 = response2.statusCode;
        org.jsoup.Connection.Request request8 = response2.req;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.ShortBuffer shortBuffer6 = byteBuffer5.asShortBuffer();
        java.nio.ByteOrder byteOrder7 = byteBuffer5.order();
        java.nio.FloatBuffer floatBuffer8 = byteBuffer5.asFloatBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(floatBuffer8);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.charset();
        java.lang.String str16 = response2.charset;
        response2.executed = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response8.removeCookie("java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL12 = response8.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer4.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer4.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteOrder byteOrder14 = null;
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.order(byteOrder14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer17.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        int int20 = byteBuffer17.limit();
        byte[] byteArray21 = byteBuffer17.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer11.put(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer6.get(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = byteBuffer23.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str7, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        java.lang.String str18 = byteBuffer13.toString();
        java.nio.Buffer buffer19 = byteBuffer13.flip();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer13.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong(10995116277760L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str18, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        java.nio.CharBuffer charBuffer8 = byteBuffer5.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putInt((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charBuffer8);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        int int13 = byteBuffer7.position();
        java.nio.Buffer buffer14 = byteBuffer7.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer7.putLong(70, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer9.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer13 = byteBuffer9.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.get(byteArray19);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer9.put(byteArray19, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.wrap(byteArray19);
        byte[] byteArray26 = new byte[] {};
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer25.get(byteArray26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer1.get(byteArray26);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.wrap(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = byteBuffer30.getLong((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(floatBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.get(byteArray10);
        int int14 = byteBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.slice();
        java.nio.FloatBuffer floatBuffer16 = byteBuffer1.asFloatBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(floatBuffer16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str7 = response3.cookie("");
        response3.executed = true;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = byteBuffer6.getShort(167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        short short8 = byteBuffer3.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.Buffer buffer17 = byteBuffer14.clear();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.hasRemaining();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put(byteBuffer19);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        byte[] byteArray26 = byteBuffer23.array();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer21.put(byteArray26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray26);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer33 = byteBuffer31.putFloat((float) 1L);
        boolean boolean34 = byteBuffer29.equals((java.lang.Object) 1L);
        java.nio.FloatBuffer floatBuffer35 = byteBuffer29.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte37 = byteBuffer29.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatBuffer35);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        short short10 = byteBuffer5.getShort((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = byteBuffer5.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str20 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.statusCode = ' ';
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putDouble((double) '\000');
        org.jsoup.helper.HttpConnection.Response response6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Request request9 = response8.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean11 = byteBuffer3.equals((java.lang.Object) response8);
        java.lang.String str12 = response8.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean15 = response8.hasHeader("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        org.jsoup.Connection.Method method9 = response2.method();
        response2.executed = false;
        response2.charset = "";
        org.jsoup.Connection.Method method14 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.Buffer buffer9 = byteBuffer7.rewind();
        java.nio.Buffer buffer10 = byteBuffer7.mark();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.limit();
        byte[] byteArray11 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.put(byteArray11);
        int int13 = byteBuffer12.position();
        int int14 = byteBuffer12.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray13);
        short short15 = byteBuffer1.getShort();
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer1.putDouble((double) '\u2300');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer15.putInt((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        java.nio.Buffer buffer26 = byteBuffer16.mark();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer16.asShortBuffer();
        boolean boolean28 = byteBuffer16.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(buffer26);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request20 = response19.req;
        org.jsoup.Connection.Method method21 = response19.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response19);
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer8.get(byteArray12);
        java.nio.Buffer buffer15 = byteBuffer8.rewind();
        java.nio.ByteOrder byteOrder16 = byteBuffer8.order();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer6.order(byteOrder16);
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer17.get(byteArray18, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str6 = response5.contentType;
        boolean boolean8 = response5.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        byte[] byteArray13 = byteBuffer10.array();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.get(byteArray13);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putDouble((double) '4');
        double double19 = byteBuffer16.getDouble();
        java.lang.String str20 = byteBuffer16.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer5.put(byteBuffer16);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]" + "'", str20, "java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str9 = response7.header("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        java.nio.ByteOrder byteOrder5 = byteBuffer1.order();
        byte[] byteArray6 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer7.limit(167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.statusMessage;
        java.lang.String str16 = response2.charset;
        org.jsoup.Connection.Request request17 = response2.req;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer1.position();
        boolean boolean6 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = byteBuffer1.getLong(85);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer17.get(byteArray21);
        java.nio.Buffer buffer24 = byteBuffer17.rewind();
        java.nio.ByteOrder byteOrder25 = byteBuffer17.order();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer14.order(byteOrder25);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = byteBuffer26.putFloat((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        int int11 = byteBuffer10.position();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putDouble(11, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float16 = byteBuffer14.getFloat((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = byteBuffer1.getFloat(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        response9.charset = "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]";
        java.lang.String str12 = response9.contentType;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        java.lang.String str18 = byteBuffer13.toString();
        java.nio.Buffer buffer19 = byteBuffer13.flip();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer13.duplicate();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.get(byteArray26);
        java.nio.Buffer buffer29 = byteBuffer22.rewind();
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.wrap(byteArray33);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer22.put(byteArray33);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer39 = byteBuffer13.get(byteArray33, (int) ' ', 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str18, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        response2.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        response2.statusCode = 100;
        int int9 = response2.numRedirects;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putDouble((double) '\000');
        org.jsoup.helper.HttpConnection.Response response6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Request request9 = response8.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean11 = byteBuffer3.equals((java.lang.Object) response8);
        java.lang.String str12 = response8.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putChar('a');
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.put((int) '\000', (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putLong(85, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 97, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = byteBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            char char5 = byteBuffer1.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        int int6 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = byteBuffer1.getShort(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char char8 = byteBuffer6.getChar(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str7 = response2.charset();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        int int12 = byteBuffer9.position();
        boolean boolean13 = byteBuffer9.isReadOnly();
        java.nio.CharBuffer charBuffer14 = byteBuffer9.asCharBuffer();
        boolean boolean15 = byteBuffer9.hasRemaining();
        response2.byteData = byteBuffer9;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        int int9 = byteBuffer7.arrayOffset();
        byte[] byteArray10 = new byte[] {};
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer7.get(byteArray10);
        byte[] byteArray13 = new byte[] {};
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.Buffer buffer15 = byteBuffer14.flip();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder17 = byteBuffer16.order();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer7.order(byteOrder17);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer7.putInt(93, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer5.put(byteArray15, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer20.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putChar('#');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.limit();
        byte[] byteArray11 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.put(byteArray11);
        java.nio.FloatBuffer floatBuffer13 = byteBuffer12.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putChar((-32), '\u2300');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(floatBuffer13);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL13 = response12.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str17 = response15.header("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response15.headers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.IntBuffer intBuffer22 = byteBuffer20.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer23 = byteBuffer20.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertNotNull(charBuffer6);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        boolean boolean6 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer1.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        java.nio.ByteOrder byteOrder7 = byteBuffer4.order();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer2.order(byteOrder7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer2.put((int) (short) 13312, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        int int26 = byteBuffer23.position();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer23.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer23.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer29.slice();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.duplicate();
        int int32 = byteBuffer20.compareTo(byteBuffer29);
        java.nio.Buffer buffer33 = byteBuffer20.rewind();
        java.nio.Buffer buffer34 = buffer33.rewind();
        boolean boolean35 = buffer34.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(buffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        int int14 = byteBuffer8.compareTo(byteBuffer12);
        java.nio.Buffer buffer15 = byteBuffer12.clear();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.hasRemaining();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer12.put(byteBuffer17);
        response2.byteData = byteBuffer19;
        int int21 = byteBuffer19.capacity();
        java.nio.LongBuffer longBuffer22 = byteBuffer19.asLongBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(longBuffer22);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method14 = response13.method();
        boolean boolean16 = response13.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response13.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str10 = response8.cookie("java.nio.HeapByteBuffer[pos=32 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        org.jsoup.Connection.Request request8 = response3.req;
        response3.statusMessage = "";
        org.jsoup.Connection.Response response13 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]", "");
        java.lang.Class<?> wildcardClass14 = response3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray7);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.get(byteArray7);
        java.nio.Buffer buffer10 = byteBuffer3.rewind();
        int int11 = byteBuffer3.position();
        java.nio.Buffer buffer12 = byteBuffer3.rewind();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer3.slice();
        java.nio.ByteOrder byteOrder14 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.order(byteOrder14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = byteBuffer1.getLong((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.numRedirects = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer11 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        byte[] byteArray10 = byteBuffer9.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray10, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        boolean boolean9 = byteBuffer8.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = byteBuffer8.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        response6.statusCode = (-1);
        int int9 = response6.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response6.contentType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(31, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        short short8 = byteBuffer3.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.Buffer buffer17 = byteBuffer14.clear();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.hasRemaining();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put(byteBuffer19);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        byte[] byteArray26 = byteBuffer23.array();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer21.put(byteArray26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray26);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer33 = byteBuffer31.putFloat((float) 1L);
        boolean boolean34 = byteBuffer29.equals((java.lang.Object) 1L);
        java.nio.FloatBuffer floatBuffer35 = byteBuffer29.asFloatBuffer();
        int int36 = byteBuffer29.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 33 + "'", int36 == 33);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.Buffer buffer20 = byteBuffer18.reset();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer18.duplicate();
        int int22 = byteBuffer18.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            float float24 = byteBuffer18.getFloat(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        java.lang.String str9 = response3.cookie("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        int int10 = response3.statusCode();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer1.getInt(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder12 = byteBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer1.putChar((-10), ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        java.nio.ByteOrder byteOrder5 = byteBuffer1.order();
        byte[] byteArray6 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray6, 33, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.Buffer buffer7 = byteBuffer1.mark();
        java.nio.Buffer buffer8 = byteBuffer1.flip();
        java.nio.Buffer buffer9 = byteBuffer1.mark();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        int int17 = byteBuffer11.compareTo(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer15.compact();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        byte[] byteArray23 = byteBuffer20.array();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer15.put(byteArray23);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer1.put(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.wrap(byteArray23, 32, (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(35);
        long long3 = byteBuffer1.getLong((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short7 = byteBuffer5.getShort(1);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        boolean boolean11 = byteBuffer9.isDirect();
        java.lang.String str12 = byteBuffer9.toString();
        byte[] byteArray13 = byteBuffer9.array();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.put(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer1.get(byteArray13, (int) '#', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str12, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.put((byte) 10);
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        boolean boolean13 = byteBuffer10.hasArray();
        java.nio.Buffer buffer15 = byteBuffer10.position((int) (byte) 0);
        int int16 = byteBuffer5.compareTo(byteBuffer10);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer5.put(22, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer21 = byteBuffer19.position((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 35)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.rewind();
        java.nio.FloatBuffer floatBuffer7 = byteBuffer5.asFloatBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(floatBuffer7);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        int int11 = byteBuffer10.position();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putDouble(11, (double) 10.0f);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer10.putFloat((int) (byte) 1, (float) (-3));
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.isReadOnly();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        int int25 = byteBuffer19.compareTo(byteBuffer23);
        java.nio.DoubleBuffer doubleBuffer26 = byteBuffer23.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer27 = byteBuffer23.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.wrap(byteArray33);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer29.get(byteArray33);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer23.put(byteArray33, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.wrap(byteArray33);
        byte[] byteArray40 = new byte[] {};
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.wrap(byteArray40);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer39.get(byteArray40);
        org.jsoup.helper.HttpConnection.Response response43 = null;
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response43);
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response43);
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response(response43);
        java.nio.ByteBuffer byteBuffer47 = response46.byteData;
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response46);
        java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.allocate(0);
        response46.byteData = byteBuffer50;
        java.nio.ByteBuffer byteBuffer52 = byteBuffer50.slice();
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.allocate(0);
        boolean boolean55 = byteBuffer54.hasRemaining();
        java.nio.ByteBuffer byteBuffer56 = byteBuffer54.asReadOnlyBuffer();
        boolean boolean57 = byteBuffer56.hasRemaining();
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer60 = byteBuffer59.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer61 = byteBuffer59.asShortBuffer();
        java.nio.ByteBuffer byteBuffer62 = byteBuffer59.compact();
        java.nio.ByteOrder byteOrder63 = byteBuffer62.order();
        java.nio.ByteBuffer byteBuffer64 = byteBuffer56.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer52.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer39.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer10.order(byteOrder63);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer26);
        org.junit.Assert.assertNotNull(floatBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(doubleBuffer60);
        org.junit.Assert.assertNotNull(shortBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        java.lang.String str9 = response2.statusMessage();
        int int10 = response2.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.headers();
        response2.statusCode = 3;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response14.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        byte[] byteArray9 = byteBuffer8.array();
        byte[] byteArray10 = new byte[] {};
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.Buffer buffer12 = byteBuffer11.flip();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.duplicate();
        int int15 = byteBuffer8.compareTo(byteBuffer11);
        java.lang.String str16 = byteBuffer8.toString();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        int int21 = byteBuffer18.position();
        java.nio.ByteOrder byteOrder22 = null;
        java.nio.ByteBuffer byteBuffer23 = byteBuffer18.order(byteOrder22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer18.asReadOnlyBuffer();
        int int25 = byteBuffer24.capacity();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer8.put(byteBuffer24);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = byteBuffer8.putChar(167772160, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]" + "'", str16, "java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        boolean boolean8 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.charset();
        java.lang.String str16 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer18 = response2.byteData;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = byteBuffer5.remaining();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float15 = byteBuffer13.getFloat(1);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putLong((long) 10);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer13.putChar('\000');
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.wrap(byteArray25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer21.get(byteArray25);
        java.nio.Buffer buffer28 = byteBuffer21.rewind();
        java.nio.ByteOrder byteOrder29 = byteBuffer21.order();
        boolean boolean30 = byteBuffer21.hasRemaining();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer34 = byteBuffer21.put(byteArray33);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.wrap(byteArray33);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer13.get(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer37 = byteBuffer5.get(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(buffer28);
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.putChar(3, 'a');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.putInt((int) (short) 1, (int) (short) 13312);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer16.putLong(22, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer5.put(byteArray15, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray15);
        byte[] byteArray22 = new byte[] {};
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.get(byteArray22);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer27 = byteBuffer26.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer26.compact();
        java.nio.ByteOrder byteOrder30 = byteBuffer29.order();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer21.order(byteOrder30);
        boolean boolean32 = byteBuffer21.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer21.putShort(10, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(doubleBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        response4.numRedirects = 'a';
        java.lang.String str8 = response4.getHeaderCaseInsensitive("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.jsoup.Connection.Request request9 = null;
        response4.req = request9;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        // The following exception was thrown during execution in test generation
        try {
            char char16 = byteBuffer15.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.IntBuffer intBuffer13 = byteBuffer7.asIntBuffer();
        int int14 = intBuffer13.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = byteBuffer1.getShort(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str6 = response2.contentType;
        response2.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        java.nio.ByteOrder byteOrder5 = byteBuffer1.order();
        byte[] byteArray6 = byteBuffer1.array();
        int int7 = byteBuffer1.remaining();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteBuffer1.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.mark();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        int int15 = byteBuffer12.position();
        java.nio.ByteOrder byteOrder16 = null;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer12.order(byteOrder16);
        java.lang.String str18 = byteBuffer17.toString();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer17.slice();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer17.asShortBuffer();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer23 = byteBuffer22.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer24 = byteBuffer22.asShortBuffer();
        java.nio.ByteOrder byteOrder25 = null;
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.order(byteOrder25);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer29 = byteBuffer28.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer30 = byteBuffer28.asShortBuffer();
        int int31 = byteBuffer28.limit();
        byte[] byteArray32 = byteBuffer28.array();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer22.put(byteArray32);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer17.get(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer37 = byteBuffer5.put(byteArray32, 3, (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str18, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(doubleBuffer23);
        org.junit.Assert.assertNotNull(shortBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(doubleBuffer29);
        org.junit.Assert.assertNotNull(shortBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        byte[] byteArray17 = byteBuffer14.array();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer12.put(byteArray17);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer22 = byteBuffer21.rewind();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.compact();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer23.slice();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        boolean boolean27 = byteBuffer26.isReadOnly();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        int int29 = byteBuffer26.position();
        boolean boolean30 = byteBuffer26.isReadOnly();
        java.nio.CharBuffer charBuffer31 = byteBuffer26.asCharBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer26.asShortBuffer();
        int int33 = byteBuffer23.compareTo(byteBuffer26);
        int int34 = byteBuffer23.arrayOffset();
        byte[] byteArray35 = byteBuffer23.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer38 = byteBuffer19.get(byteArray35, (int) '\000', 22);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(buffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer8.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer10 = byteBuffer9.asLongBuffer();
        int int11 = longBuffer10.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(longBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder12 = byteBuffer1.order();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.putFloat((int) (short) 0, 1.0f);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer15.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer16.put((int) '4', (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("");
        response2.statusMessage = "";
        int int11 = response2.statusCode;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        boolean boolean8 = response3.hasCookie("");
        response3.charset = "hi!";
        org.jsoup.Connection.Request request11 = null;
        response3.req = request11;
        java.lang.String str13 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.Buffer buffer7 = byteBuffer1.mark();
        java.nio.Buffer buffer8 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putLong((-32), (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        response6.statusCode = (-1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response6.scanHeaders("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        int int5 = byteBuffer1.arrayOffset();
        boolean boolean6 = byteBuffer1.isDirect();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean10 = response8.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response8.scanHeaders("");
        java.net.URL uRL13 = response8.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response16 = response8.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.Connection.Request request0 = null;
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.allocate(0);
        boolean boolean3 = byteBuffer2.isReadOnly();
        java.nio.ShortBuffer shortBuffer4 = byteBuffer2.asShortBuffer();
        int int5 = byteBuffer2.position();
        boolean boolean6 = byteBuffer2.isReadOnly();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        int int13 = byteBuffer2.compareTo(byteBuffer8);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.position();
        java.nio.ByteOrder byteOrder19 = null;
        java.nio.ByteBuffer byteBuffer20 = byteBuffer15.order(byteOrder19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer2.put(byteBuffer21);
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.nio.ByteBuffer byteBuffer27 = response26.byteData;
        boolean boolean28 = byteBuffer2.equals((java.lang.Object) response26);
        org.jsoup.Connection.Response response30 = response26.removeCookie("hi!");
        response26.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response33 = org.jsoup.helper.HttpConnection.Response.execute(request0, response26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.mark();
        int int9 = byteBuffer5.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putInt(13, 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short9 = byteBuffer6.getShort((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean12 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request14 = response3.req;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response3.headers();
        java.lang.String str16 = response3.charset();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = byteBuffer5.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.limit();
        byte[] byteArray11 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer1.put(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer12.putChar((int) '4', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        org.jsoup.Connection.Response response10 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response3.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
        java.nio.CharBuffer charBuffer6 = byteBuffer4.asCharBuffer();
        java.nio.Buffer buffer7 = byteBuffer4.mark();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putShort((short) 0);
        java.nio.ByteOrder byteOrder12 = byteBuffer11.order();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(0, (byte) 0);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer17.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer17.compact();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.duplicate();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer11.put(byteBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer4.put(byteBuffer22);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        long long4 = byteBuffer1.getLong();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putChar((int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean12 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str13 = response3.charset();
        response3.executed = true;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putChar('a');
        java.nio.LongBuffer longBuffer8 = byteBuffer5.asLongBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer11 = buffer9.limit((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 97, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.slice();
        byte[] byteArray10 = byteBuffer5.array();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putFloat(65, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putInt(167772160, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response11.statusCode = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response11.scanHeaders("");
        java.nio.ByteBuffer byteBuffer16 = response11.byteData;
        java.lang.String str18 = response11.header("java.nio.HeapByteBuffer[pos=9 lim=9 cap=32]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        java.lang.String str5 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.charset = "hi!";
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putDouble((double) '\000');
        char char11 = byteBuffer10.getChar();
        java.nio.Buffer buffer12 = byteBuffer10.clear();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer10.putFloat((int) '\000', (float) 10);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer10.putLong(0L);
        response2.byteData = byteBuffer10;
        java.lang.String str19 = response2.charset;
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.net.URL uRL8 = response1.url();
        response1.charset = "hi!";
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=9 lim=9 cap=32]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer13 = byteBuffer12.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        java.lang.String str15 = byteBuffer12.toString();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer12);
        java.nio.ByteOrder byteOrder17 = byteBuffer1.order();
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer1.asDoubleBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str15, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(doubleBuffer18);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer5.putDouble(10.0d);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        boolean boolean9 = response5.executed;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request11 = null;
        response10.req = request11;
        int int13 = response10.statusCode();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request13 = response12.req;
        int int14 = response12.numRedirects;
        response12.contentType = "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        boolean boolean8 = response3.hasCookie("");
        response3.charset = "hi!";
        java.lang.String str11 = response3.statusMessage();
        int int12 = response3.statusCode();
        java.lang.String str13 = response3.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        java.lang.String str11 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.statusMessage();
        java.lang.Class<?> wildcardClass14 = response3.getClass();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int11 = response10.numRedirects;
        boolean boolean13 = response10.hasCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer15.duplicate();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.duplicate();
        response10.byteData = byteBuffer18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.Buffer buffer20 = byteBuffer18.reset();
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer18.asDoubleBuffer();
        boolean boolean23 = byteBuffer18.equals((java.lang.Object) 3);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        boolean boolean28 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.put(byteBuffer25);
        java.nio.Buffer buffer30 = byteBuffer25.rewind();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer33 = byteBuffer32.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        byte[] byteArray35 = byteBuffer32.array();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray35);
        int int37 = byteBuffer25.compareTo(byteBuffer36);
        // The following exception was thrown during execution in test generation
        try {
            float float38 = byteBuffer36.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(buffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(doubleBuffer33);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putInt(4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        boolean boolean7 = response2.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        boolean boolean9 = response8.executed;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        java.lang.String str10 = response2.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.headers();
        org.jsoup.Connection.Method method12 = response2.method();
        int int13 = response2.numRedirects;
        org.jsoup.Connection.Response response16 = response2.header("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]", "java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = byteBuffer27.putLong((long) 11);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        long long7 = byteBuffer1.getLong((int) (short) 10);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putDouble((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str7, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        java.lang.String str18 = byteBuffer13.toString();
        java.nio.Buffer buffer19 = byteBuffer13.flip();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer13.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putChar(' ');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str18, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        double double28 = byteBuffer22.getDouble((int) (byte) 10);
        double double29 = byteBuffer22.getDouble();
        int int30 = byteBuffer22.getInt();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        org.jsoup.Connection.Request request5 = null;
        response3.req = request5;
        int int7 = response3.statusCode();
        java.lang.String str8 = response3.statusMessage();
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.Connection.Response response11 = response3.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.compact();
        java.nio.Buffer buffer28 = byteBuffer22.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer30 = byteBuffer22.putDouble((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(buffer28);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset;
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.lang.String str17 = response1.cookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer14.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer18 = byteBuffer14.asFloatBuffer();
        java.lang.String str19 = byteBuffer14.toString();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer1.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer1.put((byte) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putInt(7);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = byteBuffer22.getDouble(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(floatBuffer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str19, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        double double4 = byteBuffer1.getDouble();
        java.lang.String str5 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble((-3), (double) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]" + "'", str5, "java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        java.lang.String str9 = response3.getHeaderCaseInsensitive("");
        java.lang.String str10 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        java.nio.CharBuffer charBuffer8 = byteBuffer5.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putLong((long) 13);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charBuffer8);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str12 = response10.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 9;
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response11 = response8.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        boolean boolean12 = response8.executed;
        response8.contentType = "java.nio.HeapByteBuffer[pos=9 lim=9 cap=32]";
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.Connection.Response response12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response14 = response3.removeHeader("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        int int15 = response3.numRedirects;
        boolean boolean16 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str18 = response17.charset();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        org.jsoup.Connection.Request request8 = response3.req;
        java.lang.String str9 = response3.statusMessage();
        boolean boolean11 = response3.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str14 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((int) (byte) 10, (short) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong(3, (long) 0);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        int int17 = byteBuffer11.compareTo(byteBuffer15);
        java.nio.Buffer buffer18 = byteBuffer15.clear();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        boolean boolean21 = byteBuffer20.hasRemaining();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer15.put(byteBuffer20);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer15.slice();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.compact();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.compact();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer27.get(byteArray31);
        java.nio.Buffer buffer34 = byteBuffer27.rewind();
        java.nio.ByteOrder byteOrder35 = byteBuffer27.order();
        java.nio.ByteBuffer byteBuffer36 = byteBuffer24.order(byteOrder35);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer6.order(byteOrder35);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = byteBuffer37.getLong((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(buffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        boolean boolean14 = byteBuffer13.isDirect();
        boolean boolean15 = byteBuffer13.hasArray();
        java.nio.Buffer buffer16 = byteBuffer13.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(buffer16);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        java.lang.String str5 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.nio.ByteBuffer byteBuffer6 = response2.byteData;
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        byte[] byteArray13 = byteBuffer10.array();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = byteBuffer5.getLong(167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        int int13 = byteBuffer7.compareTo(byteBuffer11);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer11.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer15 = byteBuffer11.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer17.get(byteArray21);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer11.put(byteArray21, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer1.put(byteArray21);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer1.putShort((short) 0);
        boolean boolean31 = byteBuffer30.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = byteBuffer30.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertNotNull(floatBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        int int26 = byteBuffer23.position();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer23.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer23.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer29.slice();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.duplicate();
        int int32 = byteBuffer20.compareTo(byteBuffer29);
        boolean boolean33 = byteBuffer29.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = byteBuffer29.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        byte[] byteArray8 = byteBuffer7.array();
        boolean boolean9 = byteBuffer7.isDirect();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.put((byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putFloat((-10), (float) '\u0a00');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jsoup.Connection.Request request0 = null;
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer4 = byteBuffer2.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.putDouble((double) '\000');
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Request request10 = response9.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean12 = byteBuffer4.equals((java.lang.Object) response9);
        java.lang.String str13 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        response14.contentType = "java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.Buffer buffer20 = byteBuffer18.reset();
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer18.asDoubleBuffer();
        boolean boolean23 = byteBuffer18.equals((java.lang.Object) 3);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        boolean boolean28 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.put(byteBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer25.put(2, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 0);
        int int2 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = byteBuffer1.getDouble(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.mark();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.slice();
        int int11 = byteBuffer5.arrayOffset();
        java.nio.Buffer buffer13 = byteBuffer5.position(0);
        java.nio.Buffer buffer14 = byteBuffer5.flip();
        // The following exception was thrown during execution in test generation
        try {
            float float16 = byteBuffer5.getFloat(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer13);
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        java.nio.CharBuffer charBuffer13 = byteBuffer8.asCharBuffer();
        boolean boolean14 = byteBuffer8.hasRemaining();
        response1.byteData = byteBuffer8;
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.net.URL uRL18 = response1.url();
        java.lang.String str19 = response1.charset;
        int int20 = response1.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        boolean boolean18 = byteBuffer14.isReadOnly();
        int int19 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.isReadOnly();
        java.nio.ShortBuffer shortBuffer23 = byteBuffer21.asShortBuffer();
        int int24 = byteBuffer21.position();
        java.nio.ByteOrder byteOrder25 = null;
        java.nio.ByteBuffer byteBuffer26 = byteBuffer21.order(byteOrder25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer21.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer28 = byteBuffer8.put(byteBuffer27);
        response2.byteData = byteBuffer28;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer34 = byteBuffer33.rewind();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer33.compact();
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.allocate(0);
        boolean boolean38 = byteBuffer37.hasRemaining();
        java.nio.ByteBuffer byteBuffer39 = byteBuffer37.asReadOnlyBuffer();
        int int40 = byteBuffer37.arrayOffset();
        int int41 = byteBuffer35.compareTo(byteBuffer37);
        response31.byteData = byteBuffer37;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        org.jsoup.Connection.Response response9 = response2.removeHeader("java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer8.get(byteArray12);
        java.nio.Buffer buffer15 = byteBuffer8.rewind();
        java.nio.ByteOrder byteOrder16 = byteBuffer8.order();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer6.order(byteOrder16);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.isReadOnly();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        int int25 = byteBuffer19.compareTo(byteBuffer23);
        java.nio.DoubleBuffer doubleBuffer26 = byteBuffer23.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer27 = byteBuffer23.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.wrap(byteArray33);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer29.get(byteArray33);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer23.put(byteArray33, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.wrap(byteArray33);
        byte[] byteArray40 = new byte[] {};
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.wrap(byteArray40);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer39.get(byteArray40);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer17.get(byteArray40);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer26);
        org.junit.Assert.assertNotNull(floatBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(35);
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.get(byteArray2, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteOrder byteOrder13 = byteBuffer10.order();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.get(byteArray19);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer15.slice();
        byte[] byteArray23 = byteBuffer22.array();
        boolean boolean24 = byteBuffer10.equals((java.lang.Object) byteBuffer22);
        java.nio.LongBuffer longBuffer25 = byteBuffer10.asLongBuffer();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.isReadOnly();
        java.nio.ShortBuffer shortBuffer29 = byteBuffer27.asShortBuffer();
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate(0);
        boolean boolean32 = byteBuffer31.isReadOnly();
        int int33 = byteBuffer27.compareTo(byteBuffer31);
        java.nio.Buffer buffer34 = byteBuffer31.clear();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        boolean boolean37 = byteBuffer36.hasRemaining();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer31.put(byteBuffer36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer38.compact();
        java.nio.LongBuffer longBuffer40 = byteBuffer39.asLongBuffer();
        org.jsoup.helper.HttpConnection.Response response41 = null;
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response41);
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response41);
        boolean boolean44 = response43.executed;
        java.lang.String str46 = response43.getHeaderCaseInsensitive("");
        java.lang.String str48 = response43.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int49 = response43.statusCode();
        org.jsoup.Connection.Response response52 = response43.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.allocate(0);
        boolean boolean55 = byteBuffer54.isReadOnly();
        java.nio.ShortBuffer shortBuffer56 = byteBuffer54.asShortBuffer();
        java.nio.ByteBuffer byteBuffer58 = java.nio.ByteBuffer.allocate(0);
        boolean boolean59 = byteBuffer58.isReadOnly();
        int int60 = byteBuffer54.compareTo(byteBuffer58);
        java.nio.DoubleBuffer doubleBuffer61 = byteBuffer58.asDoubleBuffer();
        response43.byteData = byteBuffer58;
        java.nio.ByteOrder byteOrder63 = byteBuffer58.order();
        java.nio.ByteBuffer byteBuffer64 = byteBuffer39.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer10.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer67 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer68 = byteBuffer67.rewind();
        java.nio.ByteBuffer byteBuffer69 = byteBuffer67.compact();
        java.nio.ByteBuffer byteBuffer70 = byteBuffer69.slice();
        java.nio.Buffer buffer72 = byteBuffer69.limit(9);
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.duplicate();
        java.nio.ByteBuffer byteBuffer75 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer76 = byteBuffer75.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer77 = byteBuffer75.asShortBuffer();
        byte[] byteArray78 = byteBuffer75.array();
        java.nio.ByteBuffer byteBuffer79 = byteBuffer69.get(byteArray78);
        java.nio.ByteBuffer byteBuffer80 = byteBuffer10.get(byteArray78);
        // The following exception was thrown during execution in test generation
        try {
            float float82 = byteBuffer10.getFloat(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(longBuffer40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer61);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(buffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(buffer72);
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(doubleBuffer76);
        org.junit.Assert.assertNotNull(shortBuffer77);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[]");
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(byteBuffer80);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        int int6 = response2.statusCode;
        java.lang.String str7 = response2.charset();
        java.lang.String str9 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        boolean boolean11 = response2.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        boolean boolean4 = byteBuffer3.hasRemaining();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.compact();
        java.nio.ByteOrder byteOrder10 = byteBuffer9.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer3.order(byteOrder10);
        int int12 = byteBuffer11.position();
        java.nio.DoubleBuffer doubleBuffer13 = byteBuffer11.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer11.putInt((-32), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer13);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble(65, (double) 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.compact();
        int int28 = byteBuffer22.position();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer22.put((byte) 1);
        java.nio.LongBuffer longBuffer31 = byteBuffer30.asLongBuffer();
        java.nio.ByteOrder byteOrder32 = byteBuffer30.order();
        java.nio.Buffer buffer33 = byteBuffer30.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 31 + "'", int28 == 31);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(longBuffer31);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertNotNull(buffer33);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = byteBuffer2.getInt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method7 = response6.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response6.headers();
        org.jsoup.Connection.Method method9 = response6.method();
        java.lang.String str10 = response6.charset;
        java.lang.String str12 = response6.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        boolean boolean7 = response3.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response3.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.lang.String str11 = response3.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        java.lang.String str13 = response2.statusMessage;
        response2.charset = "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]";
        boolean boolean17 = response2.hasCookie("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method11 = response3.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int14 = response13.numRedirects;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.net.URL uRL8 = response1.url();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        boolean boolean17 = byteBuffer16.isReadOnly();
        int int18 = byteBuffer12.compareTo(byteBuffer16);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer16.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer20 = byteBuffer16.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.get(byteArray26);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer16.put(byteArray26, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray26);
        response1.byteData = byteBuffer32;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str35 = response34.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(floatBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = response11.url();
        java.lang.String str13 = response11.contentType();
        java.lang.String str14 = response11.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        short short10 = byteBuffer5.getShort((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = byteBuffer5.getDouble((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        response3.executed = false;
        org.jsoup.Connection.Method method13 = response3.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str16 = response3.header("java.nio.HeapByteBuffer[pos=9 lim=9 cap=32]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        java.lang.String str6 = byteBuffer1.toString();
        boolean boolean7 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int10 = byteBuffer9.limit();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer9.putChar(' ');
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteOrder byteOrder17 = null;
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.order(byteOrder17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        int int23 = byteBuffer20.limit();
        byte[] byteArray24 = byteBuffer20.array();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer14.put(byteArray24);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer9.put(byteArray24);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer1.get(byteArray24);
        java.nio.ByteOrder byteOrder28 = null;
        java.nio.ByteBuffer byteBuffer29 = byteBuffer27.order(byteOrder28);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer33 = byteBuffer31.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer33.putShort(0, (short) (byte) 10);
        short short38 = byteBuffer33.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate(0);
        boolean boolean41 = byteBuffer40.isReadOnly();
        java.nio.ShortBuffer shortBuffer42 = byteBuffer40.asShortBuffer();
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.allocate(0);
        boolean boolean45 = byteBuffer44.isReadOnly();
        int int46 = byteBuffer40.compareTo(byteBuffer44);
        java.nio.Buffer buffer47 = byteBuffer44.clear();
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocate(0);
        boolean boolean50 = byteBuffer49.hasRemaining();
        java.nio.ByteBuffer byteBuffer51 = byteBuffer44.put(byteBuffer49);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer54 = byteBuffer53.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer55 = byteBuffer53.asShortBuffer();
        byte[] byteArray56 = byteBuffer53.array();
        java.nio.ByteBuffer byteBuffer57 = java.nio.ByteBuffer.wrap(byteArray56);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer51.put(byteArray56);
        java.nio.ByteBuffer byteBuffer59 = byteBuffer33.get(byteArray56);
        float float60 = byteBuffer59.getFloat();
        java.nio.ByteBuffer byteBuffer61 = byteBuffer29.put(byteBuffer59);
        java.nio.DoubleBuffer doubleBuffer62 = byteBuffer61.asDoubleBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 0 + "'", short38 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(buffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(doubleBuffer54);
        org.junit.Assert.assertNotNull(shortBuffer55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(doubleBuffer62);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response12.executed;
        boolean boolean15 = response12.hasHeader("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        org.jsoup.Connection.Request request10 = null;
        response2.req = request10;
        java.lang.String str12 = response2.charset();
        response2.statusCode = 10;
        java.lang.String str16 = response2.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]";
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        int int26 = byteBuffer23.position();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer23.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer23.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer29.slice();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.duplicate();
        int int32 = byteBuffer20.compareTo(byteBuffer29);
        // The following exception was thrown during execution in test generation
        try {
            float float34 = byteBuffer29.getFloat((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        org.jsoup.Connection.Request request10 = response4.req;
        response4.executed = true;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str14 = response13.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        int int18 = byteBuffer13.capacity();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer13.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float21 = byteBuffer13.getFloat(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.CharBuffer charBuffer11 = byteBuffer6.asCharBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer6.asShortBuffer();
        int int13 = byteBuffer3.compareTo(byteBuffer6);
        int int14 = byteBuffer3.arrayOffset();
        byte[] byteArray15 = byteBuffer3.array();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = byteBuffer3.getInt((-27));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        java.nio.ByteBuffer byteBuffer5 = response3.byteData;
        boolean boolean7 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]");
        java.lang.String str8 = response3.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method12 = response11.method();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        response11.byteData = byteBuffer19;
        java.lang.String str22 = response11.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str24 = response11.cookie("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = byteBuffer12.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer4.remaining();
        int int6 = byteBuffer4.position();
        // The following exception was thrown during execution in test generation
        try {
            char char7 = byteBuffer4.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        org.jsoup.Connection.Method method9 = response2.method();
        response2.executed = false;
        response2.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.numRedirects = 1677787392;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL13 = response12.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response12.contentType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        response3.executed = true;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.Connection.Response response19 = response14.header("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]", "java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
        java.lang.String str21 = response14.getHeaderCaseInsensitive("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request8 = null;
        response7.req = request8;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jsoup.Connection.Request request0 = null;
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.allocate(0);
        boolean boolean3 = byteBuffer2.isReadOnly();
        java.nio.ShortBuffer shortBuffer4 = byteBuffer2.asShortBuffer();
        int int5 = byteBuffer2.position();
        boolean boolean6 = byteBuffer2.isReadOnly();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        int int13 = byteBuffer2.compareTo(byteBuffer8);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.position();
        java.nio.ByteOrder byteOrder19 = null;
        java.nio.ByteBuffer byteBuffer20 = byteBuffer15.order(byteOrder19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer2.put(byteBuffer21);
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.nio.ByteBuffer byteBuffer27 = response26.byteData;
        boolean boolean28 = byteBuffer2.equals((java.lang.Object) response26);
        org.jsoup.Connection.Response response30 = response26.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response26.headers();
        response26.charset = "";
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response36 = org.jsoup.helper.HttpConnection.Response.execute(request0, response34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        java.nio.Buffer buffer6 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putDouble(0, (double) 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        java.nio.Buffer buffer11 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer1.putInt((int) (short) 1, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(buffer11);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        java.nio.ByteOrder byteOrder11 = byteBuffer10.order();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response13.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str18 = response16.header("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method12 = response11.method();
        int int13 = response11.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        response14.statusMessage = "java.nio.HeapByteBuffer[pos=32 lim=32 cap=32]";
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        int int9 = response3.statusCode();
        java.lang.String str11 = response3.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response3.getHeaderCaseInsensitive("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        short short8 = byteBuffer3.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.Buffer buffer17 = byteBuffer14.clear();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.hasRemaining();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put(byteBuffer19);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        byte[] byteArray26 = byteBuffer23.array();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer21.put(byteArray26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray26);
        int int30 = byteBuffer3.position();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = byteBuffer3.getLong((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        java.nio.ByteOrder byteOrder7 = byteBuffer4.order();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer2.order(byteOrder7);
        java.nio.Buffer buffer9 = byteBuffer8.rewind();
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean13 = response12.executed;
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        java.net.URL uRL16 = response12.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response12.scanHeaders("");
        response12.statusMessage = "";
        java.net.URL uRL21 = response12.url();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.wrap(byteArray27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer23.get(byteArray27);
        byte[] byteArray30 = byteBuffer29.array();
        boolean boolean31 = byteBuffer29.isDirect();
        byte[] byteArray32 = byteBuffer29.array();
        response12.byteData = byteBuffer29;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer34 = byteBuffer8.put(byteBuffer29);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer4.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer4.putInt((int) (short) 13312, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method11 = response3.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        response12.statusCode = (byte) -1;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        java.nio.IntBuffer intBuffer22 = byteBuffer20.asIntBuffer();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer20.slice();
        java.nio.ShortBuffer shortBuffer24 = byteBuffer20.asShortBuffer();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer26.putDouble((double) '4');
        double double29 = byteBuffer26.getDouble();
        byte byte31 = byteBuffer26.get(22);
        boolean boolean32 = byteBuffer20.equals((java.lang.Object) 22);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.wrap(byteArray38);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer34.get(byteArray38);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer34.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer42.compact();
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocate(0);
        boolean boolean46 = byteBuffer45.isReadOnly();
        java.nio.ShortBuffer shortBuffer47 = byteBuffer45.asShortBuffer();
        int int48 = byteBuffer45.position();
        java.nio.ByteOrder byteOrder49 = null;
        java.nio.ByteBuffer byteBuffer50 = byteBuffer45.order(byteOrder49);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer45.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer52 = byteBuffer51.slice();
        java.nio.ByteBuffer byteBuffer53 = byteBuffer51.duplicate();
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer60 = java.nio.ByteBuffer.wrap(byteArray59);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer55.get(byteArray59);
        java.nio.Buffer buffer62 = byteBuffer55.rewind();
        java.nio.ByteOrder byteOrder63 = byteBuffer55.order();
        java.nio.ByteBuffer byteBuffer64 = byteBuffer51.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer43.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer20.order(byteOrder63);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = byteBuffer66.getInt(167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(shortBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortBuffer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(buffer62);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer66);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        java.lang.String str10 = response2.contentType;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Request request7 = null;
        response5.req = request7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response9.contentType;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        byte[] byteArray13 = byteBuffer10.array();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.get(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = byteBuffer5.getInt((int) '\u2300');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        byte[] byteArray6 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer11 = byteBuffer8.asLongBuffer();
        java.nio.ByteOrder byteOrder12 = byteBuffer8.order();
        byte[] byteArray13 = byteBuffer8.array();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        boolean boolean15 = byteBuffer1.equals((java.lang.Object) byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer1.putLong((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(longBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer6.get(byteArray10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer6.slice();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.isReadOnly();
        int int21 = byteBuffer15.compareTo(byteBuffer19);
        java.nio.DoubleBuffer doubleBuffer22 = byteBuffer19.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer23 = byteBuffer19.asFloatBuffer();
        java.lang.String str24 = byteBuffer19.toString();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer6.put(byteBuffer19);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer6.put((byte) 100);
        byte byte28 = byteBuffer27.get();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        java.nio.ByteOrder byteOrder33 = byteBuffer30.order();
        java.nio.ByteBuffer byteBuffer34 = byteBuffer27.order(byteOrder33);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer1.order(byteOrder33);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer37 = byteBuffer35.putChar('4');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer22);
        org.junit.Assert.assertNotNull(floatBuffer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str24, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putDouble((double) '\000');
        float float6 = byteBuffer5.getFloat();
        float float8 = byteBuffer5.getFloat((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer5.getInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        java.lang.String str6 = response4.charset;
        boolean boolean8 = response4.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response4.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.lang.String str12 = response4.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean10 = response8.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response8.scanHeaders("");
        java.net.URL uRL13 = response8.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        java.lang.String str7 = response3.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.Connection.Request request8 = response3.req;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        byte[] byteArray6 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer11 = byteBuffer8.asLongBuffer();
        java.nio.ByteOrder byteOrder12 = byteBuffer8.order();
        byte[] byteArray13 = byteBuffer8.array();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        boolean boolean15 = byteBuffer1.equals((java.lang.Object) byteArray13);
        java.nio.Buffer buffer16 = byteBuffer1.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(longBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(buffer16);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        char char9 = byteBuffer7.getChar();
        java.nio.Buffer buffer10 = byteBuffer7.flip();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.duplicate();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer7.putFloat(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = byteBuffer13.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        int int19 = byteBuffer13.compareTo(byteBuffer17);
        java.nio.DoubleBuffer doubleBuffer20 = byteBuffer17.asDoubleBuffer();
        response2.byteData = byteBuffer17;
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer23.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer27.get(byteArray31);
        java.nio.Buffer buffer34 = byteBuffer27.rewind();
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.wrap(byteArray38);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer27.put(byteArray38);
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.wrap(byteArray38);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer25.put(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer45 = byteBuffer17.get(byteArray38, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = byteBuffer5.remaining();
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = byteBuffer5.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        java.lang.String str6 = response1.statusMessage;
        int int7 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Request request13 = null;
        response12.req = request13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request17 = response12.req;
        org.jsoup.Connection.Response response19 = response12.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.lang.String str6 = byteBuffer1.toString();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putShort((short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int17 = response2.statusCode;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ShortBuffer shortBuffer7 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer9.putChar((int) (short) 1, '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer5.put(byteArray15, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray15);
        byte[] byteArray22 = new byte[] {};
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.get(byteArray22);
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.nio.ByteBuffer byteBuffer29 = response28.byteData;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        response28.byteData = byteBuffer32;
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.slice();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        boolean boolean37 = byteBuffer36.hasRemaining();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.asReadOnlyBuffer();
        boolean boolean39 = byteBuffer38.hasRemaining();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer42 = byteBuffer41.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer43 = byteBuffer41.asShortBuffer();
        java.nio.ByteBuffer byteBuffer44 = byteBuffer41.compact();
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer38.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer34.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer21.order(byteOrder45);
        java.lang.String str49 = byteBuffer21.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer52 = byteBuffer21.putShort(22, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(doubleBuffer42);
        org.junit.Assert.assertNotNull(shortBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]" + "'", str49, "java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        int int11 = byteBuffer5.compareTo(byteBuffer9);
        java.nio.Buffer buffer12 = byteBuffer9.clear();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put(byteBuffer14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteBuffer17);
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = byteBuffer5.getDouble(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.nio.ByteBuffer byteBuffer10 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer12 = response5.byteData;
        java.lang.String str13 = response5.contentType;
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer5 = byteBuffer1.mark();
        int int6 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putDouble((double) '4');
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer8.put(byteArray16);
        int int18 = byteBuffer17.position();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.putDouble(11, (double) 10.0f);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer17.putFloat((int) (byte) 1, (float) (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer1.put(byteBuffer24);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((int) (byte) 10, (short) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong(3, (long) 0);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        int int17 = byteBuffer11.compareTo(byteBuffer15);
        java.nio.Buffer buffer18 = byteBuffer15.clear();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        boolean boolean21 = byteBuffer20.hasRemaining();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer15.put(byteBuffer20);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer15.slice();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.compact();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.compact();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer27.get(byteArray31);
        java.nio.Buffer buffer34 = byteBuffer27.rewind();
        java.nio.ByteOrder byteOrder35 = byteBuffer27.order();
        java.nio.ByteBuffer byteBuffer36 = byteBuffer24.order(byteOrder35);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer6.order(byteOrder35);
        byte[] byteArray38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer41 = byteBuffer6.get(byteArray38, (int) (short) 13312, (int) '\u0a00');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(buffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        int int11 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        response12.charset = "hi!";
        java.lang.String str16 = response12.header("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        org.jsoup.Connection.Request request5 = null;
        response3.req = request5;
        int int7 = response3.statusCode;
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response3.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer17.get(byteArray21);
        java.nio.Buffer buffer24 = byteBuffer17.rewind();
        java.nio.ByteOrder byteOrder25 = byteBuffer17.order();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer14.order(byteOrder25);
        // The following exception was thrown during execution in test generation
        try {
            short short27 = byteBuffer26.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int6 = response5.statusCode;
        response5.contentType = "hi!";
        java.lang.String str9 = response5.statusMessage;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str11 = response10.statusMessage();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.compact();
        byte byte28 = byteBuffer22.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int8 = byteBuffer7.getInt();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer12 = byteBuffer7.asIntBuffer();
        java.nio.Buffer buffer13 = byteBuffer7.mark();
        java.nio.Buffer buffer14 = byteBuffer7.flip();
        java.nio.Buffer buffer15 = byteBuffer7.mark();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.isReadOnly();
        int int23 = byteBuffer17.compareTo(byteBuffer21);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.compact();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer27 = byteBuffer26.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        byte[] byteArray29 = byteBuffer26.array();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.wrap(byteArray29);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer21.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer7.put(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer1.put(byteArray29, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(intBuffer12);
        org.junit.Assert.assertNotNull(buffer13);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(doubleBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean8 = byteBuffer1.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            char char10 = byteBuffer1.getChar(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        java.lang.String str12 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str14 = response2.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        boolean boolean4 = byteBuffer3.isReadOnly();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        int int9 = byteBuffer3.compareTo(byteBuffer7);
        java.nio.Buffer buffer10 = byteBuffer7.clear();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.put(byteBuffer12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putDouble((double) '\000');
        char char23 = byteBuffer22.getChar();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        boolean boolean25 = byteBuffer16.equals((java.lang.Object) byteBuffer22);
        int int26 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.compact();
        char char29 = byteBuffer27.getChar(4);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = byteBuffer27.getInt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 13312);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) 1677787392);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer19.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        int int22 = byteBuffer13.compareTo(byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putLong((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("");
        response2.statusMessage = "";
        java.lang.String str11 = response2.contentType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response10 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        java.nio.Buffer buffer5 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = buffer5.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        int int8 = byteBuffer7.position();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            char char10 = byteBuffer9.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        java.lang.String str6 = byteBuffer1.toString();
        boolean boolean7 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int10 = byteBuffer9.limit();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer9.putChar(' ');
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteOrder byteOrder17 = null;
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.order(byteOrder17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        int int23 = byteBuffer20.limit();
        byte[] byteArray24 = byteBuffer20.array();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer14.put(byteArray24);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer9.put(byteArray24);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer1.get(byteArray24);
        java.nio.ByteOrder byteOrder28 = null;
        java.nio.ByteBuffer byteBuffer29 = byteBuffer27.order(byteOrder28);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer27.putFloat((int) (short) 0, (float) '4');
        int int33 = byteBuffer27.capacity();
        // The following exception was thrown during execution in test generation
        try {
            char char35 = byteBuffer27.getChar(93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response11.statusCode = '4';
        java.lang.String str15 = response11.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response11.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        int int10 = byteBuffer7.position();
        boolean boolean11 = byteBuffer7.isReadOnly();
        int int12 = byteBuffer1.compareTo(byteBuffer7);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteBuffer20);
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.nio.ByteBuffer byteBuffer26 = response25.byteData;
        boolean boolean27 = byteBuffer1.equals((java.lang.Object) response25);
        org.jsoup.Connection.Response response29 = response25.removeCookie("hi!");
        response25.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str32 = response25.charset();
        org.jsoup.Connection.Method method33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response25.method(method33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(byteBuffer10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.FloatBuffer floatBuffer14 = byteBuffer5.asFloatBuffer();
        java.nio.IntBuffer intBuffer15 = byteBuffer5.asIntBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.isReadOnly();
        int int23 = byteBuffer17.compareTo(byteBuffer21);
        java.nio.Buffer buffer24 = byteBuffer21.clear();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        boolean boolean27 = byteBuffer26.hasRemaining();
        java.nio.ByteBuffer byteBuffer28 = byteBuffer21.put(byteBuffer26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.compact();
        int int30 = byteBuffer29.limit();
        int int31 = byteBuffer29.position();
        java.nio.Buffer buffer33 = byteBuffer29.position((int) (byte) 0);
        byte[] byteArray34 = byteBuffer29.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer37 = byteBuffer5.get(byteArray34, (int) '\u2300', 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(floatBuffer14);
        org.junit.Assert.assertNotNull(intBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(buffer33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.putChar('4');
        java.lang.String str10 = byteBuffer9.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putDouble((int) '\u2300', 4.9E-323d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]" + "'", str10, "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request13 = response12.req;
        int int14 = response12.numRedirects;
        org.jsoup.Connection.Request request15 = null;
        response12.req = request15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response12.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer8.get(byteArray12);
        java.nio.Buffer buffer15 = byteBuffer8.rewind();
        java.nio.ByteOrder byteOrder16 = byteBuffer8.order();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer6.order(byteOrder16);
        java.nio.ByteOrder byteOrder18 = byteBuffer17.order();
        int int19 = byteBuffer17.capacity();
        short short20 = byteBuffer17.getShort();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        response4.numRedirects = 'a';
        java.lang.String str8 = response4.getHeaderCaseInsensitive("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        java.nio.ByteBuffer byteBuffer9 = response4.byteData;
        org.jsoup.Connection.Method method10 = response4.method();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer5.get(byteArray9);
        java.nio.Buffer buffer12 = byteBuffer5.rewind();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer5.put(byteArray16);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer3.put(byteArray16);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putDouble((double) (short) 13312);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        int int6 = byteBuffer1.position();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float9 = byteBuffer7.getFloat((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer1.getLong((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = byteBuffer8.getLong(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        int int18 = byteBuffer13.capacity();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer13.slice();
        java.lang.Class<?> wildcardClass20 = byteBuffer13.getClass();
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.duplicate();
        response5.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response19.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        boolean boolean8 = response3.hasCookie("");
        response3.charset = "hi!";
        org.jsoup.Connection.Request request11 = null;
        response3.req = request11;
        java.lang.String str13 = response3.charset();
        java.lang.String str14 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 93;
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer6 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer6);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.asReadOnlyBuffer();
        boolean boolean10 = byteBuffer9.hasRemaining();
        response5.byteData = byteBuffer9;
        java.nio.Buffer buffer12 = byteBuffer9.mark();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer9.asShortBuffer();
        java.lang.Class<?> wildcardClass14 = byteBuffer9.getClass();
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble(22, (double) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putLong(1, 100L);
        int int12 = byteBuffer11.getInt();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putShort(10, (short) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        int int8 = byteBuffer7.position();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer7.compact();
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request13 = response12.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response12.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        response3.executed = false;
        org.jsoup.Connection.Method method13 = response3.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean16 = response3.hasCookie("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage;
        java.lang.String str8 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str10 = response3.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        org.jsoup.Connection.Response response12 = response3.cookie("hi!", "");
        int int13 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str16 = response14.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        response18.numRedirects = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        byte[] byteArray6 = byteBuffer5.array();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer5.asDoubleBuffer();
        char char9 = byteBuffer5.getChar(0);
        short short11 = byteBuffer5.getShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\u0a00' + "'", char9 == '\u0a00');
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.duplicate();
        java.nio.CharBuffer charBuffer10 = byteBuffer7.asCharBuffer();
        boolean boolean11 = byteBuffer7.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer7.putLong((long) '\000');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        boolean boolean7 = byteBuffer1.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

